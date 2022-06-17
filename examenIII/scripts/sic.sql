-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-06-2022 a las 23:33:35
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sic`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_clientes`
--

CREATE TABLE `tbl_clientes` (
  `codigo_cliente` int(11) NOT NULL,
  `nombre_cliente` varchar(60) DEFAULT NULL,
  `direccion_cliente` varchar(60) DEFAULT NULL,
  `nit_cliente` varchar(20) DEFAULT NULL,
  `telefono_cliente` varchar(50) DEFAULT NULL,
  `codigo_vendedor` varchar(5) DEFAULT NULL,
  `estatus_cliente` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_lineas`
--

CREATE TABLE `tbl_lineas` (
  `codigo_linea` int(11) NOT NULL,
  `nombre_linea` varchar(60) NOT NULL,
  `estatus_linea` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_marcas`
--

CREATE TABLE `tbl_marcas` (
  `codigo_marcas` int(5) NOT NULL,
  `nombre_marca` varchar(60) DEFAULT NULL,
  `estatus_marca` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_productos`
--

CREATE TABLE `tbl_productos` (
  `codigo_producto` int(18) NOT NULL,
  `nombre_producto` varchar(60) DEFAULT NULL,
  `codigo _linea` varchar(5) DEFAULT NULL,
  `codigo_marca` varchar(5) DEFAULT NULL,
  `existencia_producto` double DEFAULT NULL,
  `estatus_producto` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_vendedores`
--

CREATE TABLE `tbl_vendedores` (
  `codigo_vendedor` int(11) NOT NULL,
  `nombre_vendedor` varchar(60) DEFAULT NULL,
  `direccion_vendedor` varchar(60) DEFAULT NULL,
  `telefono_vendedor` varchar(50) DEFAULT NULL,
  `nit_vendedor` varchar(20) DEFAULT NULL,
  `estatus_vendedor` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `Id_usuario` int(11) NOT NULL,
  `Nombre` varchar(20) DEFAULT NULL,
  `Correo` varchar(20) DEFAULT NULL,
  `Contraseña` varchar(20) DEFAULT NULL,
  `Tipo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_clientes`
--
ALTER TABLE `tbl_clientes`
  ADD PRIMARY KEY (`codigo_cliente`);

--
-- Indices de la tabla `tbl_lineas`
--
ALTER TABLE `tbl_lineas`
  ADD PRIMARY KEY (`codigo_linea`);

--
-- Indices de la tabla `tbl_marcas`
--
ALTER TABLE `tbl_marcas`
  ADD PRIMARY KEY (`codigo_marcas`);

--
-- Indices de la tabla `tbl_productos`
--
ALTER TABLE `tbl_productos`
  ADD PRIMARY KEY (`codigo_producto`);

--
-- Indices de la tabla `tbl_vendedores`
--
ALTER TABLE `tbl_vendedores`
  ADD PRIMARY KEY (`codigo_vendedor`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_clientes`
--
ALTER TABLE `tbl_clientes`
  MODIFY `codigo_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_lineas`
--
ALTER TABLE `tbl_lineas`
  MODIFY `codigo_linea` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_marcas`
--
ALTER TABLE `tbl_marcas`
  MODIFY `codigo_marcas` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_productos`
--
ALTER TABLE `tbl_productos`
  MODIFY `codigo_producto` int(18) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_vendedores`
--
ALTER TABLE `tbl_vendedores`
  MODIFY `codigo_vendedor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Id_usuario` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
