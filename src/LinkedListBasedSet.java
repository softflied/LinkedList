import org.w3c.dom.Node;

import javax.imageio.metadata.IIOMetadataNode;
import java.awt.*;
import java.util.WeakHashMap;

public class LinkedListBasedSet implements IntSet {
    private IntNode head = null; // firs of all head must be null


    @Override
    public int getSize() {
        int cnt = 0;
        IntNode walk = head;
        while (walk != null) {
            cnt++;
            walk = walk.getNext();
        }
        return cnt;
    }

    @Override
    public boolean isEmpty() {
        if (head == null)
            return true;
        return false;
    }

    @Override
    public boolean add(int newEntry) {
        boolean status = false;
        if (true) {
            IntNode newNode = new IntNode(newEntry);
            newNode.setNext(head);
            head = newNode;
            status = true;
        }
        return true;
    }

    public void reserve()
    {
        IntNode walk = head;
        IntNode temp = head;

        while (walk!=null)
        {
            walk.getNext().setNext(walk);
            walk = walk.getNext();
        }
        temp.setNext(null);
        head = walk;
    }

    public boolean isEven(LinkedListBasedSet ll)
    {
        IntNode walk1 = head;


        while (walk1.getNext()!=null)
        {
            if(walk1.getNext()==null)
            {
                return false;
            }
            if(walk1.getNext().getNext()==null)
            {
                return true;
            }

            walk1=walk1.getNext().getNext();



        }


        return false;
    }

    public void skipMdeleteN(LinkedListBasedSet ll,int M,int N)
    {
        IntNode walk = ll.head;

        int cnt =0;
        int cnt2=0;
        while (walk!=null)
        {
            cnt++;
            if(cnt%M==0)
            {
                IntNode walk2 = walk;
                while (cnt2<N-1)
                {
                    walk2 = walk2.getNext();
                    cnt2++;


                }
                if(walk2.getNext()!=null && walk2!=null)
                {
                    walk.setNext(walk2.getNext().getNext());

                }



            }
            walk = walk.getNext();
        }






    }


    @Override
    public void rearenge()
    {
        IntNode walk1 = head;
        IntNode walk2 = head.getNext();
        IntNode prev = head;

        if(!isEmpty())
        {
            while (walk1.getNext()!=null)
            {
                walk1= walk1.getNext();
            }

            while (walk2!=null)
            {
                if(prev.getData()==0)
                {
                    prev.setNext(walk2.getNext());
                    walk1.setNext(walk2);
                    walk2.setNext(null);
                    walk1=walk1.getNext();
                    walk2=prev.getNext();

                }

                walk2= walk2.getNext();
                prev = prev.getNext();
            }




        }

    }



    @Override
    public boolean addFirst(int newEntry) {
        boolean status = false;
        if (contains(newEntry) == false) // ekleyeceğimiz değeri konrol etme
        {
            IntNode newNode = new IntNode(newEntry); // yeni node oluşturma
            if (head == null) // listede öğe yoksa
            {
                newNode.setNext(null); //yeni node'un nextini null yapma
                head = newNode; // yeni nodeu head yapma
                status = true;
            } else { // listede en az bir öğe varsa
                newNode.setNext(head); // yeni nodeun nextini head yapma çünkü başa ekleme methodu bu
                head = newNode; // yeni nodu head yapma
                status = true;
            }

        }
        return status;
    }

    @Override
    public boolean addLast(int newEntry) {
        boolean status = false;

        if (true) {
            IntNode newNode = new IntNode(newEntry);
            if (head == null) {
                newNode.setNext(null);
                head = newNode;
                status = true;
            } else {

                IntNode walk = head;
                while (walk.getNext() != null) {
                    walk = walk.getNext();
                }

                walk.setNext(newNode);
                newNode.setNext(null);
                status = true;

            }
        }

        return status;
    }


    @Override
    public IntNode findMid() {

        IntNode walk = head;
        IntNode mid = head;
        int counter = 0;

        while (walk.getNext()!=null)
        {
            counter++;
            if(counter%2==0)
            {
                mid = mid.getNext();
            }
            walk = walk.getNext();
        }

        if(counter%2==1)
        {
           mid = mid.getNext();
        }

        return mid;
    }

    @Override
    public void findLoop() {


        IntNode walk = head;
        IntNode temp = head;

        while (walk!= null)
        {

        }


    }

    public LinkedListBasedSet sum(LinkedListBasedSet set1,LinkedListBasedSet set2)
    {
        LinkedListBasedSet set3 = new LinkedListBasedSet();
       IntNode walk1 = set1.head;
       IntNode walk2 = set2.head;

       int carry =0;
       int DigitSum =0;
        int temp =set2.head.getData();
       while (walk1!=null)
       {

           DigitSum = (walk1.getData() + temp);
           if(DigitSum>=10)
           {

               set3.add((DigitSum%10)+carry);
               carry =1;
           }
           else
           {

               set3.add(DigitSum+carry);
               carry =0;

           }
           if(walk2.getNext()!=null)
           {

               walk2 = walk2.getNext();
                temp =walk2.getData();
           }
           else
               temp =0;

           walk1 = walk1.getNext();



       }
        return set3;
    }

