package pl.dmichalski.c06_01.service;

import java.util.Map;

/**
 * Author: Daniel
 */
public class CityServiceImpl implements CityService {

    private Map<String, Map<String, Double>> distanceMap;

    @Override
    public double findDistance(String srcCity, String destCity) {
        Map<String, Double> destinationMap = distanceMap.get(srcCity);
        if (destinationMap == null) {
            throw new IllegalArgumentException("Source city not found");
        }
        Double distance = destinationMap.get(destCity);
        if (distance == null) {
            throw new IllegalArgumentException("Destiny city not found");
        }
        return distance;
    }

    public void setDistanceMap(Map<String, Map<String, Double>> distanceMap) {
        this.distanceMap = distanceMap;
    }
}
