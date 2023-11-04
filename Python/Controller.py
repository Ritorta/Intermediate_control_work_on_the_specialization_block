import view
import note
import noteapp

    
def main():
    while True:
        num = view.user_input()
        if num == 1:
            add = view.input_1()
            noteapp.add_note(add[0], add[1])
        elif num == 6:
            print('Goodbye')
            break
        else:
            print('Error: Invalid number, choice number is menu.')

main()