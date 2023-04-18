import java.util.Scanner;

public class M73_ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float fideus = 0f;
		float gambes = 0f;
		float calamars = 0f;
		int persones = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indica el preu per kilo del fideu(en Euros): ");
		fideus = entrada.nextFloat();
		
		System.out.println("Indica el preu per kilo de gambes(en Euros): ");
		gambes = entrada.nextFloat();
		
		System.out.println("Indica el preu per kilo de calamars(en Euros): ");
		calamars = entrada.nextFloat();
		
		System.out.println("Indica quantes persones vindran: ");
		persones = entrada.nextInt();
		
		System.out.println("La quantitat de fideus necessària seran :" + (float)(persones * fideusPp()) + " Kgs");
		System.out.println("La quantitat de gambes necessària seran :" + (float)(persones * gambesPp())+ " Kgs");
		System.out.println("La quantitat de calamars necessària seran :" + (float)(persones * calamarsPp())+ " Kgs");
		
		//System.out.println("El preu per persona per fideus :" + (float)(persones * fideusPp() * fideus) + " Euros");
		//System.out.println("El preu per persona per gambes :" + (float)(persones * gambesPp() * gambes)+ " Euros");
		//System.out.println("El preu per persona per calamars :" + (float)(persones * calamarsPp() * calamars)+ " Euros");
		
		System.out.println("El preu total de la fideua es de :" + (float)((persones * fideusPp() * fideus) + 
				(persones * gambesPp() * gambes) + (persones * calamarsPp() * calamars))+ " Euros");
		System.out.println("El preu per persona de la fideua es de :" + (float)(((persones * fideusPp() * fideus) + 
				(persones * gambesPp() * gambes) + (persones * calamarsPp() * calamars)) / persones) + " Euros");	
	}
	public static float fideusPp() {
		return (float) 0.500 / 4;
	}
	public static float gambesPp() {
		return (float) 0.400 / 4;
	}
	public static float calamarsPp() {
		return (float) 0.200 / 4;
	}
						
}
