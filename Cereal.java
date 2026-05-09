public class Cereal 
{
    private String name; 
    private int calories; 
    private double fiber; 
    private double carbohydrates; 
    private double cups; 

    public Cereal (String name, int calories, double fiber, double carbohydrates, double cups){
        this.name = name; 
        this.calories = calories; 
        this.fiber = fiber; 
        this.carbohydrates = carbohydrates; 
        this.cups = cups; 
    }
    
    public String getName() {
        return name; 

    }

      public int getCalories() {
        return calories; 

    }

      public double getFiber() {
        return fiber; 

    }

    public double getCarbohydrates() {
        return carbohydrates;
    }


  public double  getCups() {
        return cups; 

    }

 public String toString()
    {
        return "Cereal Name: " + name +
               "\nCalories: " + calories +
               "\nFiber: " + fiber +
               "\nCarbohydrates: " + carbohydrates +
               "\nCups: " + cups;
    }

}