package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edld extends edow {
    public final List a;

    public edld(List list) {
        if (list == null) {
            throw new NullPointerException("Null fuelPrices");
        }
        this.a = list;
    }

    @Override // defpackage.edow
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edow) {
            return this.a.equals(((edow) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FuelOptions{fuelPrices=" + this.a.toString() + "}";
    }
}
