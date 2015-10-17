package com.wesleyreisz.mymusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.wesleyreisz.mymusic.model.Song;

import java.util.List;

/**
 * Created by Sin on 10/17/2015.
 */
public class SongAdapater extends ArrayAdapter<Song> {
    private Context mContext;
    private List<Song> mEntries;
    public SongAdapater(Context context, int textViewResourceId, List<Song> entries) {
        super(context, textViewResourceId, entries);
        mContext = context;
        mEntries = entries;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view==null){
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.my_fragment_layout, parent,false);
        }
        final Song song = mEntries.get(position);

        return view;
    }
}
