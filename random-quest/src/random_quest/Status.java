package random_quest;

public class Status {
	private String name;
	private int    hp;
	private int    maxHp;
	public Status(String name,int hp){
		this.name = name;
		this.hp   = hp;
		this.maxHp = hp;
	}

	public void attack(Status target){
		System.out.printf("%sの攻撃!\n",name);
		int damage = Main.rand.nextInt(49)+1;
		target.setHp(target.getHp() - damage);
		System.out.printf("%sに%dのダメージ!\n",target.getName(),damage);
	}

	public void heal(){
		System.out.println("ぶつぶつ言っている・・・");
		if(maxHp == hp){
			System.out.println("だが何も起こらなかった");
		}else{
			int heal = Main.rand.nextInt(29)+1;
			if(hp + heal > maxHp) heal = maxHp - hp;
			this.hp += heal;
			System.out.printf("%sのHPが%d回復した\n",name,heal);
		}
	}

	public void runAway(){
		System.out.printf("%sは逃げ出した\n",name);
	}

	public String getName(){
		return this.name;
	}

	public void setHp(int hp){
		this.hp = hp;
	}

	public int getHp(){
		return this.hp;
	}



}
