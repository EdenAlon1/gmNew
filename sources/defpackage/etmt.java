package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmt extends etmw {
    public final int a;
    public final etms b;

    public etmt(int i, etms etmsVar) {
        this.a = i;
        this.b = etmsVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.b != etms.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etmt)) {
            return false;
        }
        etmt etmtVar = (etmt) obj;
        return etmtVar.a == this.a && etmtVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(etmt.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
