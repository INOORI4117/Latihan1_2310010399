
package hitung;


public class Matematika {
   //membuat var
    private double bil1, bil2;
    
    //membuat constructor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2; 
    }
    //membuat set penjumlahan
    double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    
    //membuat set pengurangn
    double setPengurangan(){
        return bil1 - bil2;
    }
    
    //membuat set pengurangn
    double setPerkalian(){
        return bil1 * bil2;
    }
    
    //membuat set pengurangn
    double setPembagian(){
        return bil1 / bil2;
    }
}
