/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : day06_db

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/05/2020 01:48:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `order_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  PRIMARY KEY (`oid`) USING BTREE,
  INDEX `FK_orders_1`(`user_id`) USING BTREE,
  CONSTRAINT `FK_orders_1` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES (1, 1, '20200221001');
INSERT INTO `tb_order` VALUES (2, 2, '20200221002');
INSERT INTO `tb_order` VALUES (3, 1, '20200221003');

-- ----------------------------
-- Table structure for tb_orderitem
-- ----------------------------
DROP TABLE IF EXISTS `tb_orderitem`;
CREATE TABLE `tb_orderitem`  (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(32) NULL DEFAULT NULL COMMENT '订单号',
  `product_id` int(32) NULL DEFAULT NULL COMMENT '商品id',
  `total_price` double(20, 0) NULL DEFAULT NULL COMMENT '商品总价',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`item_id`) USING BTREE,
  INDEX `FK_orderdetail_1`(`order_id`) USING BTREE,
  INDEX `FK_orderdetail_2`(`product_id`) USING BTREE,
  CONSTRAINT `FK_orderdetail_1` FOREIGN KEY (`order_id`) REFERENCES `tb_order` (`oid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_orderdetail_2` FOREIGN KEY (`product_id`) REFERENCES `tb_product` (`pid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_orderitem
-- ----------------------------
INSERT INTO `tb_orderitem` VALUES (1, 1, 1, 5288, 1);
INSERT INTO `tb_orderitem` VALUES (2, 1, 2, 6288, 1);
INSERT INTO `tb_orderitem` VALUES (3, 2, 2, 6288, 1);
INSERT INTO `tb_orderitem` VALUES (4, 3, 1, 5288, 1);

-- ----------------------------
-- Table structure for tb_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product`  (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
  `price` float(6, 1) NOT NULL COMMENT '商品价格',
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品描述',
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_product
-- ----------------------------
INSERT INTO `tb_product` VALUES (1, '辟邪剑谱', 5288.0, '欲练此功,... ...');
INSERT INTO `tb_product` VALUES (2, '葵花宝典', 6288.0, '这是一部毁人的千古奇书,但每个人都对它爱不释手!');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'dongfangbubai', '123456', '东方不败', 30, 1, '1988-08-08', '2020-02-19 16:56:04', '2020-02-21 11:24:59');
INSERT INTO `tb_user` VALUES (2, 'fengqingyang', '123456', '风清扬', 21, 2, '1990-01-01', '2020-02-19 16:56:04', '2020-02-19 16:56:04');
INSERT INTO `tb_user` VALUES (3, 'linghuchong', '123456', '令狐冲', 22, 2, '2000-01-01', '2020-02-19 16:56:04', '2020-02-19 16:56:04');
INSERT INTO `tb_user` VALUES (4, 'linpingzhi', '123456', '林平之', 20, 1, '2000-09-01', '2020-02-19 16:56:04', '2020-02-19 16:56:04');
INSERT INTO `tb_user` VALUES (5, 'renwoxing', '123456', '任我行', 28, 1, '1998-01-01', '2020-02-19 16:56:04', '2020-02-19 16:56:04');
INSERT INTO `tb_user` VALUES (6, 'tianboguang', '123456', '田伯光', 23, 1, '1999-08-08', '2020-02-20 11:41:15', '2020-02-20 11:41:15');

SET FOREIGN_KEY_CHECKS = 1;
