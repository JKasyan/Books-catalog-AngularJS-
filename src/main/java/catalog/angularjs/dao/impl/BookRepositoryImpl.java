package catalog.angularjs.dao.impl;

import catalog.angularjs.dao.BookRepository;

import catalog.angularjs.dto.BookDto;
import catalog.angularjs.generated.tables.pojos.Author;
import catalog.angularjs.generated.tables.pojos.Book;
import org.jooq.DSLContext;
import org.jooq.Record7;
import org.jooq.Result;
import org.jooq.types.UInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static catalog.angularjs.generated.Tables.*;

@Repository("bookRepository")
public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private DSLContext create;


    @Override
    public List<Book> selectAll() {
        List<Book> books = create
                .select()
                .from(BOOK)
                .fetchInto(Book.class);
        Set<Integer> idsBook = books
                .stream()
                .map(Book::getIdBook)
                .collect(Collectors.toSet());
        create
                .select(AUTHOR.ID_AUTHOR, AUTHOR.FIRST_NAME, AUTHOR.SECOND_NAME, BOOK.ID_BOOK)
                .from(AUTHOR)
                .join(AUTHOR_BOOK)
                .on(AUTHOR_BOOK.ID_AUTHOR.equal(AUTHOR.ID_AUTHOR))
                .join(BOOK)
                .on(BOOK.ID_BOOK.equal(AUTHOR_BOOK.ID_BOOK))
                .where(BOOK.ID_BOOK.in(idsBook));
        return create.select()
                .from(BOOK)
                .fetchInto(Book.class);
    }

    private List<Author> selectAuthor(List<Integer> idBooks) {
        return create.select()
                .from(AUTHOR)
                .join(AUTHOR_BOOK)
                .on(AUTHOR_BOOK.ID_AUTHOR.equal(AUTHOR.ID_AUTHOR))
                .where(AUTHOR_BOOK.ID_BOOK.in(idBooks))
                .fetchInto(Author.class);
    }

    @Override
    public List<Book> selectBooksByIdAuthor(int idAuthor) {
        return create.select()
                .from(BOOK)
                .join(AUTHOR_BOOK)
                .on(BOOK.ID_BOOK.equal(AUTHOR_BOOK.ID_BOOK))
                .join(AUTHOR)
                .on(AUTHOR.ID_AUTHOR.equal(AUTHOR_BOOK.ID_AUTHOR))
                .where(AUTHOR.ID_AUTHOR.equal(idAuthor))
                .fetchInto(Book.class);
    }
}
