package com.example.driviglicencetesttrainer_rtoexam;

public class SignItem {
    int mImageResource;
    int mSignNo;
    String mDetail;

    public SignItem(int mImageResource, String mDetail, int mSignNo) {
        this.mImageResource = mImageResource;
        this.mDetail = mDetail;
        this.mSignNo = mSignNo;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getmDetail() {
        return mDetail;
    }

    public void setmDetail(String mDetail) {
        this.mDetail = mDetail;
    }

    public int getmSignNo() {
        return mSignNo;
    }

    public void setmSignNo(int mSignNo) {
        this.mSignNo = mSignNo;
    }
}
