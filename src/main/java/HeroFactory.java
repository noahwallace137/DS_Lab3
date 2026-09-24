public class HeroFactory
{

   public static HeroInterface createHero(String raceName, String jobName)   
   {
	   if (raceName == null || jobName == null ) {
		   return null;
   }
	   Race race = null;
	   
	   if (raceName.equals("ELF")) {
		   race = new Elf();
	   }
	   else if (raceName.equals("ROBOT")) {
		   race = new Robot();
	   }
	   else if (raceName.equals("DWARF")) {
		   race = new Dwarf();
	   }
	   Job job = null;
	   if (jobName.equals("MAGE")) {
		   job = new Mage();
	   }
	   if (jobName.equals("ARCHER")) {
		   job = new Archer();
	   }
	   if (jobName.equals("WARRIOR")) {
		   job = new Warrior();
	   }
	   if (race == null || job == null) {
		   return null;
	   }
	   return new Hero(race, job);

   }
}