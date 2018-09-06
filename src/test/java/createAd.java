import com.codeborne.selenide.Selenide;
import org.junit.Test;
import pages.AutoRuAddAdPage;
import pages.AutoRuMainPage;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.openqa.selenium.Keys.DOWN;

public class createAd {
    @Test
            public void createAdTest() {

        AutoRuAddAdPage autoRuAddAdPage = new AutoRuAddAdPage();
        AutoRuMainPage autoRuMainPage = new AutoRuMainPage();


        //Тестовые данные
        String url = "http://www.auto.ru";
        String pathToFile1 = "src/test/resources/front.jpg";
        String pathToFile2 = "src/test/resources/rear.jpeg";

        String mileage = "55000";
        String city = "Омск";
        String address = "ул. Андрианова д.10";
        String phone = "9058662233";
        String name = "Алексей Владимирович";
        String email = "test@test.ru";
        String price = "2000000";

        String regNumber = "с999сс";
        String region = "55";
        String vin = "WAUYP64B01N141245";
        String sts = "78ОТ 757744";
        String description = "Машина огонь!";


        //Открываем сайт
        open(url);


        //Нажимаем кнопку "Продать"
        autoRuMainPage.$addAdButton.click();


        //Выбираем марку, модель и год выпуска
        autoRuAddAdPage.$company.click();
        autoRuAddAdPage.$model.click();
        autoRuAddAdPage.$year.click();


        //Ждем когда появится форма и выбираем правый руль и поколение
        autoRuAddAdPage.$wheelOnTheRight.waitUntil(visible, 30000);
        autoRuAddAdPage.$wheelOnTheRight.click();
        autoRuAddAdPage.$generation.click();


        //Кликаем по кнопке "Бензин" и устанавливаем чекбокс ГБО
        autoRuAddAdPage.$benzinEngine.click();
        autoRuAddAdPage.$gbo.click();


        //Кликаем по кнопкам "Полный" привод, "Автоматическая" КПП и модификация в 407 лс
        autoRuAddAdPage.$allWheelDrive.click();
        autoRuAddAdPage.$automaticGearbox.click();
        autoRuAddAdPage.$modification407Power.click();



        //Делаем поле для загрузки файлов доступным
        executeJavaScript("$('.photos-add__input').attr('style', 'display: block;');");


        //Выбираем первый файл, ждем загрузки и подтверждаем. Тоже самое для второго файла
        autoRuAddAdPage.$photo.uploadFile(new File(pathToFile1));
        autoRuAddAdPage.$modalDoneButton.waitUntil(visible, 30000);
        autoRuAddAdPage.$modalDoneButton.click();
        autoRuAddAdPage.$photo.uploadFile(new File(pathToFile2));
        autoRuAddAdPage.$modalDoneButton.waitUntil(visible, 30000);
        autoRuAddAdPage.$modalDoneButton.click();


        //Кликаем на синий цвет, вводим пробег, устанавливаем чекбоксы битый и нерастаможенный
        autoRuAddAdPage.$colorBlue.click();
        autoRuAddAdPage.$run.sendKeys(mileage);
        autoRuAddAdPage.$crashed.click();
        autoRuAddAdPage.$custom.click();


        //Вводим город, адрес, номер телефона, имя и email
        autoRuAddAdPage.$city.sendKeys(city);
        autoRuAddAdPage.$address.sendKeys(address);
        autoRuAddAdPage.$phone.sendKeys(phone);
        autoRuAddAdPage.$name.sendKeys(name);
        autoRuAddAdPage.$email.sendKeys(email);


        //Вводим цену и указываем возможность обмена
        autoRuAddAdPage.$price.sendKeys(price);
        autoRuAddAdPage.$exchange.click();


        //Выбираем доллар
        autoRuAddAdPage.$currency.click();
        int i;
        for (i=0; i<1; i++) {
            autoRuAddAdPage.$currency.sendKeys(DOWN);
        }

        autoRuAddAdPage.$currency.pressEnter();


        //Указываем дубликат ПТС, второго владельца, выбираем время покупки авто и устанавливаем чекбокс гарантии
        autoRuAddAdPage.$duplicate.click();
        autoRuAddAdPage.$secondOwner.click();


        //Выбираем год покупки авто
        autoRuAddAdPage.$buyYear.click();

        for (i=0; i<8; i++) {
            autoRuAddAdPage.$buyYear.sendKeys(DOWN);
        }

        autoRuAddAdPage.$buyYear.pressEnter();


        //Выбираем месяц покупки авто
        autoRuAddAdPage.$buyMonth.click();

        for (i=0; i<7; i++) {
            autoRuAddAdPage.$buyMonth.sendKeys(DOWN);
        }

        autoRuAddAdPage.$buyMonth.pressEnter();


        //Вводим ГРЗ, VIN и СТС
        autoRuAddAdPage.$regNumber.sendKeys(regNumber);
        autoRuAddAdPage.$region.sendKeys(region);
        autoRuAddAdPage.$vin.sendKeys(vin);
        autoRuAddAdPage.$sts.sendKeys(sts);


        //Указываем максимальную комплектацию и выбираем размер колес
        autoRuAddAdPage.$farsh.click();
        autoRuAddAdPage.$wheels.click();

        for (i=0; i<6; i++) {
            autoRuAddAdPage.$wheels.sendKeys(DOWN);
        }

        autoRuAddAdPage.$wheels.pressEnter();


        //Вводим описание
        autoRuAddAdPage.$description.sendKeys(description);


        //Выбираем опцию "Обычная продажа"
        autoRuAddAdPage.$usualSale.click();


        //И не нажимаем кнопку "Разместить"
        //$submitForm.click();


        //Подождем 15 секунд чтобы убедиться, что все заполнено
        Selenide.sleep(15000);
    }

}
