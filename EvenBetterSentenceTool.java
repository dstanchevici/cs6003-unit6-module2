
/*

  NOTE To Grader: The module doesn't have a BetterSentenceToolSolution. I wonder if it should be BetterSentenceTool.
  
public class EvenBetterSentenceTool extends BetterSentenceToolSolution {

    // WRITE YOUR CODE HERE to override countLetters() and countNonLetters(),
    // checking for null.

}
*/


// BetterSentenceTool extends SentenceTool

public class EvenBetterSentenceTool extends BetterSentenceTool {

    // WRITE YOUR CODE HERE to override countLetters() and countNonLetters(),
    // checking for null.

    
    // Overrides countLetters in SentenceTool,
    // which is  extended in BetterSentenceTool
    public static int countLetters (String sentence)
    {
	if (sentence == null) {
	    // System.out.println ("The sentence is null.");
	    return 0;
	}

	int ltrCnt = 0;
	for (int i=0; i<sentence.length(); i++) {
	    char ch = sentence.charAt (i);
	    if ( Character.isLetter(ch) ) {
		ltrCnt ++;
	    }
	}	
	return ltrCnt;
    }


    // Overrides countNonLetters() in BetterSentenceTool
    public static int countNonLetters (String sentence)
    {
	if (sentence == null) {
	    // System.out.println ("The sentence is null.");
	    return 0;
	}

	return ( sentence.length() - countLetters(sentence) );	
    }
    
} // end-EvenBetterSentenceTool
