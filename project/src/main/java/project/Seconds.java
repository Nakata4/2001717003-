package project;

public class Seconds {
	private int seconds;
    private int minute;
    public Seconds()
    {
        seconds = 12;
        minute = 0;
    }


    public Seconds(int h, int m)
    {
        if ( h >= 1 && h <= 23)
            h = seconds;
        else 
            seconds = 0;
        if ( m >= 0 && m <= 59)
            m = minute;
        else 
            minute = 0;
    }

}
