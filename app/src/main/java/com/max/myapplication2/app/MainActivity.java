package com.max.myapplication2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button but;
    Button but1;
    Button but2;
    Button but3;
    Float tapX,tapY;
    TextView text,txy;
    ImageView pict;
    Model gamer = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = (Button) findViewById(R.id.knopka);
        but1 = (Button) findViewById(R.id.knopka1);
        but2 = (Button) findViewById(R.id.knopka2);
        but3 = (Button) findViewById(R.id.knopka3);
        text = (TextView)findViewById(R.id.texttt);

        pict = (ImageView) findViewById(R.id.kartinka);
        viewG();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            tapX = event.getX();
            tapY = event.getY();
        }
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            float deltaX = tapX - event.getX();
            float deltaY = tapY - event.getY();
            gamer.move(deltaX*(-0.1f),deltaY*(-0.1f));
            viewG();
//            gamer.setT((int) deltaX);
//            if (Math.abs(deltaX) < Math.abs(deltaY) && deltaY < 0)g_down();
//            else if (Math.abs(deltaX) < Math.abs(deltaY) && deltaY > 0) g_up();
//            else if (Math.abs(deltaX) > Math.abs(deltaY) && deltaX < 0)g_right();
//            else if (Math.abs(deltaX) > Math.abs(deltaY) && deltaX > 0)g_left();
        }

        return super.onTouchEvent(event);
    }


    private void viewG() {
        pict.setX(gamer.getX());
        pict.setY(gamer.getY());
        text.setText("x = " + String.valueOf(pict.getX()+" y = " + String.valueOf(pict.getY())));
    }
}
