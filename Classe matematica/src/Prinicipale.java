import java.io.*;
public class Prinicipale {
	public static void main(String[] args) {
	
		int n=10;
		String valore="";
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader (input); 
		Matematica m = new Matematica();
		
		for(int i=0;i<n;i++) {
			System.out.println("Inserisci l'elemento " + String.valueOf(i+1));
			try {
			valore=tastiera.readLine();	
			}catch(Exception e){
				
			}
			m.vetInt[i]=Integer.valueOf(valore).intValue();
		}
		
		System.out.println("La media del vettore dei numeri interi è: " + m.CalcolaMedia1(m.vetInt, n));
		System.out.printf("%.2f", m.CalcolaMedia1(m.vetInt, n));
		
		int d=10;
		int []a=new int[100];
		
		for(int b=0;b<d;b++) {
			System.out.println("Inserisci l'elemento " + String.valueOf(b+1));
			try {
			valore=tastiera.readLine();	
			}catch(Exception e){
				
			}
			m.vetFlo[b]=Float.valueOf(valore).floatValue();
		}
		System.out.println("La media del vettore dei numeri reali è: " + m.CalcolaMedia2(m.vetFlo, n));
		System.out.printf("%.2f", m.CalcolaMedia2(m.vetFlo, n));
		
		
		
		
  }
	
}