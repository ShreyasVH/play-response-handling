package services.impl;

import com.google.inject.Inject;
import models.db.Book;
import models.requests.CreateRequest;
import models.requests.UpdateRequest;
import repositories.BookRepository;
import services.BookService;

import java.util.List;

public class BookServiceImpl implements BookService
{
    private final BookRepository bookRepository;

    @Inject
    public BookServiceImpl(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    public Book create(CreateRequest request)
    {
        return this.bookRepository.create(request);
    }

    public List<Book> list() {
        return this.bookRepository.list();
    }

    public Book get(Long id) {
        return this.bookRepository.get(id);
    }

    public Book update(Long id, UpdateRequest request) {
        return this.bookRepository.update(id, request);
    }

    public void delete(Long id) {
        this.bookRepository.delete(id);
    }
}
