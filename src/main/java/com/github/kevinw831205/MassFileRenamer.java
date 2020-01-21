package com.github.kevinw831205;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        File[] files = filesInDir();

        System.out.println(files.length);
        String regex = "^"+baseFileName+"(.*)(\\..*)$";
        Pattern pattern = Pattern.compile(regex);

        for(File file : files){
            Matcher matcher = pattern.matcher(file.getName());


            while(matcher.find()){
                System.out.println(matcher.group(1));
                System.out.println(matcher.group(2));

//                File newFileName = new File(directory+"\\newbbFile"+matcher.group(1)+extensions[0]);
//                if(file.renameTo(newFileName)){
//                    System.out.println("success");
//                } else {
//                    System.out.println("fail");
//                }

            }


//            System.out.println(file.getName());
        }
    }

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
