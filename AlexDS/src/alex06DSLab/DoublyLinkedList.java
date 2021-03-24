package alex06DSLab;

public class DoublyLinkedList {
    // Define properties
    private class Container{
        int value;
        Container pre;
        Container next;
    }
    private Container head, tail;
    private int size = 0;
    // Define Constructors (1)
    public DoublyLinkedList(){
        Container container = new Container();
        head = container;
        tail = container;
        container.next=null;
        container.pre=null;
        size = 0;
    }
    // Define Constructors (2)
    public DoublyLinkedList(int input){
        this();
        this.add(input);
    }
    // Define Constructors (3)
    public DoublyLinkedList(int[] input){
        this();
        for(var temp:input){
            this.add(temp);
        }
    }
    // Define Methods
    public void add(int input){
        if(size==0){
            head.value=input;
        }
        else{
            Container newAddContainer = new Container();
            Container temp = tail;
            tail.next = newAddContainer;
            tail = tail.next;
            tail.value = input;
            tail.pre= temp;
        }
        size++;
    }
    public void add(int[] input){
        for(var temp : input){
            this.add(temp);
        }
    }
    public int getSize(){
        return size;
    }
    public boolean insertByIndex(int index,int value){
        if(index<0||index>size){return false;}

        if(size==0||index==size){
            add(value);
        }else{
            int count = 0;
            Container after = head;
            for(int i=0;i<index;i++){
                after = after.next;
            }
            Container before = after.pre;
            Container newContainer = new Container();
            newContainer.value=value;
            newContainer.next=after;
            after.pre=newContainer;
            before.next=newContainer;
            newContainer.pre=before;
            size++;

        }
        return true;

    }

    public int getByIndex(int index){
        if(index<0||size==0||index>=size){
            throw new IndexOutOfBoundsException("Index Out of Bounds");
        }
        else{
            Container curr = head;
            int out=0;
            for(int i=0;i<=index;i++){
                if(i==index) {
                    out = curr.value;
                    break;
                }
                curr=curr.next;
            }
            return out;
        }
    }

    public void deleteByIndex(int index){
        if(index<0||size==0||index>=size){
            throw new IndexOutOfBoundsException("Index Out of Bounds");
        }
        else if(index==0){
            if(size>1) {
                Container after = head.next;
                head = after;
                head.pre=null;
            }
            size--;
        }
        else if(index==size-1){
            Container before = tail.pre;
            before.next = null;
            tail = before;
            size--;
        }
        else{
            Container curr = head;
            for(int i=0;i<index;i++){
                if(i==index)break;
                curr = curr.next;
            }
            Container before = curr.pre;
            Container after = curr.next;

            curr.pre=null;
            curr.next=null;
            before.next=after;
            after.pre=before;

        }
    }

    public int getByIndexReversed(int index){
        if(index<0||size==0||index>=size){
            throw new IndexOutOfBoundsException("Index Out of Bounds");
        }
        else{
            Container curr = tail;
            int out=0;
            for(int i=0;i<=index;i++){
                if(i==index) {
                    out = curr.value;
                    break;
                }
                curr=curr.pre;
            }
            return out;
        }
    }


    @Override
    public String toString(){
        if (head == null||size==0) {return "The Doubly Linked List is empty!";}
        Container curr = head;
        String out = (head==tail)? ("[" + curr.value +"]"):("[" + curr.value + ",");
        while(curr !=tail) {
            curr = curr.next;
            out += (curr==tail)?(curr.value+"]"): (curr.value + ",");
        }
        return out;
    }


}
