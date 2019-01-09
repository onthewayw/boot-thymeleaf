/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : boot-test

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-01-09 18:54:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(50) NOT NULL AUTO_INCREMENT COMMENT '主键 员工id',
  `dept_id` bigint(50) DEFAULT NULL COMMENT '员工所属部门id',
  `name` varchar(255) DEFAULT NULL COMMENT '员工名字',
  `card_no` varchar(255) DEFAULT NULL COMMENT '员工卡号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('3', '2', '12', '12');
