package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eude extends euea {
    public static final BigInteger a = BigInteger.valueOf(65537);
    public final int b;
    public final BigInteger c;
    public final eudd d;
    public final eudc e;

    public eude(int i, BigInteger bigInteger, eudd euddVar, eudc eudcVar) {
        this.b = i;
        this.c = bigInteger;
        this.d = euddVar;
        this.e = eudcVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.d != eudd.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eude)) {
            return false;
        }
        eude eudeVar = (eude) obj;
        return eudeVar.b == this.b && Objects.equals(eudeVar.c, this.c) && eudeVar.d == this.d && eudeVar.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(eude.class, Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public final String toString() {
        BigInteger bigInteger = this.c;
        eudc eudcVar = this.e;
        return "RSA SSA PKCS1 Parameters (variant: " + String.valueOf(this.d) + ", hashType: " + String.valueOf(eudcVar) + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.b + "-bit modulus)";
    }
}
