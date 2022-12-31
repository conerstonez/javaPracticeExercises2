import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("BookShelf Specification")
public class BookShelfSpec {

    @Test
//    @DisplayName("Shelf is empty when no book is added")
    public void shelfEmptyWhenNoBookAdded(){
        System.out.println("Working on test case\n");
        BookShelf shelf = new BookShelf();
        List<String> book = shelf.books();
        assertTrue(book.isEmpty(), () -> "BookShelf should be empty.");
    }

//    @Test
//    void checkForEvenNumbers(){
//        int number = new Random(10).nextInt();
//        assertTrue(() -> number % 2 == 0, number + "is not an even number");
//
//        BiFunction<Integer, Integer, Boolean> divisible = (x, y) -> x % y == 0;
//        Function<Integer, Boolean> multipleOf2 = (x) -> divisible.apply(x, 2);
//        assertTrue(() -> multipleOf2.apply(number), () -> "2 is not factor of " + number);
//
//        List<Integer> numbers = Arrays.asList(1, 1, 1, 1, 2);
//        assertTrue(() -> numbers.stream().distinct().anyMatch(DSLTest::isEven), "Did not find an even number in the list");
//    }
//    static  boolean isEven(int number){
//        return number % 2 == 0;
//    }

//    @Test
//    public void shelfToStringShouldPrintBookCountAndTitles() throws Exception {
//        BookShelf shelf = new BookShelf();
//        List<String> books = shelf.books("The Phoenix Project");
//        books.add("The Phoenix Project");
//        books.add("Java 8 in Action");
//        String shelfStr = shelf.toString();
//        assertAll(() -> assertTrue(shelfStr.contains("The Phoenix Project"),"1st book title missing"),
//                () -> assertTrue(shelfStr.contains("Java 8 in Action") , "2nd book title missing "),
//                (() -> assertTrue(shelfStr.contains("2 books found"), "Book count missing")));
//    }

    @Test
    void bookshelfContainsTwoBooksWhenTwoBooksAdded(){
        BookShelf shelf = new BookShelf();
        shelf.add("Effective Java");
        shelf.add("Code Complete");
        List<String> book = shelf.books();
        assertEquals(2, book.size(), () -> "BookShelf should have two books");
    }
}
