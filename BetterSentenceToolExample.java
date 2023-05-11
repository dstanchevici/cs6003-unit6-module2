
public class BetterSentenceToolExample {

    public static void main (String[] argv)
    {
	String s1 = "Now, disobey this command!";
	String s2 = "I used to think I was indecisive; but now I'm not so sure.";

	System.out.println (BetterSentenceTool.countLetters(s1) + ", " + BetterSentenceTool.countNonLetters(s1));
	System.out.println (BetterSentenceTool.countLetters(s2) + ", " + BetterSentenceTool.countNonLetters(s2));
    }

}
