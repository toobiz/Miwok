package com.example.android.miwok;

/**
 * Created by mike on 24.10.2016.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word (String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
