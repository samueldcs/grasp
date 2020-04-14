package indirection.services;

import indirection.providers.LocationProvider;

import javax.xml.crypto.NoSuchMechanismException;

public class LocationService {

    private final LocationProvider locationProvider;

    public LocationService(LocationProvider locationProvider) {
        this.locationProvider = locationProvider;
    }

    public String getLocation() {
        if(locationProvider.hasGpsConnection()) {
            return locationProvider.getCurrentLocation();
        } else {
            throw new NoSuchMechanismException("GPS is necessary to get current position!");
        }
    }
}
