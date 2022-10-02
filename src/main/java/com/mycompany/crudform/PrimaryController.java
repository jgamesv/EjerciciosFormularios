package com.mycompany.crudform;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController{

    @FXML
    private TextField user;
    @FXML
    private TextField pass;
    @FXML
    private TextField discount;
        
    @FXML
    
    private void addClient(){
      System.out.println(user.getText()+" "+pass.getText()+" "+discount.getText());
    }
        private void findClient(){
      System.out.println(user.getText()+" "+pass.getText()+" "+discount.getText());
    }
        private void price(){
      System.out.println(user.getText()+" "+pass.getText()+" "+discount.getText());
    }
        private void exit(){
      System.out.println(user.getText()+" "+pass.getText()+" "+discount.getText());
    }
        
    
}
