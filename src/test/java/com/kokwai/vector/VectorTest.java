package com.kokwai.vector;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class VectorTest {

    @Test
    void itShouldGetInitialCapacityWhenVectorIsCreated() {
        Vector underTest = new Vector();
        int expectedCapacity = 2;

        int capacity = underTest.getCapacity();

        assertThat(capacity).isEqualTo(expectedCapacity);
    }

    @Test
    void itShouldGetInitialSizeWhenVectorIsCreated(){
        Vector underTest = new Vector();
        int expectedSize = 0;

        int size = underTest.getSize();

        assertThat(size).isEqualTo(expectedSize);
    }

    @Test
    void itShouldAddElementIntoArray(){
        Vector underTest = new Vector();

        underTest.addElement(10);
        underTest.addElement(20);
        int expected = 2;
        int arraySizeResult = underTest.getSize();

        assertEquals(expected, arraySizeResult);
    }

    @Test
    void itShouldReturnElementAtASpecificIndex(){
        Vector underTest = new Vector();

        underTest.addElement(10);
        int expectedResult = 10;
        int elementAtIndexResult = underTest.at(0);

        assertThat(expectedResult).isIn(elementAtIndexResult);
    }

    @Test
    void itShouldExpandTheArrayTwice(){
        Vector underTest = new Vector();

        underTest.addElement(10);
        underTest.addElement(20);
        underTest.addElement(30);
        underTest.addElement(40);

        int expectedCapacity = 8;
        int arrayCapacity = underTest.getCapacity();

        assertEquals(expectedCapacity, arrayCapacity);
    }

    @Test
    void itShouldRemoveElementAtSpecificIndexAndCapacityCheck(){
        Vector underTest = new Vector();

        underTest.addElement(10);
        underTest.addElement(20);
        underTest.addElement(30);
        underTest.addElement(40);

        underTest.removeElement(1);
        int expectedResult = 30;
        int elementAtIndexResult = underTest.at(1);
        int expectedCapacity = 3;
        int arrayCapacity = underTest.getSize();
        assertThat(expectedResult).isIn(elementAtIndexResult);
        assertEquals(expectedCapacity, arrayCapacity);
    }
}