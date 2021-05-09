-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2021 a las 16:39:10
-- Versión del servidor: 10.1.37-MariaDB
-- Versión de PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_ds`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnoss`
--

CREATE TABLE `alumnoss` (
  `id_alumno` int(1) NOT NULL,
  `nombre_alumno` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email_alumno` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tel_alumno` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `dir_alumno` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ultima_modificacion` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `mencion_alumno` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ci_alumno` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para registrar alumnos';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `id_materia` int(11) NOT NULL,
  `id_alumno` int(11) NOT NULL,
  `tipo_materia` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `calificacion` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `maestro` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `num_serie` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `dia_ingreso` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `mes_ingreso` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `annio_ingreso` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Observaciones` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ultima_modificacion` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `comentarios_tecnicos` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `revision_tecnica_de` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci COMMENT='Esta tabla es para registrar notas';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID_usuario` int(1) NOT NULL,
  `nombre_usuario` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tipo_nivel` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `estatus` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registrado_por` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de usuarios';

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID_usuario`, `nombre_usuario`, `email`, `telefono`, `username`, `password`, `tipo_nivel`, `estatus`, `registrado_por`) VALUES
(1, 'ETC-ADMIN', 'No disponible', 'No disponible', 'ETC', '9722fdfd4d36594e03b4185e864678e7', 'Administrador', 'Activo', 'JeanFranco Parra - Desarrollador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnoss`
--
ALTER TABLE `alumnoss`
  ADD PRIMARY KEY (`id_alumno`) USING BTREE;

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`id_materia`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnoss`
--
ALTER TABLE `alumnoss`
  MODIFY `id_alumno` int(1) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `materias`
--
ALTER TABLE `materias`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID_usuario` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
