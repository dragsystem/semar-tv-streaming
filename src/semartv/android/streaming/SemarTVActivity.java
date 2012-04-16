package semartv.android.streaming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SemarTVActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Thread logoTimer = new Thread(){
        	public void run(){
        		try{
        			sleep(3000);
        			Intent menuIntent=new Intent("com.semartv.streaming.VIEW");
        			startActivity(menuIntent);
        		} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
        		finally{
        			finish();
        		}
        	}
 

        	};

        	logoTimer.start();

   	}

 }



