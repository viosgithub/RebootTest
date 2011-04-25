package com.foo.RebootTest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnClickListener;

public class RebootTest extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.id.Button01).setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//以下のようにやるとrebootできるらしい
		Intent i = new Intent(Intent.ACTION_REBOOT);
		i.putExtra("nowait", 1);
		i.putExtra("interval", 1);
		i.putExtra("window", 0);
		sendBroadcast(i);
		
	}
}