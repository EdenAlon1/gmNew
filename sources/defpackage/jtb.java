package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtb extends jsf {
    public final jxc d;

    public jtb(jxc jxcVar) {
        this.d = jxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jtb) && ffkj.e(this.d, ((jtb) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.d + ')';
    }
}
