class FirstNonRepeat{
	public static void main(String[] args) {
		String word = "raviravi"; //v
		int[] warr = new int[256];
		for(int i=0; i<word.length(); i++){
			warr[word.charAt(i)]++;
		}
		for(int i=0; i<word.length(); i++){
			if(warr[word.charAt(i)] == 1){
				System.out.println(word.charAt(i));
				return;
			}
		}
		System.out.println("There are no non repeating characters");
	}
}