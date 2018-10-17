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
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Fragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String tag = "Fragment1";
        Log.i(tag,"onCreateView");
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        final EditText nameEdit = view.findViewById(R.id.name);
        final EditText streetEdit = view.findViewById(R.id.street);
        final EditText stateEdit = view.findViewById(R.id.state);
        final EditText cityEdit = view.findViewById(R.id.city);
        final EditText phoneEdit = view.findViewById(R.id.phone);
        final EditText emailEdit = view.findViewById(R.id.email);
        final TextView personalOutPut = view.findViewById(R.id.personalOutPut);

        String hotelRDes = ((MainActivity)getActivity()).hR.toString();
        personalOutPut.setText(hotelRDes);
        nameEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = nameEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        //int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setName(str);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        personalOutPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {

                }
            }
        });

        streetEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = streetEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        //int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setStreet(str);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        personalOutPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
            }
        });

        cityEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = cityEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        //int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setCity(str);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        personalOutPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
            }
        });

        stateEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = stateEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        //int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setState(str);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        personalOutPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
            }
        });

        phoneEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = phoneEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        //int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setPhone(str);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        personalOutPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
            }
        });

        emailEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String str = emailEdit.getText().toString();
                if (!str.isEmpty()) {
                    try {
                        //int numOfA = Integer.parseInt(str);
                        mListener.onFragmentInteraction(str);
                        String returnFromMain = ((MainActivity) getActivity()).shareInFragments;
                        ((MainActivity) getActivity()).hR.setEmail(str);
                        String displayR = ((MainActivity) getActivity()).hR.toString();
                        personalOutPut.setText((displayR));
                    } catch (Exception e) {
                    }
                } else {
                }
            }
        });


        return view;
    }

    @Override
    public void onResume() {
        String tag = "Fragment1";
        Log.i(tag,"onResume");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        String tag = "Fragment1";
        Log.i(tag,"onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        String tag = "Fragment1";
        Log.i(tag,"onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onPause() {
        String tag = "Fragment1";
        Log.i(tag,"onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        String tag = "Fragment1";
        Log.i(tag,"onStop");
        super.onStop();
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(View view) {
        if (mListener != null) {
            mListener.onFragmentInteraction("Did fragment1 made it to MainActivity");
        }
    }

    @Override
    public void onAttach(Context context) {
        String tag = "Fragment1";
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
