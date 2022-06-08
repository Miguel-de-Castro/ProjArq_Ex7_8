package com.bcopstein;

import org.springframework.stereotype.Component;

@Component
public class Receiver { 
  public void receiveMessage(String message) {
    //HistoryDTO hDto = HistoryDTO.fromJSon(message);
    System.out.println("History received: "+message);
  }
}
