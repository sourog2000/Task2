package com.example.question2;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class ActuFrag extends Fragment {
    private Communicator comu = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.action_fragment, container, false);
        Button btn = (Button) view.findViewById(R.id.addit);
        Button btn2 = (Button) view.findViewById(R.id.delit);
        EditText et = (EditText) view.findViewById(R.id.namu_new);
        CheckBox simpleCheckBox = (CheckBox) view.findViewById(R.id.checku);
        comu = (Communicator) getActivity();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alu = et.getText().toString();
                comu.clicked(alu);
//                simpleCheckBox.setText(alu);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                List<String> aList = new ArrayList<String>();

                ListFrag ol = new ListFrag();
                ol.getcheku(v);
//                System.out.println(simpleCheckBox.isChecked());

//                System.out.println("aList");
//                String s = (String) simpleCheckBox.getText();
//                System.out.println(s);

            }
        });
        return view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
