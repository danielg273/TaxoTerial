package com.gzstudio.taxoterial.data

import com.gzstudio.taxoterial.R

object DataProvider {
    val dominioList = listOf(
        Dominio(
            id = 1,
            dominioImageId = R.drawable.eukarya,
            title = "Eukarya",
            body = "Es el dominio que incluye a los organismos eucariotas, los cuales tienen células con núcleo definido y orgánulos membranosos. Su metabolismo también es diverso, e incluye fotosíntesis y respiración celular. Los eucariotas se dividen en cuatro reinos.",
            ),
        Dominio(
            id = 2,
            dominioImageId = R.drawable.arquea,
            title = "Archaea",
            body = "También está compuesto por organismos unicelulares procariotas, pero presenta diferencias significativas con las bacterias en la estructura de la membrana celular, los ribosomas y otros componentes celulares. Su metabolismo también es diverso, incluyendo la capacidad de vivir en ambientes extremos como aguas termales, géiseres y salinas.",
            ),

        Dominio(
            id = 3,
            dominioImageId = R.drawable.bacteria,
            title = "Bacteria",
            body = "Es el dominio más antiguo y diverso, compuesto por organismos unicelulares procariotas. Las bacterias carecen de núcleo definido y orgánulos membranosos, y su material genético se encuentra en un único cromosoma circular. Su metabolismo es muy diverso, incluyendo fotosíntesis, quimiosíntesis y fermentación. Las bacterias se encuentran en una gran variedad de hábitats, desde el suelo y el agua hasta el interior de otros organismos.",
            )

    )

    val reinoList = listOf(
        Reino(
            idDominio = 1,
            reinoImageId = R.drawable.plantae,
            title = "Plantae",
            body = "Incluye a las plantas, las cuales son organismos eucariotas multicelulares fotosintéticos",
        ),

        Reino(
            idDominio = 1,
            reinoImageId = R.drawable.fungi,
            title = "Fungi",
            body = "Incluye a los hongos, los cuales son multicelulares y se caracterizan por su pared celular de quitina y su modo de nutrición heterótrofo por descomposición.",
        ),

        Reino(
            idDominio = 1,
            reinoImageId = R.drawable.animalia,
            title = "Animalia",
            body = "Incluye a los animales, caracterizados por su capacidad de locomoción, nutrición heterótrofa y desarrollo embrionario.",
        ),

        Reino(
            idDominio = 1,
            reinoImageId = R.drawable.protista,
            title = "Protista",
            body = "Incluye a los organismos eucariotas unicelulares o multicelulares simples. Pueden ser fotosintéticos, o heterótrofos.",
        ),

    )
}