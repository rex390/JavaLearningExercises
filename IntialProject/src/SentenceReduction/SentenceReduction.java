package SentenceReduction;

public class SentenceReduction 
{


	public void compressSentence(String sentence) {


		String[] wordList = sentence.split(" ");

		for (int i = 0; i < wordList.length; i++) {


			if (i+1 < wordList.length) {
				wordList[i] = compareChar(wordList[i], wordList[i+1]);
				if (wordList[i].charAt(wordList[i].length()-1) == '~' ) {
					wordList[i] = wordList[i].substring(0, wordList[i].length()-1);
					System.out.print(wordList[i]+ "");
				}
				else {
					System.out.print(wordList[i]+ " ");
				}

			}	
		}


	}

	public String compareChar(String wordOne, String wordTwo) {

		String reduncance = "";
		String result = wordOne;
		System.out.println(wordOne + " " + wordTwo);
		boolean found = false; 

		for (int i = 0; i < wordTwo.length(); i++) 
		{
			for (int j = wordOne.length()-1; j > 0; j--) 
			{			
				if (i+1 < wordTwo.length() && j-1 < wordOne.length()) 
				{

					
					String t1 = Character.toString(wordTwo.charAt(i)) + Character.toString(wordOne.charAt(j));
					String t2 =  Character.toString(wordOne.charAt(j-1)) + Character.toString(wordTwo.charAt(i+1));
					System.out.println(t1 + " " + t2);
					if (t1.equals(t2))  
					{

						reduncance += t1 + t2;//wordTwo.charAt(i) + wordTwo.charAt(i+1);
						System.out.println("reduncance: " + reduncance);			


						
						//						if (wordTwo.charAt(i+1) == wordOne.charAt(j-1)) 
						//						{
						//							reduncance += wordTwo.charAt(i+1);
						//							System.out.println("reduncance2: " + reduncance+i+1);		
						//							found = true; 
						//						}
						//					}

					}

				}
				else {
					found = false;
				}
			}

		}

		if (found == true) {

			wordTwo = "";
			result=  wordOne.replace(reduncance, "~") ;
			System.out.println("reduncance: " + reduncance);
		}

		return result;
	}

}

