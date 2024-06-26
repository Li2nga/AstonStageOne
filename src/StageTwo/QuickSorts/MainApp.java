package StageTwo.QuickSorts;

import java.util.Arrays;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/aY0yYfztKMY
     */
    public static void main(String[] args) {

        Integer[] integers = { 10, 55, -5, 34, 7, 22, 19 };
        String [] strings = { "Void Elf", "Vulpera", "Human", "Troll", "Undead" };
        System.out.println(Arrays.toString(integers) + " | " + Arrays.toString(strings));
        new QuickSort<>(integers).sort(); new QuickSort<>(strings).sort();
        System.out.println(Arrays.toString(integers) + " | " + Arrays.toString(strings));

    }

}
