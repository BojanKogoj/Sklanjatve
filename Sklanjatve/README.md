Sklanjatve
=======
Podpiraa: sekunda, minuta, ura, dan, mesec, leto
Primer delovanja: https://play.google.com/store/apps/details?id=edu.vreme
Primer uporabe:

* Sklanjatve.sklanjaj(60) //1 minuta
* Sklanjatve.sklanjaj(2, Sklanjatve.SEKUNDA) //2 sekundi
* Sklanjatve.sklanjaj(15, Sklanjatve.LETO) //15 let

**Veè primerov uporabe je v test/TestirajSklanjatve.java**

-SEKUNDA: 1, 2, 3, 59

* pred eno sekundo
* pred 2 sekundama
* pred 3 sekundami
* pred 59 sekundami

-MINUTA: 1, 2, 3

* pred eno minuto
* pred 2 minutama
* pred 3 minutami

-PRED ENO URO

* pred eno uro

-URA: 1, 2, 3

* pred 1 uro
* pred 2 urama
* pred 3 urami

-VCERAJ

* vèeraj

-DAN: 2, 3

* pred 2 dnevoma
* pred 3 dnevi

-MESEC: 1, 2, 3

* pred enim mescem
* pred 2 mesecema
* pred 3 meseci

-LETO: 1, 2, 3

* pred enim letom
* pred 2 letoma
* pred 3 leti


Test: 1, 2, 3, 59

* pred 1 sekundo
* pred 2 sekundama
* pred 3 sekundami
* pred 59 sekundami

Test: 1, 2, 3, 59

* pred 1 minuto
* pred 2 minutama
* pred 3 minutami
* pred 59 minutami

Test: 1, 2, 3, 59

* pred 1 uro
* pred 2 urama
* pred 3 urami
* pred 59 urami

Test: 1, 2, 3, 30

* pred 1 dnem
* pred 2 dnevoma
* pred 3 dnevi
* pred 30 dnevi

Test: 1, 2, 3, 11

* pred 1 mesecem
* pred 2 mesecema
* pred 3 meseci
* pred 11 meseci

Test: 1, 2, 3, 15

* pred 1 letom
* pred 2 letoma
* pred 3 leti
* pred 15 leti
