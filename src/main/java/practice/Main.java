package practice;

import practice.adapter.AdapterExample;
import practice.builder.BuilderExample;
import practice.factory.FactoryExample;
import practice.memento.MementoExample;
import practice.observer.ObserverExample;
import practice.proxy.ProxyExample;
import practice.singleton.SingletonExample;
import practice.template.TemplateExample;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Run all the example");
    BuilderExample.main(prefixFilter(args, "builder"));
    FactoryExample.main(prefixFilter(args, "factory"));
    SingletonExample.main(prefixFilter(args, "singleton"));
    AdapterExample.main(prefixFilter(args, "adapter"));
    ProxyExample.main(prefixFilter(args, "proxy"));
    MementoExample.main(prefixFilter(args, "memento"));
    TemplateExample.main(prefixFilter(args, "template"));
    ObserverExample.main(prefixFilter(args, "observer"));
  }

  private static String[] prefixFilter(String[] args, String prefix) {
    return Arrays.stream(args).filter(arg -> arg.startsWith(prefix)).toArray(String[]::new);
  }
}
