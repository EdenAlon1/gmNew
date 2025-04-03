package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdpw {
    public final boolean a;
    public final boolean b;
    private final boolean c;

    public cdpw(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdpw)) {
            return false;
        }
        cdpw cdpwVar = (cdpw) obj;
        if (this.a != cdpwVar.a || this.b != cdpwVar.b) {
            return false;
        }
        boolean z = cdpwVar.c;
        return true;
    }

    public final int hashCode() {
        return (((cdpv.a(this.a) * 31) + cdpv.a(this.b)) * 31) + cdpv.a(false);
    }

    public final String toString() {
        return "MediaConstraintsInfo(hasWifiConnection=" + this.a + ", hasPluggedIn=" + this.b + ", isBatteryLow=false)";
    }

    public cdpw() {
        this(false, false);
    }
}
