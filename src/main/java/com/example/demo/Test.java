package com.example.demo;

import java.io.UnsupportedEncodingException;

import org.springframework.security.crypto.codec.Base64;


public class Test {  
	  
    public static void main(String[] args) {  
        System.out.println(generate("my-client-with-secret", "secret"));  
    }  
  
    private static String generate(String clientId, String clientSecret) {  
        String creds = String.format("%s:%s", new Object[] { clientId, clientSecret });  
        try {  
            return "Basic " + new String(Base64.encode(creds.getBytes("UTF-8")));  
        } catch (UnsupportedEncodingException e) {  
            throw new IllegalStateException("Could not convert String");  
        }  
    }  
  
}  