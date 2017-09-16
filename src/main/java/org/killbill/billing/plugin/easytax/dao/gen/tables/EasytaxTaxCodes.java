/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.easytax.dao.gen.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EasytaxTaxCodes extends org.jooq.impl.TableImpl<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord> {

	private static final long serialVersionUID = -458118853;

	/**
	 * The reference instance of <code>easytax_tax_codes</code>
	 */
	public static final org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes EASYTAX_TAX_CODES = new org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord> getRecordType() {
		return org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord.class;
	}

	/**
	 * The column <code>easytax_tax_codes.record_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, org.jooq.types.ULong> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>easytax_tax_codes.kb_tenant_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, java.lang.String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>easytax_tax_codes.tax_zone</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, java.lang.String> TAX_ZONE = createField("tax_zone", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>easytax_tax_codes.product_name</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, java.lang.String> PRODUCT_NAME = createField("product_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>easytax_tax_codes.tax_code</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, java.lang.String> TAX_CODE = createField("tax_code", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>easytax_tax_codes.tax_rate</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, java.math.BigDecimal> TAX_RATE = createField("tax_rate", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 9).nullable(false), this, "");

	/**
	 * The column <code>easytax_tax_codes.valid_from_date</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, org.joda.time.DateTime> VALID_FROM_DATE = createField("valid_from_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "", new org.killbill.billing.plugin.easytax.dao.JodaDateTimeBinding());

	/**
	 * The column <code>easytax_tax_codes.valid_to_date</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, org.joda.time.DateTime> VALID_TO_DATE = createField("valid_to_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new org.killbill.billing.plugin.easytax.dao.JodaDateTimeBinding());

	/**
	 * The column <code>easytax_tax_codes.created_date</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, org.joda.time.DateTime> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "", new org.killbill.billing.plugin.easytax.dao.JodaDateTimeBinding());

	/**
	 * Create a <code>easytax_tax_codes</code> table reference
	 */
	public EasytaxTaxCodes() {
		this("easytax_tax_codes", null);
	}

	/**
	 * Create an aliased <code>easytax_tax_codes</code> table reference
	 */
	public EasytaxTaxCodes(java.lang.String alias) {
		this(alias, org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes.EASYTAX_TAX_CODES);
	}

	private EasytaxTaxCodes(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord> aliased) {
		this(alias, aliased, null);
	}

	private EasytaxTaxCodes(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.killbill.billing.plugin.easytax.dao.gen.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord, org.jooq.types.ULong> getIdentity() {
		return org.killbill.billing.plugin.easytax.dao.gen.Keys.IDENTITY_EASYTAX_TAX_CODES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord> getPrimaryKey() {
		return org.killbill.billing.plugin.easytax.dao.gen.Keys.KEY_EASYTAX_TAX_CODES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.killbill.billing.plugin.easytax.dao.gen.tables.records.EasytaxTaxCodesRecord>>asList(org.killbill.billing.plugin.easytax.dao.gen.Keys.KEY_EASYTAX_TAX_CODES_PRIMARY, org.killbill.billing.plugin.easytax.dao.gen.Keys.KEY_EASYTAX_TAX_CODES_RECORD_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes as(java.lang.String alias) {
		return new org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes rename(java.lang.String name) {
		return new org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes(name, null);
	}
}