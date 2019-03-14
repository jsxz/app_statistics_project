package com.atguigu.app.common;

/**
 * Created by atguigu on 2017/11/8
 */
public class AppUsageLog extends  AppBaseLog {

    private Long singleUploadTraffic;     //单次使用过程中的上传流量
    private Long singleDownloadTraffic;       //单次使用过程中的下载流量

    public Long getSingleUploadTraffic() {
        return singleUploadTraffic;
    }

    public void setSingleUploadTraffic(Long singleUploadTraffic) {
        this.singleUploadTraffic = singleUploadTraffic;
    }

    public Long getSingleDownloadTraffic() {
        return singleDownloadTraffic;
    }

    public void setSingleDownloadTraffic(Long singleDownloadTraffic) {
        this.singleDownloadTraffic = singleDownloadTraffic;
    }
}
