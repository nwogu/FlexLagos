package com.example.android.flexlagos;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by TEST on 6/17/2017.
 */

public class Flex  {

    private String placeName;

    private String description;

    private int imageresource;


public Flex (String mPlaceName, String mDescription, int mImageResource){
    placeName = mPlaceName;
    description = mDescription;
    imageresource = mImageResource;
}

public String getPlaceName(){
    return placeName;
}

public String getDescription(){
    return description;
}

public int getImageresource(){
    return imageresource;
}
}