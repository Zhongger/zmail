package com.zhongger.zmail.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class ZmailThirdPartyApplicationTests {
	@Autowired
	private OSSClient ossClient;

	@Test
	void contextLoads() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Zhongger\\Desktop\\personal\\照片\\小一寸b.jpg");
		ossClient.putObject("zmall-bucket","照片.jpg",fileInputStream);
		ossClient.shutdown();
		System.out.println("上传成功！");
	}

}
