<%--
  Created by IntelliJ IDEA.
  User: thelibrarian
  Date: 9/3/21
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1>PIZZA PLANET</h1>
<form action="/pizza-order" method="post">
<%--    <div class="form-row">--%>
<%--        <div class="col-7">--%>
<%--            <input type="text" class="form-control" placeholder="Street Addr.">--%>
<%--        </div>--%>
<%--        <div class="col">--%>
<%--            <input type="text" class="form-control" placeholder="City">--%>
<%--        </div>--%>
<%--        <div class="col">--%>
<%--            <input type="text" class="form-control" placeholder="State">--%>
<%--        </div>--%>
<%--        <div class="col">--%>
<%--            <input type="text" class="form-control" placeholder="Zip">--%>
<%--        </div>--%>
<%--    </div>--%>

<%--    todo sam walk through --%>

    <select name="crust_type">
        <option value="hand-tossed">hand-tossed</option>
        <option value="stuffed">stuffed</option>
        <option value="thin">thin</option>
    </select>
    <br>
    <select name="sauce_type">
        <option value="tomato">tomato</option>
        <option value="alfredo">alfredo</option>
        <option value="pesto">pesto</option>
        <option value="bbq">bbq</option>
    </select>
    <br>
    <select name="topping_type">
        <option value="pepperoni">peperoni</option>
        <option value="alfredo">alfredo</option>
        <option value="pesto">pesto</option>
        <option value="bbq">bbq</option>
    </select>
    <br>
    <select name="size">
        <option value="sml">small</option>
        <option value="med">medium</option>
        <option value="lrg">large</option>
        <option value="x-lrg">extra large</option>
    </select>
    <br>
<%--    toppings check box below--%>
    <label for="pepperoni">
        peperoni <input type="checkbox" id="pepperoni" name="toppings" value="peperoni">
    </label>
    <label for="sausage">
        peperoni <input type="checkbox" id="sausage" name="toppings" value="peperoni">
    </label>
    <label for="pineapple">
        peperoni <input type="checkbox" id="pineapple" name="toppings" value="peperoni">
    </label>
    <label for="spinach">
        peperoni <input type="checkbox" id="spinach" name="toppings" value="peperoni">
    </label>
    <label for="cheeseburger">
        peperoni <input type="checkbox" id="cheeseburger" name="toppings" value="peperoni">
    </label>
    <label for="address">
        peperoni <input type="checkbox" id="address" name="toppings" value="peperoni">
    </label>

    <input type="submit">

</form>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>



<%--This form features choices to select the crust type, sauce type, size type (use select inputs), --%>
<%--toppings (checkboxes), and delivery address (text input).--%>