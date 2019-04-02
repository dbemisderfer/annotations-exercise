/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unchecked")
public class Author extends Person {
    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public String fullName() {
        return String.format("%s, %s", lastName, firstName);
    }

    public static void main(String[] args) {
//        Author jan = new Author("Jan", "Jansen");
//        jan.books = new ArrayList(List.of(1,2,3));
//
//        for (String book : jan.getBooks()) {
//            System.out.println(book);
//        }
    }
}


//David Stephens [2:48 PM]
//Okay, so I figured out the exception I was trying to
// trigger earlier to explain why just putting an Annotation
// will not help run your application. if you add this to
// your author class on the easy_fix branch, it will not
// throw an exception:
//Why you need to fix it.