/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Smart
 */
import java.lang.String;
public class StringUtils {
    
    public static boolean included (String word, String searched) {
        //word : orginal item
        //searched: term wanted
        String trim_searched = searched.trim();
        String searchedUpper = trim_searched.toUpperCase();
        String trim_word = word.trim();
        String wordUpper = trim_word.toUpperCase();
        
        return wordUpper.contains(searchedUpper);
    }
    
}
