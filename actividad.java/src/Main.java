//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import javax.swing.*;

public class Main {
    public static void main(String[] args){

        String cali= JOptionPane.showInputDialog("Ingresa la primera calificacion");
        String calif= JOptionPane.showInputDialog("Ingresa la segunda calificacion");
        String califi= JOptionPane.showInputDialog("Ingresa la tercera calificacion");
        System.out.println("Promedio:" + Float.parseFloat(cali)+ Float.parseFloat(calif)+ Float.parseFloat(califi));


        }
    }
