package com.web.tanuki.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("1")
public class Audio extends Content{

    public Audio(Channel channel, String title, String description, String path, Date uploaded_date, String size, String format, int views) {
        super(channel, title, description, path, uploaded_date, size, format, views);
    }

    public Audio() {
    }
}
