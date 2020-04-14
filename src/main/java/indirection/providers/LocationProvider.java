package indirection.providers;

public class LocationProvider {
    public String getCurrentLocation() {
        // I'm a stub! I should be checking for GPS coordinates, but I return a static location instead!
        return "ABC Street, 234";
    }

    public Boolean hasGpsConnection() {
        return true;
    }
}
