import java.util.Scanner;
public class percobaan6{
public static void main (String[] args) {
	Scanner masukan = new Scanner(System.in);
	int nilai1, nilai2, hasil;
	System.out.print("Masukkan integer pertama : ");
	nilai1 = masukan.nextInt();
	System.out.print("Masukkan integer kedua   : ");
	nilai2 = masukan.nextInt();  
	hasil = nilai1 + nilai2;
	System.out.println("hasil = "+nilai1+ "+" +nilai2+ "= " +hasil);
	}
}