/*
 Navicat Premium Data Transfer

 Source Server         : 本地MySQL
 Source Server Type    : MySQL
 Source Server Version : 50520
 Source Host           : localhost:3306
 Source Schema         : studentmanage

 Target Server Type    : MySQL
 Target Server Version : 50520
 File Encoding         : 65001

 Date: 07/06/2021 21:30:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for boss
-- ----------------------------
DROP TABLE IF EXISTS `boss`;
CREATE TABLE `boss`  (
  `bossId` int(11) NOT NULL,
  `bossName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bossGender` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `bossEmail` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`bossId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of boss
-- ----------------------------
INSERT INTO `boss` VALUES (1, 'Tom', '男', 'Tom@gmail.com');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `deptId` int(11) NOT NULL,
  `managerId` int(11) NOT NULL,
  `deptName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`deptId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, 1, '研发部');
INSERT INTO `department` VALUES (2, 2, '需求部');
INSERT INTO `department` VALUES (3, 3, '调研部');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `groupId` int(11) NOT NULL,
  `empId` int(11) NOT NULL,
  `empName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `gender` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`empId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 1, 'AD', '男', 'AD@email.com');
INSERT INTO `employee` VALUES (2, 2, 'Ad', '男', 'Ad@email.com');
INSERT INTO `employee` VALUES (3, 3, 'aS', '男', 'aS@email.com');
INSERT INTO `employee` VALUES (4, 4, 'AS', '男', 'AS@email.com');
INSERT INTO `employee` VALUES (5, 5, 'Zx', '男', 'Zx@email.com');
INSERT INTO `employee` VALUES (6, 6, 'V', '男', 'V@email.com');
INSERT INTO `employee` VALUES (7, 7, 'Zx', '男', 'Zx@email.com');
INSERT INTO `employee` VALUES (8, 8, 'AS', '男', 'AS@email.com');
INSERT INTO `employee` VALUES (9, 9, 'ZXC', '女', 'ZXC@email.com');
INSERT INTO `employee` VALUES (10, 10, 'QW', '女', 'QW@email.com');
INSERT INTO `employee` VALUES (11, 11, 'VX', '女', 'VX@email.com');
INSERT INTO `employee` VALUES (12, 12, 'GAS', '女', 'GAS@email.com');
INSERT INTO `employee` VALUES (13, 13, 'BFD', '女', 'BFD@email.com');
INSERT INTO `employee` VALUES (14, 14, 'BDas', '女', 'BDas@email.com');
INSERT INTO `employee` VALUES (15, 15, 'BD', '女', 'BD@email.com');
INSERT INTO `employee` VALUES (16, 16, 'VXz', '女', 'VXz@email.com');
INSERT INTO `employee` VALUES (17, 17, 'VAS', '女', 'VAS@email.com');
INSERT INTO `employee` VALUES (18, 18, 'QWFS', '女', 'QWFS@email.com');

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group`  (
  `groupId` int(11) NOT NULL,
  `leaderId` int(11) NOT NULL,
  `deptId` int(11) NOT NULL,
  `managerId` int(11) NOT NULL,
  PRIMARY KEY (`groupId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of group
-- ----------------------------
INSERT INTO `group` VALUES (1, 1, 1, 1);
INSERT INTO `group` VALUES (2, 2, 1, 1);
INSERT INTO `group` VALUES (3, 3, 1, 1);
INSERT INTO `group` VALUES (4, 4, 2, 2);
INSERT INTO `group` VALUES (5, 5, 2, 2);
INSERT INTO `group` VALUES (6, 6, 2, 2);
INSERT INTO `group` VALUES (7, 7, 3, 3);
INSERT INTO `group` VALUES (8, 8, 3, 3);
INSERT INTO `group` VALUES (9, 9, 3, 3);

-- ----------------------------
-- Table structure for leader
-- ----------------------------
DROP TABLE IF EXISTS `leader`;
CREATE TABLE `leader`  (
  `groupId` int(11) NOT NULL,
  `leaderId` int(11) NOT NULL,
  `leaderName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `leaderGender` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `leaderEmail` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`leaderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of leader
-- ----------------------------
INSERT INTO `leader` VALUES (1, 1, 'as', '男', 'as@email.com');
INSERT INTO `leader` VALUES (2, 2, 'Av', '男', 'Av@email.com');
INSERT INTO `leader` VALUES (3, 3, 'Ty', '女', 'Ty@email.com');
INSERT INTO `leader` VALUES (4, 4, 'WW', '女', 'WW@email.com');
INSERT INTO `leader` VALUES (5, 5, 'CD', '男', 'CD@email.com');
INSERT INTO `leader` VALUES (6, 6, 'FA', '女', 'FA@email.com');
INSERT INTO `leader` VALUES (7, 7, 'Fc', '男', 'Fc@email.com');
INSERT INTO `leader` VALUES (8, 8, 'YU', '女', 'YU@email.com');
INSERT INTO `leader` VALUES (9, 9, 'KK', '女', 'KK@email.com');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login`  (
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('admin', 'Fjz_Kuroko@163.com', '123456');

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `deptId` int(11) NOT NULL,
  `managerId` int(11) NOT NULL,
  `managerName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `managerGender` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `managerEmail` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`managerId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES (1, 1, 'AK', '男', 'Ak@email.com');
INSERT INTO `manager` VALUES (2, 2, 'M3', '女', 'M3@email.com');
INSERT INTO `manager` VALUES (3, 3, 'Puff', '女', 'Puff@gamil.com');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int(11) NOT NULL,
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sex` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `age` tinyint(4) DEFAULT NULL,
  `insitute` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `majo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `grade` int(4) DEFAULT NULL,
  `clazz` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1005, '测试1', '女', 20, '国际商学院', '国际贸易', 2018, 1);
INSERT INTO `student` VALUES (1006, '测试2', '男', 25, '职教', '幼教', 2019, 4);
INSERT INTO `student` VALUES (1007, '测试3', '男', 22, '公关', '陪酒', 2017, 3);
INSERT INTO `student` VALUES (1008, '测试4', '男', 56, '计算机学院', '计科', 2019, 5);
INSERT INTO `student` VALUES (1010, '测试5', '女', 34, '化学学院', '化学师范', 2018, 4);
INSERT INTO `student` VALUES (1011, '测试6', '男', 13, '物电学院', '物联网', 2016, 5);
INSERT INTO `student` VALUES (1022, '测试7', '男', 23, '经济', '金融', 2011, 1);
INSERT INTO `student` VALUES (1033, '测试8', '女', 28, '体院', '跑步', 2023, 3);
INSERT INTO `student` VALUES (1044, '测试9', '女', 24, '体院', '铅球', 2012, 2);
INSERT INTO `student` VALUES (1077, '测试10', '男', 27, '物院', '物理', 2077, 3);
INSERT INTO `student` VALUES (1099, '测试11', '女', 24, '生环', '生物环境', 2033, 3);

SET FOREIGN_KEY_CHECKS = 1;
