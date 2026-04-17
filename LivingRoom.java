
public class LivingRoom {
	    // Attributes
	    private String dimensions;
	    private double ceilingHeight;
	    private int floorNumber;
	    private String wallColor;
	    private int numberOfWindows;
	    private int numberOfDoors;
	    private boolean tvStand;
	    private int numberOfCouches;
	    private int numberOfPlants;

	    // Private constructor - only the Builder can use this
	    LivingRoom(LivingRoomBuilder builder) {
	        this.dimensions = builder.dimensions;
	        this.ceilingHeight = builder.ceilingHeight;
	        this.floorNumber = builder.floorNumber;
	        this.wallColor = builder.wallColor;
	        this.numberOfWindows = builder.numberOfWindows;
	        this.numberOfDoors = builder.numberOfDoors;
	        this.tvStand = builder.tvStand;
	        this.numberOfCouches = builder.numberOfCouches;
	        this.numberOfPlants = builder.numberOfPlants;
	    }

	    @Override
	    public String toString() {
	        return "LivingRoom [Dimensions=" + dimensions + ", TV Stand=" + tvStand + 
	               ", Couches=" + numberOfCouches + ", Plants=" + numberOfPlants + "]";
	    }
}
