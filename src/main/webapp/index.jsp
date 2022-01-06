<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>IPWA-Navigator</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
</head>
<body id="page-top">
<div id="wrapper">
    <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
        <div class="container-fluid d-flex flex-column p-0"><a
                class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
            <div class="sidebar-brand-icon rotate-n-15"><i class="fab fa-java"></i></div>
            <div class="sidebar-brand-text mx-3"><span>IPWA 1</span></div>
        </a>
            <hr class="sidebar-divider my-0">
            <ul class="navbar-nav text-light" id="accordionSidebar">
                <li class="nav-item"><a class="nav-link active" href="index.html"><i
                        class="fas fa-tachometer-alt"></i><span>Beispiele</span></a></li> <!--TODO-->
                <li class="nav-item"><a class="nav-link" href="profile.html"><i
                        class="fas fa-user"></i><span>Tutorial</span></a></li> <!--TODO-->
                <li class="nav-item"></li>
                <li class="nav-item"></li>
                <li class="nav-item"></li>
            </ul>
            <div class="text-center d-none d-md-inline">
                <button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button>
            </div>
        </div>
    </nav>
    <div class="d-flex flex-column" id="content-wrapper">
        <div id="content">
            <div class="container-fluid">
                <div class="d-sm-flex justify-content-between align-items-center mb-4" style="margin-top: 10px;">
                    <h3 class="text-dark mb-0"><%= "Beispielprojekte" %>
                    </h3>
                </div>
                <div class="row">
                    <div class="col">
                        <div class="row">
                            <div class="col" style="padding-bottom: 12px;padding-top: 12px;">
                                <div class="accordion" role="tablist" id="accordion-1">
                                    <div class="accordion-item">
                                        <h2 class="accordion-header" role="tab">
                                            <button class="accordion-button" data-bs-toggle="collapse"
                                                    data-bs-target="#accordion-1 .item-1" aria-expanded="true"
                                                    aria-controls="accordion-1 .item-1">IPWA 1-3-1
                                            </button>
                                        </h2>
                                        <div class="accordion-collapse collapse show item-1" role="tabpanel"
                                             data-bs-parent="#accordion-1">
                                            <div class="accordion-body">
                                                <p class="mb-0"></p><a href="ipwa131">IPWA 1-3-1: Servlets</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="accordion-item">
                                        <h2 class="accordion-header" role="tab">
                                            <button class="accordion-button collapsed" data-bs-toggle="collapse"
                                                    data-bs-target="#accordion-1 .item-2" aria-expanded="false"
                                                    aria-controls="accordion-1 .item-2">IPWA 1-3-2
                                            </button>
                                        </h2>
                                        <div class="accordion-collapse collapse item-2" role="tabpanel"
                                             data-bs-parent="#accordion-1">
                                            <div class="accordion-body">
                                                <p class="mb-0"></p><a href="ipwa132">IPWA 1-3-2: JSP</a>
                                                <p class="mb-0"></p><a href="ipwa132besser">IPWA 1-3-2: JSP Aber
                                                besser</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="accordion-item">
                                        <h2 class="accordion-header" role="tab">
                                            <button class="accordion-button collapsed" data-bs-toggle="collapse"
                                                    data-bs-target="#accordion-1 .item-3" aria-expanded="false"
                                                    aria-controls="accordion-1 .item-2">IPWA 1-3-3
                                            </button>
                                        </h2>
                                        <div class="accordion-collapse collapse item-3" role="tabpanel"
                                             data-bs-parent="#accordion-1">
                                            <div class="accordion-body">
                                                <p class="mb-0"></p><a href="ipwa133">IPWA 1-3-3: AJAX</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="accordion" role="tablist" id="accordion-4">
                                    <div class="accordion-item">
                                        <h2 class="accordion-header" role="tab">
                                            <button class="accordion-button" data-bs-toggle="collapse"
                                                    data-bs-target="#accordion-4 .item-1" aria-expanded="true"
                                                    aria-controls="accordion-4 .item-1">IPWA 1-4-1-1
                                            </button>
                                        </h2>
                                        <div class="accordion-collapse collapse item-1" role="tabpanel"
                                             data-bs-parent="#accordion-4">
                                            <div class="accordion-body">
                                                <p class="mb-0"></p><a href="pages/ipwa1411.xhtml">IPWA 1-4-1: JSF
                                                erster eindruck</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="accordion" role="tablist" id="accordion-5">
                                        <div class="accordion-item">
                                            <h2 class="accordion-header" role="tab">
                                                <button class="accordion-button" data-bs-toggle="collapse"
                                                        data-bs-target="#accordion-5 .item-1" aria-expanded="true"
                                                        aria-controls="accordion-5 .item-1">IPWA 1-4-2
                                                </button>
                                            </h2>
                                            <div class="accordion-collapse collapse item-1" role="tabpanel"
                                                 data-bs-parent="#accordion-5">
                                                <div class="accordion-body">
                                                    <p class="mb-0"></p><a href="pages/ipwa142.xhtml">IPWA 1-4-2: JSF
                                                    erster eindruck</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="accordion" role="tablist" id="accordion-6">
                                        <div class="accordion-item">
                                            <h2 class="accordion-header" role="tab">
                                                <button class="accordion-button" data-bs-toggle="collapse"
                                                        data-bs-target="#accordion-6 .item-1" aria-expanded="true"
                                                        aria-controls="accordion-6 .item-1">IPWA 1-5-1
                                                </button>
                                            </h2>
                                            <div class="accordion-collapse collapse item-1" role="tabpanel"
                                                 data-bs-parent="#accordion-6">
                                                <div class="accordion-body">
                                                    <p class="mb-0"></p><a href="pages/ipwa151.xhtml">IPWA 1-5-1: Managed Beans</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="accordion" role="tablist" id="accordion-7">
                                        <div class="accordion-item">
                                            <h2 class="accordion-header" role="tab">
                                                <button class="accordion-button" data-bs-toggle="collapse"
                                                        data-bs-target="#accordion-7 .item-1" aria-expanded="true"
                                                        aria-controls="accordion-7 .item-1">IPWA 1-5-2
                                                </button>
                                            </h2>
                                            <div class="accordion-collapse collapse item-1" role="tabpanel"
                                                 data-bs-parent="#accordion-7">
                                                <div class="accordion-body">
                                                    <p class="mb-0"></p><a href="pages/ipwa152.xhtml">IPWA 1-5-2: EL</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <footer class="bg-white sticky-footer">
                <div class="container my-auto">
                    <div class="text-center my-auto copyright"><span>Copyright © Brand 2022</span></div>
                </div>
            </footer>
        </div>
        <a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a>
    </div>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/theme.js"></script>
</body>

</html>

<!-- Anmerkungen:
Siehe die dateien fuer anmerkungen -->
