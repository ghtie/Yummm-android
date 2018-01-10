package com.casept.yummm;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by gloria on 1/10/18.
 */

public class VenueFragment extends ListFragment {

    String venues[] = {"The Den", "L3 Grill", "Naan",
            "Melt U", "Pinzas", "Rough Rider", "Jolly Scholar"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.venuelist_fragment, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, venues);
        setListAdapter(adapter);
    }

}
