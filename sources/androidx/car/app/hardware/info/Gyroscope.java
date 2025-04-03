package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.cfs;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class Gyroscope {
    private final CarValue<List<Float>> mRotations;

    private Gyroscope() {
        this.mRotations = CarValue.UNKNOWN_FLOAT_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Gyroscope) {
            return Objects.equals(this.mRotations, ((Gyroscope) obj).mRotations);
        }
        return false;
    }

    public CarValue<List<Float>> getRotations() {
        return this.mRotations;
    }

    public int hashCode() {
        return Objects.hash(this.mRotations);
    }

    public String toString() {
        return "[ rotations: " + this.mRotations + " ]";
    }

    public Gyroscope(CarValue<List<Float>> carValue) {
        carValue.getClass();
        this.mRotations = carValue;
    }
}
