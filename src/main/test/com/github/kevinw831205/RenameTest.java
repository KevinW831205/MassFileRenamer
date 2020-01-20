package com.github.kevinw831205;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class RenameTest {
    private MassFileRenamer renamer;

    @Before
    public void Initialize() {
        renamer = new MassFileRenamer("K:\\MassFileRenamer\\TestResource", "file", ".txt");
    }

    @Test
    public void directoryToFileTest() {
        File actual =  renamer.DirectoryToFile();
        String expectedDirectory = renamer.getDirectory();
        Assert.assertNotNull(actual);
        Assert.assertEquals(expectedDirectory,actual.getAbsolutePath());
    }

    @Test
    public void fileInDirTest(){
        File[] files= renamer.filesInDir();
        for(File file: files){
            System.out.println(file);
        }
        Assert.assertEquals(5,files.length);
    }
}
