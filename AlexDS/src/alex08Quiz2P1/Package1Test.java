package alex08Quiz2P1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Package1Test {

    public static void main(String[] args) {
        String[] testStr = new String[]{"abccba","Racecar","hello","abccba","Was it a car or a cat I saw?","I did, did I?","hello","Don't nod"};

        for(int i=0;i<testStr.length;i++){
            System.out.println(testStr[i] + "   ===   " + checkForPalindrome(testStr[i]));
        }
    }
    public static boolean checkForPalindrome(String str){
        ArrayList<Character> stack = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                stack.add(str.charAt(i));
            }
            else if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                stack.add(Character.toLowerCase(str.charAt(i)));
            }
        }
        ArrayList<Character> newStack = new ArrayList<>();
        for(int i=stack.size()-1;i>=0;i--){
            newStack.add(stack.get(i));
        }

        return stack.toString().equals(newStack.toString());

    }
}
