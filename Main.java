package homework_3;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("Go!");
        linkedList.addFirst("1");
        linkedList.addFirst("2");
        linkedList.addFirst("3");
        for (String item: linkedList) {
            System.out.println(item);
        }
    }
}
