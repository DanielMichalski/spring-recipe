package pl.dmichalski.c06_03.form;

import org.apache.struts.action.ActionForm;

/**
 * Author: Daniel
 */
public class DistanceForm extends ActionForm {

    private String srcCity;

    private String destCity;

    public String getSrcCity() {
        return srcCity;
    }

    public void setSrcCity(String srcCity) {
        this.srcCity = srcCity;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

}
