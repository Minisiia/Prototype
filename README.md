## Prototype
## Design Patterns. Prototype
You are developing a system for managing products in an online store. 
One of the tasks of the system is to create copies of products for editing or creating new products based on existing ones. 
You need to implement this functionality using the "Prototype" design pattern.

You should create a base class Product(id, name, description, price, image), which will contain common properties and methods for all types of products.

Then, create subclasses Book(author, publisher, isbn), Movie(director, actors, duration), and Music(artist, genre, album), which will contain additional properties and methods specific to each type of product.

Each class should implement the clone() method, which will create a copy of the object.
For example, you can create the book "War and Peace" by Leo Tolstoy, save it in the collection, and then create a copy, changing the name to "War and Peace (new edition)" and increasing the price by 10%.

## Задание 
Вы разрабатываете систему для управления товарами в интернет-магазине. Одна из задач системы - создание копий товаров для редактирования или создания новых товаров на основе существующих. Вам необходимо реализовать эту функциональность, используя шаблон проектирования "Прототип".

Вам нужно создать базовый класс Product, который будет содержать общие свойства и методы для всех типов товаров. Затем необходимо создать подклассы Book, Movie и Music, которые будут содержать дополнительные свойства и методы, специфичные для каждого типа товаров. Каждый класс должен реализовать метод clone(), который будет создавать копию объекта.

Класс Product должен содержать следующие свойства:

- id - уникальный идентификатор товара
- name - название товара
- description - описание товара
- price - цена товара
- image - ссылка на изображение товара

Класс Book должен содержать дополнительные свойства:

- author - имя автора книги
- publisher - издательство книги
- isbn - номер ISBN книги

Класс Movie должен содержать дополнительные свойства:

- director - имя режиссера фильма
- actors - список актеров в фильме
- duration - длительность фильма

Класс Music должен содержать дополнительные свойства:

- artist - имя исполнителя музыки
- genre - жанр музыки
- album - название альбома

В методе main необходимо создать несколько объектов каждого типа товаров, сохранить их в коллекции и затем создать копии объектов, используя метод clone(). При создании копий объектов необходимо изменить значения некоторых свойств, чтобы продемонстрировать, что объекты создаются на основе существующих объектов.

Например, можно создать книгу "Война и мир" Льва Толстого, сохранить ее в коллекции и затем создать копию, изменив название на "Война и мир (новое издание)" и увеличив цену на 10%.

## Заметки

Реализация интерфейса Cloneable является необходимой для использования метода clone() в классах-наследниках. Если класс не реализует интерфейс Cloneable, то при попытке клонирования объекта будет выброшено исключение CloneNotSupportedException.

В данном случае, реализация интерфейса Cloneable в классе Product является необходимой, так как метод clone() будет использоваться в классах-наследниках Book, Movie и Music. При этом, метод clone() необходимо переопределить в каждом из этих классов, чтобы создать правильную копию объекта в соответствии со специфичными для каждого класса свойствами.

В классе Product метод clone() не переопределяется.

Методы clone() в классах-наследниках Book, Movie и Music относятся к методу clone() из интерфейса Cloneable.

Когда класс реализует интерфейс Cloneable, это означает, что объекты этого класса могут быть клонированы с помощью метода clone(). Однако, чтобы clone() работал корректно, необходимо, чтобы класс имел свой собственный метод clone(), который переопределяет метод clone() из класса Object.

В данном случае класс Product реализует интерфейс Cloneable, чтобы классы-наследники могли использовать метод clone(), но поскольку класс Product не переопределяет метод clone(), вызов метода clone() из класса Object будет использоваться для клонирования объектов класса Product. Классы-наследники, такие как Book, Movie и Music, переопределяют метод clone() из класса Object, чтобы создавать корректные копии своих собственных объектов.
