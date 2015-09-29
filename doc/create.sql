CREATE DATABASE `test`
CHARACTER SET 'utf8'
COLLATE 'utf8_general_ci';

DROP TABLE IF EXISTS `que_answer`;
CREATE TABLE `que_answer` (
  `id` varchar(36) NOT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(36) DEFAULT NULL,
  `update_user` varchar(36) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delete_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除;未删除:0,删除:1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

DROP TABLE IF EXISTS `que_question`;
CREATE TABLE `que_question` (
  `id` varchar(36) NOT NULL,
  `question` varchar(200) DEFAULT NULL COMMENT '问题内容',
  `visible` char(1) DEFAULT '0' COMMENT '是否显示;显示:0,不显示:1',
  `sort` int(11) DEFAULT '0' COMMENT '排序',
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(36) DEFAULT NULL,
  `update_user` varchar(36) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delete_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除;未删除:0,删除:1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

DROP TABLE IF EXISTS `que_question_answer`;
CREATE TABLE `que_question_answer` (
  `id` varchar(36) NOT NULL,
  `question_id` varchar(36) DEFAULT NULL,
  `answer_id` varchar(36) DEFAULT NULL,
  `sort` int(11) DEFAULT '0' COMMENT '排序',
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(36) DEFAULT NULL,
  `update_user` varchar(36) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delete_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除;未删除:0,删除:1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

DROP TABLE IF EXISTS `que_result`;
CREATE TABLE `que_result` (
  `id` varchar(36) NOT NULL,
  `question_id` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user` varchar(36) DEFAULT NULL,
  `update_user` varchar(36) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delete_flag` char(1) NOT NULL DEFAULT '0' COMMENT '是否删除;未删除:0,删除:1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;