# LiskovSubstitutionPrinciple.Принцип подстановки Барбары Лисков.
## - Функции, использующие указатели ссылок на базовые классы, должны уметь использовать объекты производных классов, даже не зная об этом.

  * Попросту говоря: подкласс/производный класс должен быть взаимозаменяем с базовым/родительским классом.

  * Значит, любая реализация абстракции (интерфейса) должна быть взаимозаменяемой в любом месте, в котором принимается эта абстракция. По сути, когда мы используем в коде интерфейсы, то используем контракт не только по входным данным, принимаемым интерфейсом, но и по выходным данным, возвращаемым разными классами, реализующими этот интерфейс. В обоих случаях данные должны быть одного типа
