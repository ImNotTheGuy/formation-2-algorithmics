import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class Exercice1_functionTest {

    Exercice1_function exercice;

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4,5,6}) // 7 numbers
    void testKidAgeTooYoung(int number) {
        assertEquals("Trop petit", new Exercice1_function().kidName(number), "Kid should be considered too young");
    }

    @ParameterizedTest
    @ValueSource(ints = {18,19,20,21,Integer.MAX_VALUE}) // 5 numbers
    void testKidAgeTooOld(int number) {
        assertEquals("Trop grand", new Exercice1_function().kidName(number), "Kid should be considered too old");
    }

    @ParameterizedTest
    @ValueSource(ints = {7,8,9}) // 5 numbers
    void testKidAgePoussin(int number) {
        assertEquals("Poussin", new Exercice1_function().kidName(number), "Kid between age of 7 and 9 should be Poussin");
    }

    @ParameterizedTest
    @ValueSource(ints = {10,11}) // 5 numbers
    void testKidAgePupille(int number) {
        assertEquals("Pupille", new Exercice1_function().kidName(number), "Kid between age of 7 and 9 should be Poussin");
    }

    @ParameterizedTest
    @ValueSource(ints = {12,13}) // 5 numbers
    void testKidAgeBenjamin(int number) {
        assertEquals("Benjamin", new Exercice1_function().kidName(number), "Kid between age of 7 and 9 should be Poussin");
    }

    @ParameterizedTest
    @ValueSource(ints = {14,15}) // 5 numbers
    void testKidAgeMinime(int number) {
        assertEquals("Minime", new Exercice1_function().kidName(number), "Kid between age of 7 and 9 should be Poussin");
    }

    @ParameterizedTest
    @ValueSource(ints = {16,17}) // 5 numbers
    void testKidAgeCadet(int number) {
        assertEquals("Cadet", new Exercice1_function().kidName(number), "Kid between age of 7 and 9 should be Poussin");
    }

}