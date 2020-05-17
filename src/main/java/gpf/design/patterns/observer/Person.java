package gpf.design.patterns.observer;

/**
 * 订阅者
 *
 * @author ge.pengfei
 */
public class Person {
    /**
     * 订阅
     * @param newspaper
     */
    public void rss(INewspaper newspaper) {
        newspaper.addPerson(this);
    };

    /**
     * 解除订阅
     * @param newspaper
     */
    public void rssReverse(INewspaper newspaper) {
        newspaper.removePerson(this);
    };

    /**
     * 新刊发布接收消息
     */
    public void listen(String message) {
        System.out.println(message);
    }
}
