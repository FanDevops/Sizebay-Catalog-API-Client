package sizebay.catalog.client.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;

@Getter
@Setter
public class Modeling   {
  
  private Long id;
  private String name;

  private Gender gender;
  private String gMerchantBrandName;
  private String gMerchantAgeGroup;
  private String gMerchantSizeType;
  private String observation;

  private TypeEnum type;
  private Long brandId;
  private Measure composedMeasure;
  private ComposedMeasureOrder composedMeasureOrder;
  private SizeSystem sizeSystem;
  private List<ModelingSizeMeasures> measures = new ArrayList<>();
  private List<CustomRange> customRanges = new ArrayList<>();

  private Long originalModelingId;

  private StrongCategoryType strongCategoryType;

  boolean active = true;
  boolean accessories = false;

  private List<ModelingCategory> modelingCategories = new ArrayList<ModelingCategory>();

  private Boolean isShoeModeling;

  @Getter
  @RequiredArgsConstructor
  public enum TypeEnum {
    PRODUCT("product"),
    BODY("body");

    final private String value;

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  @Getter
  @RequiredArgsConstructor
  public enum Gender {
    M("M"), F("F"), U("U");

    final private String value;

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }
}

