package test;

import org.graalvm.polyglot.Engine;

public class Car {
  Engine engine;

  void start() {
    engine.onSparkPlug();
    engine.MoveMotor();

  }

  void stop() {
    engine.offSparkPlug();
    engine.stopMotor();
  }
}
