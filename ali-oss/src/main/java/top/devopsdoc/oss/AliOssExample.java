package top.devopsdoc.oss;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

/**
 * Demonstrates connecting to Alibaba Cloud OSS.
 */
public class AliOssExample {
    public static void main(String[] args) {
        // TODO: replace with your endpoint and credentials
        String endpoint = "https://oss-your-region.aliyuncs.com";
        String accessKeyId = "YOUR_ACCESS_KEY_ID";
        String accessKeySecret = "YOUR_ACCESS_KEY_SECRET";

        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        try {
            System.out.println("Buckets: " + ossClient.listBuckets());
        } finally {
            ossClient.shutdown();
        }
    }
}
