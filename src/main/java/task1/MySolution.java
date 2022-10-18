package task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class MySolution {
    static ArrayList<MyAssociate> associatesForGivenTechnology(ArrayList<MyAssociate> myAssociates, String searchTechnology) {

        ArrayList<MyAssociate> technologyAssociates = new ArrayList<>();
        for(MyAssociate item : myAssociates){
            if(item.getTechnology().equalsIgnoreCase(searchTechnology)){
                technologyAssociates.add(item);
            }
        }
        return technologyAssociates;
    }

    public static void main(String[] args) {

        MyAssociate myAssociate1 = new MyAssociate(101, "Alex", "Java",15);
        MyAssociate myAssociate2 = new MyAssociate(102, "Albert", "Unix",20);
        MyAssociate myAssociate3 = new MyAssociate(103, "Alfred", "Testing",13);
        MyAssociate myAssociate4 = new MyAssociate(104, "Alfa", "Java",15);
        MyAssociate myAssociate5 = new MyAssociate(105, "Almas", "Java",29);

        ArrayList<MyAssociate> myAssociates = new ArrayList<>();
        myAssociates.add(myAssociate1);
        myAssociates.add(myAssociate2);
        myAssociates.add(myAssociate3);
        myAssociates.add(myAssociate4);
        myAssociates.add(myAssociate5);

        ArrayList<MyAssociate> techBros = associatesForGivenTechnology(myAssociates, "java");
        for (MyAssociate bro : techBros) {
        System.out.println(bro.getId() + " is " + bro.getName());
        }

    }
}
