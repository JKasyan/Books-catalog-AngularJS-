/**
 * This class is generated by jOOQ
 */
package catalog.angularjs.generated;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.author_id_author_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> AUTHOR_ID_AUTHOR_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("author_id_author_seq", catalog.angularjs.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.book_id_book_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> BOOK_ID_BOOK_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("book_id_book_seq", catalog.angularjs.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.test_table_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> TEST_TABLE_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("test_table_id_seq", catalog.angularjs.generated.Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
