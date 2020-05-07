/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : ssmdemo

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/05/2020 01:49:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` tinyint(4) NULL DEFAULT NULL,
  `born_date` date NULL DEFAULT NULL,
  `head_img` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'will', 17, '2019-09-17', '|ू･ω･` )');
INSERT INTO `t_user` VALUES (2, 'lucy', 18, '2019-09-17', '(✪ω✪)');
INSERT INTO `t_user` VALUES (3, 'Hadden', 29, '2019-09-17', 'o(╥﹏╥)o');
INSERT INTO `t_user` VALUES (4, '叶孤城', 11, '2019-09-17', 'o(´^｀)o');
INSERT INTO `t_user` VALUES (7, '马明顺', 18, '1998-06-06', '(^_−)☆');
INSERT INTO `t_user` VALUES (9, 'Saber', 25, '1994-11-24', '﻿ε≡٩(๑>₃<)۶ 一心向学');
INSERT INTO `t_user` VALUES (10, '栾兆飞', 21, '1998-11-19', 'Σσ(・Д・；)我我我什么都没做!!!');

SET FOREIGN_KEY_CHECKS = 1;
