package nyc.c4q.capstone.maintenance_tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.capstone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubmittedFragment extends Fragment {

    View rootView;


    public SubmittedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_submitted, container, false);
        return rootView;
    }

}
