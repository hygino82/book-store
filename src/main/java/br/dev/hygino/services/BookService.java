package br.dev.hygino.services;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.hygino.dto.BookRecordDTO;
import br.dev.hygino.models.AuthorModel;
import br.dev.hygino.models.BookModel;
import br.dev.hygino.models.PublisherModel;
import br.dev.hygino.models.ReviewModel;
import br.dev.hygino.repositories.AuthorRepository;
import br.dev.hygino.repositories.BookRepository;
import br.dev.hygino.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    @Transactional
    public BookModel saveBook(BookRecordDTO dto) {
        BookModel book = new BookModel();
        book.setTitle(dto.title());

        PublisherModel publisher = publisherRepository.findById(dto.publisherId())
                .orElseThrow(() -> new IllegalArgumentException());

        Set<AuthorModel> authors = (authorRepository.findAllById(dto.authorsId()).stream().collect(Collectors.toSet()));

        ReviewModel review = new ReviewModel();

        review.setComment(dto.reviewComment());
        review.setBook(book);
        book.setAuthors(authors);
        book.setReview(review);
        book.setPublisher(publisher);

        return bookRepository.save(book);
    }
}
