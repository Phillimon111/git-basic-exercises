public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    private int expectedMinInOven;
    
        public Lasagna () {
         this.expectedMinInOven = 40;
        } 
    public int expectedMinutesInOven (){
        
        return expectedMinInOven;
    };
            
    // TODO: define the 'remainingMinutesInOven()' method
   public int remainingMinutesInOven ( int remainingMinInOven ) {
       return expectedMinInOven - remainingMinInOven;
   }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes( int prepTimeInMinutes){
        return prepTimeInMinutes*2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes (  int numberOfLayers , int numberOfMinutes  ){
        int prepTimeInMinutes = preparationTimeInMinutes(numberOfLayers);
        return prepTimeInMinutes + numberOfMinutes;
    }
    
}
