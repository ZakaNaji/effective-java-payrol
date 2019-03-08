public class RegularDay extends DayOfTheWeek {

    public RegularDay(){
        payRation = 0.5;
        dayType = "regular";
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
        return true;
    }
}
