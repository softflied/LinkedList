public class SetApplication {

    public static void main(String[] args) {
        LinkedListBasedSet set1=new LinkedListBasedSet();
        LinkedListBasedSet set3=new LinkedListBasedSet();
        DoublyLinkedListSet set2 = new DoublyLinkedListSet();
        set1.add(1);
        set1.add(0);
        set1.add(0);
        set1.add(1);
        set1.add(0);
        set1.add(1);
        set1.add(1);
        set1.add(0);

        set1.rearenge();
        System.out.println(set1);







        set3.add(1);
        set3.add(2);
        set3.add(3);






        set1.dupPositives(set1).getdata(0);


        //set1.dupPositives(set1).toString();

        set3.add(3);
        set3.add(2);
        set3.add(5);
        set3.add(4);
        set3.add(1);

       // set1.sum(set1,set3);
     /*   for(int i =0;i<set1.sum(set1,set3).getSize();i++)
        {

           // System.out.print(set1.sum(set1,set3).getdata(i));
        }*/










       /* set1.reserve();
        System.out.println(set1);*/



        set2.addLast(1);
        set2.addLast(2);
        set2.addLast(3);
        set2.addLast(4);
        set2.addLast(4);
        set2.addLast(3);
        set2.addLast(2);
        set2.addLast(1);


      //  System.out.println(set2.isPalindrome());










        /*set1.add(33);
        set1.add(23);
        set1.add(14);
        set1.add(1);
        set1.add(2);
        set1.add(23);
        set1.add(18);
        set1.add(33);
        set1.add(33);
        set1.add(33);*/



       /* set1.addFirst(315);
        set1.addLast(221);*/



       /* System.out.println(set1);
        int size  = set1.getSize();
        System.out.println("Size: "+size);

        System.out.println("\n");

        set1.remove(18);
        System.out.println(set1);
        int size2  = set1.getSize();
        System.out.println("Size: "+size2);


        System.out.println("\n");

        set1.addWithIndex(3,6);
        System.out.println(set1);
        int size3  = set1.getSize();
        System.out.println("Size: "+size3);


        System.out.println("\n");





        if(set1.contains(44))
            System.out.println("Set1 contains 44");
        else
            System.out.println("Set1 doesn't contain 44");

        System.out.println(set1.getData(5));
        System.out.println(set1.getIndex(1));
      /*  set1.remove(23);
        System.out.println(set1);
        int []items=set1.toArray();
        for(int a:items)
            System.out.println(a);*/

        /*IntSet set2=new ArrayBasedSet();
        set1.add(221);
        set1.add(23);
        set1.add(104);
        set1.add(1);
        IntSet set3=set2.union(set1);
        System.out.println(set2);
        IntSet set4=set2.intersection(set1);
        System.out.println(set3);
        IntSet set5=set2.difference(set1);
        System.out.println(set4);*/

    }
}
