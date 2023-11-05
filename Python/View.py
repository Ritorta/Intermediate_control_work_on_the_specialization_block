def user_input():
    ask = int(input('Action menu with notes: \n'
                    '1 - Create notes\n'
                    '2 - Edit note title\n'
                    '3 - Edit note body\n'
                    '4 - View for select note\n'
                    '5 - View for date\n'
                    '6 - View all notes\n'
                    '7 - Delete notes\n'
                    '8 - Exit\n'))
    return ask

def input_1():
    title = input('Enter note title: ')
    body = input('Enter note body: ')
    return title, body

def input_2():
    while True:
        try:
            note_id = int(input('Enter iD note: '))
            new_title = input('Enter new note: ')
            return note_id, new_title
        except ValueError:
            print('Error, please enter the number iD')    

def input_3():
    while True:
        try:
            note_id = int(input('Enter iD note: '))
            new_body = input('Enter new note: ')
            return note_id, new_body
        except ValueError:
            print('Error, please enter the number iD')     

def input_4(notes):
    note_id = int(input('Enter ID note: '))
    for note in notes:
        if note.note_id == note_id:
            return note
    
    # note_id = int(input('Enter iD note: '))
    # return notes, note_id

def input_7():
    while True:
        try:
            note_id = int(input('Enter iD note: '))
            return note_id
        except ValueError:
            print('Error, please enter the number iD')