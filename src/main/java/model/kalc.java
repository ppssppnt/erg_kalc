package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class kalc
{

    protected List NameSet = new ArrayList();
    protected List CountSet = new ArrayList();
    protected List PowerSet = new ArrayList();
    public String getit(int n) {
        int i = 0;
        Iterator iterator1 = NameSet.iterator();
        Iterator iterator2 = CountSet.iterator();
        Iterator iterator3= PowerSet.iterator();
        while(iterator1.hasNext() & iterator2.hasNext() & iterator3.hasNext()){

            String element =(String) iterator1.next()+" Число "+ iterator2.next() +" Потребление "+ iterator3.next();
            if(i==n)return element;
            i++;
        }
        return "NONE";
    }
    public void Add(String  a,String b, String c){
        NameSet.add(a);

        CountSet.add(b);
        PowerSet.add(c);
    }

    public double AllPower(){

        double power = 0.0;
        Iterator iterator1 = NameSet.iterator();
        Iterator iterator2 = CountSet.iterator();
        Iterator iterator3 = PowerSet.iterator();
        while(iterator1.hasNext() && iterator2.hasNext() && iterator3.hasNext()){
            power+= Double.parseDouble(iterator2.next().toString() )* Double.parseDouble(iterator3.next().toString() );

        }
        return power;
    }

}

