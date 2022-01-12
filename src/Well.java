
public class Well {
	public int water;
;

	public Well(int water) {
		super();
		this.water = water;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	@Override
	public String toString() {
		return "Well [water=" + water + "]";
	}
	
	

}
