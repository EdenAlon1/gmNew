package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xln implements xlo {
    private final xlu a;

    public xln(xlu xluVar) {
        this.a = xluVar;
    }

    @Override // defpackage.xlo
    public final xlu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xln) && ffkj.e(this.a, ((xln) obj).a);
    }

    public final int hashCode() {
        xlu xluVar = this.a;
        if (xluVar == null) {
            return 0;
        }
        return xluVar.hashCode();
    }

    public final String toString() {
        return "ONE_TO_ONE_SMS(textCounterData=" + this.a + ")";
    }

    public xln() {
        this(null);
    }
}
