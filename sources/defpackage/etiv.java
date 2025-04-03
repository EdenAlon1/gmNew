package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etiv extends etgr {
    public final String a;
    public final etiu b;

    public etiv(String str, etiu etiuVar) {
        this.a = str;
        this.b = etiuVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.b != etiu.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etiv)) {
            return false;
        }
        etiv etivVar = (etiv) obj;
        return etivVar.a.equals(this.a) && etivVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(etiv.class, this.a, this.b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.a + ", variant: " + this.b.c + ")";
    }
}
