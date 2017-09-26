package myapp

import myapp.Book
import myapp.ExampleCategory

class BootStrap {

    def init = { servletContext ->

        // create categories
        def horrorCategory = ExampleCategory.findByName("Horror")
        if (!horrorCategory) {
            horrorCategory = new ExampleCategory(name: 'Horror')
            horrorCategory.save(failOnError: true)
        }

        // create books
        def book1 = Book.findByTitle("The Stand")
        if (!book1) {
            book1 = new Book(
                    title: 'The Stand',
                    author: 'Stephen King'
            )
            book1.save(failOnError: true)
            book1.addToCategories(horrorCategory)
            book1.save(failOnError: true)
        }




    }

    def destroy = {
    }
}
