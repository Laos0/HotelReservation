package com.example.android.hotelreservationapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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
        Log.i(tag, "onCreate");
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onDestroy() {
        String tag = "GuestFragment";
        Log.i(tag, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        String tag = "GuestFragment";
        Log.i(tag, "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onStop() {
        String tag = "GuestFragment";
        Log.i(tag, "onStop");
        super.onStop();
    }

    @Override
    public void onPause() {
        String tag = "GuestFragment";
        Log.i(tag, "onPause");
        super.onPause();
    }

    @Override
    public void onResume() {
        String tag = "GuestFragment";
        Log.i(tag, "onResume");
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String tag = "GuestFragment";
        Log.i(tag, "onCreateView");
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_guest, container, false);

        // ---------------- IMPLEMENT THESE COMMENTS BELOW -----------------------------------
        //Button guestButton = (Button) view.findViewById(R.id.guest_button);
        final EditText adultEdit = view.findViewById(R.id.adult);
        final EditText childrenEdit = view.findViewById(R.id.children);
        final EditText roomEdit = view.findViewById(R.id.numOfRoom);
        final EditText checkInEdit = view.findViewById(R.id.checkIn);
        final EditText checkOutEdit = view.findViewById(R.id.checkOut);
        final TextView outPut = view.findViewById(R.id.guestOutPut);
        String hotelRDes = ((MainActivity)getActivity()).hR.toString();
        outPut.setText(hotelRDes);
/*
        guestButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mListener.onFragmentInteraction("Did this make it to MainActivity?");
                String returnedFromMain = ((MainActivity) getActivity()).shareInFragments;
                //TextView tv2 = (TextView)view.findViewById(R.id.text_view);
                //tv2.setText((returnedFromMain));
            }
        });
*/
        adultEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                String tag = "beforeTextChanged";
                Log.i(tag, "beforeTextChanged");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String tag = "onTextChanged";
                Log.i(tag, "onTextChanged");
            }

            @Override
            public void afterTextChanged(Editable s) {
                //String tag = "afterTextChanged";
                //Log.i(tag, "afterTextChanged");
                String str = adultEdit.getText().toString();

                if (!str.isEmpty()) {
                    try {
                        int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setAdults(numOfA);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        outPut.setText((displayR));
                    } catch (Exception e) {

                    }
                } else {

                }

            }


        });

        childrenEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = childrenEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setChildren(numOfA);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        outPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
            }
        });

        roomEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = roomEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setRoom(numOfA);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        outPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
            }
        });

        checkInEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = checkInEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        //int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setCheckIn(str);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        outPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
            }
        });

        checkOutEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = checkOutEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        //int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setCheckOut(str);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        outPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
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
        Log.i(tag, "onAttach");
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
