package linkedListArray;

import java.util.LinkedList;

//class Person{
//    String name;
//    Person neighbor;
//
//}

public class LinkedListArrayOfString {

    private class Container{
        String value;
        Container next;
    }

    private Container start, end;
    private int size = 0;

    public void add(String value){
        addToEnd(value);
    }

    private void addToEnd(String value) { //Complexity is O(1)
        Container node = new Container();
        node.value = value;

        //what if there is no node?
        if (size == 0) {
            start = node;
            end = node;
            size++;
        } else {
            end.next = node;
            end = node;
            size++;
        }
    }

    private void addToFront(String value){
        Container node = new Container();
        node.value = value;

        if (size == 0) {
            start = node;
            end = node;
            size++;
        } else {
            node.next = start;
            start = node;
            size++;
        }
    }

    public String[] toArray(){ //it can be used for unit testing
        String[] resultArray = new String[size];
        Container currentContainer = start;
        int position = 0;


        while(currentContainer != null){
            resultArray[position++] = currentContainer.value;
            currentContainer = currentContainer.next;
        }

        return resultArray;
    }

    public int getSize(){
        return size;
    }

    public String get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        // if we are at the end of the linkedlist
        if(index == size -1){
            return end.value;
        }
        if (index == 0){
            return start.value;
        }
        int counter = 0;
        Container currentContainer = start;
        while (currentContainer != null){
            if (counter == index){
                return currentContainer.value;
            }
            counter ++;
            currentContainer = currentContainer.next;
        }
        throw new RuntimeException("Internal Error");
    }

    public void insertValueAtIndex(int index, String value){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if (size == 0 || index == size){//either at the beginning or at the end
            addToEnd(value);
            return;
        }
        if (index == 0){
            addToFront(value);
            return;
        }
        //common case
        //find the container just before the position which we are going to insert
        Container before = start;
        for(int i=0; i< index -1 ; i++){
            before = before.next;
        }
        Container newNode= new Container();
        newNode.value = value;

        //important to be the same step
        newNode.next = before.next;
        before.next = newNode;
        size++;
    }

    public void deleteByIndex(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            start = start.next;
            size--;
            return;
        }

        Container before= start;
        for(int i=0; i< index - 1 ; i++){
            before = before.next;
        }

        if (index == size -1){ //it means I am at the end
            end = before;
        }
        before.next = before.next.next; // remove the pointer and point to the next of next
        size--;
    }

    public boolean deleteByValue(String value){
        int position = 0;
        Container curr = start;
        while (curr != null){
            if (curr.value.equals(value)){
                deleteByIndex(position);
                return true;
            }
            position ++;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public String toString() {
        Container curr = start;
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (curr !=null){
            builder.append(curr == start ? "" : ",");
            builder.append(curr.value);
            curr = curr.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
