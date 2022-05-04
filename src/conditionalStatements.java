import java.util.Scanner;

// public class conditionalStatements{
//     public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
    
//     System.out.println("Enter a number greater than 212:");
//         int num = Integer.valueOf(scanner.nextLine());
//         if(num > 212){
//     System.out.println("Water is boiling!");
//     }
//     scanner.close();
//     }
// }

// class NumberComparison{
//     public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);

//     System.out.println("Enter a number:");
//         int num1 =Integer.valueOf(scan.nextLine());
//     System.out.println("Enter another number:");
//         int num2 = Integer.valueOf(scan.nextInt());
//         if (num1 > num2){
//     System.out.println("The first number was larger than the second.");}
//         else{
//     System.out.print("The second number was larger than the first.");}
    
//     scan.close();
//     }
// }

// class TestScores{
//     public static void main(String[] args) {
//     Scanner inputscore = new Scanner(System.in);

//     System.out.println("Name a number between 0 and 100");
//         int number = Integer.valueOf(inputscore.nextLine());
//         if(number >=90){
//     System.out.println("Your grade is an A :)");
//         } else if (number >= 80 && number <90){
//     System.out.println("Your grade is an B :)");}
//         else if (number >=70 && number <80){
//     System.out.println("Your grade is an C -_-");}
//         else if (number >=60 && number < 70){
//     System.out.println("Your grade is an D :(");} 
//         else{
//     System.out.println("Your grade is an F :(");}
    
//     inputscore.close();
//     }
// }

class SameOrNah{
    public static void main(String[] args) {
        Scanner inputword= new Scanner(System.in);

    System.out.println("Enter a word:");
        String word1 =(inputword.nextLine());

    System.out.println("Enter another word:");
        String word2 = (inputword.nextLine());
                if(word1.equals(word2)){
    System.out.println("The words are the same.");}
                else{
    System.out.println("The words are different.");}

    inputword.close();
    }
}

