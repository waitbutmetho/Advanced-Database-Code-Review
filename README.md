# Bands and Venues

#### Simple website that allows users to add bands and venues then add venues to bands and bands to venues  Date:03/04/2016

#### Author - Joshua Gustafson

## Setup/Installation Requirements

* _Clone this repository._
* _Make sure you have Java and Gradle installed._
    * _For Java:_
        * _Download and install [Java SDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)_
        * _Download and install [Java JRE](http://www.java.com/en/)_
    * _For Gradle: if you are using Homebrew on Mac:_
        * _$ brew update_
        * _$ brew install gradle_
* _Run the following command in terminal:_
  * _postgres_
* _Open a new tab in terminal and create the 'band_venues' database:_
  * _psql_
  * _CREATE DATABASE band_venues;_
* _Run the following command in terminal:_
  *  _psql band_venues < band_venues.sql_
* _In the top level of the cloned directory, run the following command in your terminal:_
    * _$ gradle run_
* _Open your web browser of choice to localhost:4567_

## Technologies Used

Java, Spark, Junit, Velocity, Fluentlenium, Bootstrap

### License

MIT license.

Copyright (c) 2016

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