    @Override
    public boolean addWithIndex(int Index, int NewEntry) {
        boolean status = false;
        if (contains(NewEntry) == false) {
            IntNode newNode = new IntNode(NewEntry);


            if (head == null) {
                head = newNode;
                newNode.setNext(null);

                status = true;
            } else if (Index == 0) {

                newNode.setNext(head);
                head = newNode;

                status = true;
            } else {
                int counter = -1;
                IntNode walk = head;
                while (walk != null) {

                    counter++;
                    if (counter == Index - 1) {
                        break;
                    }
                    walk = walk.getNext();
                }

                IntNode previous = walk;

                newNode.setNext(previous.getNext());
                previous.setNext(newNode);

                status = true;
            }

        }
        return status;
    }

    @Override
    public int getdata(int Index) {
        int data = 0;
        int counter = -1;
        IntNode walk = head;
        IntNode temp = head;

        while (walk != null) {
            counter++;
            if (counter == Index) {
                temp.setData(walk.getData());

                break;
            }
            walk = walk.getNext();

        }
        return temp.getData();
    }

    @Override
    public int getIndex(int anEntry) {
        int cnt = 0;

       if(contains(anEntry))
       {
           IntNode walk = head;

           while (walk!=null)
           {
               if(walk.getData()==anEntry)
               {
                   break;
               }
               walk =walk.getNext();
               cnt++;
           }
       }

       return cnt;
    }
    @Override
    public boolean deleteAll(int Value) {
        IntNode walk = head;
        IntNode prev = head;
        if(contains(Value))
        {
            while (walk!=null)
            {
                if(head.getData()==Value)
                {
                    head = head.getNext();
                }

                else if(walk.getNext().getNext()==null)
                {
                    if(walk.getNext().getData()==Value)
                    {
                        walk.setNext(null);
                        break;
                    }
                }
                else if(walk.getNext().getData()==Value)
                {
                    walk.setNext(walk.getNext().getNext());

                    walk = walk.getNext();
                }

                else {
                    walk = walk.getNext();
                }

            }
            return true;
        }
        return false;

    }
    public boolean deleteFirst(int Value)
    {

        IntNode walk = head;
        if(contains(Value))
        {
            while (walk!=null)
            {
                if(head.getData()==Value)
                {
                    head = head.getNext();
                    return true;
                }
                else if (walk.getNext().getData()==Value)
                {
                    walk.setNext(walk.getNext().getNext());
                    return true;
                }
                else if(walk.getNext().getNext()==null)
                {
                    walk.setNext(null);
                    return true;
                }
                else {
                    walk = walk.getNext();
                }


            }
            return false;
        }

        return true;
    }

    public boolean deleteLast(int Value){
        IntNode walk = head;
        IntNode prev = head;
        if(contains(Value))
        {
            while (walk!=null)
            {
                if(head.getData() == Value)
                {
                    prev = head;

                }
                else if(walk.getData()==Value)
                {
                    prev =prev.getNext();
                    walk =walk.getNext();
                }
                else if(walk.getNext().getNext()==null)
                {
                    walk.setNext(null);
                    return true;
                }
                else
                {
                    walk = walk.getNext();
                    if(walk.getNext()==null)
                    {
                        break;
                    }
                }

            }
            if(prev==head)
            {
                head =head.getNext();
            }
            else
            prev.setNext(prev.getNext().getNext());

        }

        return false;
    }

    public  void findTheDuplicates()
    {
        IntNode walk = head;

        while (walk!=null)
        {
            
        }


    }

    @Override
    public LinkedListBasedSet dupPositives(LinkedListBasedSet p) {

        IntNode walk = p.head;

        if(p.head==null)
        {
            System.out.println("sistem boşş");
        }
        else
        {
            while (walk!=null)
            {
                if(walk.getData()>=0)
                {
                    IntNode newNode = new IntNode(walk.getData());

                    newNode.setNext((walk.getNext()));
                    walk.setNext(newNode);

                    walk = walk.getNext().getNext();
                }
                else
                    walk = walk.getNext();
            }

        }



        return p;
    }

    @Override
    public boolean remove(int anEntry) {
        boolean status =false;
        if(contains(anEntry))
        {
            if(head.getData()!=anEntry)
            {
                IntNode walk = head;
                int cnt =0;

                while (walk!=null)
                {

                    if(getIndex(anEntry)-1 ==cnt)
                    {
                        break;
                    }
                    walk = walk.getNext();
                    cnt++;

                }
                IntNode previous = walk;
                previous.setNext(previous.getNext().getNext());
            }
            else
            {
                head = head.getNext();
            }
        }
        return status;
    }

    public void eyup(LinkedListBasedSet list)
    {
        IntNode Swalk = list.head;
        IntNode Fwalk = list.head;
        int counter =1;


        while (Fwalk!=null)
        {
            if(counter%2==0)
            {
                Swalk = Swalk.getNext();
            }

            Fwalk = Fwalk.getNext();
            counter++;
        }
        System.out.println(Swalk.getData());

    }


    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean contains(int anEntry) {
        IntNode walk = head;
        while (walk != null) {
            if (walk.getData() == anEntry)
                return true;
            walk = walk.getNext();
        }
        return false;
    }

    @Override
    public int[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IntSet union(IntSet arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IntSet intersection(IntSet arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IntSet difference(IntSet arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        String res = "{";
        IntNode walk = head;
        while (walk != null) {
            res += walk.getData() + ",";
            walk = walk.getNext();
        }
        res += "}";
        return res;
    }

}
