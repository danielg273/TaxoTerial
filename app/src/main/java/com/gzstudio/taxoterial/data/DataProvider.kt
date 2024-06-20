package com.gzstudio.taxoterial.data

import com.gzstudio.taxoterial.R

object DataProvider {
    val itemLists = listOf(
        Item(
            parent = null,
            type = "Dominio",
            itemImageId = R.drawable.eukarya,
            name = "Eukarya",
            body = "Es el dominio que incluye a los organismos eucariotas, los cuales tienen células con núcleo definido y orgánulos membranosos. Su metabolismo también es diverso, e incluye fotosíntesis y respiración celular. Los eucariotas se dividen en cuatro reinos.",
            child = "Reino",
            ),
        Item(
            parent = null,
            type = "Dominio",
            itemImageId = R.drawable.arquea,
            name = "Archaea",
            body = "También está compuesto por organismos unicelulares procariotas, pero presenta diferencias significativas con las bacterias en la estructura de la membrana celular, los ribosomas y otros componentes celulares. Su metabolismo también es diverso, incluyendo la capacidad de vivir en ambientes extremos como aguas termales, géiseres y salinas.",
            child = "Reino",
            ),

        Item(
            parent = null,
            type = "Dominio",
            itemImageId = R.drawable.bacteria,
            name = "Bacteria",
            body = "Es el dominio más antiguo y diverso, compuesto por organismos unicelulares procariotas. Las bacterias carecen de núcleo definido y orgánulos membranosos, y su material genético se encuentra en un único cromosoma circular. Su metabolismo es muy diverso, incluyendo fotosíntesis, quimiosíntesis y fermentación. Las bacterias se encuentran en una gran variedad de hábitats, desde el suelo y el agua hasta el interior de otros organismos.",
            child = "Reino",
            ),

        // AQUI EMPIEZAN LOS REINOS
        Item(
            parent = "Eukarya",
            type = "Reino",
            itemImageId = R.drawable.plantae,
            name = "Plantae",
            body = "Incluye a las plantas, las cuales son organismos eucariotas multicelulares fotosintéticos",
            child = "Filo",
        ),

        Item(
            parent = "Eukarya",
            type = "Reino",
            itemImageId = R.drawable.fungi,
            name = "Fungi",
            body = "Incluye a los hongos, los cuales son multicelulares y se caracterizan por su pared celular de quitina y su modo de nutrición heterótrofo por descomposición.",
            child = "Filo",
        ),

        Item(
            parent = "Eukarya",
            type = "Reino",
            itemImageId = R.drawable.animalia,
            name = "Animalia",
            body = "Incluye a los animales, caracterizados por su capacidad de locomoción, nutrición heterótrofa y desarrollo embrionario.",
            child = "Filo",
        ),

        Item(
            parent = "Eukarya",
            type = "Reino",
            itemImageId = R.drawable.protista,
            name = "Protista",
            body = "Incluye a los organismos eucariotas unicelulares o multicelulares simples. Pueden ser fotosintéticos, o heterótrofos.",
            child = "Filo",
        ),

        //Filos de plantae
        Item(
            parent = "Plantae",
            type = "Filo",
            name = "Briofitas",
            body = "Son plantas no vasculares que habitan en ambientes húmedos. Se caracterizan por su pequeño tamaño y su falta de sistema vascular. Las briofitas incluyen musgos, antoceros y hepáticas.",
            child = "Clase",
        ),
        Item(
            parent = "Plantae",
            type = "Filo",
            name = "Pteridofitas",
            body = "Son plantas vasculares que presentan un sistema de transporte de agua y nutrientes. Se reproducen por esporas y no tienen flores ni semillas. Las pteridofitas incluyen helechos, equisetos y licopodios.",
            child = "Clase",
        ),
        Item(
            parent = "Plantae",
            type = "Filo",
            name = "Gimnospermas",
            body = "Son plantas vasculares que producen semillas desnudas, sin fruto que las envuelva. Las gimnospermas incluyen coníferas (pinos, abetos, cedros) y ginkgo biloba.",
            child = "Clase",
        ),
        Item(
            parent = "Plantae",
            type = "Filo",
            name = "Angiospermas",
            body = "Son las plantas con flores y frutos que contienen las semillas. Las angiospermas son el grupo más diverso del Reino Plantae y comprenden la mayoría de las plantas que conocemos, como árboles, arbustos, hierbas, flores y frutas.",
            child = "Clase",
        ),
        Item(
            parent = "Plantae",
            type = "Filo",
            name = "Algas",
            body = "Son un grupo muy diverso de organismos fotosintéticos que pueden ser unicelulares o multicelulares. Las algas habitan en ambientes acuáticos, tanto marinos como dulceacuícolas. Algunas algas son importantes productores primarios en los ecosistemas acuáticos.",
            child = "Clase",
        ),




//        Item(
//            parent = "Plantae", // Este se queda igual
//            type = "Filo", // Se queda igual
//            itemImageId = null, // Se queda igual
//            name = " ", // Pones el nombre del filo entre las comillas
//            body = " ", // Una breve descripcion
//            child = "Clase", // Se queda igual
//        ),

    )

}

