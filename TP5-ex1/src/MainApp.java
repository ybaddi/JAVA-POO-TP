
public class MainApp {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.initialise(3, 6);
		System.out.println("Coordonnees : " + p.getX() + " " + p.getY());
		PointA pA = new PointA();
		pA.initialise(2, 10);
		//System.out.println("Coordonnees : " + p.getX() + " " + p.getY());
		pA.affiche();

	}

}
