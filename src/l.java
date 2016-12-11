/**
 * Created by SiyuanZeng's on 12/11/2016.
 */

import lombok.Data;

import java.util.List;

@Data
public class l implements k{
    private String title;
    private List<String> categories;
    private String content;

    //it is easy to write code everywehre just like it is easy to find something around tyou right now right here and rithe me and right peope right place it is easy and you will never see it again only right now
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isValid() {
        return title != null && !title.isEmpty() && !categories.isEmpty();
    }


}
