package com.bilgehw.hw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//
//Req 1 : Sistemde programlama dilleri tutulmalıdır.
//
//Programlama dillerini(C#,Java,Python) ekleyebilecek, silebilecek, güncelleyebilecek, listeleyebilecek, id ile getirebilecek kodları yazınız.
// ekledi sildi listeledi
// Bunu tamamen in memory yapınız. tamamdır
//İsimler tekrar edemez. tamamdır
//Programlama dili boş geçilemez. (Validation kullanmadan, kod yazarak algoritmik çözünüz) tamamdır

@SpringBootApplication
public class Hw2Application {
	public static void main(String[] args) {
		SpringApplication.run(Hw2Application.class, args);
	}
}
