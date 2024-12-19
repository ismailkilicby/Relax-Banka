/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankacibitir;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


/**
 *
 * @author a
 */
public class Baglanti {
    public static Connection connecrb(){
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://HUAWEI\\SERVERINSTANCE:1433;databaseName=banka;encrypt=true;trustServerCertificate=true","sa","12345");
            return conn;
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return null;
    }
    public static void main(String[] args) {
        
    }
}
