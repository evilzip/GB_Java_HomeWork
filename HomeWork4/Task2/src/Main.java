import java.util.*;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Main {

    private static LinkedList<String> userList = new LinkedList<>();

    public static void main(String[] args) {
        Task2(userList);
    }
    public static void Task2(LinkedList<String> list){
        userList.add("one");
        userList.add("two");
        userList.add("three");
        userList.add("four");
        userList.add("five");
        System.out.println("Изначальный список: " + userList);
        System.out.println("Списко после метода enque(six): " + enqueue(userList, "six"));
        System.out.println(dequeue(userList));
        System.out.println("Списко после метода deque(): " + userList);
        System.out.println(first(userList));
        System.out.println("Списко после метода Fisrt(): " + userList);
    }

    private static LinkedList<String> enqueue(LinkedList<String> list, String s){
        //enqueue() - помещает элемент в конец очереди
        list.addLast(s);
        return list;

    }
    private static String dequeue(LinkedList<String> list){
        //dequeue() - возвращает первый элемент из очереди и удаляет его
        return list.poll();

    }
    private static String first(LinkedList<String> list) {
        //first() - возвращает первый элемент из очереди, не удаляя
        return list.peek();
    }
}