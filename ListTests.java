import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;




public class ListTests{

    @Test 
	public void testFilter(){

    StringChecker sc = new StringChecker() {
        public boolean checkString(String s) {
          return s.startsWith("b") || s.startsWith("c");
        }
      };
    
    List<String> sr = new ArrayList<> (Arrays.asList("aaaa","bbbb","cccc"));

    List<String> expected = new ArrayList<>(Arrays.asList("bbbb", "cccc"));
    List<String> actual = ListExamples.filter(sr, sc);
    assertEquals(expected, actual);


    }



}