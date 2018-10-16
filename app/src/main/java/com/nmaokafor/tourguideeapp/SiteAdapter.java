package com.nmaokafor.tourguideeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;


public class SiteAdapter extends ArrayAdapter<Site> {

    public SiteAdapter(Context context, int resources, List<Site> siteList) {
        super(context, 0, siteList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Site currentSite = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView nameSiteTextView = (TextView)
                listItemView.findViewById(R.id.nameTextView);
        nameSiteTextView.setText(currentSite.getName());

        TextView descriptionSiteTextView = (TextView) listItemView.findViewById(R.id.descriptionTextView);
        descriptionSiteTextView.setText(currentSite.getDescription());

        TextView spotSiteTextView = listItemView.findViewById(R.id.spotTextView);
        spotSiteTextView.setText(currentSite.getSpot());

        TextView timingSiteTextView = listItemView.findViewById(R.id.timingTextView);
        timingSiteTextView.setText(currentSite.getTime());

        TextView priceSiteTextView = listItemView.findViewById(R.id.priceTextView);
        priceSiteTextView.setText(currentSite.getPrice());

        TextView numberSiteTextView = listItemView.findViewById(R.id.numberTextView);
        nameSiteTextView.setText(currentSite.getNumber());

        ImageView pictureSiteImageView = listItemView.findViewById(R.id.pictureImageView);

        if (currentSite.hasImage()) {
            pictureSiteImageView.setImageResource(currentSite.getImageResourceId());
            pictureSiteImageView.setVisibility(View.VISIBLE);
        } else {
            pictureSiteImageView.setVisibility(View.GONE);
        }

        if (currentSite.hasName()) {
            nameSiteTextView.setVisibility(View.VISIBLE);
        } else {
            nameSiteTextView.setVisibility(View.GONE);
        }
        if (currentSite.hasPrice()) {
            priceSiteTextView.setVisibility(View.VISIBLE);
        } else {
            priceSiteTextView.setVisibility(View.GONE);
        }

        if (currentSite.hasTime()) {
            timingSiteTextView.setVisibility(View.VISIBLE);
        } else {
            timingSiteTextView.setVisibility(View.GONE);
        }

        if (currentSite.hasSpot()) {
            spotSiteTextView.setVisibility(View.VISIBLE);
        } else {
            spotSiteTextView.setVisibility(View.GONE);
        }

        if (currentSite.hasNumber()) {
            nameSiteTextView.setVisibility(View.VISIBLE);
        } else {
            numberSiteTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}