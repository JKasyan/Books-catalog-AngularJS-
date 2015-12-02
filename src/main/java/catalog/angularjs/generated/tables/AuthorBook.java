/**
 * This class is generated by jOOQ
 */
package catalog.angularjs.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorBook extends org.jooq.impl.TableImpl<catalog.angularjs.generated.tables.records.AuthorBookRecord> {

	private static final long serialVersionUID = 2036842018;

	/**
	 * The singleton instance of <code>public.author_book</code>
	 */
	public static final catalog.angularjs.generated.tables.AuthorBook AUTHOR_BOOK = new catalog.angularjs.generated.tables.AuthorBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<catalog.angularjs.generated.tables.records.AuthorBookRecord> getRecordType() {
		return catalog.angularjs.generated.tables.records.AuthorBookRecord.class;
	}

	/**
	 * The column <code>public.author_book.id_author</code>.
	 */
	public final org.jooq.TableField<catalog.angularjs.generated.tables.records.AuthorBookRecord, java.lang.Integer> ID_AUTHOR = createField("id_author", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.author_book.id_book</code>.
	 */
	public final org.jooq.TableField<catalog.angularjs.generated.tables.records.AuthorBookRecord, java.lang.Integer> ID_BOOK = createField("id_book", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.author_book</code> table reference
	 */
	public AuthorBook() {
		this("author_book", null);
	}

	/**
	 * Create an aliased <code>public.author_book</code> table reference
	 */
	public AuthorBook(java.lang.String alias) {
		this(alias, catalog.angularjs.generated.tables.AuthorBook.AUTHOR_BOOK);
	}

	private AuthorBook(java.lang.String alias, org.jooq.Table<catalog.angularjs.generated.tables.records.AuthorBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private AuthorBook(java.lang.String alias, org.jooq.Table<catalog.angularjs.generated.tables.records.AuthorBookRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, catalog.angularjs.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<catalog.angularjs.generated.tables.records.AuthorBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<catalog.angularjs.generated.tables.records.AuthorBookRecord, ?>>asList(catalog.angularjs.generated.Keys.AUTHOR_BOOK__AUTHOR_FK, catalog.angularjs.generated.Keys.AUTHOR_BOOK__BOOK_FK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public catalog.angularjs.generated.tables.AuthorBook as(java.lang.String alias) {
		return new catalog.angularjs.generated.tables.AuthorBook(alias, this);
	}

	/**
	 * Rename this table
	 */
	public catalog.angularjs.generated.tables.AuthorBook rename(java.lang.String name) {
		return new catalog.angularjs.generated.tables.AuthorBook(name, null);
	}
}
