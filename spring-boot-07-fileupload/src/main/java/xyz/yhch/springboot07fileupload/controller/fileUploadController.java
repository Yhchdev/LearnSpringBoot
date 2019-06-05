package xyz.yhch.springboot07fileupload.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/uploads")
public class fileUploadController {

    /**
     *
     * @param file MultipartFile spring上传文件的封装类
     * transferTo 方法将上传文件写到服务器上指定的文件。
     * @return
     */
    @PostMapping("/single")
    public Map<String,String> single(
            @RequestParam("file") MultipartFile file
            ) throws IOException {
        // 写入到指定目录（具体开发中有可能是将文件写入到云存储(七牛云,图片服务器)/或者指定目录通过 Nginx 进行 gzip 压缩和反向代理
        file.transferTo(new File("D:\\FileUploadtest\\" + file.getOriginalFilename()));

        Map<String,String> result = new HashMap<>();
        result.put("contentType",file.getContentType());
        result.put("fileName",file.getOriginalFilename());
        result.put("fileSize",file.getSize()+"");
        return result;
    }

    @PostMapping("/multiple")
    public List<Map<String,String>> mutiple(
            @RequestParam("file") MultipartFile[] files
    ) throws IOException {

        List<Map<String,String>> results = new ArrayList<>();

        for(MultipartFile file:files){
            file.transferTo(new File("D:\\FileUploadtest\\"+file.getOriginalFilename()));
            Map<String, String> map = new HashMap<>(16);
            map.put("contentType", file.getContentType());
            map.put("fileName", file.getOriginalFilename());
            map.put("fileSize", file.getSize() + "");
            results.add(map);
        }


        return results;
    }
}
