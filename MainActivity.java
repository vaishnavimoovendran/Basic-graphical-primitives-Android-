
package com.example.admin.ex3;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)  
{     
  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas = new Canvas(bg);
 Paint paint1 = new Paint();
        paint1.setColor(Color.RED);
        paint1.setTextSize(50);//To draw a Rectangle
        canvas.drawText("Rectangle", 420, 150, paint1);
        canvas.drawRect(400, 200, 650, 700, paint1);
        Paint paint2 = new Paint();
        paint2.setColor(Color.BLUE);
        paint2.setTextSize(50);
        canvas.drawText("Circle", 120, 150, paint2);
        canvas.drawCircle(200, 350, 150, paint2);
         Paint paint3 = new Paint();
        paint3.setColor(Color.MAGENTA);
        paint3.setTextSize(50);  
canvas.drawText("Square", 120, 800, paint3);
        canvas.drawRect(50, 850, 350, 1150, paint3);

    }}

