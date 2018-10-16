package com.nmaokafor.tourguideeapp;

import android.content.Context;

import java.util.List;

public class Food {
    public static void initFoodsList(List<Site> list, Context context) {

        list.add(new Site(
                context.getString(R.string.food_amala),
                context.getString(R.string.food_amala_description),
                context.getString(R.string.food_amala_spot),
                context.getString(R.string.food_amala_number),
                context.getString(R.string.food_amala_timing),
                context.getString(R.string.food_amala_pricing),
                R.drawable.food_amala_pic
        ));

        list.add(new Site(
                context.getString(R.string.food_terra),
                context.getString(R.string.food_terra_description),
                context.getString(R.string.food_terra_spot),
                context.getString(R.string.food_terra_number),
                context.getString(R.string.food_terra_timing),
                context.getString(R.string.food_terra_pricing),
                R.drawable.food_terra_kulture
        ));

        list.add(new Site(
                context.getString(R.string.food_boli),
                context.getString(R.string.food_boli_description),
                context.getString(R.string.food_boli_spot),
                context.getString(R.string.food_boli_number),
                context.getString(R.string.food_boli_timing),
                context.getString(R.string.food_boli_pricing),
                R.drawable.food_boli
        ));

        list.add(new Site(
                context.getString(R.string.food_hard_rock),
                context.getString(R.string.food_hrc_description),
                context.getString(R.string.food_hrc_spot),
                context.getString(R.string.food_hrc_number),
                context.getString(R.string.food_hrc_timing),
                context.getString(R.string.food_hrc_pricing),
                R.drawable.food_hard_rock
        ));

        list.add(new Site(
                context.getString(R.string.food_so_fresh),
                context.getString(R.string.food_fresh_description),
                context.getString(R.string.food_fresh_spot),
                context.getString(R.string.food_fresh_number),
                context.getString(R.string.food_fresh_timing),
                context.getString(R.string.food_fresh_pricing),
                R.drawable.food_so_fresh
        ));

        list.add(new Site(
                context.getString(R.string.food_the_place),
                context.getString(R.string.food_place_description),
                context.getString(R.string.food_place_spot),
                context.getString(R.string.food_place_number),
                context.getString(R.string.food_place_timing),
                context.getString(R.string.food_place_pricing),
                R.drawable.food_the_place
        ));

        list.add(new Site(
                context.getString(R.string.food_suya),
                context.getString(R.string.food_suya_description),
                context.getString(R.string.food_suya_spot),
                context.getString(R.string.food_suya_number),
                context.getString(R.string.food_suya_timing),
                context.getString(R.string.food_suya_pricing),
                R.drawable.food_suya_spot
        ));
    }
}
