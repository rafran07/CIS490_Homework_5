package com.wesleyreisz.mymusic;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.wesleyreisz.mymusic.model.Song;
import com.wesleyreisz.mymusic.service.MockMusicService;

import java.util.List;


/**
 * Created by Sin on 10/17/2015.
 */
public class MyFragment extends Fragment {

    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View myFragmentView = inflater.inflate(R.layout.my_fragment_layout, container, false);
        listView = (ListView)myFragmentView.findViewById(R.id.listView2);
        List<Song> songs = new MockMusicService().findAll();
        SongAdapater songAdapter = new SongAdapater(this,R.layout.fragment_item,songs);
        listView.setAdapter(songAdapter);

        return myFragmentView;
    }


}
