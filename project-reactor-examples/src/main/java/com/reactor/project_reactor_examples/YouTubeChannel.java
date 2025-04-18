package com.reactor.project_reactor_examples;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private List<Video> videos;

    public YouTubeChannel(List<Video> videos) {
        this.videos = videos;
    }

    public YouTubeChannel() {
        this.videos = new ArrayList<>();
    }

    public void addVideo(Video video){
        videos.add(video);
    }

    public Flux<Video> getAllVideos(){
        return Flux.fromIterable(videos);
    }
}
