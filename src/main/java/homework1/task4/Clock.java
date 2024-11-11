package homework1.task4;

public class Clock implements Readable {
    int hour;
    int minute;
    int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
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

    public void tick() {
        this.second += 1;
        if (this.second > 59) {
            this.minute += 1;
            this.second = 0;
        }
        if (this.minute > 59) {
            this.hour += 1;
            this.minute = 0;
        }
        if (this.hour > 23) {
            this.hour = 0;
        }
    }

    @Override
    public void readTime() {
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }
}
