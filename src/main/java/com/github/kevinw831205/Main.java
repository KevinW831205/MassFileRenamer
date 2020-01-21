package com.github.kevinw831205;

public class Main {

    public static void main(String[] args) {
        MassFileRenamer renamer = new MassFileRenamer("TestResource", "newFile", ".txt");

        renamer.renameFiles();
    }
}
