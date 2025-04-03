package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqi implements idh {
    private final ffjn a;

    public eqi(ffjn ffjnVar) {
        this.a = ffjnVar;
    }

    @Override // defpackage.idh
    public final icr a(long j, kah kahVar, jzn jznVar) {
        ibc ibcVar = new ibc((byte[]) null);
        this.a.a(ibcVar, new iar(j), kahVar);
        ibcVar.c();
        return new ico(ibcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        eqi eqiVar = obj instanceof eqi ? (eqi) obj : null;
        return (eqiVar != null ? eqiVar.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
