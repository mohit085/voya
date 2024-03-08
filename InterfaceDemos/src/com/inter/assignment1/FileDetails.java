package com.inter.assignment1;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor iCompressor = new ZipCompressor();
        String[] array=iCompressor.compressFiles("file1.doc","image.jpeg");
        for(String print : array){
            System.out.println(print);
        }


//        ZipCompressor zipCompressor = new ZipCompressor();

    }
}
