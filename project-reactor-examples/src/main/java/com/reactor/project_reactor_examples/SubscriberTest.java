package com.reactor.project_reactor_examples;

public class SubscriberTest {
    public static void main(String... args) {
        YouTubeChannel publisher = new YouTubeChannel();
        publisher.addVideo(new Video("Reactive Programming with java",
                "This video talk about reactive programming", 200, 10000));
        publisher.addVideo(new Video("Java vs Kotlin",
                "This video compare the difference about Java and Kotlin", 50, 20000));

        //Teste 1
        //User subscriber = new User("Karina");
        //publisher.getAllVideos().subscribeWith(subscriber);

        //Teste 2
        //publisher.getAllVideos().log().subscribe();

        //Teste 3
        //publisher.getAllVideos().log().subscribe(video -> {System.out.println(video.getName());});

        //Teste 4
        publisher.getAllVideos().log().subscribe(
                video -> System.out.println(video.getName()),
                throwable -> System.out.println(throwable),
                () -> System.out.println("Dados consumidos com sucesso")
        );


    }
}
