package alex06DSLab;

public class CustomLinkedList<T> {
    private class Container{
        T value;
        Container next;
    }
    private Container head, tail;
    private int size = 0;
    public CustomLinkedList(){
        Container container = new Container();
        head = container;
        tail = container;
        container.next=null;
        size = 0;
    }

    public int getSize(){
        return size;
    }
    public void add(T input){
        if(size==0) {
            head.value = input;
        }
        else{
            Container newAddContainer = new Container();
            newAddContainer.value=input;
            newAddContainer.next = null;
            tail.next = newAddContainer;
            tail = newAddContainer;
        }
        size++;
    }

    @Override
    public String toString(){
        Container curr = head;
        String out = "[";

        for(int i=0;i<size;i++) {
            out+= i==size-1?curr.value.toString():curr.value.toString()+",";
            curr = curr.next;
        }
        out +="]";
        return out;

    }



}
