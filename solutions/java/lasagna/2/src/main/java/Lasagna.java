public class Lasagna {

    public int expectedMinutesInOven()
    {
        return 40;
    }

    public int remainingMinutesInOven(int duration)
    {
        int time = expectedMinutesInOven();

        return time-duration;
    }
  
    public int preparationTimeInMinutes(int x)
    {
        return 2*x;
    }

    public int totalTimeInMinutes(int layers , int n)
    {
        return n+preparationTimeInMinutes(layers);
    }
}
