import notes
import json
import os
from notes import Note
from datetime import datetime

class NoteApp:
    def __init__(self):
        self.notes = []
        self.load_notes()

    def load_notes(self):
        try:
            with open("notes.json", "r") as file:
                data = json.load(file)
                for note_data in data:
                    note = Note(note_data["note_id"], note_data["title"], note_data["body"], note_data["created_time"], note_data["modified_time"])
                    self.notes.append(note)
        except FileNotFoundError:
            self.notes = []

    def save_notes(self):
        data = []
        for note in self.notes:
            note_data = {"note_id": note.note_id, "title": note.title, "body": note.body, "created_time": note.created_time, "modified_time": note.modified_time}
            data.append(note_data)
        with open("notes.json", "w") as file:
            json.dump(data, file, indent=4)
            
    def add_note(self, title, body):
            note_id = len(self.notes) + 1
            created_time = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
            modified_time = created_time
            note = Note(note_id, title, body, created_time, modified_time)
            self.notes.append(note)
            self.save_notes()
            print("Note added successfully.")