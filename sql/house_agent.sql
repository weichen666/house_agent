/*
Navicat MySQL Data Transfer

Source Server         : template
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : house_agent

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-03-14 22:49:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `h_buliding`
-- ----------------------------
DROP TABLE IF EXISTS `h_buliding`;
CREATE TABLE `h_buliding` (
  `b_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_title` varchar(255) NOT NULL COMMENT '标题',
  `b_content` varchar(1000) NOT NULL,
  `b_price` double(10,2) NOT NULL,
  `b_size` double(10,2) NOT NULL,
  `b_location` varchar(300) NOT NULL COMMENT '地址',
  `b_type` varchar(10) NOT NULL COMMENT '出租，出售',
  `b_createtime` datetime NOT NULL,
  `b_updatetime` datetime DEFAULT NULL,
  `u_id` int(11) DEFAULT NULL,
  `b_photo` varchar(200) DEFAULT NULL COMMENT '图片集地址',
  `b_flag` int(1) DEFAULT '1',
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of h_buliding
-- ----------------------------

-- ----------------------------
-- Table structure for `h_message`
-- ----------------------------
DROP TABLE IF EXISTS `h_message`;
CREATE TABLE `h_message` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_content` varchar(1000) NOT NULL,
  `u_id` int(11) NOT NULL,
  `m_createtime` datetime NOT NULL,
  `m_flag` int(11) DEFAULT '1' COMMENT '是否有效',
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of h_message
-- ----------------------------

-- ----------------------------
-- Table structure for `h_system`
-- ----------------------------
DROP TABLE IF EXISTS `h_system`;
CREATE TABLE `h_system` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_code` varchar(100) NOT NULL,
  `s_content` varchar(200) NOT NULL,
  `s_flag` int(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of h_system
-- ----------------------------

-- ----------------------------
-- Table structure for `h_user`
-- ----------------------------
DROP TABLE IF EXISTS `h_user`;
CREATE TABLE `h_user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_username` varchar(100) NOT NULL,
  `u_password` varchar(100) NOT NULL,
  `u_type` varchar(20) NOT NULL COMMENT '用户、管理员',
  `u_sex` varchar(255) DEFAULT NULL,
  `u_birth` date DEFAULT NULL,
  `u_phone` varchar(11) NOT NULL,
  `u_flag` int(11) DEFAULT NULL COMMENT '是否有效',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of h_user
-- ----------------------------
