package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * utc local 时间互转换
 */
public class UtcTimeTest {

    /**
     * local时间转换成UTC时间
     *
     * @param localTime
     * @return
     */
    public String localToUTC(String localTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date localDate = null;
        try {
            localDate = sdf.parse(localTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long localTimeInMillis = localDate.getTime();

        /** long时间转换成Calendar */
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(localTimeInMillis);
        /** 取得时间偏移量 */
        int zoneOffset = calendar.get(java.util.Calendar.ZONE_OFFSET);
        /** 取得夏令时差 */
        int dstOffset = calendar.get(java.util.Calendar.DST_OFFSET);
        /** 从本地时间里扣除这些差量，即可以取得UTC时间*/
        calendar.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        /** 取得的时间就是UTC标准时间 */
//        Date utcDate = new Date(calendar.getTimeInMillis());
        calendar.setTimeInMillis(calendar.getTimeInMillis());
        SimpleDateFormat foo = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return foo.format(calendar.getTime());
    }


    /**
     * utc时间转成local时间
     *
     * @param utcTime
     * @return
     */
    public String utcToLocal(String utcTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String localTime = null;
        try {
            Date utcDate = sdf.parse(utcTime);
            sdf.setTimeZone(TimeZone.getDefault());
            localTime = sdf.format(utcDate.getTime());
            Date localDate = sdf.parse(localTime);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            localTime = format.format(localDate);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return localTime;
    }


    public static void main(String[] args) {
        UtcTimeTest gc = new UtcTimeTest();
        System.out.println("utc time :" + gc.localToUTC("2021-12-07 19:59:15"));
        System.out.println("local time : " + gc.utcToLocal("2021-12-07T11:59:15"));
    }
}
