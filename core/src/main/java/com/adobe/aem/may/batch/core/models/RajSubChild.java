package com.adobe.aem.may.batch.core.models;

import java.util.Date;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class ,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class RajSubChild {


    @ValueMapValue
    public String writername;

    @ValueMapValue
    public int writernumber;

    @ValueMapValue
    public Date writerdob;

    public String getWritername() {
        return writername;
    }

    public int getWriternumber() {
        return writernumber;
    }

    public Date getWriterdob() {
        return writerdob;
    }

    

}
