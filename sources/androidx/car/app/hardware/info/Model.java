package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.cfs;
import defpackage.cgc;
import j$.util.Objects;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class Model {
    private final CarValue<String> mManufacturer;
    private final CarValue<String> mName;
    private final CarValue<Integer> mYear;

    private Model() {
        this.mName = CarValue.UNKNOWN_STRING;
        this.mManufacturer = CarValue.UNKNOWN_STRING;
        this.mYear = CarValue.UNKNOWN_INTEGER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return Objects.equals(this.mName, model.mName) && Objects.equals(this.mYear, model.mYear) && Objects.equals(this.mManufacturer, model.mManufacturer);
    }

    public CarValue<String> getManufacturer() {
        CarValue<String> carValue = this.mManufacturer;
        carValue.getClass();
        return carValue;
    }

    public CarValue<String> getName() {
        CarValue<String> carValue = this.mName;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Integer> getYear() {
        CarValue<Integer> carValue = this.mYear;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mYear, this.mManufacturer);
    }

    public String toString() {
        return "[ name: " + this.mName + ", year: " + this.mYear + ", manufacturer: " + this.mManufacturer + "]";
    }

    Model(cgc cgcVar) {
        CarValue carValue = cgcVar.a;
        throw null;
    }
}
