public enum WeekDays implements PayrolDay {

    LUNDI(new RegularDay()),
    MARDI(new RegularDay()),
    MERCREDI(new RegularDay()),
    JEUDI(new RegularDay()),
    VENDREDI(new RegularDay()),
    SAMEDI(new HoliDay()),
    DIMANCHE(new HoliDay());

    private DayOfTheWeek dayOfTheWeek;
    private static final double HOUR_PAY_COST = 20;

     private WeekDays(DayOfTheWeek dayOfTheWeek){
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public double calculatePayRol(int numberOfWorkedHours) {
         DayOfTheWeek thisDay = this.dayOfTheWeek;
            return HOUR_PAY_COST * thisDay.getDaypayRatio() * numberOfWorkedHours;
    }
}
