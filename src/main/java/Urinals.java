package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Urinals {
        public static int getUrinalCount(String urinals){
        if(urinals.contains("11")) {
            return -1;
        }
        return urinals.replace("010", "-")
                .replace("10", "-")
                .replace("01", "-")
                .replace("1", "-")
                .replace("00", "0")
                .replace("-", "")
                .length();
    }
    public static void writeToFile(List<String> outputs) throws IOException {
        int num = 0;
        String currentPath = new java.io.File(".").getCanonicalPath();
        String save = "rule.txt";
        File file = new File(currentPath, save);
        while(file.exists()) {
            save = "rule" + (++num) +".txt";
            file = new File(currentPath, save);
        }
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            for(int i=0;i<outputs.size();i++){
                fr.write(String.valueOf(outputs.get(i)));
                fr.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
    public static ArrayList readFromFile() throws IOException {
        File file = new File(
                "urinals.dat");
        BufferedReader br
                = new BufferedReader(new FileReader(file));
        String st;
        ArrayList inputList = new ArrayList();
        ArrayList outputList = new ArrayList();
        while ((st = br.readLine()) != null){
            if(st=="-1"){
                return inputList;
            }
            inputList.add(st);
        }
        for(int i=0;i<inputList.size();i++){
            if(getUrinalCount(inputList.get(i).toString())==-1){
                outputList.add(-1);
                return outputList;
            }
            outputList.add(getUrinalCount(inputList.get(i).toString()));
        }
        return outputList;
    }

    public static boolean validString(String userInput){
            boolean isABinNumber = userInput.matches("^[01]+$");
            if(isABinNumber){
                return true;
            }
            else {
                return false;
            }
    }

    public static void main(String[] args) throws IOException{
        System.out.println("Please select from below options");
        System.out.println("1. Input from keyboard");
        System.out.println("2. From file");
        Scanner myOptions = new Scanner(System.in);
        String selectedOption = myOptions.nextLine();

        if(selectedOption.contains("1")){
            System.out.println("Enter string");
            Scanner val1 = new Scanner(System.in);
            String selVal = val1.nextLine();
            if(validString(selVal)){
                System.out.println(getUrinalCount(selVal));
            }
            else{
                System.out.println("Not valid input");
            }
        }

        if(selectedOption.contains("2")){
            List<String> fileValue = readFromFile();
            writeToFile(fileValue);
        }
    }
}
