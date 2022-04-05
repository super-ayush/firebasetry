package com.example.ipl01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Expert11Data.DataModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragTab1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragTab1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private ArrayList<DataModel> dataHolder;

    public fragTab1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragTab1.
     */
    // TODO: Rename and change types and number of parameters
    public static fragTab1 newInstance(String param1, String param2) {
        fragTab1 fragment = new fragTab1();
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
        View view = inflater.inflate(R.layout.fragment_frag_tab1, container, false);
        recyclerView = view.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder = new ArrayList<>();

        DataModel ob1 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob1);

        DataModel ob2 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob2);

        DataModel ob3 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob3);

        DataModel ob4 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob4);

        DataModel ob5 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob5);

        DataModel ob6 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob6);

        DataModel ob7 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob7);

        DataModel ob8 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob8);

        DataModel ob9 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob9);

        DataModel ob10 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob10);

        DataModel ob11 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob11);

        DataModel ob12 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob12);

        DataModel ob13 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob13);

        DataModel ob14 = new DataModel(R.drawable.profile_pic, "Anurag Dwivedi", R.drawable.expert_team);
        dataHolder.add(ob14);

        recyclerView.setAdapter(new myAdapter(dataHolder));
        return view;
    }
}