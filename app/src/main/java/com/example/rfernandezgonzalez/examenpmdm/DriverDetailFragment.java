package com.example.rfernandezgonzalez.examenpmdm;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.rfernandezgonzalez.examenpmdm.dummy.DummyContent;

/**
 * A fragment representing a single Driver detail screen.
 * This fragment is either contained in a {@link DriverListActivity}
 * in two-pane mode (on tablets) or a {@link DriverDetailActivity}
 * on handsets.
 */
public class DriverDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public DriverDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_driver_detail, container, false);

        //Recojo el TextView
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.textView)).setText("Item" + mItem.id);
        }
        //Creo el boton y hago que el fragment escuche al boton a través del Listener, cuando hagamos click
        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener((View.OnClickListener) this);
        return rootView;
    }

    public void onClick(View v) {
        if (fragment == null || isInLayout()) {
            //Si no esta el primer fragment, estara en Portrait, es decir, va a cerrar el fragment2
            +getActivity().setResult(getActivity().RESULT_OK);//Este get activity nos devolverá si el resultado es satisfactorio o OK
            getActivity().finish();
        } else {

            //Click del button

            @Override
            public void OnClick (View v){
                mListener.cerrar();
            }
            //Fragment cerrado
            private MyFragmentListener {
                public void cerrar ();

            }
        }

        //Será ejecutado cuando el fragment sea unido a una activity
        @Override
        public void onAttach (Context context){

            super.onAttach(context);
            mListener = (MyFragmentListener) context;

        }
    }