-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2023 at 03:32 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `paint_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `cashout`
--

CREATE TABLE `cashout` (
  `Cashout_id` int(50) NOT NULL,
  `Date` date NOT NULL DEFAULT current_timestamp(),
  `Total_income` double NOT NULL,
  `Time` time NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cashout`
--

INSERT INTO `cashout` (`Cashout_id`, `Date`, `Total_income`, `Time`) VALUES
(1, '2022-12-19', 100, '09:58:40'),
(2, '2022-12-19', 200, '09:59:44'),
(3, '2022-12-19', 1, '10:04:25'),
(4, '2022-12-27', 1000, '09:50:46'),
(5, '2022-12-27', 11, '11:14:03'),
(6, '2022-12-27', 1231, '17:22:06'),
(7, '2022-12-27', 1000, '22:20:39'),
(8, '2023-01-08', 1, '21:23:01');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `Product_id` int(50) NOT NULL,
  `Brandname` varchar(50) NOT NULL,
  `Productname` varchar(50) NOT NULL,
  `Price` double NOT NULL,
  `Stocks` int(50) NOT NULL,
  `Type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`Product_id`, `Brandname`, `Productname`, `Price`, `Stocks`, `Type`) VALUES
(10, 'Davies', 'Flat wall Enamel 1LTR', 185, 5, 'Enamel Paint'),
(11, 'BOYSEN', 'Clear Acrylic Emulsion 4LTR', 230, 10, 'Emulsion Paint'),
(12, 'Sennelier', 'Sennelier Set 10x30ml', 350, 13, 'Oil paint'),
(13, 'a-plus', '1310-Red Oxide 2LTR', 230, 6, 'Anti-Corrosive Paint'),
(14, 'Davies Acreex', 'Chlorinated Rubber Base 4LTR', 300, 5, 'Synthetic Rubber Paint'),
(15, 'a-plus', '1701-Flat White 1LTR', 230, 10, 'Latex paint'),
(16, 'Davies', 'Acry-Color 1LTR', 180, 10, 'Acrylic Paint'),
(17, 'Psycho Paint', 'Platinum Silicon Paint 1LTR', 5000, 10, 'Silicon Paint'),
(18, 'BOYSEN', 'Traffic Paint Yellow 4LTR', 940, 19, 'Alkyd Paint');

-- --------------------------------------------------------

--
-- Table structure for table `salesreport`
--

CREATE TABLE `salesreport` (
  `sales_id` int(50) NOT NULL,
  `Date` date NOT NULL DEFAULT current_timestamp(),
  `Type` varchar(50) NOT NULL,
  `Brandname` varchar(50) NOT NULL,
  `Productname` varchar(50) NOT NULL,
  `Price` double NOT NULL,
  `Quantity` int(50) NOT NULL,
  `Totalcost` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salesreport`
--

INSERT INTO `salesreport` (`sales_id`, `Date`, `Type`, `Brandname`, `Productname`, `Price`, `Quantity`, `Totalcost`) VALUES
(93, '2023-01-09', 'Alkyd Paint', 'BOYSEN', 'Traffic Paint Yellow 4LTR', 940, 1, 940);

-- --------------------------------------------------------

--
-- Table structure for table `stock_in`
--

