/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : test02_db

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/05/2020 01:50:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hero
-- ----------------------------
DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `NAME`(`name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hero
-- ----------------------------
INSERT INTO `hero` VALUES (2, 'Archer', 'hero_king', '吉尔伽美什');
INSERT INTO `hero` VALUES (3, 'Rider', 'conquer_king', '伊斯坎达尔');
INSERT INTO `hero` VALUES (4, 'Diarmuid_Ua_Duibhne', 'glorious_appearance', '迪尔姆德·奥迪那');
INSERT INTO `hero` VALUES (5, 'Berserker', 'knight_on_the_lake', '兰斯洛特');
INSERT INTO `hero` VALUES (6, 'Caster', 'blue_beard', '吉尔·德·雷');
INSERT INTO `hero` VALUES (7, 'Assassin', 'hasan_b.sabbah', '哈桑·萨巴赫');
INSERT INTO `hero` VALUES (8, 'Misaka_Mikoto', 'railgun', '御坂美琴');

SET FOREIGN_KEY_CHECKS = 1;
