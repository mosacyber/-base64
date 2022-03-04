
package tools;

import java.util.Base64;


public class Decode {
       public static String decode (String str) {
   Base64. Decoder decoder = Base64.getDecoder ();
    byte[] decoded = decoder.decode (str);
    return new String (decoded);
}
     
}
