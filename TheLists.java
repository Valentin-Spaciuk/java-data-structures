package org.spck;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow",
                "orange",
                "black"
        );
        // colorsUnmodifiable.add("pink"); make an error

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        /** I can't add these types
        colors.add(1);
        colors.add(new Object());
        **/

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        //recomendend only if needed access to the index
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
