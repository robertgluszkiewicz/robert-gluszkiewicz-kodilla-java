package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {

        //Given
        Library library = new Library("Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n-> library.getBooks()
                        .add(new Book("Title-" + n, "Author-" + n, LocalDate.now().minusDays(n * 5_000))));

        //making a shallow copy of object library
        Library clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Shallow clone of library");

        //making a deep copy of object library
        Library deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Deep clone of library");

        //When
        library.getBooks().add(new Book("Title-0", "Author-0", LocalDate.now().minusDays(50_000)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
