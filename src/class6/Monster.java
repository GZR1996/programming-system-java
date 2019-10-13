package class6;

public abstract class Monster {

	private int hitPoints;
	private int attackPoints;
	private String type;
	private String[] weaknesses;
	
	public Monster() {
		type = "";
		weaknesses = new String[1];
	}
	
	public Monster(int hitPoints, int attackPoints, String[] weaknesses) {
		this.hitPoints = hitPoints;
		this.attackPoints = attackPoints;
		this.weaknesses = weaknesses;
	}
	
	public boolean isWeakAgainst (String otherType) {
		boolean isWeak = false;
		
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
		
		return true;
	}

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
}
