package classwork_6;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister pers = new Persister(user);
        Report rep = new Report(user);
        pers.save();
        rep.printReport();
    }
}