import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class herotesting
{
	public void checkAttributes(HeroInterface hero, String raceName, String jobName, int str, int dex, int i) {
		assertEquals(raceName, hero.getRaceName());
		assertEquals(jobName, hero.getJobName());
		assertEquals(str, hero.getSTR());
		assertEquals(dex, hero.getDEX());
		assertEquals(i, hero.getINT());		
	}
	
	
	@Test
	public void DwarfWarriorTesting() {
		HeroInterface hero = HeroFactory.createHero("DWARF", "WARRIOR");
		checkAttributes(hero, "DWARF", "WARRIOR", 25, 20, 20);
		assertEquals(245, hero.attack(9));
		assertEquals(120, hero.attack(4));
		
	}
	
	@Test
	public void DwarfArcherTesting() {
		HeroInterface hero = HeroFactory.createHero("DWARF", "ARCHER");
		checkAttributes(hero, "DWARF", "ARCHER", 25, 20, 20);
		assertEquals(150, hero.attack(5));
		assertEquals(300, hero.attack(10));
		
	}
	
	@Test
	public void DwarfMageTesting() {
		HeroInterface hero = HeroFactory.createHero("DWARF", "MAGE");
		checkAttributes(hero, "DWARF", "MAGE", 25, 20, 20);
		assertEquals(120, hero.attack(5));
		assertEquals(220, hero.attack(10));
		
	}
	
	@Test
	public void ElfWarriorTesting() {
		HeroInterface hero = HeroFactory.createHero("ELF", "WARRIOR");
		checkAttributes(hero, "ELF", "WARRIOR", 20, 25, 20);
		assertEquals(125, hero.attack(5));
		assertEquals(225, hero.attack(10));
	}
	
	@Test
	public void ElfArcherTesting() {
		HeroInterface hero = HeroFactory.createHero("ELF", "ARCHER");
		checkAttributes(hero, "ELF", "ARCHER", 20, 25, 20);
		assertEquals(187, hero.attack(5));
		assertEquals(375, hero.attack(10));
	}

	@Test
	public void ElfMageTesting() {
		HeroInterface hero = HeroFactory.createHero("ELF", "MAGE");
		checkAttributes(hero, "ELF", "MAGE", 20, 25, 20);
		assertEquals(125, hero.attack(5));
		assertEquals(225, hero.attack(10));
	}

	@Test
	public void RobotWarriorTesting() {
		HeroInterface hero = HeroFactory.createHero("ROBOT", "WARRIOR");
		checkAttributes(hero, "ROBOT", "WARRIOR", 20, 20, 25);
		assertEquals(120, hero.attack(5));
		assertEquals(220, hero.attack(10));
	}

	@Test
	public void RobotArcherTesting() {
		HeroInterface hero = HeroFactory.createHero("ROBOT", "ARCHER");
		checkAttributes(hero, "ROBOT", "ARCHER", 20, 20, 25);
		assertEquals(150, hero.attack(5));
		assertEquals(300, hero.attack(10));
	}

	@Test
	public void RobotMageTesting() {
		HeroInterface hero = HeroFactory.createHero("ROBOT", "MAGE");
		checkAttributes(hero, "ROBOT", "MAGE", 20, 20, 25);
		assertEquals(145, hero.attack(5));
		assertEquals(270, hero.attack(10));
	}
	
	@Test
	public void RobotCatTesting() {
		HeroInterface hero = HeroFactory.createHero("ROBOT", "CLASS");
		assertNull(hero);
	}
		
		
	
	@Test 
	public void FairyArcherTesting() {
		HeroInterface hero = HeroFactory.createHero("FAIRY", "ARCHER");
		assertNull(hero);
	}
}
