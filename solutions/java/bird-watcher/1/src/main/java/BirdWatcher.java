
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birds = new int[birdsPerDay.length];
       for(int i = 0 ; i < birdsPerDay.length ; i++)
            birds[i] = birdsPerDay[i];
        return birds;      
    }

    public int getToday() {
       return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
       birdsPerDay[birdsPerDay.length-1]+=1;
    }

    public boolean hasDayWithoutBirds() {

        for(int values :birdsPerDay){
            if(values==0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int count = 0;
        for(int i = 0 ; i < Math.min(numberOfDays,birdsPerDay.length) ;i++)
            count+=birdsPerDay[i];
        return count;
    }

    public int getBusyDays() {
       int count = 0;
        for(int values : birdsPerDay)
           if(values >=5) count++;
        return count;
    }
}
