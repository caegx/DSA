public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(5);
        list.addLast(10);
        list.addLast(33);
        list.removeLast();
        System.out.println(list.contains(10));
    }
}