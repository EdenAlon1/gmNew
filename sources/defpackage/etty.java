package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etty extends etup {
    public final int a;
    public final int b;
    public final ettx c;

    public etty(int i, int i2, ettx ettxVar) {
        this.a = i;
        this.b = i2;
        this.c = ettxVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.c != ettx.d;
    }

    public final int b() {
        ettx ettxVar = this.c;
        if (ettxVar == ettx.d) {
            return this.b;
        }
        if (ettxVar == ettx.a || ettxVar == ettx.b || ettxVar == ettx.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etty)) {
            return false;
        }
        etty ettyVar = (etty) obj;
        return ettyVar.a == this.a && ettyVar.b() == b() && ettyVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(etty.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.c) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
