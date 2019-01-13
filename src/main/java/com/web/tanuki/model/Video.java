package com.web.tanuki.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("2")
public class Video extends Content{

    public Video(Channel channel, String title, String description, String path, Date uploaded_date, String size, String format, int views) {
        super(channel, title, description, path, uploaded_date, size, format, views);
    }

    public Video() {
    }
}
