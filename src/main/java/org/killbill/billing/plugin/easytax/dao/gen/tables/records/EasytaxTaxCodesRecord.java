/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.easytax.dao.gen.tables.records;


import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes;

import javax.annotation.processing.Generated;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EasytaxTaxCodesRecord extends UpdatableRecordImpl<EasytaxTaxCodesRecord> implements Record9<ULong, String, String, String, String, BigDecimal, DateTime, DateTime, DateTime> {

    private static final long serialVersionUID = -724704007;

    /**
     * Setter for <code>easytax_tax_codes.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>easytax_tax_codes.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>easytax_tax_codes.tax_zone</code>.
     */
    public void setTaxZone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.tax_zone</code>.
     */
    public String getTaxZone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>easytax_tax_codes.product_name</code>.
     */
    public void setProductName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.product_name</code>.
     */
    public String getProductName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>easytax_tax_codes.tax_code</code>.
     */
    public void setTaxCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.tax_code</code>.
     */
    public String getTaxCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>easytax_tax_codes.tax_rate</code>.
     */
    public void setTaxRate(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.tax_rate</code>.
     */
    public BigDecimal getTaxRate() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>easytax_tax_codes.valid_from_date</code>.
     */
    public void setValidFromDate(DateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.valid_from_date</code>.
     */
    public DateTime getValidFromDate() {
        return (DateTime) get(6);
    }

    /**
     * Setter for <code>easytax_tax_codes.valid_to_date</code>.
     */
    public void setValidToDate(DateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.valid_to_date</code>.
     */
    public DateTime getValidToDate() {
        return (DateTime) get(7);
    }

    /**
     * Setter for <code>easytax_tax_codes.created_date</code>.
     */
    public void setCreatedDate(DateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>easytax_tax_codes.created_date</code>.
     */
    public DateTime getCreatedDate() {
        return (DateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, String, String, String, String, BigDecimal, DateTime, DateTime, DateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, String, String, String, String, BigDecimal, DateTime, DateTime, DateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.KB_TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.TAX_ZONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.PRODUCT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.TAX_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.TAX_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field7() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.VALID_FROM_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field8() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.VALID_TO_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DateTime> field9() {
        return EasytaxTaxCodes.EASYTAX_TAX_CODES.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getRecordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getKbTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTaxZone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProductName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTaxCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getTaxRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value7() {
        return getValidFromDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value8() {
        return getValidToDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime value9() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value2(String value) {
        setKbTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value3(String value) {
        setTaxZone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value4(String value) {
        setProductName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value5(String value) {
        setTaxCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value6(BigDecimal value) {
        setTaxRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value7(DateTime value) {
        setValidFromDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value8(DateTime value) {
        setValidToDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord value9(DateTime value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EasytaxTaxCodesRecord values(ULong value1, String value2, String value3, String value4, String value5, BigDecimal value6, DateTime value7, DateTime value8, DateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EasytaxTaxCodesRecord
     */
    public EasytaxTaxCodesRecord() {
        super(EasytaxTaxCodes.EASYTAX_TAX_CODES);
    }

    /**
     * Create a detached, initialised EasytaxTaxCodesRecord
     */
    public EasytaxTaxCodesRecord(ULong recordId, String kbTenantId, String taxZone, String productName, String taxCode, BigDecimal taxRate, DateTime validFromDate, DateTime validToDate, DateTime createdDate) {
        super(EasytaxTaxCodes.EASYTAX_TAX_CODES);

        set(0, recordId);
        set(1, kbTenantId);
        set(2, taxZone);
        set(3, productName);
        set(4, taxCode);
        set(5, taxRate);
        set(6, validFromDate);
        set(7, validToDate);
        set(8, createdDate);
    }
}
