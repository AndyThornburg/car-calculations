
public class Car {
	  private double milesPerGallon;
	    public double fuel;
	    /**
	     * 
	     * @param mpg Represents the miles per gallon of the car.
	     */
	    Car(double mpg){
	        milesPerGallon = mpg;
	        fuel = 0;
	    }
	    
	    /**
	     * 
	     * @param distance represents the distance the car has driven.
	     */
	    public void drive (double distance){
	        fuel = fuel-(distance/milesPerGallon);
	    }
	    /**
	     * 
	     * @return distance driven.
	     */
	    
	    public double getGasInTank(){
	        return fuel;
	    }
	    /**
	     * 
	     * @param gasAmount Represents the amount of gas in the tank.
	     */
	    public void addGas(double gasAmount){
	        fuel = fuel + gasAmount;
	    }
	     
	    
	}



