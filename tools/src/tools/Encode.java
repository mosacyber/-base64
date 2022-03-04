package tools;

import java.util.Base64;

public class Encode {
     public static String encode (String str) {
    Base64.Encoder encoder = Base64.getEncoder();
    byte[] encoded = encoder.encode(str.getBytes());
    return new String(encoded);
 }
}
