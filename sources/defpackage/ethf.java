package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethf extends etgr {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final ethe e;
    public final ethd f;

    public ethf(int i, int i2, int i3, int i4, ethe etheVar, ethd ethdVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = etheVar;
        this.f = ethdVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.e != ethe.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ethf)) {
            return false;
        }
        ethf ethfVar = (ethf) obj;
        return ethfVar.a == this.a && ethfVar.b == this.b && ethfVar.c == this.c && ethfVar.d == this.d && ethfVar.e == this.e && ethfVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(ethf.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        ethd ethdVar = this.f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.e) + ", hashType: " + String.valueOf(ethdVar) + ", " + this.c + "-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }
}
