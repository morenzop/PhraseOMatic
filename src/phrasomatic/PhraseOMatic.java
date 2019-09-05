package phrasomatic;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordsListOne = {"Wild" , "Super", "Wonderous", "Fantastic",
        "Crazy", "10 Mile", "Next Level"};
        String[] wordsListTwo = {"Unfettered", "Unfiltered", "Well Thought",
        "Hair Brained", "Straight", "Unconventional"};
        String[] wordsListThree = {" Plan", "Mind-Space", "Structure", "Flavor",
        "Movement", "Initiative"};

        int oneLength = wordsListOne.length;
        int twoLength = wordsListTwo.length;
        int threeLength = wordsListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordsListOne[rand1] + " " + wordsListTwo[rand2] + " " +
                wordsListThree[rand3];
        System.out.println("What we need is a " + phrase + ".");
    }
}