CREATE TABLE `stock_in` (
  `Date` date NOT NULL DEFAULT current_timestamp(),
  `Supplier_name` varchar(50) NOT NULL,
  `Brandname` varchar(50) NOT NULL,
  `Productname` varchar(50) NOT NULL,
  `Price` double NOT NULL,
  `Stocks` int(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Stockin_id` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stock_in`
--

INSERT INTO `stock_in` (`Date`, `Supplier_name`, `Brandname`, `Productname`, `Price`, `Stocks`, `Type`, `Stockin_id`) VALUES
('2022-12-29', 'Davies Paints', 'Davies', 'Flat Wall Enamel 1LTR', 185, 10, 'Enamel Paint', 11),
('2022-12-29', 'BOYSEN paints', 'BOYSEN', 'Clear Acrylic Emulsion 4LTR', 230, 8, 'Emulsion Paint', 12),
('2022-12-29', 'Sennelier Oil Paints', 'Sennelier', 'Sennelier Set 10x30ml', 350, 16, 'Oil paint', 13),
('2022-12-29', 'a-plus Paints', 'a-plus', '1310-Red Oxide 2LTR', 230, 6, 'Anti-Corrosive Paint', 14),
('2022-12-29', 'Davies Paints', 'Davies Acreex', 'Chlorinated Rubber Base 4LTR', 300, 10, 'Synthetic Rubber Paint', 15),
('2022-12-29', 'a-plus Paints', 'a-plus', '1701-Flat White 1LTR', 230, 12, 'Latex paint', 16),
('2022-12-29', 'Davies Paints', 'Davies', 'Acry-Color 1LTR', 180, 15, 'Acrylic Paint', 17),
('2022-12-29', 'Psycho Paint', 'Psycho Paint', 'Platinum Silicon Paint 1LTR', 5000, 10, 'Silicon Paint', 18),
('2022-12-29', 'BOYSEN Paints', 'BOYSEN', 'Traffic Paint Yellow 4LTR', 940, 20, 'Alkyd Paint', 19);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `Transaction_ID` int(50) NOT NULL,
  `Brandname` varchar(50) NOT NULL,
  `Productname` varchar(50) NOT NULL,
  `Price` double NOT NULL,
  `Quantity` double NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Totalcost` int(50) NOT NULL,
  `Date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`Transaction_ID`, `Brandname`, `Productname`, `Price`, `Quantity`, `Type`, `Totalcost`, `Date`) VALUES
(47, 'asd', 'asd', 123, 2, 'SELECT TYPE', 246, '2022-12-01'),
(48, 'asd', 'asd', 123, 2, 'SELECT TYPE', 246, '2022-12-02'),
(49, 'asd', 'asd', 123, 3, 'SELECT TYPE', 369, '2022-12-27'),
(50, 'asf', 'asf', 23, 2, 'PAINT', 46, '2022-12-27'),
(51, 'asd', 'asd', 123, 2, 'SELECT TYPE', 246, '2022-12-27'),
(52, 'asd', 'asd', 123, 2, 'SELECT TYPE', 246, '2022-12-27'),
(53, 'asd', 'asd', 123, 3, 'SELECT TYPE', 369, '2022-12-27'),
(54, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(55, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(56, 'asf', 'asf', 23, 1, 'PAINT', 23, '2022-12-27'),
(57, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(58, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(59, 'asf', 'asf', 23, 3, 'PAINT', 69, '2022-12-27'),
(60, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(61, 'asf', 'asf', 23, 2, 'PAINT', 46, '2022-12-27'),
(62, 'asf', 'asf', 23, 3, 'PAINT', 69, '2022-12-27'),
(63, 'ASD', 'ASD', 213, 3, 'PAINT BRUSH', 639, '2022-12-27'),
(64, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(65, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(66, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(67, 'asf', 'asf', 23, 2, 'PAINT', 46, '2022-12-27'),
(68, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(69, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(70, 'ASD', 'ASD', 213, 3, 'PAINT BRUSH', 639, '2022-12-27'),
(71, 'ASD', 'ASD', 213, 1, 'PAINT BRUSH', 213, '2022-12-27'),
(72, 'asf', 'asf', 23, 1, 'PAINT', 23, '2022-12-27'),
(73, 'ASD', 'ASD', 213, 1, 'PAINT BRUSH', 213, '2022-12-27'),
(74, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(75, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(76, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(77, 'asf', 'asf', 23, 2, 'PAINT', 46, '2022-12-27'),
(78, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(79, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(80, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(81, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(82, 'asf', 'asf', 23, 2, 'PAINT', 46, '2022-12-27'),
(83, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(84, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(85, 'asf', 'asf', 23, 2, 'PAINT', 46, '2022-12-27'),
(86, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(87, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(88, 'asf', 'asf', 23, 2, 'PAINT', 46, '2022-12-27'),
(89, 'ASD', 'ASD', 213, 2, 'PAINT BRUSH', 426, '2022-12-27'),
(90, 'Davies Acreex', 'Chlorinated Rubber Base 4LTR', 300, 2, 'SELECT TYPE', 600, '2023-01-05'),
(91, 'Sennelier', 'Sennelier Set 10x30ml', 350, 2, 'SELECT TYPE', 700, '2023-01-05'),
(92, 'Davies', 'Flat wall Enamel 1LTR', 185, 5, 'SELECT TYPE', 925, '2023-01-05'),
(93, 'BOYSEN', 'Clear Acrylic Emulsion 4LTR', 230, 2, 'SELECT TYPE', 460, '2023-01-07'),
(94, 'Davies Acreex', 'Chlorinated Rubber Base 4LTR', 300, 1, 'SELECT TYPE', 300, '2023-01-07'),
(95, 'Davies', 'Acry-Color 1LTR', 180, 2, 'Acrylic Paint', 360, '2023-01-08'),
(96, 'Davies Acreex', 'Chlorinated Rubber Base 4LTR', 300, 1, 'Synthetic Rubber Paint', 300, '2023-01-08'),
(97, 'BOYSEN', 'Traffic Paint Yellow 4LTR', 940, 1, 'Alkyd Paint', 940, '2023-01-09');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `Account_id` int(50) NOT NULL,
  `Full_name` varchar(50) NOT NULL,
  `Account_username` varchar(50) NOT NULL,
  `Account_password` varchar(50) NOT NULL,
  `Account_type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`Account_id`, `Full_name`, `Account_username`, `Account_password`, `Account_type`) VALUES
(14, 'Admin', 'Admin', 'Admin', 'Admin'),
(16, 'Cashier', 'Cashier', 'Cashier', 'Cashier');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cashout`
--
ALTER TABLE `cashout`
  ADD PRIMARY KEY (`Cashout_id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`Product_id`);

--
-- Indexes for table `salesreport`
--
ALTER TABLE `salesreport`
  ADD PRIMARY KEY (`sales_id`);

--
-- Indexes for table `stock_in`
--
ALTER TABLE `stock_in`
  ADD PRIMARY KEY (`Stockin_id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`Transaction_ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`Account_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashout`
--
ALTER TABLE `cashout`
  MODIFY `Cashout_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `inventory`
--
ALTER TABLE `inventory`
  MODIFY `Product_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `salesreport`
--
ALTER TABLE `salesreport`
  MODIFY `sales_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=94;

--
-- AUTO_INCREMENT for table `stock_in`
--
ALTER TABLE `stock_in`
  MODIFY `Stockin_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `Transaction_ID` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=98;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `Account_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
