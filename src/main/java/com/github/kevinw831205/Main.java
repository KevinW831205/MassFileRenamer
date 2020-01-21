package com.github.kevinw831205;

public class Main {

    public static void main(String[] args) {
        String directory = "D:\\github-repo\\MassFileRenamer\\TestResource"; // directory of files to rename
        String baseFileName = "html"; // base file name of files index ex: file1 -> file
        String[] extensions = new String[]{".html"};

        String newFileName = "newHtml";


        MassFileRenamer renamer = new MassFileRenamer(directory, baseFileName, extensions);

        renamer.renameFiles(newFileName);
    }
}
