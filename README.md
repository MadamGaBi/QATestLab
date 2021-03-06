# QATestLab
Test Automation Courses - Лекция 2. Домашнее задание:
По примеру из лекции создать Maven проект и подключить к нему библиотеку Selenium.
 Разработать скрипты в виде обычного приложения (с использованием метода main():
o Скрипт А. Логин в Админ панель
1. Открыть страницу Админ панели
2. Ввести логин, пароль и нажать кнопку Логин.
3. После входа в систему нажать на пиктограмме пользователя в верхнем
правом углу и выбрать опцию «Выход.»
o Скрипт Б. Проверка работоспособности главного меню Админ панели
1. Войти в Админ панель (по аналогии с предыдущим скриптом)
2. Кликнуть на каждом видимом пункте главного меню (Dashboard, Заказы,
Каталог, Клиенты…) для открытия соответствующего раздела и выполнить
следующее:
a. Вывести в консоль заголовок открытого раздела.
b. Выполнить обновление (рефреш) страницы и проверить, что
пользователь остается в том же разделе после перезагрузки
страницы.
Примечания: В процессе перехода между разделами может потребоваться ожидание загрузки
контента и корректной отработки скриптов. На данный момент вы можете использовать
стандартную задержку Thread.sleep() в необходимых местах. Корректное описание ожиданий
драйвера будут рассмотрены на следующей лекции.

Test Automation Courses - Лекция 3. Домашнее задание:
На основе примеров из лекции создать Maven проект и подключить к нему библиотеку
Selenium.
 Разработать скрипт в виде обычного приложения (с использованием метода main():
1. Войти в Админ Панель
2. Выбрать пункт меню Каталог -> категории и дождаться загрузки страницы управления
категориями.
3. Нажать «Добавить категорию» для перехода к созданию новой категории.
4. После загрузки страницы ввести название новой категории и сохранить изменения. На
странице управления категориями должно появиться сообщение об успешном
создании категории.
5. Отфильтровать таблицу категорий по имени и дождаться там появления записи
созданной категории.
Примечания: В процессе разработки следует не забывать о том, что, возможно, потребуется
описывать ожидания для корректной отработки скрипта (ожидание загрузки необходимой
страницы и ее содержимого, ожидание видимости подпунктов главного меню после наведения
курсора и т.п.).

 Дополнительно необходимо описать логгер, который будет выводить в консоль базовые
действия драйвера в процессе выполнения скрипт (переход на страницу, поиск элементов,
клики по элементам). Самый простой способ описания логгера – использовать свою
реализацию WebDriverEventListener.

Test Automation Courses - Лекция 4. Домашнее задание:
 Дополнительно рассмотрите использование таких аннотаций фреймворка TestNG как
@Parameters и @DataProvider.
 На основе примеров из лекции создать Maven проект и подключить к нему библиотеки
Selenium и TestNG.
Разработать тестовый скрипт, который будет соответствовать следующему сценарию:
Часть А. Создание продукта:
1. Войти в Админ Панель.
2. Выбрать пункт меню Каталог -> повары и дождаться загрузки страницы продуктов.
3. Нажать «Новый товар» для перехода к созданию нового продукта, дождаться загрузки
страницы.
4. Заполнить следующие свойства нового продукта: Название продукта, Количество, Цена.
Свойства продукта должны генерироваться случайно (случайное название продукта,
количество от 1 до 100, цена от 0.1 ₴ до 100 ₴).
5. После заполнения полей активировать продукт используя переключатель на нижней
плавающей панели. После активации продукта дождаться всплывающего уведомления
о сохранении настроек и закрыть его.
6. Сохранить продукт нажав на кнопку «Сохранить». Дождаться всплывающего
уведомления о сохранении настроек и закрыть его.
Часть Б. Проверка отображения продукта:
1. Перейти на главную страницу магазина.
2. Перейти к просмотру всех продуктов воспользовавшись ссылкой «Все товары».
Добавить проверку (Assertion), что созданный в Админ Панели продукт отображается на
странице.
3. Открыть продукт. Добавить проверки, что название продукта, цена и количество
соответствует значениям, которые вводились при создании продукта в первой части
сценария.
 Настройте выполнение тестового скрипта таким образом, чтобы при вызове выполнения
тестов (mvn test) он выполнился на разных браузерах: Chrome, Firefox, Internet Explorer. Для
этого можно в testng.xml воспользоваться возможностью передачи параметров.
