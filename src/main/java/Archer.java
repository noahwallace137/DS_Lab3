
public class Archer extends Job
{
	@Override
	public int attack (Race race, int val) {
		return (int) (race.getDEX() * 1.5 * val);
		
	}
	
	@Override
	public String getJobName() {
		return "ARCHER";
	}

}
