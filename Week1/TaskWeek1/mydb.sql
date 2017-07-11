-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2017-07-07 12:50:15
-- 服务器版本： 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- 表的结构 `Customer`
--

CREATE TABLE IF NOT EXISTS `Customer` (
`id` int(11) NOT NULL COMMENT '编号',
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `CID` char(18) NOT NULL COMMENT '身份证号',
  `phone` char(11) NOT NULL COMMENT '电话',
  `beginTime` datetime NOT NULL COMMENT '入住时间',
  `RoomID` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='客人信息表' AUTO_INCREMENT=5 ;

--
-- 转存表中的数据 `Customer`
--

INSERT INTO `Customer` (`id`, `name`, `CID`, `phone`, `beginTime`, `RoomID`) VALUES
(1, '杜云章', '370415199508083015', '17865933179', '2017-07-06 00:00:00', 1),
(2, '公毛', '370165199505051578', '17865931279', '2017-07-05 00:00:00', 2),
(3, '毛', '123456789123456789', '12789566547', '2017-07-07 00:00:00', 1),
(4, '杨毛', '123123123123123123', '17185382011', '2017-07-06 15:55:30', 3);

-- --------------------------------------------------------

--
-- 表的结构 `Room`
--

CREATE TABLE IF NOT EXISTS `Room` (
`RoomID` int(11) NOT NULL COMMENT '房间号',
  `State` varchar(255) NOT NULL COMMENT '房间状态',
  `type` int(11) NOT NULL COMMENT '房间类型'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='房间信息表' AUTO_INCREMENT=7 ;

--
-- 转存表中的数据 `Room`
--

INSERT INTO `Room` (`RoomID`, `State`, `type`) VALUES
(1, '已入住', 1),
(2, '已入住', 2),
(3, '已入住', 2),
(4, '空房间', 3),
(6, '装修', 3);

-- --------------------------------------------------------

--
-- 表的结构 `RoomType`
--

CREATE TABLE IF NOT EXISTS `RoomType` (
`TypeID` int(11) NOT NULL COMMENT '类型编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_german2_ci NOT NULL COMMENT '类型名称',
  `money` float NOT NULL COMMENT '日租金',
  `bedNum` int(11) NOT NULL COMMENT '床位数',
  `cNum` int(11) NOT NULL COMMENT '人数'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='房间类型表' AUTO_INCREMENT=4 ;

--
-- 转存表中的数据 `RoomType`
--

INSERT INTO `RoomType` (`TypeID`, `name`, `money`, `bedNum`, `cNum`) VALUES
(1, '标准间', 200, 2, 3),
(2, '单间', 100, 1, 2),
(3, '总统间', 1200, 1, 4);

-- --------------------------------------------------------

--
-- 表的结构 `User`
--

CREATE TABLE IF NOT EXISTS `User` (
`id` int(11) NOT NULL COMMENT '用户编号',
  `name` varchar(255) NOT NULL COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户信息表' AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `User`
--

INSERT INTO `User` (`id`, `name`, `password`) VALUES
(1, 'zhang', '456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Customer`
--
ALTER TABLE `Customer`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Room`
--
ALTER TABLE `Room`
 ADD PRIMARY KEY (`RoomID`);

--
-- Indexes for table `RoomType`
--
ALTER TABLE `RoomType`
 ADD PRIMARY KEY (`TypeID`);

--
-- Indexes for table `User`
--
ALTER TABLE `User`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Customer`
--
ALTER TABLE `Customer`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `Room`
--
ALTER TABLE `Room`
MODIFY `RoomID` int(11) NOT NULL AUTO_INCREMENT COMMENT '房间号',AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `RoomType`
--
ALTER TABLE `RoomType`
MODIFY `TypeID` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型编号',AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `User`
--
ALTER TABLE `User`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
