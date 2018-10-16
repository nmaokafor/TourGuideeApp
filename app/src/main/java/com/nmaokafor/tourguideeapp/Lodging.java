package com.nmaokafor.tourguideeapp;

import android.content.Context;

import java.util.List;

public class Lodging {
    public static void initLodgingList(List<Site> list, Context context) {

        list.add(new Site(
                context.getString(R.string.lodging_oriental),
                context.getString(R.string.lodging_oriental_description),
                context.getString(R.string.lodging_oriental_spot),
                context.getString(R.string.lodging_oriental_number),
                context.getString(R.string.lodging_oriental_timing),
                context.getString(R.string.lodging_oriental_pricing),
                R.drawable.lodging_oriental
        ));

        list.add(new Site(
                context.getString(R.string.lodging_eko),
                context.getString(R.string.lodging_eko_description),
                context.getString(R.string.lodging_eko_spot),
                context.getString(R.string.lodging_eko_number),
                context.getString(R.string.lodging_eko_timing),
                context.getString(R.string.lodging_eko_pricing),
                R.drawable.lodging_eko_hotel
        ));

        list.add(new Site(
                context.getString(R.string.lodging_tropicana),
                context.getString(R.string.lodging_tropicana_description),
                context.getString(R.string.lodging_tropicana_spot),
                context.getString(R.string.lodging_tropicana_number),
                context.getString(R.string.lodging_tropicana_timing),
                context.getString(R.string.lodging_tropicana_pricing),
                R.drawable.lodging_campagne
        ));

        list.add(new Site(
                context.getString(R.string.lodging_ibis),
                context.getString(R.string.lodging_ibis_description),
                context.getString(R.string.lodging_ibis_spot),
                context.getString(R.string.lodging_ibis_number),
                context.getString(R.string.lodging_ibis_timing),
                context.getString(R.string.lodging_ibis_pricing),
                R.drawable.lodging_ibis
        ));

        list.add(new Site(
                context.getString(R.string.lodging_radisson),
                context.getString(R.string.lodging_radisson_description),
                context.getString(R.string.lodging_radisson_spot),
                context.getString(R.string.lodging_radisson_number),
                context.getString(R.string.lodging_radisson_timing),
                context.getString(R.string.lodging_radisson_pricing),
                R.drawable.lodging_radisson
        ));

        list.add(new Site(
                context.getString(R.string.lodging_george),
                context.getString(R.string.lodging_george_description),
                context.getString(R.string.lodging_george_spot),
                context.getString(R.string.lodging_george_number),
                context.getString(R.string.lodging_george_timing),
                context.getString(R.string.lodging_george_pricing),
                R.drawable.lodging_george
        ));

        list.add(new Site(
                context.getString(R.string.lodging_lilygate),
                context.getString(R.string.lodging_lilygate_description),
                context.getString(R.string.lodging_lilygate_spot),
                context.getString(R.string.lodging_lilygate_number),
                context.getString(R.string.lodging_lilygate_timing),
                context.getString(R.string.lodging_lilygate_pricing),
                R.drawable.lodging_lilygate
        ));
    }
}