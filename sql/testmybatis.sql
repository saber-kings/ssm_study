/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : testmybatis

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/05/2020 01:50:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lzf
-- ----------------------------
DROP TABLE IF EXISTS `lzf`;
CREATE TABLE `lzf`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '密码',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(10) NULL DEFAULT NULL COMMENT '年龄',
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '性别，1男性，2女性',
  `birthday` date NULL DEFAULT NULL COMMENT '出生日期',
  `created` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`user_name`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lzf
-- ----------------------------
INSERT INTO `lzf` VALUES (1, 'Saber', 'saber_king', '阿尔托莉雅·潘德拉贡', 16, 2, '2004-12-30', '2020-03-11 17:33:20', '2020-03-11 17:33:22');
INSERT INTO `lzf` VALUES (2, 'Archer', 'hero_king', '吉尔伽美什', 20, 1, '2020-01-01', '2020-03-11 17:36:42', '2020-03-11 17:36:44');
INSERT INTO `lzf` VALUES (4, 'Rider', 'conquer_king', '伊斯坎达尔', 40, 1, '1980-07-20', '2020-03-11 17:40:03', '2020-03-11 17:40:05');
INSERT INTO `lzf` VALUES (5, 'Lancer', 'glorious_appearance', '迪尔姆德·奥迪那', 30, 1, '1990-07-18', '2020-03-11 17:43:37', '2020-03-11 17:43:39');
INSERT INTO `lzf` VALUES (6, 'Berserker', 'knight_on_the_lake', '兰斯洛特', 35, 1, '1985-10-03', '2020-03-11 17:47:48', '2020-03-11 17:47:50');
INSERT INTO `lzf` VALUES (7, 'Caster', 'blue_beard', '吉尔·德·雷', 36, 1, '1984-09-10', '2020-03-11 17:49:13', '2020-03-11 17:49:15');

SET FOREIGN_KEY_CHECKS = 1;
