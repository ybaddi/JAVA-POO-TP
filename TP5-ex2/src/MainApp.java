
public class MainApp {

	public static void main(String[] args) {
		Point p = new Point();
		p.setPoint(3, 7);
		p.affCoord();
		
		PointNom p1 = new PointNom();
		p1.affCoordNom();
		p1.setPointNom(3, 5, 'A');
		p1.affCoordNom();
		p1.deplace(5, 2);
		p1.affCoordNom();
		
		PointNom p2 = new PointNom();
		p2.setPoint(1, 4);
		p2.setNom('B');
		p2.affCoordNom();
		p2.deplace(5, 2);
		p2.affCoordNom();

	}

}
