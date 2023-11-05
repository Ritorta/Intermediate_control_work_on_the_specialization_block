import view
import noteApp

def main():
    note_app = noteApp.NoteApp()
    while True:
        num = view.user_input()
        if num == 1:
            title, body = view.input_1()
            note_app.add_note(title=title, body=body)
        elif num == 2:
            note_id, new_title = view.input_2()
            note_app.edit_note_title(note_id=note_id, new_title=new_title)  
        elif num == 3:
            note_id, new_body = view.input_3()
            note_app.edit_note_body(note_id=note_id, new_body=new_body)
        elif num == 4:
            notes = note_app.select_notes_by_date()
            for note in notes:
                print(note)   
        elif num == 5:
            note_app.view_all_notes()
        elif num == 6:
            note_id = view.input_6()
            note_app.delete_note(note_id=note_id)
        elif num == 7:
            print('Goodbye')
            break
        else:
            print('Error: Invalid number, choice number is menu.')

main()