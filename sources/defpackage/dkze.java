package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkze extends dlaf {
    public final boolean a;
    private final boolean b = false;

    public dkze(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkze)) {
            return false;
        }
        dkze dkzeVar = (dkze) obj;
        if (this.a != dkzeVar.a) {
            return false;
        }
        boolean z = dkzeVar.b;
        return true;
    }

    public final int hashCode() {
        return (dkzd.a(this.a) * 31) + dkzd.a(false);
    }
}
