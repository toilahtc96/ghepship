<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html SYSTEM "about:legacy-compat">

<html>
<head>
<title>${message }</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="<c:url value = "/resources/layout/styles/layout.css"/>" rel="stylesheet" type="text/css" media="all">
</head>
<body id="top">
<!-- Top Background Image Wrapper -->
<div class="bgded overlay" style="background-image:url('/resources/images/demo/backgrounds/01.png');"> 
  <div class="wrapper">
    <div id="pageintro" class="hoc clear"> 
      <article>
        <h2 class="heading">Consectetur adipiscing elit etiam</h2>
        <p>Pretium ullamcorper velit ut lobortis duis non</p>
        <footer><a class="btn" href="#">Auctor aliquet</a></footer>
      </article>
    </div>
  </div>
  
  
  
  <div class="wrapper row1">
    <header id="header" class="hoc clear"> 
      
      <div id="logo" class="fl_left">
        <h1><a href="index.html">Merciano</a></h1>
      </div>
      <nav id="mainav" class="fl_right">
        <ul class="clear">
          <li class="active"><a href="index.html">Home</a></li>
          <li><a class="drop" href="#">Pages</a>
            <ul>
              <li><a href="/resources/pages/gallery.html">Gallery</a></li>
              <li><a href="/resources/pages/full-width.html">Full Width</a></li>
              <li><a href="/resources/pages/sidebar-left.html">Sidebar Left</a></li>
              <li><a href="/resources/pages/sidebar-right.html">Sidebar Right</a></li>
              <li><a href="/resources/pages/basic-grid.html">Basic Grid</a></li>
            </ul>
          </li>
          <li><a class="drop" href="#">Dropdown</a>
            <ul>
              <li><a href="#">Level 2</a></li>
              <li><a class="drop" href="#">Level 2 + Drop</a>
                <ul>
                  <li><a href="#">Level 3</a></li>
                  <li><a href="#">Level 3</a></li>
                  <li><a href="#">Level 3</a></li>
                </ul>
              </li>
              <li><a href="#">Level 2</a></li>
            </ul>
          </li>
          <li><a href="#">Link Text</a></li>
          <li><a href="#">Link Text</a></li>
        </ul>
      </nav>
      
    </header>
  </div>
  
</div>
<!-- End Top Background Image Wrapper -->
 
 
 
<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    
    <div class="btmspace-50 center">
      <h3 class="btmspace-10">Consequat urna nunc semper felis</h3>
      <p class="nospace">Quis leo pretium convallis ligula fermentum quisque tellus ornare</p>
    </div>
    <ul class="nospace clear services">
      <li class="one_quarter first"><a href="#">
        <figure><img src="/resources/images/demo/gallery/01.png" alt="">
          <figcaption>Blandit</figcaption>
        </figure>
        </a></li>
      <li class="one_quarter"><a href="#">
        <figure><img src="/resources/images/demo/gallery/01.png" alt="">
          <figcaption>Ultricies</figcaption>
        </figure>
        </a></li>
      <li class="one_quarter"><a href="#">
        <figure><img src="/resources/images/demo/gallery/01.png" alt="">
          <figcaption>Tortor</figcaption>
        </figure>
        </a></li>
      <li class="one_quarter"><a href="#">
        <figure><img src="/resources/images/demo/gallery/01.png" alt="">
          <figcaption>Praesent</figcaption>
        </figure>
        </a></li>
      <li class="one_quarter first"><a href="#">
        <figure><img src="/resources/images/demo/gallery/01.png" alt="">
          <figcaption>Gravida</figcaption>
        </figure>
        </a></li>
      <li class="one_quarter"><a href="#">
        <figure><img src="/resources/images/demo/gallery/01.png" alt="">
          <figcaption>Volutpat</figcaption>
        </figure>
        </a></li>
      <li class="one_quarter"><a href="#">
        <figure><img src="/resources/images/demo/gallery/01.png" alt="">
          <figcaption>Suspendisse</figcaption>
        </figure>
        </a></li>
      <li class="one_quarter"><a href="#">
        <figure><img src="/resources/images/demo/gallery/01.png" alt="">
          <figcaption>Tristique</figcaption>
        </figure>
        </a></li>
    </ul>
    <p class="center"><a class="btn inverse" href="#">Ornare scelerisque</a></p>
    
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>
 
 
 
<div class="wrapper bgded overlay" style="background-image:url('/resources/images/demo/backgrounds/02.png');">
  <div class="hoc container clear"> 
    
    <div class="testimonial clear">
      <blockquote>Est vitae varius vivamus enim mi egestas at lacinia et faucibus eget tellus aenean nec massa semper luctus quam non cursus purus donec nec sollicitudin mauris at pulvinar lectus nunc eget mi a.</blockquote>
      <figure><img class="circle" src="/resources/images/demo/60x60.png" alt="">
        <figcaption><strong>A.Doe</strong><br>
          <em>Job / Title</em></figcaption>
      </figure>
    </div>
    <p class="center"><a class="btn" href="#">Risus justo nunc</a></p>
    
  </div>
</div>
 
 
 
