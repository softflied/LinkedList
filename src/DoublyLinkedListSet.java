public class DoublyLinkedListSet {

    DoublyNode head=null;
    DoublyNode tail=null;

    public void  add(int data)
    {
        DoublyNode newNode = new DoublyNode(data);

        if(head!=null)
        {

            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;

        }
        else
        {
            head = newNode;
            tail = newNode;
        }

    }

    public void addLast(int data)
    {
        DoublyNode newNode = new DoublyNode(data);
        if(head!=null)
        {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        else
        {
            tail = newNode;
            head = newNode;
        }


    }

    boolean isPalindrome()
    {
        DoublyNode walk = head;
        DoublyNode walk2 = tail;

        while (walk!= null)
        {
            if(walk.getData()== walk2.getData())
            {
                walk = walk.getNext();
                walk2 = walk2.getPrev();

            }
            else
                return false;


        }


        return true;

    }



    public void getData()
    {
        DoublyNode walk = head;
        while (walk!=null)
        {
            System.out.println(walk.getData());
            walk = walk.getNext();
        }
    }


}
