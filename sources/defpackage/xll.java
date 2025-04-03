package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xll implements xlp {
    public final xlu a;

    public xll() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xll) && ffkj.e(this.a, ((xll) obj).a);
    }

    public final int hashCode() {
        xlu xluVar = this.a;
        if (xluVar == null) {
            return 0;
        }
        return xluVar.hashCode();
    }

    public final String toString() {
        return "SATELLITE(textCounterData=" + this.a + ")";
    }

    public xll(xlu xluVar) {
        this.a = xluVar;
    }

    public /* synthetic */ xll(byte[] bArr) {
        this((xlu) null);
    }
}
