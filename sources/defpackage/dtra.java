package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtra extends dtvd {
    public final boolean a;

    public dtra(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dtvd
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtvd) {
            dtvd dtvdVar = (dtvd) obj;
            if (this.a == dtvdVar.a()) {
                dtvdVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TransactionParameters{withoutSqliteTransaction=" + this.a + ", deferredForeignKeyConstraints=false}";
    }

    @Override // defpackage.dtvd
    public final void b() {
    }
}
