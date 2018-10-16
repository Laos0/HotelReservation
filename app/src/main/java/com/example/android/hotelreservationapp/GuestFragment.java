package com.example.android.hotelreservationapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GuestFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GuestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GuestFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GuestFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GuestFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GuestFragment newInstance(String param1, String param2) {
        GuestFragment fragment = new GuestFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        String tag = "GuestFragment";
        Log.i(tag,"onCreate");
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onDestroy() {
        String tag = "GuestFragment";
        Log.i(tag,"onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        String tag = "GuestFragment";
        Log.i(tag,"onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onStop() {
        String tag = "GuestFragment";
        Log.i(tag,"onStop");
        super.onStop();
    }

    @Override
    public void onPause() {
        String tag = "GuestFragment";
        Log.i(tag,"onPause");
        super.onPause();
    }

    @Override
    public void onResume() {
        String tag = "GuestFragment";
        Log.i(tag,"onResume");
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String tag = "GuestFragment";
        Log.i(tag,"onCreateView");
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_guest, container, false);

        // ---------------- IMPLEMENT THESE COMMENTS BELOW -----------------------------------
         Button guestButton = (Button) view.findViewById(R.id.guest_button);
         guestButton.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 mListener.onFragmentInteraction("Did this make it to MainActivity?");
                 String returnedFromMain = ((MainActivity)getActivity()).getShareInFragments();
                 TextView tv2 = (TextView)view.findViewById(R.id.text_view);
                 tv2.setText((returnedFromMain));
             }
            });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(View view) {
        if (mListener != null) {
            mListener.onFragmentInteraction("Did you get to the Activity?");
        }
    }

    @Override
    public void onAttach(Context context) {
        String tag = "GuestFragment";
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
        void onFragmentInteraction(String value);

    }
}
