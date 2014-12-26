package pl.dmichalski.c02_09_external_resources.shop;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Author: Daniel
 */
public class BannerLoader implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    private Resource banner;

    public void showBanner() throws IOException {
        InputStream in = banner.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void setBanner(Resource banner) {
        this.banner = banner;
    }

}
