class Note:
    def __init__(self, note_id, title, body, created_time, modified_time):
        self.note_id = note_id
        self.title = title
        self.body = body
        self.created_time = created_time
        self.modified_time = modified_time

    def __repr__(self):
        return f'iD note: {self.note_id}, Title: {self.title}, Created: {self.created_time}, Modified: {self.modified_time}'
    