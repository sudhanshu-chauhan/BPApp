package com.vdmn.util;

import java.io.IOException;
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RawParser{
  public static Object ParseRawJSON(String filePath, Class<?> targetMapperClass){
    try{
      FileReader input = new FileReader(filePath);
      ObjectMapper mapper = new ObjectMapper();
      Object abc =  mapper.readValue(input, targetMapperClass);
      return abc;
    }catch(IOException e){
      System.out.println("error: " + e.getMessage());
      return null;
    }
  }
}