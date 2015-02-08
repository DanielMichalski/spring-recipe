package pl.dmichalski.c06_04.bean;

import pl.dmichalski.c06_04.service.CityService;

/**
 * Author: Daniel
 */
public class DistanceBean {

    private String srcCity;

    private String destCity;

    private double distance;

    private CityService cityService;

    public void find() {
        distance = cityService.findDistance(srcCity, destCity);
    }

    public String getSrcCity() {
        return srcCity;
    }

    public String getDestCity() {
        return destCity;
    }

    public double isDistance() {
        return distance;
    }

    public void setSrcCity(String srcCity) {
        this.srcCity = srcCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public double getDistance() {
        return distance;
    }

    public void setCityService(CityService cityService) {
        this.cityService = cityService;
    }

}
