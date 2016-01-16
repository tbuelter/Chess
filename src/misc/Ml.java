package misc;

import java.util.*;
import javax.swing.JOptionPane;

public class Ml {

    // PRINT
    public static void print(String s) {
        System.out.print(s);
    }

    public static void print(Boolean b) {
        System.out.print(b);
    }

    public static void print(char c) {
        System.out.print(c);
    }

    public static void print(int i) {
        System.out.print(i);
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void print(float f) {
        System.out.print(f);
    }

    public static void print(double d) {
        System.out.println(d);
    }

    // PRINTLN
    public static void println(String s) {
        System.out.println(s);
    }

    public static void println(Boolean b) {
        System.out.println(b);
    }

    public static void println(char c) {
        System.out.println(c);
    }

    public static void println(int i) {
        System.out.println(i);
    }

    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void println(float f) {
        System.out.println(f);
    }

    public static void println(double d) {
        System.out.println(d);
    }

    // INPUT
    public static int getInt() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                int i = input.nextInt();
                return i;
            } catch (Exception e) {
                Ml.println("Bitte eine Ganzzahl eingeben(" + e + ").");
            }
        }
    }

    public static double getDouble() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                double i = input.nextDouble();
                return i;
            } catch (Exception e) {
                Ml.println("Bitte eine Zahl eingeben(" + e + ").");
            }
        }
    }

    public static float getFloat() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                float i = input.nextFloat();
                return i;
            } catch (Exception e) {
                Ml.println("Bitte eine Zahl eingeben(" + e + ").");
            }
        }
    }

    public static String getString() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                String i = input.nextLine();
                return i;
            } catch (Exception e) {
                Ml.println("Bitte einen String eingeben(" + e + ").");
            }
        }
    }
    public static char getChar() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                char i = input.nextLine().charAt(0);
                return i;
            } catch (Exception e) {
                Ml.println("Bitte einen Char eingeben(" + e + ").");
            }
        }
    }

    public static double cut(double value, int places) {

        if (places < 0) {
            throw new IllegalArgumentException();
        }

        double p = Math.pow(10, places);

        if (value < 0) {

            return Math.ceil(value * p) / p;

        }

        if (value > 0) {

            return Math.floor(value * p) / p;

        }

        return 0;
    }

    public static double round(double value, int places) {

        if (places < 0) {
            throw new IllegalArgumentException();
        }

        double p = Math.pow(10, places);

        return (Math.round(value * p) / p);
    }

    public static void WarningMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title,
                JOptionPane.WARNING_MESSAGE, null);
    }

    public static void InfoMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title,
                JOptionPane.INFORMATION_MESSAGE, null);
    }

    public static void Message(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title,
                JOptionPane.PLAIN_MESSAGE);

    }

    public static String InputMessage(String message, String title) {
        String Eingabe = JOptionPane.showInputDialog(title, message);
        return Eingabe;
    }

    // ARRAY UMKEHREN (Kehrt ein Array um)
    public static void Umkehren(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }

    public static void Umkehren(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void Umkehren(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void Umkehren(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

    }

    // ARRAY SUMMEN(Summiert ein Array)
    public static int ArraySumme(int[] array) {
        int Summe = 0;
        for (int i = 0; i < array.length; i++)
            Summe += array[i];
        return Summe;
    }

    public static double ArraySumme(double[] array) {
        double Summe = 0;
        for (int i = 0; i < array.length; i++)
            Summe += array[i];
        return Summe;
    }

    public static int ArraySumme(int[][] array) {
        int Summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                Summe += array[i][j];
        }
        return Summe;
    }

    public static double ArraySumme(double[][] array) {
        double Summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                Summe += array[i][j];
        }
        return Summe;
    }

    // ARRAYDURCHSCNITT (Gibt den Durchschnitt eines Arrays wieder[Matrizen sind
    // buggy])
    public static int ArrayDurchschnitt(int[] array) {
        int Summe = 0;
        for (int i = 0; i < array.length; i++)
            Summe += array[i];
        Summe /= array.length;
        return Summe;

    }

    public static int ArrayDurchschnitt(int[][] array) {
        int Summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                Summe += array[i][j];
        }
        Summe /= array.length;
        return Summe;

    }

    public static double ArrayDurchschnitt(double[] array) {
        double Summe = 0;
        for (int i = 0; i < array.length; i++)
            Summe += array[i];
        Summe /= array.length;
        return Summe;

    }

    public static double ArrayDurchschnitt(double[][] array) {
        double Summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                Summe += array[i][j];
        }
        Summe /= array.length;
        return Summe;

    }

    // MEDIANWERTE(Gibt den Median eines Arrays wieder. Sollte Median �ber
    // Durchschnitt liegen gibt es mehr abweichungen nach oben, ist er darunter
    // mehr nach unten)
    public static int Median(int[] array) {
        int summe = 0;
        if (array.length % 2 == 0) {
            summe = array[array.length / 2 - 1] + array[array.length / 2];
        } else
            summe = array[array.length / 2 - 1];
        return summe;

    }

    public static double Median(double[] array) {
        double summe = 0;
        if (array.length % 2 == 0) {
            summe = array[array.length / 2 - 1] + array[array.length / 2];

        } else
            summe = array[array.length / 2 - 1];
        return summe;
    }

    // LINEAR SORT(Sortiert ein Array mit einer Lineraen Methode(Bubble-up,
    // aufsteigend)
    public static void sort(int[] array) {
        int i, j;
        for (i = array.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void sort(double[] array) {
        int i, j;
        for (i = array.length - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j].compareToIgnoreCase(array[i]) < 0) {
                    String temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void sort(char[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (Character.compare(array[j], array[i]) < 0) {
                    char temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void abSort(char[] array) {
        sort(array);
        for (int i = 0; i < array.length; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void abSort(String[] array) {
        sort(array);
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
    }

    // ARRAY ABSTEIGEND SORTIEREN (Sortiert ein Array und kehrt es dann um
    public static void abSort(int[] array) {
        sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void abSort(double[] array) {
        sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    // SELECTION SORT (Macht ein Selection Sort mit einem array(aufsteigent)
    public static void selSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index])
                    index = j;
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

    }

    public static void selSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index])
                    index = j;
            }
            double temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

    }

    // ARRAY SUCHE(Sucht den Index des Werts x)
    public static int linSearch(int[] array, int x) {
        int i = 0;
        boolean found = false;
        while (!found) {
            if (array[i] == x) {
                found = true;
                break;
            }

            if (i >= array.length) {
                found = true;
                return -1;
            }
            i++;
        }
        return i;
    }

    public static double linSearch(double[] array, int x) {
        int i = 0;
        boolean found = false;
        while (!found) {
            if (array[i] == x) {
                found = true;
                break;
            }

            if (i >= array.length) {
                found = true;
                return -1;
            }
            i++;
        }
        return i;
    }

    // PRINTARRAY (Printet das Array aus mit einem Leerzeichen zwischen jedem
    // Eintag)
    public static void printArray(int[] array, String spacer) {
        for (int i = 0; i < array.length; i++)
            if(i == array.length -1){
                print(array[i]);
            }else
                print(array[i] + spacer);
    }

    public static void printArray(double[] array, String spacer) {
        for (int i = 0; i < array.length; i++)
            if(i == array.length -1){
                print(array[i]);
            }else
                print(array[i] + spacer);
    }

    public static void printArray(char[] array, String spacer) {
        for (int i = 0; i < array.length; i++)
            if(i == array.length -1){
                print(array[i]);
            }else
                print(array[i] + spacer);
    }

    public static void printArray(String[] array, String spacer) {
        for (int i = 0; i < array.length; i++)
            if(i == array.length -1){
                print(array[i]);
            }else
                print(array[i] + spacer);
    }

    // ARRAY SWAP(tauscht 2 Werte in einem Array aus)
    public static boolean swap(int[] array, int i, int j) {
        if (i > array.length - 1 || j > array.length - 1)
            return false;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return true;
    }

    public static boolean swap(double[] array, int i, int j) {
        if (i > array.length - 1 || j > array.length - 1)
            return false;
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return true;
    }

    // ARRAY ERZEUGEN (Erzeugt ein Array mit den Werten 0 bis n, keine Matrizen)
    public static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;

    }

    public static double[] createArray(double size) {
        double[] array = new double[(int) size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;

    }

    // ARRAY ERZEUGEN(Erzeugt ein Array mit allen Werten zwischen min und max
    // mit dem Abstand schrittweite)
    public static int[] createArray(int min, int max, int step) {
        int min1 = min, groesse = 0;
        while (min1 <= max) {
            groesse++;
            min1 += step;
        }
        int[] array = new int[groesse];
        array[0] = min;
        for (int i = 1; i < array.length; i++) {
            min += step;
            array[i] = min;
        }
        return array;

    }

    public static double[] createArray(double min, double max, double step,
                                       int places) {
        double min1 = min, groesse = 0;
        while (min1 <= max) {
            groesse++;
            min1 += step;
        }
        double[] array = new double[(int) groesse];
        array[0] = min;
        for (int i = 1; i < array.length; i++) {
            min += step;
            array[i] = cut(min, places);
        }
        return array;

    }

    public static int random(int min, int max) {
        int random = (int) (Math.random() * max + min);
        return random;
    }

    public static double random(double min, double max) {
        double random = Math.random() * max + min;
        return random;
    }

}
