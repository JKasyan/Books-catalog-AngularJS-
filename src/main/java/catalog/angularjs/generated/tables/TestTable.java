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
public class TestTable extends org.jooq.impl.TableImpl<catalog.angularjs.generated.tables.records.TestTableRecord> {

	private static final long serialVersionUID = 890922158;

	/**
	 * The singleton instance of <code>public.test_table</code>
	 */
	public static final catalog.angularjs.generated.tables.TestTable TEST_TABLE = new catalog.angularjs.generated.tables.TestTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<catalog.angularjs.generated.tables.records.TestTableRecord> getRecordType() {
		return catalog.angularjs.generated.tables.records.TestTableRecord.class;
	}

	/**
	 * The column <code>public.test_table.id</code>.
	 */
	public final org.jooq.TableField<catalog.angularjs.generated.tables.records.TestTableRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.test_table.some_text</code>.
	 */
	public final org.jooq.TableField<catalog.angularjs.generated.tables.records.TestTableRecord, java.lang.String> SOME_TEXT = createField("some_text", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>public.test_table</code> table reference
	 */
	public TestTable() {
		this("test_table", null);
	}

	/**
	 * Create an aliased <code>public.test_table</code> table reference
	 */
	public TestTable(java.lang.String alias) {
		this(alias, catalog.angularjs.generated.tables.TestTable.TEST_TABLE);
	}

	private TestTable(java.lang.String alias, org.jooq.Table<catalog.angularjs.generated.tables.records.TestTableRecord> aliased) {
		this(alias, aliased, null);
	}

	private TestTable(java.lang.String alias, org.jooq.Table<catalog.angularjs.generated.tables.records.TestTableRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, catalog.angularjs.generated.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<catalog.angularjs.generated.tables.records.TestTableRecord, java.lang.Integer> getIdentity() {
		return catalog.angularjs.generated.Keys.IDENTITY_TEST_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<catalog.angularjs.generated.tables.records.TestTableRecord> getPrimaryKey() {
		return catalog.angularjs.generated.Keys.PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<catalog.angularjs.generated.tables.records.TestTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<catalog.angularjs.generated.tables.records.TestTableRecord>>asList(catalog.angularjs.generated.Keys.PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public catalog.angularjs.generated.tables.TestTable as(java.lang.String alias) {
		return new catalog.angularjs.generated.tables.TestTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public catalog.angularjs.generated.tables.TestTable rename(java.lang.String name) {
		return new catalog.angularjs.generated.tables.TestTable(name, null);
	}
}
