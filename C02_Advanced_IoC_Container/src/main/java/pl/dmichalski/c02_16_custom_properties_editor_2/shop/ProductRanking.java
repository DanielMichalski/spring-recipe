package pl.dmichalski.c02_16_custom_properties_editor_2.shop;

import java.util.Date;

/**
 * Author: Daniel
 */
public class ProductRanking {

    private Product bestSeller;

    private Date fromDate;

    private Date toDate;

    public Product getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(Product bestSeller) {
        this.bestSeller = bestSeller;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
