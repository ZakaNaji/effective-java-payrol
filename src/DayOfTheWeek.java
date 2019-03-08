public abstract class DayOfTheWeek {
    protected double payRation;
    protected String dayType;

    public abstract String getDayType();
    public abstract double getDaypayRatio();
    public abstract boolean isRegularDay();
}
