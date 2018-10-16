package com.nmaokafor.tourguideeapp;

import android.content.Context;

import java.util.List;

public class Events {
    public static void initEventsList(List<Site> list, Context context) {

        list.add(new Site(
                context.getString(R.string.event_travel_number),
                context.getString(R.string.event_travel_description),
                context.getString(R.string.event_travel_spot),
                context.getString(R.string.event_travel),
                context.getString(R.string.event_travel_timing),
                context.getString(R.string.event_travel_pricing),
                R.drawable.event_travel
        ));

        list.add(new Site(
                context.getString(R.string.event_fintech),
                context.getString(R.string.event_fintech_description),
                context.getString(R.string.event_fintech_spot),
                context.getString(R.string.event_fintech_number),
                context.getString(R.string.event_fintech_timing),
                context.getString(R.string.event_fintech_pricing),
                R.drawable.event_fintech
        ));

        list.add(new Site(
                context.getString(R.string.event_plussize),
                context.getString(R.string.event_plussize_description),
                context.getString(R.string.event_plussize_spot),
                context.getString(R.string.event_plussize_number),
                context.getString(R.string.event_plussize_timing),
                context.getString(R.string.event_plussize_pricing),
                R.drawable.event_plussize
        ));

        list.add(new Site(
                context.getString(R.string.event_summit),
                context.getString(R.string.event_summit_description),
                context.getString(R.string.event_summit_spot),
                context.getString(R.string.event_summit_number),
                context.getString(R.string.event_summit_timing),
                context.getString(R.string.event_summit_pricing),
                R.drawable.event_summit
        ));

        list.add(new Site(
                context.getString(R.string.event_cocktail),
                context.getString(R.string.event_cocktail_description),
                context.getString(R.string.event_cocktail_spot),
                context.getString(R.string.event_cocktail_number),
                context.getString(R.string.event_cocktail_timing),
                context.getString(R.string.event_cocktail_pricing),
                R.drawable.event_cocktail
        ));

        list.add(new Site(
                context.getString(R.string.event_zumba),
                context.getString(R.string.event_zumba_description),
                context.getString(R.string.event_zumba_spot),
                context.getString(R.string.event_zumba_number),
                context.getString(R.string.event_zumba_timing),
                context.getString(R.string.event_zumba_pricing),
                R.drawable.event_zumba
        ));

        list.add(new Site(
                context.getString(R.string.event_ijoya),
                context.getString(R.string.event_ijoya_description),
                context.getString(R.string.event_ijoya_spot),
                context.getString(R.string.event_ijoya_number),
                context.getString(R.string.event_ijoya_timing),
                context.getString(R.string.event_ijoya_pricing),
                R.drawable.event_ijoya
        ));

        list.add(new Site(
                context.getString(R.string.event_fela),
                context.getString(R.string.event_fela_description),
                context.getString(R.string.event_fela_spot),
                context.getString(R.string.event_fela_number),
                context.getString(R.string.event_fela_timing),
                context.getString(R.string.event_fela_pricing),
                R.drawable.event_fela
        ));
    }
}
