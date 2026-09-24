
public class Mage extends Job
{
	@Override
	public int attack (Race race, int val) {
		return (race.getDEX() + race.getINT() * val);
		
	}
	
	@Override
	public String getJobName() {
		return "MAGE";
	}

}
