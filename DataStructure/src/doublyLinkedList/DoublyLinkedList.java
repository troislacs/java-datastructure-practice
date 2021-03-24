package doublyLinkedList;

public class DoublyLinkedList {

    private class Container {

        Container previous;
        Container next;
        int value;
    }

    private Container start, end;
    private int size = 0;

    public void add(int value) {
        Container newCont = new Container();
        newCont.value = value;
        if (size == 0) { //special case : if list is empty
            start = end = newCont;
            start.previous = null;
            end.next = null;
            size++;
        } else {
            end.next = newCont;
            newCont.previous = end;
            end = newCont;
            size++;
        }
    }

    public int[] toArray() { // could be used for Unit testing
        int[] result = new int[size];
        Container current = start;
        int position = 0;
        while (current != null) {
            result[position++] = current.value;
            current = current.next; //move to the next one
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Container current = null;
        if (index < size / 2) {
            current = start;
            for (int j = 0; j < index; j++) {
                current = current.next;
            }
        } else {
            current = end;
            for (int j = size - 1 ; j > index; j--) {
                current = current.previous;
            }
        }
        return current.value;

    }

    public void insertValueAtIndex(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == 0 || index == size) {
            //add/insert at the start of an emty list
            //or add at the end
            add(value);
            return;
        }
        if (index == 0) { // insert at the begining of a non-emty list
            Container newCont = new Container();
            newCont.value = value;
            newCont.next = start;
            start.previous = newCont;
            newCont.previous = null;
            start = newCont;
            size++;
            return;
        }
        //Common case
        // find the container just before the position at which we want to insert
        Container before = start;
        for (int i = 0; i < index - 1; i++) {
            before = before.next;
        }
        Container newCont = new Container();
        newCont.value = value;
        newCont.next = before.next;
        newCont.previous = before;
        before.next.previous= newCont;
        before.next = newCont;
        size++;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) { // remove the first item
            start = start.next;
            size--;
            return;
        }
        // find the container just before the one we want to delete
        Container before = start;
        for (int i = 0; i < index - 1; i++) {
            before = before.next;
        }
        //when removing the last item adjust and refernce
        // if(before.next.next = null
        if (index == size - 1) {
            end = before;
            end.next = null;
        }
        else{
            before.next.next.previous = before;
            before.next = before.next.next;
        }

        size--;
    }

    public boolean deleteByValue(int value) {
        int position = 0;
        Container curr = start;
        while (curr != null) {
            if (curr.value == value) {
                deleteByIndex(position);
                return true;
            }
            curr = curr.next;
            position++;
        }

        return false;
    }

    @Override
    public String toString() {
        Container curr = start;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        //loop over all items in the linked list
        while (curr != null) {
            sb.append(curr == start ? "" : ",");
            sb.append(curr.value);
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    } // comma-separated values list similar to: [5,8,11]

}