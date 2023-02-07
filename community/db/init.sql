# DB 생성
DROP DATABASE IF EXISTS community;
CREATE DATABASE community;
USE community;

# 게시물 테이블 생성
CREATE TABLE post (
                         id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
                         PRIMARY KEY(id),
                         createDate DATETIME NOT NULL,
                         modifyDate DATETIME NOT NULL,
                         `title` CHAR(100) NOT NULL,
                         body LONGTEXT NOT NULL
);