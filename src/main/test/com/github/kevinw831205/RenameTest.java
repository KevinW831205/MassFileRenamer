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
    public void directoryToFileCheck() {
        File actual =  renamer.DirectoryToFile();
        System.out.println(actual.getAbsoluteFile());
        Assert.assertNotNull(actual);
    }
}
