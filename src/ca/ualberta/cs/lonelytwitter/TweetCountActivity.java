package ca.ualberta.cs.lonelytwitter;



import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class TweetCountActivity extends LonelyTwitterActivity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		final TextView tcount = (TextView) findViewById(R.id.tCount);
		setContentView(R.layout.activity_tweet_count);
		
		
		int i = tweets.size();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tweet_count, menu);
		return true;
	}

}
