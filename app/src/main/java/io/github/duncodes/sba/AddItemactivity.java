package io.github.duncodes.sba;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Calendar;

import io.github.duncodes.sba.Model.Inventory;

public class AddItemactivity extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 1880;
    private ImageView imageView;
    private ImageView imageViewdefault;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_itemactivity);
        setTitle("Add New Item");

        this.imageView = (ImageView) this.findViewById(R.id.image_view);
        this.imageViewdefault = (ImageView) this.findViewById(R.id.default_image);
        Button photoButton = (Button) this.findViewById(R.id.btn_take_photo);

        photoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });

        Button createproduct = (Button) this.findViewById(R.id.btn_submit);
        createproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO : get all the data and parse it to the server
                EditText product_name = (EditText) findViewById(R.id.input_name);
                EditText ship_price = (EditText) findViewById(R.id.input_shipping_price);
                EditText unit_price = (EditText) findViewById(R.id.input_unit_price);
                EditText descption = (EditText) findViewById(R.id.input_description);
                DatePicker date = (DatePicker) findViewById(R.id.input_date);
                Inventory inventory = new Inventory();
                inventory.setPrice(Float.valueOf(unit_price.getText().toString()));
                inventory.setName(product_name.getText().toString());
                inventory.setDescription(descption.getText().toString());
                inventory.setShippingPrice(Float.valueOf(ship_price.getText().toString()));
                inventory.setDate(getDateFromDatePicker(date));

                Toast.makeText(getApplication(), inventory.getName(), Toast.LENGTH_LONG).show();
            }
        });

    }
    private static java.util.Date getDateFromDatePicker(DatePicker datePicker){
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year =  datePicker.getYear();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        return calendar.getTime();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
            imageViewdefault.setImageBitmap(photo);
        }
    }



}
