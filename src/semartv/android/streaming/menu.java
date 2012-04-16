package semartv.android.streaming;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class menu extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view);
		String LocalFile = "file:///android_asset/stream.htm";

	    WebView webView = (WebView) findViewById(R.id.webview);
	    WebSettings webSettings = webView.getSettings();
	    webSettings.setJavaScriptEnabled(true);
	    webSettings.setPluginsEnabled(true);

	    webSettings.setLoadWithOverviewMode(true);
	    webSettings.setUseWideViewPort(true); 
	    webSettings.setAllowFileAccess(true);

	    webView.setBackgroundColor(Color.BLACK);
	    webView.setVerticalScrollBarEnabled(false);
	    webView.setHorizontalScrollBarEnabled(false);
	    webView.loadUrl(LocalFile);

	}
	public void onConfigurationChanged(Configuration newConfig) 
    {
        super.onConfigurationChanged(newConfig);

    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 0, 0, R.string.app_about);
		menu.add(0, 1, 1, R.string.str_exit);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub

		
		switch (item.getItemId()) {
		case 0:
			openOptionsDialog();
			break;
			case 1:
			exitOptionsDialog();
			break;
			}
			return super.onOptionsItemSelected(item);
		}
	
	
	
	private void openOptionsDialog()
	{
	new AlertDialog.Builder(this)
	.setTitle(R.string.app_about)
	.setMessage(R.string.app_about_message)
	.setPositiveButton(R.string.str_ok,
	new DialogInterface.OnClickListener()
	{
	public void onClick(DialogInterface dialoginterface, int i)
	{
	}
	})
	.show();
	}




	private void exitOptionsDialog()
	{
	new AlertDialog.Builder(this)
	.setTitle(R.string.app_exit)
	.setMessage(R.string.app_exit_message)
	.setNegativeButton(R.string.str_no,
	new DialogInterface.OnClickListener()
	{
	public void onClick(DialogInterface dialoginterface, int i)
	{}
	})
	.setPositiveButton(R.string.str_ok,
	new DialogInterface.OnClickListener()
	
	{
	public void onClick(DialogInterface dialoginterface, int i)
	{
		finish();
		System.exit(0);
	}
	})
	.show();
	}

}
