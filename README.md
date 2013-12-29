rdfstore.scala.js
=================

This project is mapping [rdfstore.js](https://github.com/antoniogarrote/rdfstore-js) to [scala.js](http://www.scala-js.org/), allowing one to use rdfstore.js but program in Scala for the browsers. The advantages of such a mapping is that it becomes much easier to program as the Scala compiler can notify one of any type errors.

## Getting Started

 * Git clone this project
 * update the submodules of this project in the `externals` directory with
```bash
$ git submodule update --init --recursive
```
 * compile the scala code in sbt
```bash
$ ./sbt
> ~packageJS
```
 * You can then open up [html/rdfstore-scalajs.html](html/rdfstore-scalajs.html) from
your local hard drive in your browser and when you look at the console output you will see
a lot of log statements showing what is working at this point.

If you want to run the code in production just run `optimizeJS` in the sbt console, and open the
[html/rdfstore-scalajs-opt.html](html/rdfstore-scalajs-opt.html) in your browser.

