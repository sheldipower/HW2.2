public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean rubber;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean rubber) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.rubber = rubber;
    }

    private String getBrand() {
        return brand;
    }

    private String getModel() {
        return model;
    }

    private double getEngineVolume() {
        return engineVolume;
    }

    private void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;}
        private int getYear () {
            return year;
        }

        private String getCountry () {
            return country;
        }

        private String getTransmission () {
            return transmission;
        }
    private void setTransmission(String transmission) {
        this.transmission = transmission;}

        private String getBodyType () {
            return bodyType;
        }

        private int getRegistrationNumber () {
            return registrationNumber;
        }

    private void  setRegistrationNumber() {
        this.registrationNumber=registrationNumber;

    }

        private int getNumberOfSeats () {
            return numberOfSeats;
        }

        private boolean getRubber () {
            return rubber;
        }

    private void setRubber() {
        this.rubber=rubber;
    }

    }



