/**
 * This class is generated by jOOQ
 */
package catalog.angularjs.generated;


import catalog.angularjs.generated.tables.Author;
import catalog.angularjs.generated.tables.AuthorBook;
import catalog.angularjs.generated.tables.Book;
import catalog.angularjs.generated.tables.TestTable;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table public.author
	 */
	public static final Author AUTHOR = catalog.angularjs.generated.tables.Author.AUTHOR;

	/**
	 * The table public.author_book
	 */
	public static final AuthorBook AUTHOR_BOOK = catalog.angularjs.generated.tables.AuthorBook.AUTHOR_BOOK;

	/**
	 * The table public.book
	 */
	public static final Book BOOK = catalog.angularjs.generated.tables.Book.BOOK;

	/**
	 * The table public.test_table
	 */
	public static final TestTable TEST_TABLE = catalog.angularjs.generated.tables.TestTable.TEST_TABLE;
}