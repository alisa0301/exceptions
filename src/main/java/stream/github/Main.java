package stream.github;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static stream.JsonParser.getRepositoryList;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Repository> repositoryList = getRepositoryList();


        /**
         * Посчитали количество репозиториев, у которых тип владельца = User
         */
        long count = repositoryList.stream()
                .filter(privet -> privet.getOwner().getType().equalsIgnoreCase("USER"))
                .count();
        System.out.println(count);


        /**
         * Вывели на экран количество репозиториев, у которых язык = Java
         */
        repositoryList
                .stream()
                .filter(lang -> "Java".equalsIgnoreCase(lang.getLanguage()))
                .forEach(System.out::println);


        /**
         * Вернули список, состоящих из полных наименований репозиториев, принадлежащих пользователю ivliag
         * При этом еще вывели все эти репозитории в консоль
         */
        List<String> vanyaRepos = repositoryList
                .stream()
                .filter(repos -> "ivliag".equalsIgnoreCase(repos.getOwner().getLogin()))
                .map(Repository::getFull_name)
                .peek(System.out::println)
                .collect(Collectors.toList());


        /**
         * Отсортировали список животных в натуральном порядке,
         * привели к верхнему регистру, убрали из списка всех жирафов и повторяющиеся значения
         * и достали одно значение из списка
         */
        List<String> list = Arrays.asList("Котик", "Собачка", "Птичка", "Червячок", "Жираф", "Бегемот", "Котик");
        String animals = list.stream()
                .sorted()
                .map(String::toUpperCase)
                .filter(animal -> !animal.equalsIgnoreCase("Жираф"))
                .distinct()
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
        System.out.println("animals = " + animals);


        /**
         * Другая обработка Optional, чтобы получить нужный объект
         */
        Optional<String> bird = list.stream()
                .filter(anim -> anim.equals("Птичка"))
                .findFirst();

        //Пример обработки Optional
        if (bird.isPresent()) {
            System.out.println("bird.get() = " + bird.get());
        }

        //bird.ifPresent(s -> System.out.println("bird = " + s)); - обработка Optional, аналогично
    }
}
