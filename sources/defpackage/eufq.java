package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufq extends eugq {
    public final eufp a;
    public final eufp b;
    private final Integer c;
    private final Integer d;
    private final Integer e;
    private final Integer f;

    public eufq(Integer num, Integer num2, eufp eufpVar, eufp eufpVar2, Integer num3, Integer num4) {
        this.c = num;
        this.d = num2;
        this.a = eufpVar;
        this.b = eufpVar2;
        this.e = num3;
        this.f = num4;
    }

    public final int b() {
        return this.f.intValue();
    }

    public final int c() {
        return this.d.intValue();
    }

    public final int d() {
        return this.e.intValue();
    }

    public final int e() {
        return this.c.intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eufq)) {
            return false;
        }
        eufq eufqVar = (eufq) obj;
        return eufqVar.e() == e() && eufqVar.c() == c() && eufqVar.a == this.a && eufqVar.b == this.b && eufqVar.d() == d() && eufqVar.b() == b();
    }

    public final int hashCode() {
        return Objects.hash(eufq.class, this.c, this.d, this.a, this.b, this.e, this.f);
    }

    public final String toString() {
        eufp eufpVar = this.a;
        return "AesCtrHmacStreaming Parameters (IKM size: " + this.c + ", " + this.d + "-byte AES key, " + String.valueOf(eufpVar) + " for HKDF, " + String.valueOf(eufpVar) + " for HMAC, " + this.e + "-byte tags, " + this.f + "-byte ciphertexts)";
    }
}
