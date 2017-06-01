package edu.rosehulman.decramrj.bracketologyapp.BracketInfo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.rosehulman.decramrj.bracketologyapp.R;

/**
 * Created by decramrj on 6/1/2017.
 */

public class BracketFragment extends Fragment {

    public static BracketFragment newInstance() {
        BracketFragment fragment = new BracketFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //set the layout you want to display in First Fragment
        View view = inflater.inflate(R.layout.bracket_fragment,
                container, false);
        return view;
    }
}
