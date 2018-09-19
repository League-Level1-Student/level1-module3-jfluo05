
public class Netflix {
public static void main(String[] args) {
	
	Movie pitchPerfect= new Movie("Pitch Perfect", 5);
	pitchPerfect.getTicketPrice();
	
	Movie crazyRichAsians= new Movie("Crazy Rich Asians", 4);
	crazyRichAsians.getTicketPrice();
	
	Movie coolRunnings= new Movie("Cool Runnings", 2);
	coolRunnings.getTicketPrice();
	
	Movie littleGiants= new Movie("Little Giants", 3);
	littleGiants.getTicketPrice();
	
	Movie karateKid= new Movie("Karate Kid", 3);
	karateKid.getTicketPrice();
	
	NetflixQueue NQ= new NetflixQueue();
	
	NQ.addMovie(pitchPerfect);
	NQ.addMovie(crazyRichAsians);
	NQ.addMovie(coolRunnings);
	NQ.addMovie(littleGiants);
	NQ.addMovie(karateKid);
	
	System.out.println(pitchPerfect);
	System.out.println(crazyRichAsians);
	System.out.println(coolRunnings);
	System.out.println(littleGiants);
	System.out.println(karateKid);

	Movie m= NQ.getBestMovie();
	System.out.println("The best movie is "+m.getTitle());
	System.out.println("The second best movie is Crazy Rich Asians");
}
}
