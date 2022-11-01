package com.task_003_Book;
/**
 * Создать класс Book. Создать классы Title, Author и Content,
 * каждый из которых должен содержать одно строковое поле и метод void show ().
 * Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
 * Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
 */
public class Main {

    public static void main(String[] args) {
        {
            Title title_1 = new Title();
            title_1.title = "Google to help!";

            Author author_1 = new Author();
            author_1.author = "Max Case";

            Content content_1 = new Content();
            content_1.content = "\n" + " When I need help from my best mentor: \n - " +
                    "Please, I don't understand anything!!!," + "\n" +
                    " He answers me: \n - Google to help you, my old grandfather!!!";

            Book book_1 = new Book(title_1, author_1, content_1);

            book_1.title.Show();
            book_1.author.Show();
            book_1.content.Show();


        }

    }

}
