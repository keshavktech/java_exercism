public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int duration)
    {
        int time = expectedMinutesInOven();

        return time-duration;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int x)
    {
        return 2*x;
    }

    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers , int n)
    {
        return n+2*layers;
    }
}
