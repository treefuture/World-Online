"use strict";

var path = require('path');

var Htmlplugin = require("html-webpack-plugin"); //导入Html插件得到一个构造函数


var htmlplugin = new Htmlplugin({
  //创建构造函数实例对象
  template: './src/index.html',
  //指定原文件路径
  filename: './index.html' //指定生成文件的路径

});
module.exports = {
  devtool: "nosources-source-map",
  mode: "development",
  //mode指构建模式  development 开发模式  production 发布模式
  entry: path.join(__dirname, './src/index.js'),
  output: {
    path: path.join(__dirname, './dist'),
    filename: 'name.js'
  },
  plugins: [htmlplugin],
  devServer: {
    open: true,
    host: '127.0.0.1',
    port: 80
  },
  module: {
    //所有第三方模块儿的匹配规则
    rules: [//文件后缀名的匹配规则
    //test表示匹配的文件类型  use表示对应要调用的loader
    {
      test: /\.css$/,
      use: ['style-loader', 'css-loader']
    }, {
      test: /\.jpg|png|gif$/,
      use: 'url-loader'
    }]
  }
};