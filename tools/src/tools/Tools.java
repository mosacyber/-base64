
package tools;

import java.util.Scanner;


public class Tools {

 
    public static void main(String[] args) {
       Scanner hash = new Scanner(System.in);
         System.out.println("مرحبا بك في اداة فك التشفير ");
         System.out.println("اختر نوع التشفير");
         System.out.println("******************************");
         System.out.println("1- base64");
         System.out.println("2- base32");
         
            int tty = hash.nextInt();
              
             if (tty==1) {
                 
                 //base64
                  for(int i = 1; i >=1; i++) {
                      Scanner hash2 = new Scanner(System.in);
                  System.out.println("1- Encode تشفير");
                  System.out.println("2- Decodeفك التشفير ");
                  System.out.println("99- خروج");
                    int ttty = hash2.nextInt();
               if (ttty==1){
                    System.out.println("ضع النص المراد تشفيرة");
                   Scanner hash1 = new Scanner(System.in);
                   String serr = hash1.next();
                   System.out.println("/*************/");
                 System.out.println(Encode.encode(serr));
                 System.out.println("/*************/");
                 
               }else if(ttty==99){
                    break;
               }else if(ttty==2){
                    System.out.println("ضع النص المراد فك تشفيرة");
                   Scanner hash1 = new Scanner(System.in);
                   String serr = hash1.next();
                   System.out.println("/*************/");
                 System.out.println(Decode.decode(serr));
                 System.out.println("/*************/");
                 
               }
               
               }
               
             }
             
}
                 

} 
            
           

