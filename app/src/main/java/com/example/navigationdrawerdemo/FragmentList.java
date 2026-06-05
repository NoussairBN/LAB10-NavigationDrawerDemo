package com.example.navigationdrawerdemo;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ListFragment;

public class FragmentList extends ListFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        
        // Dark background for the list view
        view.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.background_dark));

        String[] items = {
                "System Boot: Success",
                "Network Interface: Up",
                "Database Connection: Established",
                "Security Protocol: Active",
                "Kernel Version: 5.10.43",
                "User Login: Admin",
                "Memory Usage: 42%",
                "Disk Status: Healthy",
                "API Gateway: Online",
                "Firewall: Enabled"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                items
        ) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View v = super.getView(position, convertView, parent);
                TextView tv = v.findViewById(android.R.id.text1);
                // Electric blue text for the list items to match the theme
                tv.setTextColor(ContextCompat.getColor(getContext(), R.color.electric_blue));
                return v;
            }
        };
        setListAdapter(adapter);
    }
}