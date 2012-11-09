package com.jameselsey.demo.scjp.formatting_parsing_tokenising;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

import static java.lang.String.format;

/**
 * Author:  JElsey
 * Date:    01/11/2012
 */
public class LocalesAndFormatting
{
    public static void main(String[] args)
    {
        Locale australiaLocale = new Locale("en", "au");
        Locale newZealandLocale = new Locale("en", "nz");
        Locale germanLocale = new Locale("de", "de");
        Locale norwayLocale = new Locale("no", "no");

        Set<Locale> locales = new HashSet<Locale>();
        locales.add(australiaLocale);
        locales.add(newZealandLocale);
        locales.add(germanLocale);
        locales.add(norwayLocale);

        for (Locale l : locales)
        {
            Date theDate = new Date();
            Calendar calendar = Calendar.getInstance(l);
            calendar.add(Calendar.HOUR, 2);


            DateFormat df = DateFormat.getInstance();
            String nowString = df.format(new Date());
            System.out.println(format("The time in %s is now %s", l.getDisplayCountry(), nowString));

            NumberFormat nf = NumberFormat.getCurrencyInstance(l);
            System.out.println(format("A house in %s may cost %s", l.getDisplayCountry(), nf.format(149999)));

            System.out.println();
        }
    }
}
