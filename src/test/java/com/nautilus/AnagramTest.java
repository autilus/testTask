package com.nautilus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    private Anagram anagram;

    @Before
    public void initTest() {
        anagram = new Anagram();
    }

    @After
    public void afterTest() {
        anagram = null;
    }

    @Test
    public void isAnagramDifferentLength() {
        assertFalse(anagram.isAnagram("матери", "метрика"));
        assertFalse(anagram.isAnagram("апесин", "спаниель"));
    }

    @Test
    public void isAnagram() {
        assertTrue(anagram.isAnagram("материк", "метрика"));
        assertFalse(anagram.isAnagram("", "спаниель"));
    }

    @Test
    public void isAnagramCaseSensitive() {
        assertTrue(anagram.isAnagram("МАтериК", "метРика"));
        assertTrue(anagram.isAnagram("апеЛьсин", "сПаниель"));
    }

    @Test
    public void NonAnagramCaseSensitive() {
        assertFalse(anagram.isAnagram("роМашка", "тОрНадО"));
        assertFalse(anagram.isAnagram("МАтериК", "тОрНадО"));
    }
}