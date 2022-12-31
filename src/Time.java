public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        validate(hour, minute, second);
        this.hour = hour;
        this.minute =  minute;
        this.second = second;
    }

    public Time(int hour, int minute){
        this(hour, minute, 0);
    }

    public Time(int hour){
        this(hour, 0);
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public String getTime() {
        return String.format("%d: %d: %d", hour, minute, second);
    }

    private static void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateHour(int hour) {
        boolean hourIsInvalid = hour > 23 || hour < 0;
        if(hourIsInvalid)throw new IllegalArgumentException("Invalid hour");
    }

    private static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute > 59 || minute < 0;
        if(minuteIsInvalid)throw new IllegalArgumentException("Invalid minute");
    }

    private static void validateSecond(int second) {
        boolean secondIsInvalid = second > 59 || second < 0;
        if(secondIsInvalid)throw new IllegalArgumentException("Invalid second");
    }
}
