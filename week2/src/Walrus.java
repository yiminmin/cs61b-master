import java.lang.reflect.Constructor;

/**
 * Student Name: Yimin Liu
 * Lab Professor: Professor Matthew Neadow
 * Due Date: Feb 12, 2023.
 * Modified: Feb 03, 2023.
 * Description: Assignment01
 */
public class Walrus {
   public int getWeight() {
      return weight;
   }

   public double getDouble1() {
      return double1;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public void setDouble1(double double1) {
      this.double1 = double1;
   }

   int weight;
   double double1;


   public Walrus(int num1, double double1) {
      this.weight = num1;
      this.double1 = double1;
   }

   public Walrus() {
   }
}