<div class="wrapper row3">
  <section class="hoc container clear"> 
    
    <div class="btmspace-50 center">
      <h3 class="btmspace-10">Ligula tempus venenatis non sit</h3>
      <p class="nospace">Amet augue morbi vulputate tempor ex aliquam finibus nam ac lacus</p>
    </div>
    <div class="latest">
      <article class="clear">
        <div class="one_half first"><a class="iblock borderedbox inspace-10" href="#"><img src="/resources/images/demo/540x333.png" alt=""></a></div>
        <div class="one_half">
          <h3 class="heading">Elementum scelerisque nisi id sollicitudin tellus vivamus id convallis tellus</h3>
          <ul class="nospace meta">
            <li>
              <time datetime="2045-04-06">6<sup>th</sup> April 2045</time>
            </li>
            <li>by <a href="#">Admin</a></li>
          </ul>
          <p>Nullam tristique nulla sit amet tortor eleifend vitae tempor est mattis praesent aliquam mauris sem id convallis ipsum posuere vel cras porttitor turpis turpis tincidunt hendrerit urna&hellip;</p>
          <footer><a class="btn" href="#">Read More</a></footer>
        </div>
      </article>
      <article class="clear">
        <div class="one_half first">
          <h3 class="heading">Aliquam vel quisque nec dolor ullamcorper lacinia ut nec dictum ipsum</h3>
          <ul class="nospace meta">
            <li>
              <time datetime="2045-04-05">5<sup>th</sup> April 2045</time>
            </li>
            <li>by <a href="#">Admin</a></li>
          </ul>
          <p>Sed vulputate mauris proin fermentum vitae diam non hendrerit vivamus pharetra interdum augue ut dignissim aenean placerat lectus ullamcorper malesuada sodales massa urna pulvinar&hellip;</p>
          <footer><a class="btn" href="#">Read More</a></footer>
        </div>
        <div class="one_half"><a class="iblock borderedbox inspace-10" href="#"><img src="/resources/images/demo/540x333.png" alt=""></a></div>
      </article>
    </div>
    
    <div class="clear"></div>
  </section>
</div>
 
 
 
<div class="wrapper">
  <section class="hoc container center clear"> 
    
    <p class="font-xs"><a href="#">Sollicitudin neque mauris ut</a></p>
    <h3 class="btmspace-10">Nibh mauris dapibus bibendum neque</h3>
    <p class="nospace">Sed at augue consectetur ultricies elit semper facilisis quam aliquam</p>
    
  </section>
  <div class="gmap clear"> 
    
    <div id="gmapcanvas"><!-- Leave Empty --></div>
    
  </div>
</div>
 
 
 
<div class="wrapper row4">
  <footer id="footer" class="hoc clear"> 
    
    <div class="one_quarter first">
      <h6 class="title">Scelerisque luctus</h6>
      <address class="btmspace-30">
      Street Name &amp; Number<br>
      Town<br>
      Postcode/Zip
      </address>
      <ul class="nospace">
        <li class="btmspace-10"><i class="fa fa-phone"></i> +00 (123) 456 7890</li>
        <li><i class="fa fa-envelope-o"></i> info@domain.com</li>
      </ul>
    </div>
    <div class="one_quarter">
      <h6 class="title">Fringilla eu efficitur</h6>
      <article>
        <h2 class="nospace font-x1"><a href="#">Dictum dui quisque</a></h2>
        <time class="font-xs" datetime="2045-04-06">Friday, 6<sup>th</sup> April 2045</time>
        <p>Lacinia gravida accumsan proin tincidunt auctor pharetra mauris id luctus tellus morbi eu magna sit amet.</p>
      </article>
    </div>
    <div class="one_quarter">
      <h6 class="title">Lacus rutrum volutpat</h6>
      <ul class="nospace linklist">
        <li><a href="#">Lobortis cursus sodales</a></li>
        <li><a href="#">Libero at iaculis sem morbi</a></li>
        <li><a href="#">Sed augue in sapien facilisis</a></li>
        <li><a href="#">Sollicitudin ut nec felis</a></li>
        <li><a href="#">Praesent maximus quam</a></li>
      </ul>
    </div>
    <div class="one_quarter">
      <h6 class="title">Vel feugiat sem nulla</h6>
      <p>Sit amet egestas porttitor metus ante ornare ipsum iaculis dapibus ante est.</p>
      <p>Convallis elit sagittis dapibus interdum proin a diam vel quam suscipit pharetra.</p>
    </div>
    
  </footer>
</div>
 
 
 
<div class="wrapper row5">
  <div id="copyright" class="hoc clear"> 
    
    <p class="fl_left">Copyright &copy; 2016 - All Rights Reserved - <a href="#">Domain Name</a></p>
    <p class="fl_right">Template by <a target="_blank" href="http://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
    
  </div>
</div>
 
 
 
<a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
<!-- JAVASCRIPTS -->
<script src="/resources/layout/scripts/jquery.min.js"></script>
<script src="/resources/layout/scripts/jquery.backtotop.js"></script>
<script src="/resources/layout/scripts/jquery.mobilemenu.js"></script>
<script src="http://maps.google.com/maps/api/js?sensor=false"></script>
<script src="/resources/layout/scripts/gmaps.js"></script>
</body>
</html>