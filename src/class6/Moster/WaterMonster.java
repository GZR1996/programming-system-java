package class6.Moster;

public class WaterMonster extends Monster {
	public WaterMonster() {
		super();
		this.type = "Water";
	}
	
	public WaterMonster(int hitPoints, int attackPoints) {
		super(hitPoints, attackPoints);
		this.type = "Water";
		this.weaknesses = new String[2];
		this.weaknesses[0] = "Fire";
		this.weaknesses[1] = "Electric";
	}

	@Override
	protected boolean dodge() {
		if (hitPoints >= 100) {
			return true;
		} else {
			return false;
		}
	}
}
