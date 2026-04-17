
public class Main {

	public static void main(String[] args) {
		LivingRoom myLivingRoom = new LivingRoomBuilder()
	            .setDimensions("20x15")
	            .setTvStand(true)        // 1 TV Stand
	            .setNumberOfCouches(2)   // 2 Couches
	            .setNumberOfPlants(3)    // 3 Plants
	            .setWallColor("Beige")
	            .build();

	        System.out.println("Living Room Created Successfully:");
	        System.out.println(myLivingRoom);
	}

}
