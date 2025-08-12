package com.example.shinchi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Terms_Conditions extends Fragment {

    public Terms_Conditions() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Inflate the layout
        View root = inflater.inflate(R.layout.fragment_terms__conditions, container, false);

        // Find views
        Button acceptButton = root.findViewById(R.id.btn_accept);
        Button declineButton = root.findViewById(R.id.btn_decline);
        TextView termsText = root.findViewById(R.id.txt_terms);

        // Set the terms text from strings.xml
        termsText.setText(getString(R.string.Terms_And_Condition));

        // Accept button click
        acceptButton.setOnClickListener(v -> {
            Toast.makeText(getContext(), "You accepted the terms.", Toast.LENGTH_SHORT).show();
            // Add your logic for accepting terms here
        });

        // Decline button click
        declineButton.setOnClickListener(v -> {
            Toast.makeText(getContext(), "You declined the terms.", Toast.LENGTH_SHORT).show();
            // Add your logic for declining terms here
        });

        return root;
    }
}
