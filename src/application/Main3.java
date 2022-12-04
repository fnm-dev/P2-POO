package application;

import model.dao.CategoryDao;
import model.dao.DaoFactory;
import model.entities.Category;

import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CategoryDao categoryDao = DaoFactory.createCategoryDao();

        System.out.println("=== TEST 1: findById =======");
        Category cat = categoryDao.findById(1);
        System.out.println(cat);

        System.out.println("\n=== TEST 2: findAll =======");
        List<Category> list = categoryDao.findAll();
        for (Category cat2 : list) {
            System.out.println(cat2);
        }

        System.out.println("\n=== TEST 3: insert =======");
        Category cat3 = new Category(null, "abc");
        categoryDao.insert(cat3);
        System.out.println("Inserted! New id: " + cat3.getId());

        System.out.println("\n=== TEST 4: update =======");
        cat3 = categoryDao.findById(5);
        cat3.setName("Pick-up");
        categoryDao.update(cat3);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        categoryDao.deleteById(id);
        System.out.println("Delete completed!");

        sc.close();
    }
}
