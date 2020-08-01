package cn.com.creavalue.exception.dispose;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;


@ConfigurationProperties(prefix = "exception.dispose")
public class ExceptionDisposeProperties {

  private List<String> adviceFilterPackage = new ArrayList<>();

  private List<String> adviceFilterClass = new ArrayList<>();

  public List<String> getAdviceFilterPackage() {
    return adviceFilterPackage;
  }

  public void setAdviceFilterPackage(List<String> adviceFilterPackage) {
    this.adviceFilterPackage = adviceFilterPackage;
  }

  public List<String> getAdviceFilterClass() {
    return adviceFilterClass;
  }

  public void setAdviceFilterClass(List<String> adviceFilterClass) {
    this.adviceFilterClass = adviceFilterClass;
  }
}
