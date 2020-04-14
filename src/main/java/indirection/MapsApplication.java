package indirection;

import indirection.providers.LocationProvider;
import indirection.services.LocationService;

import javax.xml.crypto.NoSuchMechanismException;

public class MapsApplication {

    private final LocationService service;

    public MapsApplication() {
        service = new LocationService(new LocationProvider());
    }

    public Double calculateKmBetweenCurrentLocationAndDestination(String destination) {
        try {
            String currentLocation = service.getLocation();
            // Calculate distance - fixed at 2KM
            return 2.0;
        } catch (final Exception e) {
            // tell user what went wrong with a popup
            throw new NoSuchMechanismException(e.getMessage());
        }
    }
}
