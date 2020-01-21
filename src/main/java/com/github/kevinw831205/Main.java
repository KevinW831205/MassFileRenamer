package com.github.kevinw831205;

public class Main {

    public static void main(String[] args) {
        String directory = "TestResource"; // directory of files to rename
        String baseFileName = "newFile"; // base file name of files index ex: file1 -> file
        String[] extensions = new String[]{".txt"};

        String newFileName = "file";


        MassFileRenamer renamer = new MassFileRenamer("TestResource", "file ", ".txt");

        renamer.renameFiles(newFileName);
    }
}
