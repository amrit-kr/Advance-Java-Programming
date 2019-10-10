
package wild_card;
/**
 * @author Amrit1.Kumar
 *
 */
public class House extends Building {

	public int numberOfRooms = 10;

	@Override
	public String toString() {
		return ("house");
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

}
