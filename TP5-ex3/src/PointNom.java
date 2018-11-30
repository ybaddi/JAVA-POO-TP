
public class PointNom extends  Point {
	
	private char nom;

	public void setPointNom(int x, int y, char nom) {
		setPoint(x, y);
		this.nom = nom;
		
	}
	
	
  
	
	public void setNom(char nom) {
		this.nom = nom;
	}
	
	public void affCoordNom() {
		System.out.println("Point de nom " + nom + " ");
		affCoord();
	}

}
