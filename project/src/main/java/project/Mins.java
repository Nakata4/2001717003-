package project;

public class Mins {
	private int hour;
    private int minute;
    public Mins()
    {
        hour = 12;
        minute = 0;
    }


    public Mins(int h, int m)
    {
        if ( h >= 1 && h <= 23)
            h = hour;
        else 
            hour = 0;
        if ( m >= 0 && m <= 59)
            m = minute;
        else 
            minute = 0;
    }
	
}
 

