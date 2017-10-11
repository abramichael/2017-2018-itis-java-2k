<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title></title>
      <script type="application/javascript" src="/js/jquery-1.9.1.js"></script>
  </head>
  <body>
      <input type="text" name="q" id="q_id" oninput="f()"/>
      <div id="results"></div>
      <script type="application/javascript">
          function f() {
              console.log(1);
              $.ajax({
                  url: "/ajax-students-search",
                  "data": {"q": $("#q_id").val()},
                  "dataType": "json",
                  success: function (result) {
                      $("#results").html("");
                      for (var i = 0; i < result.lastnames.length; i++) {
                          $("#results").append("<li>" + result.lastnames[i] + "</li>");
                      }
                  },
                  error: function (msg) {
                      console.log("OOOOps");
                  }
              });
          }
      </script>
  </body>
</html>
