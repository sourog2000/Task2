package com.example.question2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;


import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListFrag extends ListFragment {

    // array objects
//    String courseList[] = {};
    List <String> courseList = new ArrayList<>();
    CheckBox ckb;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.item_view, R.id.checku, courseList);
//        ckb = (CheckBox) getListView().findViewById(R.id.checku);
        setListAdapter(arrayAdapter);

//        return inflater.inflate(R.layout.list_fragment, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);

    }


    public void aduLst(String text) {

        courseList.add(text);
        System.out.println(courseList);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.item_view, R.id.checku, courseList);
//        ckb.setText(text);
        setListAdapter(arrayAdapter);
        getListView().setSelection(arrayAdapter.getCount()-1);
    }

    public void getcheku(View v){
//        View v = new View();
        System.out.println("Reached Destination");
        ckb = (CheckBox) v.findViewById(R.id.checku);
//        ckb = (CheckBox) getListView().findViewById(R.id.checku);
        System.out.println(ckb);
//        if(ckb.isChecked() == true){
//            System.out.println(ckb.getText());
//                    aList.add((String) simpleCheckBox.getText());
//        }
    }

//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
////        simpleListView = (ListView) findViewById(R.id.simpleListView);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.item_view, R.id.itemTextView, courseList);
//        setListAdapter(arrayAdapter);
//    }
}
