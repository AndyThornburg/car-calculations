
/**
 *
 * @author Andy Thornburg
 */
public class CarClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Car myVehicle = new Car(23);
       myVehicle.addGas(8.3);
       myVehicle.drive(50);
       double gasLeft = myVehicle.getGasInTank();
       
       System.out.printf("Gas Left in tank: %1.2f gallons \n ", gasLeft);
        
        
    }
}
