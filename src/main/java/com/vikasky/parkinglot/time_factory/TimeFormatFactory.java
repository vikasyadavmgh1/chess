package com.vikasky.parkinglot.time_factory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeFormatFactory {

    private static HashMap<String, Class> timeFormats;

    static {
        timeFormats = new HashMap<>();
        timeFormats.put("blitz", TimeFormat1.class);
        timeFormats.put("bullet", BulletTimeFormat.class);
        timeFormats.put("rapid", RapidTimeFormat.class);
    }

    public static List<Class> getAllFormats() {
        return new ArrayList<>(timeFormats.values());
    }

    public static List<Class> addNewTimeFormat(String newTimeFormatKey, Class newTimeFormatClass) {
        timeFormats.put(newTimeFormatKey, newTimeFormatClass);
        return new ArrayList<>(timeFormats.values());
    }

    public static TimeFormat getTimeFormatFromKey(String timeFormatKey) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TimeFormat t  = (TimeFormat) timeFormats.get(timeFormatKey).getConstructor().newInstance();
        return t;
    }

}
