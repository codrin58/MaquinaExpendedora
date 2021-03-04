import java.util.Scanner;
public class MaquinEx {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);   
        String productos[][] = new String[3][3];
        int stock[][] = new int[3][3];
        float precios[][] = new float[3][3];
        
        
//Poner productos en motriz productos(string)
        productos[0][0] = "Coca-cola";
        productos[0][1] = "Fanta";
        productos[0][2] = "Colacao";
        productos[1][0] = "Monster";
        productos[1][1] = "Agua50ml";
        productos[1][2] = "Kinder";
        productos[2][0] = "Oreo  ";
        productos[2][1] = " Chips  ";
        productos[2][2] = "  Zumo";
//Poner precios en motriz precios (float) 
        precios[0][0] =(float)1.00;
        precios[0][1] =(float)1.00;
        precios[0][2] =(float) 0.80;
        precios[1][0] =(float) 1.50;
        precios[1][1] =(float) 0.50;
        precios[1][2] =(float) 1.20;
        precios[2][0] =(float)1;
        precios[2][1] =(float) 0.80;
        precios[2][2] =(float) 0.80;
//Poner stock en motriz stock (int)
        stock[0][0]=12;
        stock[0][1]=12;
        stock[0][2]=12;
        stock[1][0]=12;
        stock[1][1]=12;
        stock[1][2]=12;
        stock[2][0]=12;
        stock[2][1]=12;
        stock[2][2]=12;
        int menu=1;
        while (menu==1) {
        System.out.println("Bienvenido,que deseas hacer ?:");
        System.out.print("");
        System.out.println("***************Menu***************");
        System.out.println("Ver Precios/productos/stock: 1");
        System.out.println("Comprar: 2");
        System.out.println("Mantenimiento: 3");
         menu=sc.nextInt();
       
        switch(menu) {
        case 1:
          System.out.println("Aqui esta nuestro catalogo:");
          System.out.println(" ");
          System.out.println("Productos:");
          showmatriz1(productos);
          System.out.println("Precios:");
          showmatriz2(precios);
          System.out.println("Stock:");
          showmatriz3(stock);
          
          break;
        case 2:
         While(tenimstock()==false || tenimcanvi()==false || ComprarCol=4) {
          System.out.println("Que quieres comprar?");
          System.out.println("introduce numero columna del productor");
          int ComprarCol=sc.nextInt();
          System.out.println("introduce numero fila del productor");
          int ComprarFil=sc.nextInt();
          if(tenimstock()==true && tenimcanvi()==true) {
              System.out.println("Aqui tens el teu producte:" + productos[ComprarCol][ComprarFil]);
              System.out.println("Aqui tens el teu canvi:"+RetornCanvi());
          }
          else if (tenimcanvi()==false && tenimstock()==true) {
              System.out.println("No hi ha canvi, torna a probar amb el import exacte");
          }
           else if (tenimstock()==false) {
                  System.out.println("No queda d'aquest producte");
          }
         }
          break;
        
        case 3:
        default:
          System.out.print("Escoja una de las opciones validas");
      }
       } 
    }


    private static boolean tenimstock() {
        // TODO Auto-generated method stub
        return false;
    }

    private static boolean tenimcanvi() {
        // TODO Auto-generated method stub
        return false;
    }

    private static String RetornCanvi() {
        // TODO Auto-generated method stub
        return null;
    }

    private static void showmatriz2(float[][] precios) {
        // TODO Auto-generated method stub
        for (int i=0; i < precios.length; i++) {
            for (int j=0; j < precios.length; j++) {
              System.out.print (precios[i][j]);
              System.out.print("  ");
            }
            System.out.println();
          }
    }
    
    private static void showmatriz3(int[][] stock) {
        // TODO Auto-generated method stub
        for (int i=0; i < stock.length; i++) {
            for (int j=0; j < stock.length; j++) {
              System.out.print (stock[i][j]);
              System.out.print(" ");
            }
            System.out.println();
          }
    }

    private static void showmatriz1(String[][] productos) {
        // TODO Auto-generated method stub
        for (int i=0; i < productos.length; i++) {
            for (int j=0; j < productos.length; j++) {
              System.out.print (productos[i][j]);
              System.out.print(" ");
            }
            System.out.println();
          }
    }

}
