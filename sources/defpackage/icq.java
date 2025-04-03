package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icq extends icr {
    public final iao a;
    public final icv b;

    public icq(iao iaoVar) {
        this.a = iaoVar;
        ibc ibcVar = null;
        if (!iap.c(iaoVar)) {
            ibc ibcVar2 = new ibc((byte[]) null);
            ibcVar2.s(iaoVar);
            ibcVar = ibcVar2;
        }
        this.b = ibcVar;
    }

    @Override // defpackage.icr
    public final iam a() {
        iao iaoVar = this.a;
        return new iam(iaoVar.a, iaoVar.b, iaoVar.c, iaoVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icq) && ffkj.e(this.a, ((icq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
