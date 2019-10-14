package class6.Moster;

public class FireMonster extends Monster{
	
	private boolean isFirstTime = true;
	
	public FireMonster() {
		super();
		this.type = "Fire";
	}
	
	public FireMonster(int hitPoints, int attackPoints) {
		super(hitPoints, attackPoints);
		this.type = "Fire";
		this.weaknesses = new String[1];
		this.weaknesses[0] = "Water";
	}

	@Override
	protected boolean dodge() {
		if (isFirstTime) {
			isFirstTime = false;
			return true;
		} else {
			isFirstTime = true;
			return false;
		}
	}
}
