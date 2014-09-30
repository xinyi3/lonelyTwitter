package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TweetListModel
{
	private ArrayList<LonelyTweetModel> tweets;

	public TweetListModel()
	{

		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}

	public void add(LonelyTweetModel t)
	{
		tweets.add(t);
	}

	public boolean hasTweet(LonelyTweetModel t)
	{
		return tweets.contains(t);
	}

	public void addTweet(LonelyTweetModel t1)
	{
		if (tweets.contains(t1)){
			throw new IllegalArgumentException("Duplicated Tweets");
		}else{
			tweets.add(t1);
		}
	}

	public int getCount()
	{
		int i=0;
		for(LonelyTweetModel lonelyTweetModel:tweets){
			i++;
		}
		return i;
	}
	
	//sorting by date code from Domchi, Link:  http://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
	public String getTweets(){
		Collections.sort(tweets, new Comparator<LonelyTweetModel>(){
			public int compare(LonelyTweetModel t1, LonelyTweetModel t2){
				return t1.getTimestamp().compareTo(t2.getTimestamp());
			}
		}
		);
		
		String a = "";
		for(LonelyTweetModel lonelyTweetModel:tweets){
			a = lonelyTweetModel.getTimestamp() + lonelyTweetModel.getText() + ", ";
		}
		return a;
	}

	public void removeTweet(LonelyTweetModel t1)
	{

		// TODO Auto-generated method stub
		tweets.remove(t1);
	}

}
