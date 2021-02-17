<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Ariel santi", "AND546"), "Chrevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("CVSD12312", new Account("Este Sech", "AAA223"), "Dodge", "Altitude");
$uberPool->printDataCar();
?>