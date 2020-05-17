package gpf.design.patterns.observer;

/**
 * @author ge.pengfei
 */
public class Student extends Person {
    @Override
    public void rss(INewspaper newspaper) {
        newspaper.addPerson(this);
    }
}
