package project;

public class Millis {
	private int millis;
    private int minute;
    public Millis()
    {
        millis = 12;
        minute = 0;
    }


    public Millis(int h, int m)
    {
        if ( h >= 1 && h <= 23)
            h = minute;
        else 
            minute = 0;
        if ( m >= 0 && m <= 59)
            m = minute;
        else 
            minute = 0;
    }
}
