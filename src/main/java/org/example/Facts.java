package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Facts {
    public String id;
    public String text;
    public String type;
    public String user;
    public int upvotes;

    public Facts(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int  upvotes
    ){
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }


    public int getUpvotes(){
        return upvotes;
    }

    @Override
    public String toString() {
        return "Id=" + id +
                "\n text=" + text +
                "\n type=" + type +
                "\n text=" + text +
                "\n upvotes" + upvotes;
    }
}
