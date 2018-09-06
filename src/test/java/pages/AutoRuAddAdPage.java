package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AutoRuAddAdPage {

    //Шаг 1
    public SelenideElement $company = $$("img").findBy(attribute("title", "BMW")).parent();


    //Шаг 2
    public SelenideElement $model = $$(".menu-item.menu-item_theme_islands.models-list__item.i-bem").get(14);


    //Шаг 3
    public SelenideElement $yearsBlock = $(".years-list__controls");
    public SelenideElement $year = $yearsBlock.$$("input").findBy(attribute("value", "2010")).parent();

    public SelenideElement $wheelOnTheRight = $$("input").findBy(Condition.name("wheel")).parent().parent();

    public SelenideElement $generationsForm = $(".generations-list");
    public SelenideElement $generation = $generationsForm.$$("button").first();

    public SelenideElement $enginesForm = $(".engines");
    public SelenideElement $benzinEngine = $enginesForm.$$("input").findBy(attribute("value", "GASOLINE")).parent();
    public SelenideElement $gbo = $enginesForm.$$("input").findBy(Condition.name("gbo")).parent().parent();

    public SelenideElement $drivesForm = $(".drives");
    public SelenideElement $allWheelDrive = $drivesForm.$$("button").first().parent();

    public SelenideElement $gearboxesForm = $(".gearboxes");
    public SelenideElement $automaticGearbox = $gearboxesForm.$$("input").findBy(attribute("value", "AUTOMATIC")).parent();

    public SelenideElement $modificationsForm = $(".modifications-list");
    public SelenideElement $modification407Power = $modificationsForm.$$("input").findBy(attribute("value", "6275113")).parent();


    //Шаг 4
    public SelenideElement $photosListForm = $(".photos-list");
    public SelenideElement $photo = $photosListForm.$(".photos-add__input");
    public SelenideElement $modalFormUpload = $("div.inner.inner_bottom-fixed.clearfix.i-bem");
    public SelenideElement $modalDoneButton = $modalFormUpload.$(".photos-list__done-button");

    public SelenideElement $colorForm = $(".color-selector");
    public SelenideElement $colorBlue = $colorForm.$$("input").findBy(attribute("value", "0433FF")).parent().parent();

    public SelenideElement $runForm = $(".run");
    public SelenideElement $run = $runForm.$$("input").findBy(Condition.name("run"));
    public SelenideElement $crashed = $runForm.$$("input").findBy(Condition.name("state")).parent().parent();
    public SelenideElement $custom = $runForm.$$("input").findBy(Condition.name("custom")).parent().parent();

    public SelenideElement $addressForm = $(".address");
    public SelenideElement $city = $addressForm.$(".input__control");
    public SelenideElement $address = $addressForm.$$("input").findBy(Condition.name("address"));

    public SelenideElement $phoneForm = $(".phone-item");
    public SelenideElement $phone = $phoneForm.$(".input__control");

    public SelenideElement $contactsForm = $(".contacts");
    public SelenideElement $name = $contactsForm.$$("input").findBy(Condition.name("username"));
    public SelenideElement $email = $contactsForm.$$("input").findBy(Condition.name("useremail"));

    public SelenideElement $priceForm = $(".price");
    public SelenideElement $price = $priceForm.$$("input").findBy(Condition.name("price"));
    public SelenideElement $currency = $priceForm.$$("button").findBy(attribute("role", "listbox"));
    public SelenideElement $exchange = $priceForm.$$("input").findBy(Condition.name("exchange")).parent().parent();

    public SelenideElement $ptsForm = $(".pts");
    public SelenideElement $duplicate = $ptsForm.$$("input").findBy(attribute("value", "2")).parent();

    public SelenideElement $ownersForm = $(".owners");
    public SelenideElement $secondOwner = $ownersForm.$$("input").findBy(attribute("value", "2")).parent();

    public SelenideElement $buyTimeForm = $(".purchase-container");
    public SelenideElement $buyYear = $buyTimeForm.$$(".section-cell__half").first().$("span.icon.select__tick");
    public SelenideElement $buyMonth = $buyTimeForm.$$(".section-cell__half").get(1).$("span.icon.select__tick");

    public SelenideElement $autoDataForm = $(".autocode");
    public SelenideElement $regNumber = $autoDataForm.$(".gos-number__series-number").$("input");
    public SelenideElement $region = $autoDataForm.$(".gos-number__region").$("input");
    public SelenideElement $vin = $autoDataForm.$$("input").findBy(Condition.name("vin"));
    public SelenideElement $sts = $autoDataForm.$$("input").findBy(Condition.name("sts"));

    public SelenideElement $extrasForm = $(".extras");
    public SelenideElement $farsh = $extrasForm.$$("input").findBy(attribute("value", "6275090_7151419_6275113")).parent();
    public SelenideElement $wheels = $extrasForm.$("span.icon.select__tick");
    public SelenideElement $description = $extrasForm.$("textarea");

    public SelenideElement $publishForm = $(".vas-container");
    public SelenideElement $usualSale = $publishForm.$(".vas-pack__free-title");

    public SelenideElement $submitForm = $(".vas-submit__submit-text");
}
