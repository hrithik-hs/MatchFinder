package com.project.matchfinder.datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SuffixTreeImplTest {

    SuffixTree suffixTree ;
    @BeforeEach
    void init(){
        suffixTree =  new  SuffixTreeImpl();
    }

    @Test
    void simpleTest1() {
        suffixTree.addString("Hrithik");
        suffixTree.addString("Hrithiki");
        suffixTree.addString("thikit");
        suffixTree.addString("One");
        suffixTree.addString("Gaurav");
        List<String> res = suffixTree.match("rit");
        assertTrue(res.size()==2);
    }

    @Test
    void simpleTest2() {
        suffixTree.addString("Hrithik");
        suffixTree.addString("Hrithiki");
        suffixTree.addString("thikit");
        suffixTree.addString("One");
        suffixTree.addString("Gaurav");
        List<String> res = suffixTree.match("av");
        assertTrue(res.size()==1);

    }
    @Test
    void simpleTest3() {
        suffixTree.addString("Hrithik");
        suffixTree.addString("Hrithiki");
        suffixTree.addString("thikit");
        suffixTree.addString("One");
        suffixTree.addString("Gaurav");
        List<String> res = suffixTree.match("one");
        assertTrue(res.size()==1);
    }

    @Test
    void simpleTest4() {
        suffixTree.addString("Hrithik");
        suffixTree.addString("Hrithiki");
        suffixTree.addString("thikit");
        suffixTree.addString("One");
        suffixTree.addString("Gaurav");
        List<String> res = suffixTree.match("long");
        assertTrue(res.size()==0);
    }

}