package com.ss.jb.three;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Assignment1 {

    /**
     * stores all files and sub directories of a given root dir
     * in a list with indents for structure
     * @param root root directory to start at
     * @param dirContents the list to store the files and subdirectories
     * @param indent the amount to indent to keep a structure of the directories
     */
    private static void storeDir(String root, List<String> dirContents, String indent) {
        try {
            File directory = new File(root);

            File[] fList = directory.listFiles();
            if (fList != null) {
                //loop through the list of files
                for (File file : fList) {
                    //add current indent level with the file name
                    if (file.isFile()) {
                        dirContents.add(indent + file.getName());
                        //add dir name with indent level and recursive call with added indent level
                    } else if (file.isDirectory()) {
                        dirContents.add(indent + file.getName());
                        storeDir(file.getAbsolutePath(), dirContents, indent + "\t");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * loops through dir list and prints each file with indent level
     * @param dirs list of directories
     */
    private static void printDir (List<String> dirs){
        for (String file: dirs){
            System.out.println(file);
        }
    }

    public static void main (String[] args){
        //Directory will be the first argument
        String strDir = args[0];
        //List to store the content of the directory
        List<String> dirContent = new ArrayList<>();

        storeDir(strDir, dirContent, "");

        printDir(dirContent);
    }

}
