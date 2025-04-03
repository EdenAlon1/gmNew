package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etum extends etup {
    public final int a;
    public final int b;
    public final etul c;
    public final etuk d;

    public etum(int i, int i2, etul etulVar, etuk etukVar) {
        this.a = i;
        this.b = i2;
        this.c = etulVar;
        this.d = etukVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.c != etul.d;
    }

    public final int b() {
        etul etulVar = this.c;
        if (etulVar == etul.d) {
            return this.b;
        }
        if (etulVar == etul.a || etulVar == etul.b || etulVar == etul.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etum)) {
            return false;
        }
        etum etumVar = (etum) obj;
        return etumVar.a == this.a && etumVar.b() == b() && etumVar.c == this.c && etumVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(etum.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        etuk etukVar = this.d;
        return "HMAC Parameters (variant: " + String.valueOf(this.c) + ", hashType: " + String.valueOf(etukVar) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
