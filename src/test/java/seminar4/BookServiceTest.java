package seminar4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void findBookById() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        String bookId = "1";
        String bookTitle = "Book";
        String bookAuthor = "Author";
        when(bookRepository.findById(bookId)).thenReturn(new Book(bookId, bookTitle, bookAuthor));
        Book book = bookService.findBookById(bookId);
        assertEquals(bookId, book.getId());
        assertEquals(bookTitle, book.getTitle());
        assertEquals(bookAuthor, book.getAuthor());
        verify(bookRepository, times(1)).findById(bookId);
    }

    @Test
    void findAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("1"));
        books.add(new Book("2"));
        books.add(new Book("3"));
        when(bookRepository.findAll()).thenReturn(books);
        List<Book> allBooks = bookService.findAllBooks();
        assertEquals(books.size(), allBooks.size());
        verify(bookRepository, times(1)).findAll();
    }
}