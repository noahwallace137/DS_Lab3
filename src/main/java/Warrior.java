
public class Warrior extends Job
{
	@Override
	public int attack (Race race, int val) {
		return (race.getSTR() * val + race.getDEX());
		
	}
	
	@Override
	public String getJobName() {
		return "WARRIOR";
	}

}
