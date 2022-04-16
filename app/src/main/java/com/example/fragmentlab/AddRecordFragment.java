package com.example.fragmentlab;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddRecordFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddRecordFragment extends Fragment {
    private Button saveBtn;
    private EditText mail;
    private EditText name;
    private EditText age;
    private EditText address;
    private SharedViewModal sharedViewModel;
    private AddRecordFragment interface;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddRecordFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     */
    // TODO: Rename and change types and number of parameters
    public static AddRecordFragment newInstance() {
        AddRecordFragment fragment = new AddRecordFragment();
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
        sharedViewModel = new ViewModelProvider(getActivity()).get(SharedViewModal.class);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_record, container, false);
        mail = view.findViewById(R.id.email);
        name = view.findViewById(R.id.name);
        age = view.findViewById(R.id.Age);
        address = view.findViewById(R.id.address);
        saveBtn = view.findViewById(R.id.SaveBtn);
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            interface = (AddRecordFragment.Interface) context;
        } catch (ClassCastException error) {
            error.printStackTrace();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedViewModel.addRecord(mail.getText().toString(), name.getText().toString(), age.getText().toString(), address.getText().toString());
                interface.
            }
        });
    }

    interface RecordFragmentInterface {
        public void messageFrag();
    }
}