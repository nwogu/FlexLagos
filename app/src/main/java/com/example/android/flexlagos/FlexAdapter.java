package com.example.android.flexlagos;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TEST on 6/17/2017.
 */

public class FlexAdapter extends ArrayAdapter<Flex> {

    public FlexAdapter(Activity context, ArrayList<Flex> flexArrayList){
        super(context, 0, flexArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    View listview = convertView;
        if (listview == null) {
            listview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Flex flex = getItem(position);
        TextView layoutcontainer = (TextView)listview.findViewById(R.id.place_name);
        layoutcontainer.setText(flex.getPlaceName());

        TextView layoutcontainer2 = (TextView)listview.findViewById(R.id.description);
        layoutcontainer2.setText(flex.getDescription());

        ImageView imageView = (ImageView)listview.findViewById(R.id.image);
        imageView.setImageResource(flex.getImageresource());

        return listview;

    }
}
