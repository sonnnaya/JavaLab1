// Program finds words whose symbols placed in ascending order of their codes
package com.company;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            //String sequency = "dhiw[dj ABCDE fkfk jdd wp;w; abcde";

            Scanner in = new Scanner(System.in);
            System.out.print("Enter line: ");
            String sequency = in.nextLine();

            StringTool program = new StringTool(sequency);
            ArrayList<String> answer = program.GetCodeOrderedWords();
            System.out.println(answer);
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
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