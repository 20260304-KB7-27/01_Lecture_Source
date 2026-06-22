package org.scoula.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class UploadFiles {

    public static String upload(String baseDir, MultipartFile part) throws IOException {


        // 기본 디렉토리 확인, 없으면 생성
        File base = new File(baseDir);
        if(!base.exists()) {
            base.mkdir(); // 존재하지 않는 디렉토리 생성
        }

        // 원본 파일명 가져오기
        String filename = part.getOriginalFilename();

        // 저장할 파일 객체 생성
        File dest = new File(baseDir, UploadFileName.getUniqueName(filename));

        part.transferTo(dest); // 업로드된 파일을 실제 서버 디렉토리에 저장 (물리파일생성)

        return dest.getPath(); // 저장된 파일 경로
    }
}
