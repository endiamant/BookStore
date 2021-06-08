package kz.kaspi.BookStore.service.impl;

import kz.kaspi.BookStore.model.Book;
import kz.kaspi.BookStore.repository.BookRepository;
import kz.kaspi.BookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    public Book findOne(Long id) {
        return bookRepository.findById(id).get();
    }

    public void removeOne(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> findByCategory(String category) {
        List<Book> bookList = bookRepository.findByCategory(category);

        List<Book> activeBookList = new ArrayList<>();

        for(Book book : bookList) {
            if(book.isActive()) {
                activeBookList.add(book);
            }
        }

        return activeBookList;
    }
    public List<Book> blurrySearch(String title) {
        List<Book> bookList = bookRepository.findByTitleContaining(title);
        List<Book> activeBookList = new ArrayList<>();

        for(Book book : bookList) {
            if(book.isActive()) {
                activeBookList.add(book);
            }
        }

        return activeBookList;
    }
}
