package sit.tu_varna.bg.datasource;

import sit.tu_varna.bg.models.*;

import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public ArrayList<User> getUserBeans() {
        final Skills skills = new Skills();
        skills.updateJobSkills("Java", (short) 10);
        skills.updateJobSkills("HTML", (short) 20);
        skills.updateJobSkills("CSS", (short) 30);
        skills.updateJobSkills("JavaScript", (short) 40);

        skills.updatePersonSkills("Комуникативност", (short) 50);
        skills.updatePersonSkills("Работа в екип", (short) 60);
        skills.updatePersonSkills("Креативност", (short) 70);

        return new ArrayList<User>() {{
            add(new User(
                    "Цветелин Петров",
                    "Студент",
                    "Lorem Ipsum е елементарен примерен текст, използван в печатарската и типографската индустрия. Lorem Ipsum е индустриален стандарт от около 1500 година, когато неизвестен печатар взема няколко печатарски букви и ги разбърква, за да напечата с тях книга с примерни шрифтове. Този начин не само е оцелял повече от 5 века, но е навлязъл и в публикуването на електронни издания като е запазен почти без промяна. Популяризиран е през 60те години на 20ти век със издаването на Letraset листи, съдържащи Lorem Ipsum пасажи, популярен е и в наши дни във софтуер за печатни издания като Aldus PageMaker, който включва различни версии на Lorem Ipsum.",
                    "male.png",
                    new Login("user1", "pass"),
                    new Contact("email@email.com", "089874562,",
                            new Address("Варна", "ул. Студентска 1")),
                    skills
            ));
        }};
    }
}
