/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : day05_db

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/05/2020 01:48:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `money` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, '梁山伯', 1000);
INSERT INTO `account` VALUES (2, '祝英台', 1000);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(10) NULL DEFAULT NULL COMMENT '年龄',
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '性别，1男性，2女性',
  `birthday` date NULL DEFAULT NULL COMMENT '出生日期',
  `created` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'qiaofeng', '123456', '乔峰', 30, 1, '1990-08-08', '2019-09-19 16:56:04', '2019-09-21 11:24:59');
INSERT INTO `user` VALUES (2, 'wyy', '123456', '王语嫣', 21, 2, '1999-01-01', '2019-09-19 16:56:04', '2019-09-19 16:56:04');
INSERT INTO `user` VALUES (4, 'jiumozhi', '123456', '鸠摩智', 20, 1, '2000-09-01', '2019-09-19 16:56:04', '2019-09-19 16:56:04');
INSERT INTO `user` VALUES (5, 'duanyu', '123456', '段誉', 20, 1, '2000-01-01', '2019-09-19 16:56:04', '2019-09-19 16:56:04');
INSERT INTO `user` VALUES (6, 'dingchunqiu', '123456', '丁春秋', 40, 1, '1980-08-08', '2019-09-20 11:41:15', '2019-09-20 11:41:15');
INSERT INTO `user` VALUES (7, 'xiaofeng', '123456', '萧峰', 30, 1, '1990-08-08', '2019-09-19 16:56:04', '2019-09-21 11:24:59');
INSERT INTO `user` VALUES (8, 'xys', '123456', '萧远山', 62, 1, '1974-08-09', '2019-09-19 16:56:04', '2019-09-21 11:24:59');
INSERT INTO `user` VALUES (9, 'mrf', '123456', '慕容复', 30, 1, '1990-08-04', '2019-09-19 16:56:04', '2019-09-21 11:24:59');
INSERT INTO `user` VALUES (10, 'mrb', '123456', '慕容博', 60, 1, '1974-08-01', '2019-09-19 16:56:04', '2019-09-21 11:24:59');
INSERT INTO `user` VALUES (11, 'sds', '123456', '扫地僧', 82, 1, '1940-06-08', '2019-09-19 16:56:04', '2019-09-21 11:24:59');

SET FOREIGN_KEY_CHECKS = 1;
