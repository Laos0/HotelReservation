package com.example.android.hotelreservationapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment0.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment0#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment0 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    @Override
    public void onDestroy() {
        String tag = "Fragment0";
        Log.i(tag, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        String tag = "Fragment0";
        Log.i(tag, "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onStop() {
        String tag = "Fragment0";
        Log.i(tag, "onStop");
        super.onStop();
    }

    @Override
    public void onPause() {
        String tag = "Fragment0";
        Log.i(tag, "onPause");
        super.onPause();
    }

    @Override
    public void onStart() {
        String tag = "Fragment0";
        Log.i(tag, "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        String tag = "Fragment0";
        Log.i(tag, "onResume");
        super.onResume();
    }

    public Fragment0() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment0.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment0 newInstance(String param1, String param2) {
        Fragment0 fragment = new Fragment0();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        String tag = "Fragment0";
        Log.i(tag, "onCreate");
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String tag = "Fragment0";
        Log.i(tag,"onCreateView");
        // This section are declarations of variables
        final View view = inflater.inflate(R.layout.fragment_fragment0, container, false);
        //Button confirmBtn = view.findViewById(R.id.confirmButton);
        final TextView description = view.findViewById(R.id.description);
        final Spinner spinner = (Spinner) view.findViewById(R.id.roomType);
        String[] roomType = {"Single - one bed", "Double - two bed", "King - 1 large bed", "Queen - 1 medium bed", "Suite - luxurious experience"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, roomType);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        // ---------------------------------------

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                /* your code here
                String mystr = "onItemSelected";
                Log.i(mystr, "onItemSelected");
                */
                String roomType = spinner.getSelectedItem().toString();
                mListener.onFragmentInteraction(roomType);
                String returnedFromMain = ((MainActivity)getActivity()).getShareInFragments();
                TextView descript = (TextView)view.findViewById(R.id.description);
                ((MainActivity)getActivity()).setRoomType(returnedFromMain);
                String displayR = ((MainActivity)getActivity()).hR.toString();
                descript.setText((displayR));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
                String mystr = "onNothingSelected";
                Log.i(mystr, "onNothingSelected");
            }

        });

//        confirmBtn.setOnClickListener(new View.OnClickListener(){
////            public void onClick(View v){
////                /*
////                mListener.onFragmentInteraction("Did this make it to MainActivity?");
////                String returnedFromMain = ((MainActivity)getActivity()).getShareInFragments();
////                TextView tv2 = (TextView)view.findViewById(R.id.test);
////                tv2.setText((returnedFromMain));
////                */
////
////                mListener.onFragmentInteraction(spinner.getSelectedItem().toString());
////                String returnedFromMain = ((MainActivity)getActivity()).getShareInFragments();
////
////            }
////        });


        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(View view) {
        if (mListener != null) {
            mListener.onFragmentInteraction("Did Fragment0 reach MainActivity?");
        }
    }

    @Override
    public void onAttach(Context context) {
        String tag = "Fragment0";
        Log.i(tag,"onAttach");
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String string);
    }
}
