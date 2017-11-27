//Custom methods used for debugging

package com.janusresearch.genoaModelTool.debug;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ConstantConditions")
public class Debug {

    public static <T> void printArray(T[] anArray) {
        System.out.println(Arrays.toString(anArray));
    }
    public static <T> void printArray(T[][] anArray) {
        System.out.println(Arrays.deepToString(anArray));
    }
    public static <T> void printArray(T[][][] anArray) {
        System.out.println(Arrays.deepToString(anArray));
    }

    public static <T> void print(T type) {
        System.out.println(type);
    }

    //This method creates the Icon Interface file from the icon folder files
    public static void updateIconClass() {
        File folder1 = new File("D:\\IdeaProjects\\Genoa_Model_Tool\\src\\icons\\actions");
        File folder2 = new File("D:\\IdeaProjects\\Genoa_Model_Tool\\src\\icons\\dataTypes");
        File folder3 = new File("D:\\IdeaProjects\\Genoa_Model_Tool\\src\\icons\\objects");
        File[] listOfFiles1 = folder1.listFiles();
        File[] listOfFiles2 = folder2.listFiles();
        File[] listOfFiles3 = folder3.listFiles();
        List<String> lines = new ArrayList<>();

        lines.add("package icons;\n\nimport com.intellij.openapi.util.IconLoader;\n\nimport javax.swing.*;\n\npublic interface GenoaIcons {\n    class Actions {\n");

        for (File f : listOfFiles1) {
            if (f.isFile()) {
                lines.add("        public static Icon " + f.getName().substring(0, f.getName().length() - 4) + " = IconLoader.getIcon(\"/icons/actions/" + f.getName() + "\");");
            }
        }

        lines.add("    }\n\n    class DataTypes {\n");

        for (File f : listOfFiles2) {
            if (f.isFile()) {
                lines.add("        public static Icon " + f.getName().substring(0, f.getName().length() - 4) + " = IconLoader.getIcon(\"/icons/dataTypes/" + f.getName() + "\");");
            }
        }

        lines.add("    }\n\n    class Objects {\n");

        for (File f : listOfFiles3) {
            if (f.isFile()) {
                lines.add("        public static Icon " + f.getName().substring(0, f.getName().length() - 4) + " = IconLoader.getIcon(\"/icons/objects/" + f.getName() + "\");");
            }
        }

        lines.add("    }\n}");

        String iconFile = "D:\\IdeaProjects\\Genoa_Model_Tool\\src\\icons\\GenoaIcons.java";
        Charset utf8 = StandardCharsets.UTF_8;
        try {
            Files.write(Paths.get(iconFile), lines);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
