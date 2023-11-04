import view
import noteApp


def main():
    note_app = noteApp.NoteApp()
    while True:
        num = view.user_input()
        if num == 1:
            title, body = view.input_1()
            note_app.add_note(title=title, body=body)
        elif num == 6:
            print('Goodbye')
            break
        else:
            print('Error: Invalid number, choice number is menu.')

if __name__ == "__main__":
    main()