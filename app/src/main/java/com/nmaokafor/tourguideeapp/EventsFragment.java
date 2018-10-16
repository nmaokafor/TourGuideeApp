package com.nmaokafor.tourguideeapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Site> list = new ArrayList<>();
        Events.initEventsList(list, getContext());

        SiteAdapter adapter = new SiteAdapter(getActivity(), 0, list);
        View view = inflater.inflate(R.layout.site_list, container, false);
        ListView listView = view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }
}
