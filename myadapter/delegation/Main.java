package myadapter.delegation;

public class Main {
    public static void main(String[] args){
        Video video = new Video("test","テスト動画");
        PrintVideo pv = new PrintVideo(video);

        pv.PrintId();   // System.out.println(video.getId)という処理を隠蔽
        pv.PrintTitle();
    }
}
