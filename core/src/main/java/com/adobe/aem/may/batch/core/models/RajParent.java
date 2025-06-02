package com.adobe.aem.may.batch.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;

@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RajParent {

    @ValueMapValue
    public String text;

    @ValueMapValue
    public String des;

    @ValueMapValue
    public int num;

    @ScriptVariable
    Page currentPage;

    @Inject
    ResourceResolver resolver;

    public String getArticletitle()
    {
        return currentPage.getTitle();
    }
    public String getArticlePagePath()
    {
        return currentPage.getPath();
    }
    public Page getArticlePageParent()
    {
        return currentPage.getParent();
    }

    public String getWebContentNode()
    {
        return resolver.getUserID();

    }

    
    @ChildResource
    public List<RajChild> bookdetailswithmap;

    public String getText() {
        return text;
    }

    public String getDes() {
        return des;
    }

    public int getNum() {
        return num;
    }

    public List<RajChild> getBookdetailswithmap() {
        return bookdetailswithmap;
    }

    

}
