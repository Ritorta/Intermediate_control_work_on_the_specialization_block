import view
import noteapp
    
def main():
    while True:
        num = view.user_input()
        if num == "1":
            add = view.input_1()
            noteapp.add_note(add)
        else:
            print('Error: Invalid number, choice number is menu.')

main()