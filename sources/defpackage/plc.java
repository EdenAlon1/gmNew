package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plc {
    public static final plc a = new plc("LOCALE", 0);
    public static final plc b = new plc("LEFT_TO_RIGHT", 1);
    public static final plc c = new plc("RIGHT_TO_LEFT", 2);
    public static final plc d = new plc("TOP_TO_BOTTOM", 3);
    public static final plc e = new plc("BOTTOM_TO_TOP", 4);
    private final String f;
    private final int g;

    private plc(String str, int i) {
        this.f = str;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof plc)) {
            return false;
        }
        plc plcVar = (plc) obj;
        return ffkj.e(this.f, plcVar.f) && this.g == plcVar.g;
    }

    public final int hashCode() {
        return (this.f.hashCode() * 31) + this.g;
    }

    public final String toString() {
        return this.f;
    }
}
