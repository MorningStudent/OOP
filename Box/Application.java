public class Application {
    public static void main(String[] args) {
        
        Box firstBox   = new Box("firstBox");
        Box anotherBox = new Box("secondBox");

        Book oneBook       = new Book("Book", "Programming in JAVA", 200, "John Doe", 2000);
        Journal oneJournal = new Journal("Journal", "BusinessClass", 40, "Business");
        
        // 9. Cu toate ca prorpietatea <title> este private, obiecte ale aceleiasi clase pot accesa proprietatile
        // altor obiecte din aceeasi clasa pentru ca modificatorul de acces <private> este proiectat sa apere de o eventuala
        // incursiune care ar veni dinafara clasei si nu dinafara obiectului.

        // 10.4 Da, se poate de pus aceeasi carte in ambele cutii.
    
        // 10.5 Da, se va schimba si titul cartii din a doua caseta. Pentru ca este vorba despre acelasi obiect <oneBook>
        // fata de care exista doua referinte diferite ale altor obiecte <firstBox> si <AnotherBox>

        firstBox.setContent(oneBook);
        anotherBox.setContent(oneBook);

        oneBook.setTitle("Programming in Phyton");

        System.out.println(firstBox);
        System.out.println(anotherBox);
    }
}
