package com.faraaf.tictacdev.firebasepushnotif.sample1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.faraaf.tictacdev.firebasepushnotif.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

public class Sample1Activity extends AppCompatActivity implements View.OnClickListener {

    Button getToken;
    private static final String TAG = "Sample1Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample1);
        getToken = findViewById(R.id.getToken);
        getToken.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
            @Override
            public void onComplete(@NonNull Task<InstanceIdResult> task) {
                if (!task.isSuccessful()) {
                    return;
                }
                // Get the Instance ID token//
                String token = task.getResult().getToken();
                String msg = getString(R.string.fcm_token, token);
                Log.d(TAG, msg);
                Toast.makeText(Sample1Activity.this, "Your device token has been saved in logcat", Toast.LENGTH_LONG).show();
            }
        });
    }


}
