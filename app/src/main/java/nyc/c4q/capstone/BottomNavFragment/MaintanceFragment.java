package nyc.c4q.capstone.BottomNavFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.capstone.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MaintanceFragment extends Fragment {

    View rootView;


    public MaintanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_maintance, container, false);
        return rootView;
    }

}