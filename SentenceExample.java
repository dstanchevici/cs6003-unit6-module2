
public class SentenceExample {

    public static void main (String[] argv)
    {
	Sentence s1 = new Sentence ();
	s1.setSentence ("Colorless green ideas sleep furiously.");
	Sentence s2 = new Sentence ();
	s2.setSentence ("try not to ever split infinitives");
	Sentence s3 = new Sentence ();
	s3.setSentence ("This   sentence isfalse!");

	System.out.println (s1.startsRight() + "  " + s1.endsRight());
	System.out.println (s2.startsRight() + "  " + s2.endsRight());
	System.out.println (s3.startsRight() + "  " + s3.endsRight());

	System.out.println (s1.countLetters() + " letters out of " + s1.length() + " chars");
	System.out.println (s2.countLetters() + " letters out of " + s2.length() + " chars");
	System.out.println (s3.countLetters() + " letters out of " + s3.length() + " chars");
    }

}
