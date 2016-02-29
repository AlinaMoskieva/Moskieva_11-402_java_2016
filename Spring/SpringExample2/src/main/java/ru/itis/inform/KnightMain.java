package ru.itis.inform;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Moskieva on 29.02.16.
 */
public class KnightMain {
    public static void main(String[] args) throws QuestException {
      // Загрузка контекста Spring
      ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");// Получение компонента knight
      Knight knight = (Knight) context.getBean("knight"); // Использование компонента knight
      knight.embarkOnQuest();
    }
}
