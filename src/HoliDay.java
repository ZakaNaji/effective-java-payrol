public class HoliDay extends DayOfTheWeek {

    public HoliDay(){
        payRation = 1;
        dayType = "holiday";
    }

    @Override
    public String getDayType() {
        return dayType;
    }

    @Override
    public double getDaypayRatio() {
        return payRation;
    }

    @Override
    public boolean isRegularDay() {
        return false;
    }
}
