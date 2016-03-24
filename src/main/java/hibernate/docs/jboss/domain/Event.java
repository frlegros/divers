package hibernate.docs.jboss.domain;

import java.util.Date;

/**
 * Created by frlegros on 24/03/16.
 * Classe persistante de type JavaBean
 */
public class Event {

    private Long id;
    private String title;
    private Date date;

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
