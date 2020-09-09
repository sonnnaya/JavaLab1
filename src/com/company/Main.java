// Program finds words whose symbols placed in ascending order of their codes
package com.company;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        String sequency = "dhiw[dj ABCDE fkfk jdd wp;w; abcde";
        StringTool program = new StringTool(sequency);
        ArrayList<String> answer = program.GetCodeOrderedWords();
        System.out.println(answer);
    }
}

class StringTool
{
    private String buffer;

    public StringTool(String buffer)
    {
        this.buffer = buffer;
    }

    public ArrayList<String> GetCodeOrderedWords()
    {
        String[] allWords = buffer.split(" ");
        ArrayList<String> orderedWords = new ArrayList<>();

        for (String word : allWords)
        {
            boolean ordered = true;
            for (int i = 0; i < word.length() - 1; ++i)
            {
                if (word.charAt(i) > word.charAt(i + 1))
                    ordered = false;
            }
            if (ordered)
                orderedWords.add(word);
        }

        return orderedWords;
    }
}