package ca.ualberta.cs.lonelytwitter;


public abstract class TweetModels implements Interface1
{
	private String tweetText;
	
	public TweetModels(String tweetText){
		super();
		this.tweetText=tweetText;
	}
	
	public String getText(){
		return tweetText;
	}
	
	public void setText(String t){
		this.tweetText= t;
	}
	
	
}
