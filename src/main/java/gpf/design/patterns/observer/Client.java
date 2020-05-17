package gpf.design.patterns.observer;

/**
 * @author ge.pengfei
 */

public class Client {
    public static void main(String[] args) {
        PeopleNewspaper peopleNewspaper = new PeopleNewspaper();
        UniversalNewspaper universalNewspaper = new UniversalNewspaper();

        System.out.println("1");
        Person student1 = new Student();
        student1.rss(peopleNewspaper);

        System.out.println("2");
        Person student2 = new Student();
        student2.rss(peopleNewspaper);
        student2.rss(universalNewspaper);

        System.out.println("3");
        Person teacher = new Teacher();
        teacher.rss(peopleNewspaper);

        System.out.println("4");
        Person person = new Person();
        person.rss(universalNewspaper);

        peopleNewspaper.publish("4月新刊发布");
        universalNewspaper.publish("4月新刊发布");

        System.out.println("3");
        teacher.rssReverse(peopleNewspaper);
        teacher.rssReverse(universalNewspaper);

        peopleNewspaper.publish("5月新刊发布");
        universalNewspaper.publish("5月新刊发布");
    }
}
