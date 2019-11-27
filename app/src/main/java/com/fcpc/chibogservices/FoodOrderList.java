package com.fcpc.chibogservices;

import android.content.DialogInterface;
import android.os.Bundle;

import com.fcpc.chibogservices.core.Globals;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class FoodOrderList extends AppCompatActivity {

    /*
        HTML Client
     */
    private final OkHttpClient client = new OkHttpClient();

    private Handler h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_food_order_list);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        h = new Handler(this.getMainLooper());

        loadInformation();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Checkout", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                confirmCheckout();
            }
        });
    }


    private void confirmCheckout(){
        AlertDialog.Builder ab = new AlertDialog.Builder(FoodOrderList.this);

        ab.setTitle("Confirm Checkout");

        ab.setMessage("Are you sure you want to checkout?");

        ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        ab.create().show();
    }

    private void loadInformation(){
        loadFoodList.start();
    }

    private Thread loadFoodList = new Thread(new Runnable() {
        @Override
        public void run() {
            try{
                final RequestBody formBody = new FormBody.Builder()

                        .build();

                final Request request = new Request.Builder()
                        .url(Globals.FOOD_URL)
                        .post(formBody)
                        .build();

                Call call = client.newCall(request);
                final Response response = call.execute();

                final String responseData = response.body().string().trim();

                h.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(FoodOrderList.this, responseData, Toast.LENGTH_SHORT).show();
                    }
                });
            }
            catch(IOException ioex){
                h.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(FoodOrderList.this,
                                "There was a problem encountered while connecting.",
                                Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    });

    private void performCheckout(){

    }

}
