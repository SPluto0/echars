/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : jpademo

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 14/11/2019 21:49:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for echars
-- ----------------------------
DROP TABLE IF EXISTS `echars`;
CREATE TABLE `echars`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `number` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of echars
-- ----------------------------
INSERT INTO `echars` VALUES (1, '冰箱', 1000);
INSERT INTO `echars` VALUES (2, '洗衣机', 1045);
INSERT INTO `echars` VALUES (3, '电视机', 2000);
INSERT INTO `echars` VALUES (4, '手机', 1564);
INSERT INTO `echars` VALUES (5, '油烟机', 850);

SET FOREIGN_KEY_CHECKS = 1;
