package myapp

class Book {

    static constraints = {
    }

    static search = {
        // fields
        title index: 'yes'
        author index: 'yes'
        categories indexEmbedded: [includeEmbeddedObjectId: true, depth: 1]
    }

    static hasMany = [categories: ExampleCategory]

    String title = ""
    String author = ""

    List<ExampleCategory> categories = []




}
