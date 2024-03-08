package com.inter.assignment1;

public class ZipCompressor implements ICompressor{
    @Override
    public String[] compressFiles(String file2, String file1) {
        String[] ZippedFiles = new String[2];
        ZippedFiles[0]= file1;
        ZippedFiles[1]= file2;

        return ZippedFiles;
    }
}
