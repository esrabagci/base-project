package org.helb.baseproject.model.entity;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Song {
    @Id
    private String id;
    private String song_name;
    private String tag_song;


}
