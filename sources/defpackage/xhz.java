package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhz implements xid {
    public final xhw a;
    public final String b;

    public xhz() {
        this((xhw) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhz)) {
            return false;
        }
        xhz xhzVar = (xhz) obj;
        return this.a == xhzVar.a && ffkj.e(this.b, xhzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Emotive(screen=" + this.a + ", initialSearchTerm=" + this.b + ")";
    }

    public xhz(xhw xhwVar, String str) {
        xhwVar.getClass();
        this.a = xhwVar;
        this.b = str;
    }

    public /* synthetic */ xhz(xhw xhwVar, int i) {
        this((i & 1) != 0 ? xif.a : xhwVar, (String) null);
    }
}
