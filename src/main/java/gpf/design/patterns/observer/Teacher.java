package gpf.design.patterns.observer;

/**
 * @author ge.pengfei
 */
public class Teacher extends Person {
    @Override
    public void rss(INewspaper newspaper) {
        newspaper.addPerson(this);
    }
}
