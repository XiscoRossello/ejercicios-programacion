/*Creamos un programan en el que dado un numero aleatorio de petalos en una flor, éste los arrancará y finalmente dará con la oración que debiera encontrarse en esa posición, teniendo 6 opciones distintas.
Añadimos también el numero aleatorio como parte de lo que se enseña para poder evaluar si el programa funciona correctamente, una vez comprobado puede eliminarse*/

public class FloresClass {
  public static void main(String[] args) {
int teAmo = 1;
int unPoco = 2;
int mucho = 3;
int pasion = 4;
int loco = 5;
int no = 6;
int contador = 0;
int numero = (int)(Math.random() * 101);

while ( contador < numero){
  if (teAmo == numero){
    System.out.println("Te amo " + numero);
  }
  else {
    teAmo += 6;
    contador ++;
      }
  
    if (unPoco == numero){
    System.out.println("Te quiero un poquito " + numero);
  }
  else {
    unPoco += 6;
    contador ++;
     }
      if (mucho == numero){
    System.out.println("Te quiero mucho " + numero);
  }
  else {
    mucho += 6;
    contador ++;
      }
      if (pasion == numero){
    System.out.println("Te quiero apasionadamente " + numero);
  }
  else {
    pasion += 6;
    contador ++;
      }
      if (loco == numero){
    System.out.println("Te quiero locamente " + numero);
  }
  else {
    loco += 6;
    contador ++;
      }
      if (no == numero){
    System.out.println("NO TE QUIERO " + numero);
  }
  else {
    no += 6;
    contador ++;
      }
    }
  }
}
