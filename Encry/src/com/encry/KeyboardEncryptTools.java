package com.encry;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

public class KeyboardEncryptTools {

	  private static byte[] sPassword = new byte[] {       //用户密钥
              88,25,-35,-45,25,98,-55,-7,10,35,-45,25,
              26,-12,25,45,-78,-99,85,14,2,10,-0,11,
              -35,48,-99,65,32,14,-78,25,36,-56,15,-45,
              1,15,-35,-75,15,26,62,95,33,-5,25,78,-88
  };

  private static final int BYTE_MAX_LENGTH = 256;

  /**
   * 对称加密
   */
  public static byte[] encrypt(StringBuilder data) {

      byte[] strBuilderByte = new byte[BYTE_MAX_LENGTH];
      int byteLength = 0;
      for (int i = 0; i < data.length(); i++) {
          String zz = data.substring(i,i+1);
          byte[] bb = zz.getBytes();
          for (byte b: bb) {
              strBuilderByte[byteLength++] = b;
          }
      }

      return encrypt(strBuilderByte, byteLength);
  }

  public static byte[] encrypt(byte[] data) {
      if (null == data || 0 == data.length) {
          return null;
      }
      return encrypt(data, data.length);
  }

  public static byte[] encrypt(byte[] content, int length) {
      try {
          KeyGenerator kgen = KeyGenerator.getInstance("AES");

          //SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "Crypto");
          //sr.setSeed(sPassword);
          //kgen.init(128, sr); // 192 and 56 bits may not be available
          byte[] enCodeFormat = kgen.generateKey().getEncoded();

          SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
          Cipher cipher = Cipher.getInstance("AES");// 创建密码器
          cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
          return cipher.doFinal(content, 0, length);
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
  }

  /**
   * 解密
   */
  public static byte[] decrypt(byte[] data) {
      if (null == data || 0 == data.length) {
          return null;
      }
      return decrypt(data, data.length);
  }
  public static byte[] decrypt(byte[] data, int length) {
      try {
          KeyGenerator kgen = KeyGenerator.getInstance("AES");

          SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "Crypto");
          sr.setSeed(sPassword);
          kgen.init(128, sr); // 192 and 256 bits may not be available
          byte[] enCodeFormat = kgen.generateKey().getEncoded();

          SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
          Cipher cipher = Cipher.getInstance("AES");// 创建密码器
          cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
          return cipher.doFinal(data, 0, length);
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
  }
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("123456");
		try {
			String s=CryptLib.SHA256("123456", 256);
			System.out.println(s);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] data=encrypt(sb);
			System.out.println(Arrays.toString(data));
			
		
	}

}
