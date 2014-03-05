<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>mainpage</title>
</head>

<body>
<form action="Client">
<p>

   <label><font size="5">Services  </font></label>
   <select name="ServiceCombo" id="ServiceCombo" width="180" style="width: 200px;height:25px">
   </select>
  <input type="text" name="text" id="text" style="width: 200px;height:23px"/>
  <input type="submit" name="button" id="button" value="Submit" style="width:100px;font-size:Larger;height:30px"/>
</p>
</form>
<table width="600" border="1" align="left">
  <tr>
    <td width="30"><strong><font size="5"></font></strong></td>
    <td width="137"><strong><font size="5">Title</font></strong></td>
    <td width="125"><strong><font size="5">Author</font></strong></td>
    <td width="116"><strong><font size="5">Price</font></strong></td>
  </tr>
  <tr>
    <td><form id="form2" name="form2" method="post" action="">
      <input type="checkbox" name="c1" id="c1" />
      <label for="c1"></label>
    </form></td>
     <td>${bookObj.title}</td>
    <td>${bookObj.author}</td>
    <td>${bookObj.price}</td>
  </tr>
  <tr>
    <td><form id="form3" name="form3" method="post" action="">
      <input type="checkbox" name="c2" id="c2" />
      <label for="c2"></label>
    </form></td>
     <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><form id="form4" name="form4" method="post" action="">
      <input type="checkbox" name="c3" id="c3" />
      <label for="c3"></label>
    </form></td>
     <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><form id="form5" name="form5" method="post" action="">
      <input type="checkbox" name="c4" id="c4" />
      <label for="c4"></label>
    </form></td>
     <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><form id="form6" name="form6" method="post" action="">
      <input type="checkbox" name="c5" id="c5" />
      <label for="c5"></label>
    </form></td>
     <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><form id="form7" name="form7" method="post" action="">
      <input type="checkbox" name="c6" id="c6" />
      <label for="c6"></label>
    </form></td>
    <td>&nbsp;</td>
     <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><form id="form8" name="form8" method="post" action="">
      <input type="checkbox" name="c7" id="c7" />
      <label for="c7"></label>
    </form></td>
    <td>&nbsp;</td>
     <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><form id="form9" name="form9" method="post" action="">
      <input type="checkbox" name="c8" id="c8" />
      <label for="c8"></label>
    </form></td>
     <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><form id="form10" name="form10" method="post" action="">
      <input type="checkbox" name="c9" id="c9" />
      <label for="c9"></label>
    </form></td>
     <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<form id="form1" name="form1" method="post" action="">
  <input type="submit" name="compare" id="compare" value="Compare Book Price" style="width:200px;font-size: larger;height:35px"/>
</form>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;					</p>
</body>
</html>




