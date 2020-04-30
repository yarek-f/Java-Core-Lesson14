package lviv.lgs.ua.min;

public class MarriedCouple {

	private String coupleName;
	private int yearsOfMarriedLife;

	public MarriedCouple(String coupleName, int yearsOfMarriedLife) {
		this.coupleName = coupleName;
		this.yearsOfMarriedLife = yearsOfMarriedLife;
	}

	public String getCouple() {
		return coupleName;
	}

	public void setCouple(String couple) {
		this.coupleName = couple;
	}

	public int getYearsOfMarriedLife() {
		return yearsOfMarriedLife;
	}

	public void setYearsOfMarriedLife(int yearsOfMarriedLife) {
		this.yearsOfMarriedLife = yearsOfMarriedLife;
	}

	@Override
	public String toString() {
		return "MarriedCouple [couple=" + coupleName + ", yearsOfMarriedLife=" + yearsOfMarriedLife + "]";
	}

}
