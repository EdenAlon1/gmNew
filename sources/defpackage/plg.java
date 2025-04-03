package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plg {
    public static final String a = "plg";
    private final plf b;
    private final plc c;
    private final phs d;
    private final phi e;

    public plg(plf plfVar, plc plcVar, phs phsVar, phi phiVar) {
        this.b = plfVar;
        this.c = plcVar;
        this.d = phsVar;
        this.e = phiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plg)) {
            return false;
        }
        plg plgVar = (plg) obj;
        return ffkj.e(this.b, plgVar.b) && ffkj.e(this.c, plgVar.c) && ffkj.e(this.d, plgVar.d) && ffkj.e(this.e, plgVar.e);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "plg:{splitType=" + this.b + ", layoutDir=" + this.c + ", animationParams=" + this.d + ", dividerAttributes=" + this.e + " }";
    }
}
