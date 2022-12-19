import java.util.Scanner;
//import java.io.*;
//import java.util.*;

public class Anagramm {

    public static boolean check_two_words(String word_1, String word_2){
        boolean value = true;
        int x = 0;
        int y = word_2.length() - 1;
        int new_counter = 0;
        
        while(x < word_1.length()){
            if(word_1.charAt(x) == word_2.charAt(y)){
                new_counter++;
            }
            x++;
            y--;
        }
        
        if(new_counter == word_1.length()){
            value = true;
        }else{
            value = false;
        }
        return value;
    }
    
    public static void main(String[] args) {
        
        String[] words = {"evil", "live", "viel", "beer"};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word:"); 
        String s = in.nextLine();
        System.out.println("You entered the word: " + s);

        char[] word = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            char new_char = s.charAt(i);
            word[i] = new_char;
        }
        
        for(int j = 0; j < words.length; j++){
            int counter = 0;
            for(int k = 0; k < word.length; k++){
                String new_letter = "" + word[k];
                /*if(words[j].contains(new_letter)==true){
                    counter++;
                }*/
                for(int l = 0; l < words[j].length(); l++){
                    if(new_letter.charAt(0) == words[j].charAt(l)){
                        counter++;
                    }
                }
                
            }
            if(counter == words[j].length()){
                System.out.println(words[j] + " ist ein Anagramm von " + s);
            }
            //System.out.println(word[j]);
        }

        Scanner new_input = new Scanner(System.in);
        System.out.print("Enter a word:"); 
        String word_1 = new_input.nextLine();
        System.out.println("Enter another word: ");
        String word_2 = new_input.nextLine();

        if(check_two_words(word_1, word_2) == true){
            System.out.println(word_1 + " ist ein Anagram von " + word_2);
        }else{
            System.out.println(word_1 + " ist kein Anagram von " + word_2);
        }

    }

}
