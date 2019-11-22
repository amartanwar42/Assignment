package com.grab.stringIntersection;

import assignment.stringIntersection.StringIntersection;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

@Test(groups = {"HASHSET"})
public class UsingHashSetTest {
    StringIntersection stringIntersection = new StringIntersection();

    @Test(description = "Input where common words are duplicate. Ex. I came twice in the given sentence")
    public void withSomeCommonDuplicateWords(){
        ArrayList<String> arrayList1 = stringIntersection.getArrayList("I am aswathy  works at ThoughtWorks");
        ArrayList<String> arrayList2 = stringIntersection.getArrayList("I am amar I works at ThoughtWorks");

        ArrayList<String> actualResult = stringIntersection.getCommonWord(arrayList1, arrayList2);

        ArrayList<String> expectedResult = stringIntersection.getArrayList("I am works at thoughtworks");

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test(description = "There are no common words in given input sentence")
    public void noCommonWord(){
        ArrayList<String> arrayList1 = stringIntersection.getArrayList("I am aswathy I works at ThoughtWorks");
        ArrayList<String> arrayList2 = stringIntersection.getArrayList("Tajmahal is in India");

        ArrayList<String> actualResult = stringIntersection.getCommonWord(arrayList1, arrayList2);

        Assert.assertEquals(actualResult.size(),0);
    }

    @Test(description = "Input where common words are not duplicate")
    public void withSomeCommonNODuplicateWords(){
        ArrayList<String> arrayList1 = stringIntersection.getArrayList("I am aswathy ");
        ArrayList<String> arrayList2 = stringIntersection.getArrayList("I am amar");

        ArrayList<String> actualResult = stringIntersection.getCommonWord(arrayList1, arrayList2);

        ArrayList<String> expectedResult = stringIntersection.getArrayList("I am");

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test(description = "Input where common words are duplicate and with upper and lowercase combination")
    public void withSomeCommonWords_CombinationOflowerAndUpperCase(){
        ArrayList<String> arrayList1 = stringIntersection.getArrayList("I am aswathy i stay in bangalore");
        ArrayList<String> arrayList2 = stringIntersection.getArrayList("I am amar I Stay in Bangalore");

        ArrayList<String> actualResult = stringIntersection.getCommonWord(arrayList1, arrayList2);

        ArrayList<String> expectedResult = stringIntersection.getArrayList("I am stay in bangalore");

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test(description = "Input where common words are duplicate and with upper and lowercase combination")
    public void oneInputIsEmpty(){
        ArrayList<String> arrayList1 = stringIntersection.getArrayList("");
        ArrayList<String> arrayList2 = stringIntersection.getArrayList("I am amar I Stay in Bangalore");

        ArrayList<String> actualResult = stringIntersection.getCommonWord(arrayList1, arrayList2);

        Assert.assertEquals(actualResult.size(),0);
    }
}
