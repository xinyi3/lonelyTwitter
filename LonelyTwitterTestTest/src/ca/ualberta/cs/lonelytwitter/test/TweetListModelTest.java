package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.TweetListModel;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetListModelTest()
	{
		super(LonelyTwitterActivity.class);
	}

//	public void testFail(){
//		fail("We failed!!!");
//	}
	
	public void testFiveIsFive(){
		assertEquals(5, 5);
	}
	
	public void testTweetListModel(){
		TweetListModel tlm = new TweetListModel();
	}
	
	public void testAdd(){
		LonelyTweetModel t = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t);
		assertTrue(tlm.hasTweet(t));
	}
	
	public void testGetCount(){
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Hello2");
		TweetListModel tlm = new TweetListModel();
		
		tlm.add(t1);
		assertTrue(tlm.getCount()==1);
		tlm.add(t2);
		assertTrue(tlm.getCount()==2);
	}
	
	public void testAddTweet(){
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Hello");
		LonelyTweetModel t3 = new LonelyTweetModel("Hello1");
		TweetListModel tlm = new TweetListModel();
		tlm.addTweet(t1);
		//tlm.addTweet(t2);
		tlm.addTweet(t3);
		assertTrue(tlm.getCount()==2);
	}
	
	public void testGetTweets(){
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t1);
		tlm.add(t2);
		String a = tlm.getTweets();
		assertTrue (a != "");
	}
	
	public void testHasTweet(){
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		LonelyTweetModel t2 = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t1);
		assertTrue (tlm.hasTweet(t2));
	}
	
	public void testRemoveTweet(){
		LonelyTweetModel t1 = new LonelyTweetModel("Hello");
		TweetListModel tlm = new TweetListModel();
		tlm.add(t1);
		tlm.removeTweet(t1);
		assertTrue(tlm.getCount()==0);
	}
}
