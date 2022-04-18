package tn.esps.exercice2;

public class Robot {
	private int x;
	private int y;
	private int orientation;

	Robot(int x, int y, int orientation) {
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}

	public void tourneraDroite() {
		/*
		 * orientation = (orientation % 4) + 1;
		 */
		if (orientation > 0 && orientation < 4) {
			orientation++;
		} else {
			orientation = 1;
		}

	}

	public void avancer() {
		switch (orientation) {
		case 1:
			y++;
			break;
		case 2:
			x++;
			break;
		case 3:
			y--;
			break;
		case 4:
			x--;
			break;
		default:
			x++;
		}
	}

	public void afficheRobot() {
		System.out.println("Robot [x=" + x + ", y=" + y + ", orientation=" + orientation + "]");
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getOrientation() {
		return orientation;
	}

}
