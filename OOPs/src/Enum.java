public class Enum {
    public static void main(String[] args) {
        holiday h = new holiday(14,MonthEnum.january);
        System.out.println(h.day+" "+h.month);
    }
}
enum MonthEnum{
    january,february,March,April,May,June,July,August,September,October,November,December;
}
class holiday{
    int day;
    MonthEnum month;
    holiday(int day,MonthEnum month){
        this.day=day;
        this.month=month;
    }
}
