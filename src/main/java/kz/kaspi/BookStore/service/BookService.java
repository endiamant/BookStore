package kz.kaspi.BookStore.service;

import kz.kaspi.BookStore.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    Book save(Book book);
    List <Book> findAll();
    Book findOne(Long id);
    void removeOne(Long id);
    List<Book> findByCategory(String category);

    List<Book> blurrySearch(String title);

}
