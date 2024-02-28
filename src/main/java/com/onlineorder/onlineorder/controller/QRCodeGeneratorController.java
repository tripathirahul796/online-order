package com.onlineorder.onlineorder.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.WriterException;
import com.onlineorder.onlineorder.service.QRCode.QRCodeGenerator;

@RestController
public class QRCodeGeneratorController {

    @Autowired
    QRCodeGenerator qrCodeGenerator;

    @GetMapping("/generate/{tableNum}")
    public String generateQRCodeForRange(@PathVariable int tableNum) {
        try {
            qrCodeGenerator.generateQRCode("Table Number : " + tableNum, tableNum);
        } catch (IOException | WriterException e) {
            e.printStackTrace();
        }
        return "Successfully generated!!";
    }

}
