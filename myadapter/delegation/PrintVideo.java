package myadapter.delegation;

// このclassは私が作成したライブラリ寄りのclassであるといえる(なぜならこのclassをvideoオブジェクトとして利用することはできないから)
// もう一つの実装方法はvideoクラスを扱えてしまうので、ライブラリというよりかはAPIの拡張の意味のほうが強くなる。
public class PrintVideo extends Print{
    private Video video;
    
    public PrintVideo(Video video){
        this.video = video;
    }

    public void PrintId(){
        System.out.println(video.getId());
    }

    public void PrintTitle(){
        System.out.println(video.getTitle());
    }
}
