package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
 @Model (adaptables = Resource.class, defaultInjectionStrategy =DefaultInjectionStrategy.OPTIONAL)
public class DemoModel {
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String des;
    @ValueMapValue
    private int num;

    //getter and setter
    //getter --> to get the value frome the varable
    public String getText(){
        return text;
    }
    public String getDes(){
        return des;
    }
    public int getNum(){
        return num;
    }
}
