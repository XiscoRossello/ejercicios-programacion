/*Después de más de una hora de romperme la cabeza he conseguido algo que funciona.
Desgraciadamente no puedo hacer un desarrollo de como he llegado hasta él ya que lo tengo en papel pero no tengo problema en explicar el proceso en clase.

He seguido los tutoriales de W3school para entender como funciona tanto el Math.random como el if y else if. He intentado prebiamente hacerlo 
con swicht case pero se me ha hecho un tanto complejo.

Ejercicio final de Piedra,Papel y tijera.*/

public class MainClass {
2	  public static void main(String[] args) {
3	  int jugador1 = (int)(Math.random() * 3);
4	  int jugador2 = (int)(Math.random() * 3);
5	 
6	  if (jugador1 == 0) {
7	    
8	      if (jugador2 == 0){
9	      System.out.println("Piedra, Piedra, empate");
10	      }
11	      else if (jugador2 == 1){
12	      System.out.println("Piedra, Papel, ¡Gana el jugador 2!");
13	      }
14	      else  {
15	      System.out.println("Piedra, Tijeras, ¡Gana el jugador 1!");  
16	  }
17	} 
18	  else if (jugador1 == 1) {
19	    
20	      if (jugador2 == 0){
21	      System.out.println("Papel, Piedra, ¡Gana el jugador 1!");
22	      }
23	      else if (jugador2 == 1){
24	      System.out.println("Papel, Papel, ¡Empate!");
25	      }
26	      else  {
27	      System.out.println("Papel, Tijeras, ¡Gana el jugador 2!");  
28	  }
29	} 
30	  else  {
31	    
32	      if (jugador2 == 0){
33	      System.out.println("Tijeras, Piedra, ¡Gana el jugador 2!");
34	      }
35	      else if (jugador2 == 1){
36	      System.out.println("Tijeras, Papel, ¡Gana el jugador 1!");
37	      }
38	      else  {
39	      System.out.println("Tijeras, Tijeras, ¡Empate!");  
40	  }
41	} 
42	}
43	}
