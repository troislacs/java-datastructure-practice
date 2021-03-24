package linkedListArray;

import org.junit.Assert;
import org.junit.Test;
import recursion.App;

public class TestLinkedList {

    @Test(expected=IndexOutOfBoundsException.class)
    public void test_negative_InsertValueAtIndex(){
        LinkedListArray list = new LinkedListArray();
        list.insertValueAtIndex(12, 12);
    }

    public void test_positiveInsertValueAtIndex(){

    }
}
