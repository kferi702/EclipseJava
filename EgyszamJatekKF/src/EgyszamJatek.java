import java.io.*;
import java.util.*;

public class EgyszamJatek {

	static RandomAccessFile f;
	static String t[][] = new String[9][10];
	static int be;
	static void adatokBe(String f_neve)
	{
		try {
			f = new RandomAccessFile(f_neve, "r");
			int sorokN = t.length;
			for (int sor = 0; sor < sorokN; sor++) {
				t[sor] = f.readLine().split(" ");
				for (int oszlop = 0; oszlop < t[0].length; oszlop++) {
				}
			}
			f.close();
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	static void kiiras() {
		for (int i = 0; i < t.length; i++) {
			System.out.println();
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j]+" ");
			}
		}
		System.out.println("\n\n");
	}
	static void f3() {
		System.out.print("3. Feladat: ");
		System.out.println("Játékosok száma: "+t.length);
	}
	static void f4() {
		System.out.print ("4. Feladat: ");
		System.out.println("Fordulók száma: "+t[0].length);
	}
	static void f5() {
		System.out.print ("5. Feladat: ");
		boolean egyes=false;
		for (int i = 0; i < t.length; i++) {
			if (Integer.parseInt(t[i][0])==1)
				egyes=true;
		}
			if (egyes)
				System.out.println("Az első fordulóban volt egyes tipp!");
			else
				System.out.println("Az első fordulóban nem egyes tipp!");
	}
	static void f6() {
		System.out.print("6. Feladat: ");
		int db=0;
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length-1; j++) {
				if (Integer.parseInt(t[i][j])>db) {
					db=Integer.parseInt(t[i][j]);
				}
			}
		}
		System.out.println("A lenagyobb tipp a fordulók során: "+db);
	}
	static void f7() {
		System.out.print("7. Feladat: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Kérem a forduló sorszámát [1−10]: ");
		be  = sc.nextInt();
			}
	static void f8() {
		System.out.print("8. Feladat: ");
		int tipp;
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length-1; j++) {
				
			}
		}
		
		System.out.println("A nyertes tipp a megadott fordulóban: ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adatokBe("egyszamjatek.txt");
		kiiras();
		f3();
		f4();
		f5();
		f6();
		f7();
		f8();
	}
	
}


