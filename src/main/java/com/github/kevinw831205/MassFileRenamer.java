package com.github.kevinw831205;

import java.io.File;
import java.nio.file.Files;

public class MassFileRenamer {

    private String directory;
    private String baseFileName;
    private String[] extensions;

    public MassFileRenamer(String directory, String baseFileName, String... extensions ) {
        this.directory = directory;
        this.baseFileName = baseFileName;
        this.extensions = extensions;
    }

    public void renameFiles(){
    };

    public File[] filesInDir(){
        File dir = DirectoryToFile();
        return dir.listFiles();
    }

    public File DirectoryToFile(){
        File file = new File(getDirectory());
        return file;
    }

    public String getDirectory() {
        return directory;
    }

    public String getBaseFileName() {
        return baseFileName;
    }

    public String[] getExtensions() {
        return extensions;
    }
}
