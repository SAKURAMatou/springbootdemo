package com.dl.springbootdemo;

import com.dl.service.OrderService;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import java.io.IOException;

public class DlTypeExcludeFilter extends TypeExcludeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        return metadataReader.getClassMetadata().getClassName().equals(OrderService.class.getName());
//        return super.match(metadataReader, metadataReaderFactory);
    }
}
