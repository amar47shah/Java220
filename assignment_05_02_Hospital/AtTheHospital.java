package assignment_05_02_Hospital;

public class AtTheHospital {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee[] staffList = new Employee[7];
			
		staffList[0] = new Executive("CEO", "Groanus Starks", 300000.00);
		staffList[1] = new Surgeon("Cardiac Surgeon", "Dr. Bada Bumpy", 325000.00);
		staffList[2] = new Doctor("Obstetrician", "Dr. Bertha DaBabies", 310000.00);
		staffList[3] = new Nurse("Nurse Anesthetist", "Mikey Knockyouout", 70000.00);
		staffList[4] = new Receptionist("Receptionist", "Sammie Friday", 35000.00);
		staffList[5] = new Cook("Cook", "Grully Slinga", 30000.00);
		staffList[6] = new Janitor("Janitor", "John McBroom", 25000.00);
		
		staffList[0].welcome();
		((Executive)staffList[0]).grub();
		System.out.println();
		
		staffList[1].welcome();
		((Surgeon)staffList[1]).operate();
		System.out.println();
		
		staffList[2].welcome();
		((Doctor)staffList[2]).diagnose();
		System.out.println();
		
		staffList[3].welcome();
		((Nurse)staffList[3]).vaccinate();
		System.out.println();
		
		staffList[4].welcome();
		((Receptionist)staffList[4]).makeAppointment();
		System.out.println();
		
		staffList[5].welcome();
		((Cook)staffList[5]).serve();
		System.out.println();

		staffList[6].welcome();
		((Janitor)staffList[6]).takeOutTheTrash();
		System.out.println();

	}
	
}
