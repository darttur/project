package com.example.tpss2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class LoadImage extends Activity {


    private final String TAG = "log_tag";

    private Context context;
    private ImageView imageView;

    public LoadImage(Context context, ImageView imageView) {
        this.context = context;
        this.imageView = imageView;
    }

    private static final int REQUEST_CAMERA = 1;
    private static final int REQUEST_GALLERY = 2;


    public void loadGallery(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, REQUEST_GALLERY);// ошибка в этой строке
//        (context.startActivityForResult(intent, REQUEST_GALLERY))
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case REQUEST_CAMERA:

                break;
            case REQUEST_GALLERY:
                if (resultCode == RESULT_OK) {
                    try {
                        final Uri imageUri = data.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imageView.setImageBitmap(selectedImage);
                    } catch (FileNotFoundException e) {
                        e.getMessage();
                    }
                }
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}


