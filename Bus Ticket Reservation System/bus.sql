-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2020 at 04:06 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `from` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `to` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`from`, `to`) VALUES
('Amritsar', 'Amritsar'),
('Goa', 'Goa');

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `name` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `source` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `destination` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `service` varchar(45) COLLATE utf8mb4_unicode_ci NOT NULL,
  `date` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `seats` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `amount` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`name`, `phone`, `source`, `destination`, `service`, `date`, `seats`, `amount`) VALUES
('N', '01', 'Dhaka', 'Cox', 'Ena', '2020-12-02', '1', '1000'),
('Tasnim', '01766464154', 'Dhaka', 'Cox', 'Ena', '2020-12-02', '2', '2000'),
('Tasif', '0187516587', 'Dhaka', 'Cox', 'Ena', '2020-12-02', '1', '1000'),
('Tasnim', '1545154', 'Dhaka', 'Cox', 'Ena', '2020-12-02', '2', '2000'),
('Mim', '018664986612', 'Dhaka', 'Cox', 'Ena', '2020-12-02', '1', '1000'),
('Alif', '012589846998', 'Dhaka', 'Cox', 'Ena', '2020-12-02', '1', '1000');

-- --------------------------------------------------------

--
-- Table structure for table `search`
--

CREATE TABLE `search` (
  `service` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `source` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `dest` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fare` int(11) DEFAULT NULL,
  `dtime` time DEFAULT NULL,
  `atime` time DEFAULT NULL,
  `seat` int(11) DEFAULT NULL,
  `date` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `search`
--

INSERT INTO `search` (`service`, `source`, `dest`, `fare`, `dtime`, `atime`, `seat`, `date`) VALUES
('Ena', 'Dhaka', 'Cox', 1000, '12:00:00', '06:00:00', 26, '2020-12-02'),
('Purbasha', 'Chuadanga', 'Dhaka', 500, '09:00:00', '15:00:00', 20, '2020-12-01'),
('Purbasha', 'Chuadanga', 'Dhaka', 500, '09:00:00', '15:00:00', 20, '2020-12-01'),
('Purbasha', 'Dhaka', 'Chuadnga', 500, '13:30:00', '19:00:00', 20, '2020-12-01'),
('Purbasha', 'Dhaka', 'Chuadnga', 500, '13:30:00', '19:00:00', 20, '2020-12-01'),
('Purbasha', 'Dhaka', 'Chuadnga', 1000, '13:30:00', '19:00:00', 20, '2020-12-16'),
('Deluxe', 'Gazipur', 'Chuadnga', 1000, '13:30:00', '19:00:00', 20, '2020-12-19'),
('CD Deluxe', 'Chuadnaga', 'Dhaka', 2000, '09:00:00', '14:00:00', 30, '2020-12-17'),
('Dhaka Bus', 'Dhaka', 'Gazipur', 200, '12:00:00', '05:00:00', 25, '2020-12-11'),
('Cd paribahan', 'Dhaka', 'Chuadanga', 500, '12:00:00', '09:00:00', 30, '2020-12-09'),
('Gazipur Paribahan', 'Gazipur', 'Dhaka', 500, '10:00:00', '12:00:00', 35, '2020-12-17');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `uname` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fname` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lname` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `age` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `state` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `city` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gender` varchar(23) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uname`, `password`, `fname`, `lname`, `phone`, `age`, `state`, `city`, `gender`, `email`) VALUES
('admin', 'admin', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('alif', '1020', 'Alif', 'Rahman', '01301245655', '52', 'Dhaka', 'Dhaka', 'Male', 'alif123@gmail.com'),
('asif', '1234', 'TAsif', 'Alam', '0157848742', '21', 'Dhaka', 'Dhaka', 'Male', 'tasif@gmail.com'),
('Mim12', '1230', 'Mim', 'Ahsan', '0152146566', '22', 'Dhaka', 'Dhaka', 'Female', 'mim@gmail.com'),
('Mim123', '12345', 'Mim', 'Rahman', '0184421', '21', 'Dhaka', 'Dhaka', 'Female', 'min@gmail.com'),
('Mim25', '1020', 'Mim12', 'Ahsan', '015712628', '25', 'Dhaka', 'Dhaka', 'Female', 'mim@gmail.com'),
('njhum0', '1020', 'Nijhum', 'Nijhum', '01646246', '25', 'Dhaka', 'Dhaka', 'Male', 'm.nijhum0'),
('Shamim12', '1234', 'Shamima', 'Khatun', '01766424155', '30', 'Dhaka', 'Dhaka', 'Female', 'Shamima@gmail.com'),
('tas', '1020', 'tas', 'as', '5565959', '14', 'sdcd', 'csdds', 'Male', 'tasshhjh'),
('Tasnim123', '123', 'Tasnim', 'Alom', '562656', '25', 'Dhaka', 'Dhaka', 'Female', 'tasnim@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`from`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`uname`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
