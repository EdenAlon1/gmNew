package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudq extends euea {
    public static final BigInteger a = BigInteger.valueOf(65537);
    public final int b;
    public final BigInteger c;
    public final eudp d;
    public final eudo e;
    public final eudo f;
    public final int g;

    public eudq(int i, BigInteger bigInteger, eudp eudpVar, eudo eudoVar, eudo eudoVar2, int i2) {
        this.b = i;
        this.c = bigInteger;
        this.d = eudpVar;
        this.e = eudoVar;
        this.f = eudoVar2;
        this.g = i2;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.d != eudp.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eudq)) {
            return false;
        }
        eudq eudqVar = (eudq) obj;
        return eudqVar.b == this.b && Objects.equals(eudqVar.c, this.c) && Objects.equals(eudqVar.d, this.d) && Objects.equals(eudqVar.e, this.e) && Objects.equals(eudqVar.f, this.f) && eudqVar.g == this.g;
    }

    public final int hashCode() {
        return Objects.hash(eudq.class, Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g));
    }

    public final String toString() {
        BigInteger bigInteger = this.c;
        eudo eudoVar = this.f;
        eudo eudoVar2 = this.e;
        return "RSA SSA PSS Parameters (variant: " + String.valueOf(this.d) + ", signature hashType: " + String.valueOf(eudoVar2) + ", mgf1 hashType: " + String.valueOf(eudoVar) + ", saltLengthBytes: " + this.g + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.b + "-bit modulus)";
    }
}
