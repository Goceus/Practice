package CodingBat.warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if( !weekday || vacation ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        SleepIn obj1 = new SleepIn();



        System.out.println(obj1.sleepIn(true, false));
    }

}
