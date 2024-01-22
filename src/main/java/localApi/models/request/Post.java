package localApi.models.request;

import lombok.Data;

@Data
public class Post {
    private String id;
    private String title;
    private String desc;
    private String user;
}
