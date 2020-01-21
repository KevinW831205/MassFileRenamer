package com.github.kevinw831205;

public class Main {

    public static void main(String[] args) {
//        String directory = "D:\\github-repo\\MassFileRenamer\\TestResource"; // directory of files to rename
//        String baseFileName = "html"; // base file name of files index ex: file1 -> file
//        String[] extensions = new String[]{".html"};
//
//        String newFileName = "newHtml";


        String directory = FileFields.DIRECTORY.getText();
        String baseFileName = FileFields.BASEFILENAME.getText();
        String[] extensions = FileFields.EXTENSIONS.getExtensions();

        String newFileName = FileFields.NEWFILENAME.getText();

        MassFileRenamer renamer = new MassFileRenamer(directory, baseFileName, extensions);

        renamer.renameFiles(newFileName);
    }
}
