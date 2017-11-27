package com.janusresearch.genoaModelTool.fileType;

import com.intellij.lang.xml.XMLLanguage;

class GenoaLanguage extends XMLLanguage {
    static final GenoaLanguage INSTANCE = new GenoaLanguage();

    private GenoaLanguage() {
        super(XMLLanguage.INSTANCE, "Genoa", "application/xml", "text/xml");
    }
}