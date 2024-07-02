import java.util.Scanner;

// public class hangman2 {
//     public static void main(String[] args) {
//         final String Word = "pygod";
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a letter:");
//         char letter = input.next().charAt(0);

//         for (int i = 0; i < Word.length(); i++) {
//             if(letter == Word.charAt(i)) {
//                 System.out.println("You guessed right!");
//             }else{
//                 System.out.println("You guessed wrong");
//             }
//         }
//         input.close();
//     }
// }
// import java.util.Scanner;

public class hangman2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String word = "secret";
        int chances = 5;
        boolean correctGuess = false;

        char[] display = new char[word.length()];

        while(chances > 0 && !correctGuess) {
            System.out.print("Guess a letter: ");
            char letter = input.next().charAt(0);
            correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) {
                    // display[i] = letter;
                    correctGuess = true;    
                    break;
                }
            }
            if (!correctGuess) {
                chances--;
                System.out.println("Incorrect! You have " + chances + " chances left.");
            }
            System.out.println("The word contains: " + new String(display));
        }

        if (correctGuess) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}
