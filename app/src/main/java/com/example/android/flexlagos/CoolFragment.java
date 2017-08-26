package com.example.android.flexlagos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CoolFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Flex> flex = new ArrayList<>();
        flex.add(new Flex("The Bar Beach", "Victoria Island, Lagos", R.drawable.barbeach));
        flex.add(new Flex("Bogobiri", "7 Maitama Sule St, Lagos", R.drawable.bogobiri));
        flex.add(new Flex("Elegushi Beach", "Lekki By, Rd 3, Lekki Phase 1", R.drawable.elegushi));
        flex.add(new Flex("Eleko Beach", "Eleko, Lagos", R.drawable.elekobeach));
        flex.add(new Flex("Freedom Park", "Mobolaji Bank Anthony St, Lagos Island, Lagos", R.drawable.freedompark));
        flex.add(new Flex("Funtopia Water Park", "KM 35, Epe Expressway, Lekki, Lagos", R.drawable.funtopiawaterpark));
        flex.add(new Flex("The Get Arena", "Plot 6, Abiola Oniru Estate, Lekki, Eti Osa, Lagos", R.drawable.getarena));
        flex.add(new Flex("Ikeja City Mall", "Obafemi Awolowo Way, Ikeja, Lagos", R.drawable.ikejacitymall));
        flex.add(new Flex("Jankara", "Lagos Island, Lagos", R.drawable.jankara));

        FlexAdapter flexAdapter = new FlexAdapter(getActivity(), flex);

        View containerView = inflater.inflate(R.layout.list_main, container, false);

        ListView listView =(ListView)containerView.findViewById(R.id.list_item);

        listView.setAdapter(flexAdapter);
        return containerView;
    }

}
