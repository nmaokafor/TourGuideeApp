package com.nmaokafor.tourguideeapp;

import android.content.Context;

import java.util.List;

public class Places {
    public static void initPlacesList(List<Site> list, Context context) {

        list.add(new Site(
                context.getString(R.string.place_craft),
                context.getString(R.string.place_craft_description),
                context.getString(R.string.place_craft_spot),
                context.getString(R.string.place_craft_number),
                context.getString(R.string.place_craft_timing),
                context.getString(R.string.place_craft_pricing),
                R.drawable.place_craft_market
        ));

        list.add(new Site(
                context.getString(R.string.place_kalakuta),
                context.getString(R.string.place_kalakuta_description),
                context.getString(R.string.place_kalakuta_spot),
                context.getString(R.string.place_kalakuta_number),
                context.getString(R.string.place_kalakuta_timing),
                context.getString(R.string.place_kalakuta_pricing),
                R.drawable.place_kalakuta_musuem
        ));

        list.add(new Site(
                context.getString(R.string.place_nike),
                context.getString(R.string.place_nike_description),
                context.getString(R.string.place_nike_spot),
                context.getString(R.string.place_nike_number),
                context.getString(R.string.place_nike_timing),
                context.getString(R.string.place_nike_pricing),
                R.drawable.place_nike_gallery
        ));

        list.add(new Site(
                context.getString(R.string.place_lcc),
                context.getString(R.string.place_lcc_description),
                context.getString(R.string.place_lcc_spot),
                context.getString(R.string.place_lcc_number),
                context.getString(R.string.place_lcc_timing),
                context.getString(R.string.place_lcc_pricing),
                R.drawable.place_lekki_conservation_centre
        ));

        list.add(new Site(
                context.getString(R.string.place_hi_impact),
                context.getString(R.string.place_hi_impact_description),
                context.getString(R.string.place_hi_impact_spot),
                context.getString(R.string.place_hi_impact_number),
                context.getString(R.string.place_hi_impact_timing),
                context.getString(R.string.place_hi_impact_pricing),
                R.drawable.place_hi_impact
        ));

        list.add(new Site(
                context.getString(R.string.place_tarkwa_bay),
                context.getString(R.string.place_tarkwa_bay_description),
                context.getString(R.string.place_tarkwa_bay_spot),
                context.getString(R.string.place_tarkwa_bay_number),
                context.getString(R.string.place_tarkwa_bay_timing),
                context.getString(R.string.place_tarkwa_bay_pricing),
                R.drawable.place_tarkwa_bay
        ));

        list.add(new Site(
                context.getString(R.string.place_freedom_park),
                context.getString(R.string.place_freedom_park_description),
                context.getString(R.string.place_freedom_park_spot),
                context.getString(R.string.place_freedom_park_number),
                context.getString(R.string.place_freedom_park_timing),
                context.getString(R.string.place_freedom_park_pricing),
                R.drawable.place_freedom_park
        ));
    }
}