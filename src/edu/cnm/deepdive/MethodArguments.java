package edu.cnm.deepdive;

public class MethodArguments {

  int getZero() {//zero parameters or also called niladic.
    return 0;
  }

  int increment(int number) {//method with one argument or also called monadic.
    return number++;
  }

  int sum(int a, int b) {//method with two arguments or also called dyadic.
    return (a + b);
  }

  int plusMinus(int a, int b, int c) {//from 3 arguments onwards should be avoided.
    return (a + b - c);
  }

  void test() {} //zero arguments and empty body but does compile.
  void test2(int a, int b) {}//two arguments but empty body. Does compile.
}
