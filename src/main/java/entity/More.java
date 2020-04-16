package entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class More {
    List course;
    Set cities;
    Map score;
    Properties props;

    public More() {
    }

    public More(List course, Set cities, Map score, Properties props) {
        this.course = course;
        this.cities = cities;
        this.score = score;
        this.props = props;
    }

    public List getCourse() {
        return course;
    }

    public void setCourse(List course) {
        this.course = course;
    }

    public Set getCities() {
        return cities;
    }

    public void setCities(Set cities) {
        this.cities = cities;
    }

    public Map getScore() {
        return score;
    }

    public void setScore(Map score) {
        this.score = score;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "More{" +
                "course=" + course +
                ", cities=" + cities +
                ", score=" + score +
                ", props=" + props +
                '}';
    }
}

