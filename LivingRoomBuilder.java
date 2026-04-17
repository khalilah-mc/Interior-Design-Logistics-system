
public class LivingRoomBuilder {
	String dimensions;
    double ceilingHeight;
    int floorNumber;
    String wallColor;
    int numberOfWindows;
    int numberOfDoors;
    boolean tvStand;
    int numberOfCouches;
    int numberOfPlants;

    public LivingRoomBuilder setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public LivingRoomBuilder setCeilingHeight(double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public LivingRoomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public LivingRoomBuilder setWallColor(String wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public LivingRoomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public LivingRoomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public LivingRoomBuilder setTvStand(boolean tvStand) {
        this.tvStand = tvStand;
        return this;
    }

    public LivingRoomBuilder setNumberOfCouches(int numberOfCouches) {
        this.numberOfCouches = numberOfCouches;
        return this;
    }

    public LivingRoomBuilder setNumberOfPlants(int numberOfPlants) {
        this.numberOfPlants = numberOfPlants;
        return this;
    }

    // The build method that returns the final object
    public LivingRoom build() {
        return new LivingRoom(this);
    }
}
