package transport;

public class Car extends transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean rubber;
    private Key key;

    public static class Key {
        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }
    }


    public Car( double engineVolume, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean rubber, Key key)
    {
 super(brand, modal, year, country, color);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.rubber = rubber;
    }



    private double getEngineVolume() {
        return engineVolume;
    }

    private void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
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



