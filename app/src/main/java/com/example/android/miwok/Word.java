package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word (String defaulTranslation, String miwokTranslation){
        mDefaultTranslation = miwokTranslation;
        mMiwokTranslation = defaulTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;

    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;

    }


}
