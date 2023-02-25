public class Tweet
{
    // instance variables - replace the example below with your own
    private String body, username;
    private int likes,commentCount, followers, retweets;
    private boolean confirmDelete, isVerified; 

    public Tweet()
    {
        this("Hello World", 100, "Lopez", 50, 60, false, true);
    }

    /**
     * Constructor for tweet class
     */
    public Tweet(String body, int likes, String username, int commentCount, int retweets, boolean confirmDelete, boolean isVerified)
    {
        this.body = body;
        this.likes = likes;
        this.username = username;
        this.commentCount = commentCount;
        this.followers = followers;
        this.retweets = retweets;
        this.confirmDelete = confirmDelete;
        this.isVerified = isVerified;
    }

    public void loggedIn()
    {
        System.out.println("Logged in in as: " + username);
    }
    
    public void postTweet(String body)
    {
        this.body = body;
        System.out.println(this.body);
        System.out.println("Tweeted by " + this.username);
    }
    
    public void setBody(String body)
    {
        this.body = body;
    }
    public String getBody()
    {
        return this.body;
    }
    
}
