package com.example.cvproject.zdjavapol141web.zad9sda.mapper;

import com.example.cvproject.zdjavapol141web.zad9sda.dto.FileDataDto;
import com.example.cvproject.zdjavapol141web.zad9sda.model.FileData;

public class FileDataDtoMapper {
public static FileDataDto map(FileData fileData){
    return FileDataDto
            .builder()
            .content(fileData.getContent())
            .extension(fileData.getExtension())
            .fileName(fileData.getFileName())
            .sizeInKb(fileData.getSizeInKb())
            .build();
}

}
