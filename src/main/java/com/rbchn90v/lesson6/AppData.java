package com.rbchn90v.lesson6;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppData {
    private String[] header;
    private int[][] data;

    private AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    private String strArrToString(String[] arr) {
        StringBuilder rez = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            rez.append(arr[i]).append(";");
        }
        return rez + "\n";
    }

    private String intArrToString(int[] arr) {
        StringBuilder rez = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            rez.append(arr[i]).append(";");
        }
        return rez + "\n";
    }

    public String twoDimentionalArrToString(int[][] arr) {
        StringBuilder valueTab = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            valueTab.append(intArrToString(arr[i]));
        }
        return valueTab.toString();
    }

    public void save(AppData data) {
        StringBuilder result = new StringBuilder();
        result.append(data.strArrToString(data.getHeader()))
                .append(data.twoDimentionalArrToString(data.getData()));
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("data.csv"))) {
            out.writeUTF(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String load() {
        String result = "";

        try (DataInputStream in = new DataInputStream(new FileInputStream("data.csv"))) {
            result = in.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = new int[][]{{100, 200, 123}, {300, 400, 500}};
        AppData appData = new AppData(header, data);
        appData.save(appData);
        System.out.println(appData.load());
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }
}
