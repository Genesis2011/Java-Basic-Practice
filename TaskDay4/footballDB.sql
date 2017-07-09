-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2017-07-06 12:51:16
-- 服务器版本： 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `footballDB`
--

-- --------------------------------------------------------

--
-- 表的结构 `TeamInfo`
--

CREATE TABLE IF NOT EXISTS `TeamInfo` (
`teamID` int(11) NOT NULL COMMENT '队伍编号',
  `city` varchar(255) NOT NULL COMMENT '城市',
  `teamName` varchar(255) NOT NULL COMMENT '队名'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='队伍信息表' AUTO_INCREMENT=5 ;

--
-- 转存表中的数据 `TeamInfo`
--

INSERT INTO `TeamInfo` (`teamID`, `city`, `teamName`) VALUES
(1, '北京', '国安'),
(2, '山东', '鲁能'),
(3, '上海', '申花'),
(4, '广州', '恒大');

-- --------------------------------------------------------

--
-- 表的结构 `VSInfo`
--

CREATE TABLE IF NOT EXISTS `VSInfo` (
`id` int(11) NOT NULL COMMENT '对战编号',
  `masterID` int(11) NOT NULL COMMENT '主队编号',
  `clientID` int(11) NOT NULL COMMENT '客队编号',
  `in` int(11) NOT NULL COMMENT '主队进球数',
  `out` int(11) NOT NULL COMMENT '主队失球数'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='对战信息表' AUTO_INCREMENT=5 ;

--
-- 转存表中的数据 `VSInfo`
--

INSERT INTO `VSInfo` (`id`, `masterID`, `clientID`, `in`, `out`) VALUES
(1, 1, 4, 1, 2),
(2, 4, 2, 1, 7),
(3, 2, 3, 2, 2),
(4, 3, 1, 0, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `TeamInfo`
--
ALTER TABLE `TeamInfo`
 ADD PRIMARY KEY (`teamID`);

--
-- Indexes for table `VSInfo`
--
ALTER TABLE `VSInfo`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `TeamInfo`
--
ALTER TABLE `TeamInfo`
MODIFY `teamID` int(11) NOT NULL AUTO_INCREMENT COMMENT '队伍编号',AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `VSInfo`
--
ALTER TABLE `VSInfo`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '对战编号',AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
