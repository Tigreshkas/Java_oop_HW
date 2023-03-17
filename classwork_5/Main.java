package classwork_5;


import classwork_5.controllers.UserController;
import classwork_5.model.FileOperation;
import classwork_5.model.FileOperationImpl;
import classwork_5.model.Repository;
import classwork_5.model.RepositoryFile;
import classwork_5.views.Validation;
import classwork_5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository,new Validation());
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}