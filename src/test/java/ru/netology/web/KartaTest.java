package ru.netology.web;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class KartaTest {
    @Test
    void shouldMakeConfirm() {
        Selenide.open("http://localhost:9999/");
        SelenideElement form = $("[data-test-id=order-success]");

        $("[name='name']").setValue("Андрей Иванов");
        $("[name='phone']").setValue("+79179129317");
        $("[data-test-id=agreement]").click();
        $$("button").find(exactText("Продолжить")).click();
        //$("order-success").shouldHave(exactText("Ваша заявка успешно отправленна! Наш менеджер свяжется с вами в ближайшее время."));

    }

}