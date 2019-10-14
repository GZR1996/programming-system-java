package class6.Moster;

public abstract class Monster {

	protected int hitPoints;
	protected int attackPoints;
	protected String type;
	protected String[] weaknesses;
	
	public Monster() {}
	
	public Monster(int hitPoints, int attackPoints) {
		this.hitPoints = hitPoints;
		this.attackPoints = attackPoints;
	}
	
	public boolean isWeakAgainst (String otherType) {
		boolean isWeak = false;
		
		if (weaknesses == null) {
			return false;
		}
		
		for (String weakness: weaknesses) {
			if (otherType.equals(weakness)) {
				isWeak = true;
			}
		}
		
		return isWeak;
	}
	
	public void removeHitPoints (int pointsToRemove) {
		hitPoints = Math.max(0, hitPoints-pointsToRemove);
	}
	
	public boolean attack (Monster otherMonster) {
		if (!this.dodge()) {
			if (this == otherMonster) {
				return false;
			}
			
			if (this.hitPoints == 0 || otherMonster.getHitPoints() == 0) {
				return false;
			} else {
				if (otherMonster.isWeakAgainst(otherMonster.getType())) {
					otherMonster.removeHitPoints(20+this.attackPoints);
				} else {
					otherMonster.removeHitPoints(this.attackPoints);
				}
			}		
		} else {
			this.removeHitPoints(10);
		}
		
		return true;
	}
	
	protected abstract boolean dodge();

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(String[] weaknesses) {
		this.weaknesses = weaknesses;
	}	
	
	public static void main(String[] args) {
		Monster monster1 = new WaterMonster(100, 20);
		Monster monster2 = new FireMonster(100, 20);
		monster1.attack(monster2);
		monster2.attack(monster1);
		System.out.println(monster1.hitPoints + " " + monster1.attackPoints);
		System.out.println(monster2.hitPoints + " " + monster2.attackPoints);
	}
}
