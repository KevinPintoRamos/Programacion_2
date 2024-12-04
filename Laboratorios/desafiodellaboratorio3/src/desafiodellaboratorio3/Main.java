package desafiodellaboratorio3;

public class Main {
    public static void main(String[] args) {
    	
        Author author = new Author("Daniel Cantinflas");

        author.addBook("Cholo Juanito", 8976.99);
        author.addBook("Lo que callan los hombres XD", 345.99);

        for (Book book : author.getBooks()) {
            book.getInfo();
            System.out.println();
        }
    }
}
