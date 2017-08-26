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
public class FunkyFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Flex> flex = new ArrayList<>();
        flex.add(new Flex("Tarkwabay", "Apapa, Lagos", R.drawable.tarkwabay));
        flex.add(new Flex("Tafawa Balewa Square", "Lagos Island, Lagos", R.drawable.tbs));
        flex.add(new Flex("Terra Kulture", "1376 Tiamiyu Savage St, Victoria Island, Lagos", R.drawable.terrakulture));
        flex.add(new Flex("National Theatre", "Ijora Olopa, Iganmu", R.drawable.theatre));
        flex.add(new Flex("Lagos Yatch Club", "Magazine Point, Marina", R.drawable.yatchclub));
        flex.add(new Flex("Golden Gate", "25B Glover Road, Ikoyi", R.drawable.goldengate));
        flex.add(new Flex("Silverbird Galleria", "133, Ahmadu Bello Way, Victoria Island", R.drawable.silverbird));
        flex.add(new Flex("Escape", "234A Adeola Odeku St, Victoria Island, Lagos", R.drawable.escape));
        flex.add(new Flex("Quilox", "873, Ozumba Mbadiwe Avenue, Victoria Island", R.drawable.quilox));

        FlexAdapter flexAdapter = new FlexAdapter(getActivity(), flex);

        View containerView = inflater.inflate(R.layout.list_main, container, false);

        ListView listView =(ListView)containerView.findViewById(R.id.list_item);

        listView.setAdapter(flexAdapter);
        return containerView;
    }

}
