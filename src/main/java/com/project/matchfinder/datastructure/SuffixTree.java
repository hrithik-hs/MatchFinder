package com.project.matchfinder.datastructure;

import java.util.List;

public interface SuffixTree {
    void addString(String s);
    List<String> match(String s);
}
