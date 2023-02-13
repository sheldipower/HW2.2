package transport;

public class transport {
    private final String brand;
    private final String modal;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public transport(String brand, String modal, int year, String country, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand=brand;
        if (modal == null || modal.isEmpty()) {
            modal = "default";
        }
        this.modal = modal;
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        this.country = country;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        this.color = color;
        }
    }
    public String getBrand () {
        return brand;
    }

    public String getModal() {
        return modal;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;

    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 120;
        }
    }


}
