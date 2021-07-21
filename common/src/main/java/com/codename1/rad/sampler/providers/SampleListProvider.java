package com.codename1.rad.sampler.providers;

import com.codename1.io.Log;
import com.codename1.rad.io.ResultParser;
import com.codename1.rad.models.AbstractEntityListProvider;
import com.codename1.rad.models.EntityList;
import com.codename1.rad.models.EntityListProvider;
import com.codename1.rad.sampler.models.UserProfile;
import com.codename1.rad.sampler.models.UserProfileImpl;
import com.codename1.ui.CN;

import java.io.IOException;

import static com.codename1.ui.CN.scheduleBackgroundTask;

public class SampleListProvider extends AbstractEntityListProvider {
    @Override
    public Request getEntities(Request request) {

        EntityList out = new EntityList();
        {
            UserProfile profile = new UserProfileImpl();
            profile.setName("Steve Hannah");
            profile.setEmail("steve@example.com");
            profile.setPhotoUrl("https://www.codenameone.com/img/steve.jpg");
            out.add(profile);
        }
        {
            UserProfile profile = new UserProfileImpl();
            profile.setName("Shai Almog");
            profile.setEmail("shai@example.com");
            profile.setPhotoUrl("https://www.codenameone.com/img/shai.jpg");
            out.add(profile);
        }
        {
            UserProfile profile = new UserProfileImpl();
            profile.setName("Chen Fishbein");
            profile.setEmail("chen@example.com");
            profile.setPhotoUrl("https://www.codenameone.com/img/chen.jpg");
            out.add(profile);
        }
        request.complete(out);
        return request;
    }

}
