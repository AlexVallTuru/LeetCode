import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class sortThePeople {
    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public String[] sortPeople(String[] names, int[] heights) {

        int len = names.length;
        List<Person> personas = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            personas.add(new Person(names[i], heights[i]));
        }

        personas.sort((persona1, persona2) -> Integer.compare(persona2.getHeights(), persona1.getHeights()));
        String[] sortedNames = new String[len];
        for (int i = 0; i < len; i++) {
        
            sortedNames[i] = personas.get(i).getName();
        
        }

        return sortedNames;
    }
}

class Person {

    String name;
    int heights;
    
    public Person(String name, int heights) {
        this.name = name;
        this.heights = heights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeights() {
        return heights;
    }

    public void setHeights(int heights) {
        this.heights = heights;
    }
}