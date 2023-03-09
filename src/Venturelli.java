import java.util.Scanner;

public class Venturelli
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				es1();
				break;
			case 2:
				dueSequenze();
				break;
			case 3:
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. 1 - Titolo es. Prodotto numeri decimali");
		System.out.println("2 - Es n. 2 - Titolo es. Due sequenze");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	static void es1()
	{
		double[] array = new double[6];
		double[] array2 = new double[3];
		int n = 0;
		System.out.println("Inserire i numeri");

		for(int i=0; i<array.length; i++)
		{
			n = (int) (Math.random()*100);
			array[i] = (double) n/10;
			System.out.println(array[i]);
		}
		System.out.println();
		for(int i=0, j=0; i<array2.length; i++, j+=2)
		{
			n = (int) ((array[j]*array[j+1])*100);
			array2[i] = (double) n/100;
		}

		for(int i=0; i<array2.length; i++)
			System.out.println(array2[i]);

	}

	static void dueSequenze()
	{
		String[] array = new String[5];
		String[] array2 = new String[5];
		boolean uguali = false;
		System.out.println("Inserisci le parole del primo array");
		for(int i=0; i<array.length; i++)
			array[i] = in.nextLine();
		System.out.println("Inserisci le parole del secondo array");
		for(int i=0; i<array.length; i++)
			array2[i] = in.nextLine();

		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length; j++)
			{
				if(array[i].equals(array2[j]))
				{
					System.out.println("OK");
					uguali = true;
					break;
				}
			}
		}
		if(uguali == false)
			System.out.println("NO");
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length; j++)
			{
				if(array[i].equals(array2[j]))
					System.out.println(array[i] + " Posizione nel primo array: "+ i + " Posizione nel primo array: " + j);	
			}
		}

	}
}
