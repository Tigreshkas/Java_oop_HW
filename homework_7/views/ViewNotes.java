package homework_7.views;

import homework_7.controller.Notes;
import homework_7.model.Note;
import java.util.List;
import java.util.Scanner;
public class ViewNotes {
    private final Notes noteController;

    public ViewNotes(Notes noteController) {
        this.noteController = noteController;
    }

    public void run() {

        Commands com;
        while (true) {
            String command = prompt("Введите любую команду из предложенных " +
                    "CREATE/READ/LIST/UPDATE/DELETE: ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE -> createNote();
                    case READ -> readNote();
                    case LIST -> listNote();
                    case UPDATE -> updateNote();
                    case DELETE -> deleteNote();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteNote() throws Exception {
        String deleteId = prompt("Введите идентификатор записки: ");
        noteController.deleteNote(deleteId);
        System.out.println("Вы успешно удалили записку");
    }

    private void updateNote() throws Exception {
        String readId = prompt("Введите редактируемый ID записки: ");
        noteController.updateNote(readId, inputNote());
    }

    private void listNote() {
        List<Note> listNotes = noteController.readAllUsers();
        for (Note note : listNotes) {
            System.out.println(note + "\n");
        }
    }

    private void readNote() throws Exception {
        String id = prompt("Идентификатор записки: ");
        Note note = noteController.readNote(id);
        System.out.println(note);

    }

    private Note inputNote() {
        String heading = prompt("Заголовок : ");
        String body = prompt("Текст: ");
        return new Note(heading, body);
    }

    private void createNote() throws Exception {
        noteController.saveNote(inputNote());
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}