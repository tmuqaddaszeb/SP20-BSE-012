package com.example.fragmentlab.;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionFragment.ActionFragmentInterface, AddRecordFragment.RecordFragmentInterface, MessageFragment.MessageFragmentInterface
{
    private FragmentManager fragManager;
    private FragmentTransaction fragmentTrans;
    private ActionFragment actionFragment;
    private MessageFragment messageFragment;
    private AddRecordFragment recordFragment;
    private SearchRecordFragment searchFragment;
    private SharedViewModal sharedViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedViewModel = new ViewModelProvider(this).get(SharedViewModal.class);
        sharedViewModel.initialize();

        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)
        {
            fragManager = getSupportFragmentManager();
            fragmentTrans = fragManager.beginTransaction();
            actionFragment = ActionFragment.newInstance();
            messageFragment = MessageFragment.newInstance();
            recordFragment = AddRecordFragment.newInstance();
            searchFragment = SearchRecordFragment.newInstance();
            fragmentTrans.replace(R.id.LeftFragment, actionFragment);
            fragmentTrans.replace(R.id.RightFragment, messageFragment);
            fragmentTrans.commitNow();
        }
    }




    @Override
    public void showAddRecord()
    {
            fragmentTrans = fragManager.beginTransaction();
            fragmentTrans.replace(R.id.RightFragment, recordFragment);
            fragmentTrans.commitNow();
    }

    @Override
    public void showSearchRecord()
    {
            fragmentTrans = fragManager.beginTransaction();
            fragmentTrans.replace(R.id.RightFragment, searchFragment);
            fragmentTrans.commitNow();
    }


    @Override
    public void messageFrag() {
        fragmentTrans = fragManager.beginTransaction();
        fragmentTrans.replace(R.id.RightFragment, messageFragment);
        fragmentTrans.commitNow();
    }
}