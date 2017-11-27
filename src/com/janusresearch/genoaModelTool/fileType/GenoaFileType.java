package com.janusresearch.genoaModelTool.fileType;

import com.intellij.openapi.fileTypes.LanguageFileType;
import icons.GenoaIcons;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class GenoaFileType extends LanguageFileType {
    static final LanguageFileType INSTANCE = new GenoaFileType();
    @NonNls private static final String DEFAULT_EXTENSION = "genoa";

    private GenoaFileType() {
        super(GenoaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Genoa";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Genoa language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return GenoaIcons.Objects.GenoaModelFile;
    }
}
