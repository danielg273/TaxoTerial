package com.gzstudio.taxoterial.data

import com.gzstudio.taxoterial.R

object DataProvider {
    val dominioList = listOf(
        Dominio(
            id = 1,
            dominioImageId = R.drawable.trav,
            title = "Eukarya",
            body = "Eukaryota o Eukarya es el dominio (o imperio) que incluye los organismos formados por células con núcleo verdadero. La castellanización adecuada del término es eucariota o eucarionte.",
            ),
        Dominio(
            id = 2,
            dominioImageId = R.drawable.anakin,
            title = "Archaea",
            body = "Gran grupo de microorganismos procariotas unicelulares que, al igual que las bacterias, no presentan núcleo (pero sí nucleolo) ni orgánulos membranosos internos, pero son fundamentalmente diferentes a estas, de tal manera que conforman su propio dominio o reino.",
            ),

        Dominio(
            id = 3,
            dominioImageId = R.drawable.minecraft,
            title = "Bacteria",
            body = "Gran grupo de microorganismos procariotas unicelulares que, al igual que las bacterias, no presentan núcleo (pero sí nucleolo) ni orgánulos membranosos internos, pero son fundamentalmente diferentes a estas, de tal manera que conforman su propio dominio o reino.",
            )

    )

    val reinoList = listOf(
        Reino(
            idDominio = 1,
            reinoImageId = R.drawable.trav,
            title = "Plantae",
            body = "Eukaryota o Eukarya es el dominio (o imperio) que incluye los organismos formados por células con núcleo verdadero.",
        ),

        Reino(
            idDominio = 1,
            reinoImageId = R.drawable.trav,
            title = "Fungi",
            body = "Eukaryota o Eukarya es el dominio (o imperio) que incluye los organismos formados por células con núcleo verdadero.",
        ),

        Reino(
            idDominio = 1,
            reinoImageId = R.drawable.trav,
            title = "Eukarya",
            body = "Eukaryota o Eukarya es el dominio (o imperio) que incluye los organismos formados por células con núcleo verdadero.",
        ),

        Reino(
            idDominio = 1,
            reinoImageId = R.drawable.trav,
            title = "Eukarya",
            body = "Eukaryota o Eukarya es el dominio (o imperio) que incluye los organismos formados por células con núcleo verdadero.",
        ),

    )
}