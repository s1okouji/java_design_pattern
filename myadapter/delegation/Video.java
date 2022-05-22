package myadapter.delegation;

// APIから提供されると仮定
public class Video {
    private String id;
    private String title;

    public Video(String id,String title){
        this.id = id;
        this.title = title;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
}
