package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethn extends etgr {
    public final int a;
    public final int b;
    public final int c = 16;
    public final ethm d;

    public ethn(int i, int i2, ethm ethmVar) {
        this.a = i;
        this.b = i2;
        this.d = ethmVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.d != ethm.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ethn)) {
            return false;
        }
        ethn ethnVar = (ethn) obj;
        if (ethnVar.a == this.a && ethnVar.b == this.b) {
            int i = ethnVar.c;
            if (ethnVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ethn.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
