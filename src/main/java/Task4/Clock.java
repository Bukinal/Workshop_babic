package Task4;

public class Clock implements Readable {
    int hour;
    int minute;
    int second;

    public void setHour(int Hour) {
        this.hour = hour;
    }
public void setMinute(int Minute) {
        this.minute = minute;
}
public void setSecond(int Second) {
        this.second = second;
}

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public void readTime() {

    }
}
