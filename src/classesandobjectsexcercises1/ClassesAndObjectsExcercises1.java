/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjectsexcercises1;

/**
 *
 * @author ocean
 */
public class ClassesAndObjectsExcercises1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Hello world");
      System.out.println("Hello class");
      

      Car car1 = new Car("Volkswagen", "Golf", 4, "Black");
      car1.drive("forward");

      Car car2 = new Car("Skoda", "Fabia", 4, "White");
      car2.drive(90);

    }
    
}
