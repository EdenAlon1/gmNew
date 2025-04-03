package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufz extends eugq {
    public final eufy a;
    private final Integer b;
    private final Integer c;
    private final Integer d;

    public eufz(Integer num, Integer num2, eufy eufyVar, Integer num3) {
        this.b = num;
        this.c = num2;
        this.a = eufyVar;
        this.d = num3;
    }

    public final int b() {
        return this.d.intValue();
    }

    public final int c() {
        return this.c.intValue();
    }

    public final int d() {
        return this.b.intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eufz)) {
            return false;
        }
        eufz eufzVar = (eufz) obj;
        return eufzVar.d() == d() && eufzVar.c() == c() && eufzVar.a == this.a && eufzVar.b() == b();
    }

    public final int hashCode() {
        return Objects.hash(eufz.class, this.b, this.c, this.a, this.d);
    }

    public final String toString() {
        return "AesGcmHkdfStreaming Parameters (IKM size: " + this.b + ", " + this.c + "-byte AES GCM key, " + String.valueOf(this.a) + " for HKDF " + this.d + "-byte ciphertexts)";
    }
}
