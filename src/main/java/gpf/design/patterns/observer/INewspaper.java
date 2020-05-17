package gpf.design.patterns.observer;

/**
 * 被订阅者：报纸
 *
 * @author ge.pengfei
 */
public interface INewspaper {
    /**
     * 报纸名称
     * @return
     */
    String name();

    /**
     * 订阅
     * @param person
     */
    void addPerson(Person person);

    /**
     * 取消订阅
     * @param person
     */
    void removePerson(Person person);

    /**
     * 新刊发布
     * @param message
     */
    void publish(String message);
}
