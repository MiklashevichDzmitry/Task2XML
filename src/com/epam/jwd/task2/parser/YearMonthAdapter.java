package com.epam.jwd.task2.parser;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.YearMonth;

public class YearMonthAdapter extends XmlAdapter<String, YearMonth> {
    @Override
    public YearMonth unmarshal(String date) {
        return YearMonth.parse(date);
    }

    @Override
    public String marshal(YearMonth date) {
        return date.toString();
    }
}