<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>尚硅谷App流量大数据分析系统</title>
  <link rel="stylesheet"
        href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
  <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
  <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
  <script src="js/echarts.js"></script>
  <script>
      $(function () {
          //手风琴特效
          $("#accordion").accordion();

          //菜单鼠标悬停
          $("#accordion a").mouseenter(function () {
              //重置所有连接的颜色
              $("#accordion a").css("background-color", "white");
              $(this).css("background-color", "#EAEAEA");
          });

          //鼠标移除
          $("#accordion a").click(function () {
              //重置所有连接的颜色
              $("#accordion a").css("color", "#6a6a6a");
              $(this).css("background-color", "#EAEAEA");
              $(this).css("color", "#3DA1A7");
          });

          $("#a_newusers").click(function(){

              $.getJSON("/stat/week1",function(d){
                  option.xAxis.data = d.get("labels");
                  option.series[0].data = d.get("data");

/*                  option.xAxis.data = d.count;
                  option.series[0].data = d.data;*/

                  myChart.setOption(option);
              });
          });

      });
  </script>
  <style type="text/css">
    .test {
      background-color: #3DA1A7;
    }

    body {
      padding: 0px;
      margin: 0px;
    }

    #div-top {
      height: 30px;
      width: 100%;
      background-color: #3b485b;
      border: 0px solid #3b485b;
    }

    #div-top ul {
      margin: 0px;
    }

    #div-top ul li {
      list-style: none;
      display: block;
      float: left;
      color: white;
      border: 0px solid white;
      line-height: 30px;
      width: 70px;
      vertical-align: middle;
      text-align: center;
    }

    #div-top ul li:first-child {
      list-style: none;
      display: block;
      float: left;
      color: white;
      border: 0px solid white;
      line-height: 30px;
      width: 130px;
      vertical-align: middle;
      text-align: center;
    }

    #div-top ul li a {
      text-decoration: none;
      font-size: smaller;
      color: #9da4ad;
    }

    #div-top ul li:first-child a {
      color: white;
      text-decoration: none;
      font-size: 15px;
    }

    #div-banner {
      height: 60px;
      width: 100%;
      border: 0px solid blue;
      text-align: left;
    }

    #div-banner form {
      border: 0px solid blue;
      width: 200px;
      height: 57px;
      vertical-align: middle;
      line-height: 57px;
      text-align: center;
    }

    #div-banner select {
      border-radius: 20px;
      font-size: 15px;
      display: inline;
      padding: 3px 10px;
    }

    #div-banner ul {
      border: 0px solid blue;
      list-style: none;
      display: block;
      position: absolute;
      left: 200px;
      top: 14px;
      height: 57px;
      width: 600px;
      vertical-align: middle;
      line-height: 57px;
      margin-left: 380px;
    }

    #div-banner ul li {
      display: inline;
      padding: 0px 20px;
    }

    #div-banner ul li a {
      text-decoration: none;
      font-size: 16px;
      color: #333333;
    }

    #accordion {
      margin: 10px 20px;
      width: 200px;
    }

    #accordion a {
      display: block;
      height: 45px;
      width: 200px;
      text-decoration: none;
      text-align: center;
      line-height: 45px;
      font-size: 14px;
      border-radius: 2px;
      margin: 1px 0px 0px -40px;
      border: 1px solid #AAAAAA;
      border-width: 0px 0px 1px 0px;
    }

    /*第一个a子元素*/
    #accordion a:first-child {
      margin-top: -20px;
    }

    #div-stat-header {
      border: 1px solid #B4B4B4;
      position: absolute;
      left: 250px;
      top: 100px;
      width: 1050px;
      height: 50px;
      border-top-left-radius: 5px;
      border-top-right-radius: 5px;
      background-color: rgb(230, 230, 230);
      vertical-align: middle;
      line-height: 50px;
      padding-left: 20px;
    }

    #div-chart {
      border: 1px solid #B4B4B4;
      position: absolute;
      left: 250px;
      top: 151px;
      width: 1050px;
      height: 440px;
      vertical-align: middle;
      line-height: 50px;
      padding-left: 20px;
    }

  </style>
</head>
<body>
<div id="div-top">
  <ul>
    <li><a href="#">尚硅谷教育出品+</a></li>
    <li><a href="#">首页</a></li>
    <li><a href="#">产品</a></li>
    <li><a href="#">报告</a></li>
    <li><a href="#">开发者中心</a></li>
    <li><a href="#">论坛</a></li>
    <li><a href="#">活动</a></li>
  </ul>
</div>
<div id="div-banner">
  <form action="" method="post">
    <select name="appid">
      <option>全部</option>
      <option>微信</option>
      <option>QQ</option>
      <option>UC</option>
      <option>植物大战僵尸</option>
    </select>
  </form>
  <ul>
    <li><a href="#">统计分析</a></li>
    <li><a href="#">组件</a></li>
    <li><a href="#">管理</a></li>
  </ul>
</div>
<div id="accordion">
  <h3>概况</h3>
  <div>
    <a href="#">实时统计</a>
    <a href="#">整体分析</a>
  </div>
  <h3>用户分析</h3>
  <div>
    <a id="a_newusers" href='javascript:;'>新增用户</a>
    <a href="#">活跃用户</a>
    <a href="#">沉默用户</a>
    <a href="#">启动次数</a>
    <a href="#">版本分布</a>
    <a href="#">行业数据</a>
  </div>
  <h3>用户构成</h3>
  <div>
    <a href="#">周用户构成</a>
    <a href="#">用户成分转化</a>
    <a href="#">变化系数分析</a>
  </div>
  <h3>留存分析</h3>
  <div>
    <a href="#">留存用户</a>
    <a href="#">用户新鲜度</a>
    <a href="#">用户活跃度</a>
  </div>
</div>
<div id="div-stat-header">
  新增用户趋势
</div>
<div id="div-chart">

</div>
<script type="application/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('div-chart'));
    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '日活跃用户统计'
        },
        tooltip: {},
        legend: {
            data: ['v1.1', 'v1.2', 'v1.3']
        },
        xAxis: {
            axisLabel: {
                rotate: 20,
                interval: 0,//横轴信息全部显示
            },
            data: ["6月10日/周一(父亲节)", "6月11日/周二", "6月12日/周三", "6月13日/周四", "6月14日/周五", "6月15日/周六"]
        },
        yAxis: {},
        series: [{
            name: 'v1.1',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
        }, {
            name: 'v1.2',
            type: 'bar',
            data: [6, 23, 38, 13, 15, 26]
        }, {
            name: 'v1.3',
            type: 'bar',
            data: [10, 35, 29, 21, 9, 33]
        }]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</body>
</html>
