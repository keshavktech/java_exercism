class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {

        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

            return (knightIsAwake || archerIsAwake || prisonerIsAwake);
        
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        
         if(archerIsAwake)
             return false;
        else{
            if(prisonerIsAwake)
                return true;
            return false;
        }
        //return (archerIsAwake);
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent)
        {
            if(archerIsAwake)
                return false;
            else
                return true;
        }

        else
        {
            if(prisonerIsAwake)
            {
                if(!knightIsAwake && !archerIsAwake)
                    return true;
                return false;
                    
            }

            return false;
        }

        //return false;
    }
}
