/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : education

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 10/12/2019 22:41:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL COMMENT '主键ID',
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `version` int(255) NULL DEFAULT NULL,
  `deleted` tinyint(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Jone', 18, 'test1@baomidou.com', NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (2, 'Jack', 20, 'test2@baomidou.com', NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (3, 'Tom', 28, 'test3@baomidou.com', NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (4, 'Sandy', 21, 'test4@baomidou.com', NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (5, 'Billie', 50, 'test5@baomidou.com', NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (1204024939766001665, 'tom', 99, 'tom@qq.com', NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (1204039087392481282, '周玲', 80, 'zhouling@qq.com', '2019-12-09 22:04:23', '2019-12-09 22:10:08', NULL, 0);
INSERT INTO `user` VALUES (1204039724121350145, '薛振春', 99, 'tom@qq.com', '2019-12-09 22:06:55', '2019-12-09 22:06:55', NULL, 0);
INSERT INTO `user` VALUES (1204386532685123585, '乔峰', 99, '周周@qq.com', '2019-12-10 21:05:00', '2019-12-10 21:05:00', 1, 1);

SET FOREIGN_KEY_CHECKS = 1;
