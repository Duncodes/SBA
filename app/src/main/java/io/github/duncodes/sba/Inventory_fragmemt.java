package io.github.duncodes.sba;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by duncan on 2/5/17.
 */

public class Inventory_fragmemt extends Fragment {
    public static Inventory_fragmemt newInstance(){
        Inventory_fragmemt fragmemt = new Inventory_fragmemt();
        return fragmemt;
    }

    public Inventory_fragmemt() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.content_inventoy,container,false);
        return  rootView;
    }

}
