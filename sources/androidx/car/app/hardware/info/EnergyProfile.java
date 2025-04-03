package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.cfs;
import defpackage.cfz;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
@cfs
/* loaded from: classes.dex */
public final class EnergyProfile {
    public static final int EVCONNECTOR_TYPE_CHADEMO = 3;
    public static final int EVCONNECTOR_TYPE_COMBO_1 = 4;
    public static final int EVCONNECTOR_TYPE_COMBO_2 = 5;
    public static final int EVCONNECTOR_TYPE_GBT = 9;
    public static final int EVCONNECTOR_TYPE_GBT_DC = 10;
    public static final int EVCONNECTOR_TYPE_J1772 = 1;
    public static final int EVCONNECTOR_TYPE_MENNEKES = 2;
    public static final int EVCONNECTOR_TYPE_OTHER = 101;
    public static final int EVCONNECTOR_TYPE_SCAME = 11;
    public static final int EVCONNECTOR_TYPE_TESLA_HPWC = 7;
    public static final int EVCONNECTOR_TYPE_TESLA_ROADSTER = 6;
    public static final int EVCONNECTOR_TYPE_TESLA_SUPERCHARGER = 8;
    public static final int EVCONNECTOR_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_BIODIESEL = 5;
    public static final int FUEL_TYPE_CNG = 8;
    public static final int FUEL_TYPE_DIESEL_1 = 3;
    public static final int FUEL_TYPE_DIESEL_2 = 4;
    public static final int FUEL_TYPE_E85 = 6;
    public static final int FUEL_TYPE_ELECTRIC = 10;
    public static final int FUEL_TYPE_HYDROGEN = 11;
    public static final int FUEL_TYPE_LEADED = 2;
    public static final int FUEL_TYPE_LNG = 9;
    public static final int FUEL_TYPE_LPG = 7;
    public static final int FUEL_TYPE_OTHER = 12;
    public static final int FUEL_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_UNLEADED = 1;
    private final CarValue<List<Integer>> mEvConnectorTypes;
    private final CarValue<List<Integer>> mFuelTypes;

    private EnergyProfile() {
        this.mEvConnectorTypes = CarValue.UNKNOWN_INTEGER_LIST;
        this.mFuelTypes = CarValue.UNKNOWN_INTEGER_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyProfile)) {
            return false;
        }
        EnergyProfile energyProfile = (EnergyProfile) obj;
        return Objects.equals(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && Objects.equals(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    public CarValue<List<Integer>> getEvConnectorTypes() {
        CarValue<List<Integer>> carValue = this.mEvConnectorTypes;
        carValue.getClass();
        return carValue;
    }

    public CarValue<List<Integer>> getFuelTypes() {
        CarValue<List<Integer>> carValue = this.mFuelTypes;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mEvConnectorTypes, this.mFuelTypes);
    }

    public String toString() {
        return "[ evConnectorTypes: " + this.mEvConnectorTypes + ", fuelTypes: " + this.mFuelTypes + "]";
    }

    EnergyProfile(cfz cfzVar) {
        CarValue carValue = cfzVar.a;
        throw null;
    }
}
