<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>IPWA1 Demo</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
    <link rel="stylesheet" href="assets/css/Navigation-Clean.css">
    <link rel="stylesheet" href="assets/css/Navigation-with-Button.css">
</head>

<body id="page-top" style="background: var(--bs-gray-100);border-color: rgb(133, 135, 150);">
<div id="wrapper">
    <div class="d-flex flex-column" id="content-wrapper">
        <div id="content">
            <!--
            <nav class="navbar navbar-dark navbar-expand-md bg-primary" style="margin-bottom: 10px;">
                <div class="container-fluid"><a class="navbar-brand" href="index.jsp">IPWA1-Demo</a><button data-bs-toggle="collapse" class="navbar-toggler" data-bs-target="#navcol-1"><span class="visually-hidden">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navcol-1">
                        <ul class="navbar-nav">
                            <li class="nav-item"></li>
                            <li class="nav-item"></li>
                            <li class="nav-item"></li>
                            <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Kapitel 3</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="ipwa131">IPWA1: 3-1: Servlets</a>
                                    <a class="dropdown-item" href="ipwa132">IPWA1: 3-2: JSP</a>
                                    <a class="dropdown-item" href="ipwa132besser">IPWA1: 3-2: JSP (besser)</a>
                                    <a class="dropdown-item" href="ipwa133">IPWA1: 3-3: AJAX</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Kapitel 4&nbsp;</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="pages/ipwa1411.xhtml">IPWA1: 4-1: JSF: Erster Eindruck</a>
                                    <a class="dropdown-item" href="pages/ipwa142.xhtml">IPWA1: 4-2: JSF Komponenten</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Kapitel 5&nbsp;</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="pages/ipwa151.xhtml">IPWA1: 5-1: Managed Beans</a>
                                    <a class="dropdown-item" href="pages/ipwa152.xhtml">IPWA1: 5-2: Unified Expression Language (UEL)</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Kapitel 6</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="pages/ipwa16.xhtml">IPWA1: 6 Managed Beans</a>
                                </div>
                            </li>
                            <li class="nav-item dropdown"><a class="dropdown-toggle nav-link" aria-expanded="false" data-bs-toggle="dropdown" href="#">Nuetzliches</a>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="https://tomcat.apache.org/download-90.cgi">Tomcat</a>
                                    <a class="dropdown-item" href="https://www.jetbrains.com/de-de/idea/">IntelliJ</a>
                                    <a class="dropdown-item" href="https://mvnrepository.com/">Maven Repository</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav> -->
            <div class="container" style="margin-top: 10px;">
                <div class="row">
                    <div class="col-md-12" style="margin-bottom: 10px;">
                        <h4 class="text-dark mb-0">Was ist das hier?</h4>
                        <p>Ich wollte die Inhalte von IPWA1 mal ausprobieren. Im Skript selber werden ja nur Code-Snippets gezeigt (und die dann auch unvollständig). Es geht NICHT darum, irgendwelche präsentierfähigen Webseiten zu bauen. An einigen Stellen Benutze ich Bootstrap (Kapitel 5) zu Darstellung, das dann aber auch sehr kleingehalten. Daher werde ich an einigen Stellen plain HTML nutzen - sodass es grade noch so reicht.<br></p>
                        <p>Es geht an erster Stelle wirklich NUR darum, mal JSP und JSF mal gesehen zu haben.<br></p>
                        <p>Wenn du es wirklich "authentisch" fuer JSF halten willst, empfiehlt sich z.B. Bootfaces.<br></p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 text-center" style="margin-bottom: 10px;">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="row" style="background: transparent;">
                                    <div class="col">
                                        <h4 class="text-dark mb-0">Kapitel 3 - JSP</h4>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col"><a href="ipwa131">IPWA1: 3-1: Servlets</a></div>
                                </div>
                                <div class="row">
                                    <div class="col"><a href="ipwa132">IPWA1: 3-2: JSP</a></div>
                                </div>
                                <div class="row">
                                    <div class="col"><a href="ipwa132besser">IPWA1: 3-2: JSP (besser)</a></div>
                                </div>
                                <div class="row">
                                    <div class="col"><a href="ipwa133">IPWA1: 3-3: AJAX</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 text-center" style="margin-bottom: 10px;">
                        <h4 class="text-dark mb-0">Kapitel 4 - JSF</h4>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="row">
                                    <div class="col"><a href="pages/ipwa1411.xhtml">IPWA1: 4-1: JSF: Erster Eindruck</a></div>
                                </div>
                                <div class="row">
                                    <div class="col"><a href="pages/ipwa142.xhtml">IPWA1: 4-2: JSF Komponenten</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 text-center" style="margin-bottom: 10px;">
                        <h4 class="text-dark mb-0">Kapitel 5 - Java Beans</h4>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="row">
                                    <div class="col"><a href="pages/ipwa151.xhtml">IPWA1: 5-1: Managed Beans</a></div>
                                </div>
                                <div class="row">
                                    <div class="col"><a href="pages/ipwa152.xhtml">IPWA1: 5-2: Unified Expression Language (UEL)</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 text-center" style="margin-bottom: 10px;">
                        <h4 class="text-dark mb-0">Kapitel 6 - Primefaces</h4>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="row">
                                    <div class="col"><a href="pages/ipwa16.xhtml">IPWA1: 6 Managed Beans</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <h4 class="text-dark mb-0">Wie hast du den Kram Eingerichtet?</h4>
                <h5 class="text-dark mb-0">1. Tomcat runterladen</h5><a href="https://tomcat.apache.org/download-90.cgi">Lad dir Tomcat als Zip runter und entpack es</a>
                <h5 class="text-dark mb-0">2. IntelliJ nutzen</h5>
                <p>Project &gt; New Project &gt; Java Enterprise<br>Gib irgendwas ein. Folgendes ist wichtig:<br>Language: Java<br>Build System: Maven<br>Project template: Web Application<br>Application Server &gt; new &gt; Tomcat Home: Den Ordner für Tomcat angeben<br>Java Version: Alles ab 8</p>
            </div>
        </div>
    </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a>
</div>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="assets/js/theme.js"></script>
</body>

</html>
