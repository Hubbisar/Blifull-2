package com.arevalo.blifull;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by jonathanarevalo on 14-12-19.
 * Class that handles all the functions in the dices section
 */
public class section3_dices extends Fragment {
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.section3_dices,container,false);
        return rootview;
    }
}
