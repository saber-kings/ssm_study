/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : test_mybatis

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/05/2020 01:49:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账户名称',
  `salt` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '加密盐值',
  `password` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码密文',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `dept_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门id',
  `real_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实名称',
  `nick_name` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱(唯一)',
  `status` tinyint(4) NOT NULL DEFAULT 1 COMMENT '账户状态(1.正常 2.锁定)',
  `sex` tinyint(4) NULL DEFAULT NULL COMMENT '性别(1.男 2.女)',
  `deleted` tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否删除(0未删除；1已删除)',
  `create_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `update_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `create_where` tinyint(4) NULL DEFAULT NULL COMMENT '创建来源(1.web 2.android 3.ios )',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('5743c9d5-9038-492a-aef9-d372e937a4d0', 'dev123', '18322a841bea425d95c1', '5d7c5f8f3344529ec41cfed3d8ab17dd', '13878828969', NULL, NULL, NULL, '163@.com', 1, 1, 0, NULL, NULL, 1, '2020-03-20 22:10:38', NULL);
INSERT INTO `sys_user` VALUES ('65956c52-72cd-4e3d-8a31-7fa6673086fb', 'dev111', '53237ffb5fde43a89c30', 'ea924181fd75fa62aa60a881f5fa6812', '13573598926', NULL, NULL, NULL, NULL, 1, NULL, 0, NULL, NULL, NULL, '2020-03-22 00:33:35', NULL);
INSERT INTO `sys_user` VALUES ('9a26f5f1-cbd2-473d-82db-1d6dcf4598f8', 'admin', '324ce32d86224b00a02b', 'ac7e435db19997a46e3b390e69cb148b', '13888888888', '24f41c71-5a95-4ef4-9493-174574f3b0c5', NULL, NULL, 'yingxue@163.com', 1, NULL, 0, NULL, NULL, 3, '2019-09-22 19:38:05', NULL);
INSERT INTO `sys_user` VALUES ('de89c4ac-8d41-4354-9ddd-b71849d3d409', 'dev', '85362784d12149d6a1d8', 'c559bcbd8abc58bba521a95cff650609', '13878828996', NULL, NULL, NULL, '163@.com', 1, 1, 0, NULL, NULL, 1, '2020-03-20 21:29:37', '2020-03-20 22:04:54');

SET FOREIGN_KEY_CHECKS = 1;
