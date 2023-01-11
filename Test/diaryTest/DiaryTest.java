package diaryTest;

import Dairy.Diary;
import Dairy.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary myDiary;
    @BeforeEach
    public void setUP(){
        myDiary = new Diary("Nen", "correctPassword");
    }

    @Test
    public void diaryExistTest(){
        assertNotNull(myDiary);
    }

    @Test
    public void newDiaryIsLocked(){
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void lockedDiaryCanBeUnlocked(){
        assertTrue(myDiary.isLocked());
        myDiary.unlock("correctPassword");
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void wrongPasswordCannotUnlockDiaryTest(){
        assertTrue(myDiary.isLocked());
        myDiary.unlock("wrongPassword");
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void diaryCanBeLockedTest(){
        myDiary.unlock("correctPassword");
        assertFalse(myDiary.isLocked());
        myDiary.lock();
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void happeningsCanBeAddedToTheDiaryTest(){
        myDiary.unlock("correctPassword");
        assertFalse(myDiary.isLocked());
        myDiary.write("I had a lovely day","I was at the semicolon village." );
        assertEquals(1, myDiary.numberOfEntries());
    }

    @Test
    void entriesCannotBeAddedWhenDiaryIsLocked() {
        try {
            myDiary.write("I had a lovely day", "I was at the semicolon village.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertEquals(0, myDiary.numberOfEntries());
    }

    @Test
    void entriesCanBeFoundById() {
        myDiary.unlock("correctPassword");
        assertFalse(myDiary.isLocked());
        myDiary.write("I had a lovely day","I was at the semicolon village." );
        assertEquals(1, myDiary.numberOfEntries());
        Entry foundEntry = myDiary.findEntryById(1);
//        Entry foundEntry = myDiary.findEntryByBody("I was at the semicolon village.");
        assertEquals(1, foundEntry.getId());
        assertEquals("I had a lovely day", foundEntry.getTitle());
        assertEquals("I was at the semicolon village.", foundEntry.getBody());
    }

    @Test
    void writingToLockedDiaryThrowsException() {
        assertTrue(myDiary.isLocked());
        assertThrows(Exception.class, ()-> myDiary.write("I had a lovely day","I was at the semicolon village."));
    }

}
