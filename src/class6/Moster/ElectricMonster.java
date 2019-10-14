package class6.Moster;

public class ElectricMonster extends Monster {
	
	public ElectricMonster() {
		super();
		this.type = "Electric";
	}
	
	public ElectricMonster(int hitPoints, int attackPoints) {
		super(hitPoints, attackPoints);
		this.type = "Electric";
	}

	@Override
	protected boolean dodge() {
		return false;
	}
}
