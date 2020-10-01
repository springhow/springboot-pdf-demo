package com.springhow.examples.springboot.pdfdemo;


import com.itextpdf.html2pdf.HtmlConverter;

import java.io.File;
import java.io.IOException;

public class GeneratePDFUsingHTML {

    public static void main(String[] args) throws IOException {

        HtmlConverter.convertToPdf(new File("./pdf-input.html"),new File("demo-html.pdf"));
    }
}
