package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etif extends etgr {
    public final int a;
    public final etie b;

    public etif(int i, etie etieVar) {
        this.a = i;
        this.b = etieVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.b != etie.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etif)) {
            return false;
        }
        etif etifVar = (etif) obj;
        return etifVar.a == this.a && etifVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(etif.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
