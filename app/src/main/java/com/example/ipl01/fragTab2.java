package com.example.ipl01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ExpertRanks.DataModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragTab2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragTab2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private ArrayList<DataModel> dataHolder2;

    public fragTab2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragTab2.
     */
    // TODO: Rename and change types and number of parameters
    public static fragTab2 newInstance(String param1, String param2) {
        fragTab2 fragment = new fragTab2();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_tab2, container, false);
        recyclerView = view.findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder2 = new ArrayList<>();

        DataModel ob1 = new DataModel("1", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob1);

        DataModel ob2 = new DataModel("2", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob2);

        DataModel ob3 = new DataModel("3", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob3);

        DataModel ob4 = new DataModel("4", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob4);

        DataModel ob5 = new DataModel("5", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob5);

        DataModel ob6 = new DataModel("6", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob6);

        DataModel ob7 = new DataModel("7", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob7);

        DataModel ob8 = new DataModel("8", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob8);

        DataModel ob9 = new DataModel("9", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob9);

        DataModel ob10 = new DataModel("10", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob10);

        DataModel ob11 = new DataModel("11", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob11);

        DataModel ob12 = new DataModel("12", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob12);

        DataModel ob13 = new DataModel("13", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob13);

        DataModel ob14 = new DataModel("14", R.drawable.profile_pic, "Anurag Dwivedi", "999", R.drawable.expert_team);
        dataHolder2.add(ob14);

        recyclerView.setAdapter(new myAdapter2(dataHolder2));

        return view;
    }
}