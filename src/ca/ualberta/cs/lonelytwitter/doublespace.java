package ca.ualberta.cs.lonelytwitter;


public class doublespace extends TweetModels
{

	public doublespace(String tweetText)
	{

		super(tweetText);
		
		// TODO Auto-generated constructor stub
	}
	public String getText(){
		return "\n" + super.getText() + "\n";
	}
	public void setText()
	{

		// TODO Auto-generated method stub
		
	}

}
