package com.example.fragmentlab;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ActionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActionFragment extends Fragment {
    private ActionFragmentInterface actionCommInterface;
    private Button addRecordButton;
    private Button searchRecordButton;

    public ActionFragment() {
        // Required empty public constructor
    }

    public static ActionFragment newInstance() {
        ActionFragment fragment = new ActionFragment();
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            actionCommInterface = (ActionFragmentInterface) context;
        } catch (ClassCastException err) {
            err.printStackTrace();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_action, container, false);
        addRecordButton = view.findViewById(R.id.AddRecord);
        searchRecordButton = view.findViewById(R.id.SearchRecord);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        addRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionCommInterface.showAddRecord();
            }
        });
        searchRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionCommInterface.showSearchRecord();
            }
        });
    }

    public interface ActionFragmentInterface {
        public void showAddRecord();

        public void showSearchRecord();
    }
}