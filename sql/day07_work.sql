/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : day07_work

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/05/2020 01:49:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, '20200221001', '购买水杯');
INSERT INTO `order` VALUES (2, '20200221002', '购买手机');
INSERT INTO `order` VALUES (3, '20200221003', '购买手办');

-- ----------------------------
-- Table structure for tb_employee
-- ----------------------------
DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee`  (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `card_id` int(11) NOT NULL,
  PRIMARY KEY (`emp_id`) USING BTREE,
  INDEX `card_id`(`card_id`) USING BTREE,
  CONSTRAINT `tb_employee_ibfk_1` FOREIGN KEY (`card_id`) REFERENCES `tb_work_card` (`card_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_employee
-- ----------------------------
INSERT INTO `tb_employee` VALUES (1, '一方通行', 1);
INSERT INTO `tb_employee` VALUES (2, '垣根帝督', 2);
INSERT INTO `tb_employee` VALUES (3, '御坂美琴', 3);

-- ----------------------------
-- Table structure for tb_work_card
-- ----------------------------
DROP TABLE IF EXISTS `tb_work_card`;
CREATE TABLE `tb_work_card`  (
  `card_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`card_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_work_card
-- ----------------------------
INSERT INTO `tb_work_card` VALUES (1);
INSERT INTO `tb_work_card` VALUES (2);
INSERT INTO `tb_work_card` VALUES (3);

SET FOREIGN_KEY_CHECKS = 1;
