public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double pr =  speed*221;

        if(speed==10)
            return (77*pr)/100;
        if(speed==9)
            return (80*pr)/100;
        if(speed>=5 && speed<=8)
            return (90*pr)/100;
        if(speed>=1 && speed<=4)
            return pr;
        
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        int pr =(int)productionRatePerHour(speed);
        return pr/60;   
    }
}
