import java.util.Scanner 

public class Converttemperature { 
	   public static void(string[] args) {
		   System.out.println("-------------------welcome-------------------------");
	       System.out.println("-------------Celsius-Fahrenheit/Fahrenheit-Celsius convert------------"); 
	   // Notre objet Scanner 
	       Scanner sc = new Scanner(System.in);
		   
       // initialisation des variables 
	      int C,F;
	   
	  do { 
		  System.out.println(" choisir le mode de conversion" );
	      System.out.println("1- Convertir Celsius-fahrenheit ");
	      System.out.println("2- Convertir fahrenheit-Celsius ");
	     
	      int mode = sc.nextInt(); 
	  if (mode !='1' && mode !='2');
	    System.out.println("erreur, veuillez saisir la température qui convient");
	  if (mode =='1') {
		// saisir la température à convertir 
		    System.out.println("veuillez entrer la température à convertir :");
		    C = sc.nextInt();
		    F =  ((9/5)*C)+32;
		    System.out.print(C +  "°C correspond à : ");
		    System.out.println(arrondi(F,2) + "°F.");
	  }
	  else{
		  F = ((C - 32)*5) / 9; 
		  System.out.print(C + "°F correspond à : ");
		  System.out.println(arrondi(F, 2) + "°C.");			  
	  }		    		
  //fin de programme
	  }
