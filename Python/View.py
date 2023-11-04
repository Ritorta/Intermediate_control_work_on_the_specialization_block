def user_input():
    ask = int(input('Action menu with notes: \n'
                    '1 - Create notes\n'
                    '2 - Edit note title\n'
                    '3 - Edit note body\n'
                    '4 - View all notes\n'
                    '5 - Delete notes\n'
                    '6 - Exit\n'))
    return ask

def input_1():
    title = input('Enter note title: ')
    body = input('Enter note body: ')
    return title, body

def input_3():
    note_id = int(input('Enter iD note: '))
    new_body = input('Enter new note: ')
    return note_id, new_body