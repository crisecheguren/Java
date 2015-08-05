import java.util.Scanner;

class Room {
	int roomNumber;
	String roomName;
	String description;
	int numExits;
	String[] exits = new String[10];
	int[] destinations = new int[10];
}

public class TextAdventureFinal {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		//initialize rooms from file
		Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");

		//showAllRooms(rooms); // for debugging

		int currentRoom = 0;
		String ans;
		while ( currentRoom >= 0 ) {
			Room cur = rooms[currentRoom];
			System.out.print( cur.description );
			System.out.print(">  ");
			ans = keyboard.nextLine();

			// See if what they typed matches any of our exit names
			boolean found = false;
			for (int i = 0; i < cur.numExits; i++) {
				if ( cur.exits[i].equals(ans) ) {
					found = true;
					// if so, change our next room to that exit's room number
					currentRoom = cur.destinations[i];
				}
			}
			if (! found)
				System.out.println("Sorry, I don't understand.");
		}
	}

	public static Room[] loadRoomsFromFile(String filename) {
		Scanner file = null;
		try {
			file = new Scanner(new java.io.File(filename));
		}
		catch (java.io.IOException ex) {
			System.err.println("Sorry, I can't read from the file '" + filename + "'.");
			System.exit(1);
		}

		int numRooms = file.nextInt();
		Room[] rooms = new Room[numRooms];

		// initialize rooms from file
		int roomNum = 0;
		while ( file.hasNext() ) {
			Room r = getRoom(file);
			if (r.roomNumber != roomNum) {
				System.err.println("Reading room # " + r.roomNumber + ", but " + roomNum + " was expected.");
				System.exit(2);
			}
			rooms[roomNum] = r;
			roomNum++;
		}
		file.close();
		return rooms;
	}
		public static void showAllRooms(Room[] rooms){
			for (Room r : rooms ) {
				String exitString = "";
				for (int i = 0; i < r.numExits; i++) {
					exitString +="\t" + r.exits[i] + " (" + r.destinations[i] + ").";
				}

				System.out.println(r.roomNumber + ") " + r.roomName + "\n" + exitString );


			}
		}

		public static Room getRoom(Scanner f) {
			// any rooms left in this file?
			if (! f.hasNext() )
				return null;

			Room r = new Room();
			String line;

			// read in the room # for error-checking later
			r.roomNumber = f.nextInt();
			f.nextLine(); // skip "\n" after room #

			r.roomName = f.nextLine();

			//read in the room's description
			r.description = "";
			while (true) {
				line = f.nextLine();
				if  (line.equals("%%"))
					break;
				r.description += line + "\n";
			}

			// finally we'll read in the exits
			int i = 0;
			while (true) {
				line = f.nextLine();
				if (line.equals("%%") )
					break;
				String[] parts = line.split(":");
				r.exits[i] = parts[0];
				r.destinations[i] = Integer.parseInt(parts[1]);
				i++;
			}

			r.numExits = i;

			//should be done. return the room

			return r;
		}

}