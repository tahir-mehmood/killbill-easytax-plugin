/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.easytax.dao.gen;


import org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes;
import org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxations;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>easytax_taxations</code>.
     */
    public static final EasytaxTaxations EASYTAX_TAXATIONS = org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxations.EASYTAX_TAXATIONS;

    /**
     * The table <code>easytax_tax_codes</code>.
     */
    public static final EasytaxTaxCodes EASYTAX_TAX_CODES = org.killbill.billing.plugin.easytax.dao.gen.tables.EasytaxTaxCodes.EASYTAX_TAX_CODES;
}
