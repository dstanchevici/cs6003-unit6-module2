
public class BetterSentenceTool extends SentenceTool {

    public static int countNonLetters (String sentence)
    {
	return ( sentence.length() - countLetters(sentence) );
    }

}
