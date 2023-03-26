package homework_7;

import homework_7.Logger.Logger;
import homework_7.controller.Notes;
import homework_7.controller.NotesContLogger;
import homework_7.controller.NotesController;
import homework_7.model.*;
import homework_7.views.ViewNotes;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("logger.txt");
        FileOperation fileOperation = (new FileOperations("notes.txt"));
        Repository repository = new RepositoryFile(fileOperation);
        NotesController controller = new NotesController(repository);
        Notes cont = new NotesContLogger(controller, logger);
        ViewNotes view = new ViewNotes(cont);
        view.run();
    }
}