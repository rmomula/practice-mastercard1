/*
package com.example.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
*/
public class FileUploadController {
/*
    private final String API_URL = "https://your-llm-api-endpoint.com/upload";

    @GetMapping("/upload")
    public String uploadFiles(@RequestParam("pdfs") MultipartFile[] pdfs,
                              @RequestParam("json") MultipartFile json) throws IOException {

        // Create a HttpClient object
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost uploadFile = new HttpPost(API_URL);

            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            for (MultipartFile pdf : pdfs) {
                builder.addBinaryBody("pdfs", pdf.getInputStream(), org.apache.http.entity.ContentType.APPLICATION_PDF, pdf.getOriginalFilename());
            }
            builder.addBinaryBody("json", json.getInputStream(), org.apache.http.entity.ContentType.APPLICATION_JSON, json.getOriginalFilename());

            HttpEntity multipart = builder.build();
            uploadFile.setEntity(multipart);

            // Execute the request
            HttpResponse response = httpClient.execute(uploadFile);
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                return EntityUtils.toString(responseEntity);
            }
        }

        return "Failed to upload files";
    }*/
}
