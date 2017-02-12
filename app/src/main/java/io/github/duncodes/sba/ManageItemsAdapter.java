package io.github.duncodes.sba;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import io.github.duncodes.sba.Model.Inventory;

/**
 * Created by duncan on 2/12/17.
 */

public class ManageItemsAdapter extends ArrayAdapter{

    public ManageItemsAdapter(Context context, int resource,List objects) {
        super(context, resource,objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        View view = inflater.inflate(R.layout.list_row,parent,false);

        Inventory item  = (Inventory) getItem(position);

        TextView textView = (TextView) view.findViewById(R.id.name);

        textView.setText(item.getName());

        return view;
    }
}
