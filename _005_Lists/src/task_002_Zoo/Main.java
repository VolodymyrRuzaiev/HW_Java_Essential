package task_002_Zoo;

public class Main {
    public static void main(String[] args) {
        //1
        Zoo zoo_1 = new Zoo();
        //2
        Zoo zoo_2 = zoo_1;
        //3
        Zoo zoo_3 = GetNewZoo();



        // adding the elements to list
        zoo_1.arrayList.add("Lion");
        zoo_1.arrayList.add("Zebra");
        zoo_1.arrayList.add("Giraffe");
        zoo_1.arrayList.add("Hippo");

        zoo_1.arrayList.add(4, "Sloth");
        zoo_1.arrayList.add(5, "Mammoth");
        zoo_1.arrayList.add(6, "Tiger");
        zoo_1.arrayList.add(7, "Squirrel");

        System.out.println(zoo_1.arrayList);

    }

    public static Zoo GetNewZoo(){
        return new Zoo();

    }
}
