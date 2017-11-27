package com.janusresearch.genoaModelTool.fileType;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.xml.XmlFileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class GenoaFileTypeFactory extends XmlFileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(GenoaFileType.INSTANCE, "genoa");
    }
}
