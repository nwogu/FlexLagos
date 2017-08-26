package com.example.android.flexlagos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChilledFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Flex> flex = new ArrayList<>();
        flex.add(new Flex("Omenka Gallery", "24, Modupe Alakija Crescent, Lagos", R.drawable.omenka));
        flex.add(new Flex("Kalakuta Rebublic", "14 Agege Motor Road, Idi-Oro, Mushin", R.drawable.kalakuta));
        flex.add(new Flex("La Campagne Tropicana Beach", "Lekki Epe Express Way, Lagos", R.drawable.lacamp));
        flex.add(new Flex("Lagos Bar Beach", "Ahmadu Bello Way, Victoria Island", R.drawable.lagosbarbeach));
        flex.add(new Flex("Lekki Conservation Center", "Lekki Conservation Centre Rd, Lekki", R.drawable.lcc));
        flex.add(new Flex("Lekkki Leisure Lake", "Lekki, Lagos", R.drawable.lekkilake));
        flex.add(new Flex("National Museum", "Onikan, Lagos", R.drawable.nationalmusuem));
        flex.add(new Flex("New African Shrine", "1, Nerdc Road, Agidingbi, Ikeja, Lagos", R.drawable.newafricanshine));
        flex.add(new Flex("Nike Art Gallery", "No. 2, Elegushi Road, 3rd Roundabout, Lekki", R.drawable.nikeartgallary));

        FlexAdapter flexAdapter = new FlexAdapter(getActivity(), flex);

        View containerView = inflater.inflate(R.layout.list_main, container, false);

        ListView listView =(ListView)containerView.findViewById(R.id.list_item);

        listView.setAdapter(flexAdapter);
        return containerView;
    }

}
