public class App {
    public static void main(String[] args) {
        
        Cabinet cab1 = new Cabinet();

        cab1.put("topShelf", new Book("Programming in Java for beginners."));
        cab1.put("middleShelf", new Tablet("Samsung M22"));

        System.out.println(cab1);
    }
}
