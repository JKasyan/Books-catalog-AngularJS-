/**
 * This class is generated by jOOQ
 */
package catalog.angularjs.generated.tables;


import catalog.angularjs.generated.Keys;
import catalog.angularjs.generated.Public;
import catalog.angularjs.generated.tables.records.AuthorRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author extends TableImpl<AuthorRecord> {

	private static final long serialVersionUID = 743938137;

	/**
	 * The reference instance of <code>public.author</code>
	 */
	public static final Author AUTHOR = new Author();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AuthorRecord> getRecordType() {
		return AuthorRecord.class;
	}

	/**
	 * The column <code>public.author.id_author</code>.
	 */
	public final TableField<AuthorRecord, Integer> ID_AUTHOR = createField("id_author", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.author.first_name</code>.
	 */
	public final TableField<AuthorRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.author.second_name</code>.
	 */
	public final TableField<AuthorRecord, String> SECOND_NAME = createField("second_name", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.author.status</code>.
	 */
	public final TableField<AuthorRecord, Boolean> STATUS = createField("status", org.jooq.impl.SQLDataType.BOOLEAN.defaulted(true), this, "");

	/**
	 * Create a <code>public.author</code> table reference
	 */
	public Author() {
		this("author", null);
	}

	/**
	 * Create an aliased <code>public.author</code> table reference
	 */
	public Author(String alias) {
		this(alias, AUTHOR);
	}

	private Author(String alias, Table<AuthorRecord> aliased) {
		this(alias, aliased, null);
	}

	private Author(String alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AuthorRecord, Integer> getIdentity() {
		return Keys.IDENTITY_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AuthorRecord> getPrimaryKey() {
		return Keys.AUTHOR_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AuthorRecord>> getKeys() {
		return Arrays.<UniqueKey<AuthorRecord>>asList(Keys.AUTHOR_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Author as(String alias) {
		return new Author(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Author rename(String name) {
		return new Author(name, null);
	}
}
