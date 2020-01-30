package com.example.translation;

import androidx.annotation.NonNull;

public class Word {

    private static final int NO_IMAGE_PROVIDED = 0;

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation,
                int imageResourceId, int audioResourceId)
    {
        this(defaultTranslation, miwokTranslation, audioResourceId);
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the miwok translation of this {@link Word}
     * @return the miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the english translation of this {@link Word}
     * @return the english translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the image resource id used as a visual illustration to represent this {@link Word}
     * @return the image resource id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Checks whether this {@link Word} has an image associated with it.
     *
     * @return true if there is an image for the {@link Word}, false otherwise
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Gets the the audio resource associated with this {@link Word}
     *
     * @return the audio resource id
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
