package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudn {
    private static final BigInteger e;
    private static final BigInteger f;
    private Integer g = null;
    public BigInteger a = eudq.a;
    public eudo b = null;
    public eudo c = null;
    private Integer h = null;
    public eudp d = eudp.d;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        e = valueOf;
        f = valueOf.pow(256);
    }

    public final eudq a() {
        Integer num = this.g;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.h == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.g, 2048));
        }
        if (this.b != this.c) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.a;
        int compareTo = bigInteger.compareTo(eudq.a);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new eudq(this.g.intValue(), this.a, this.d, this.b, this.c, this.h.intValue());
    }

    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void c(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.h = Integer.valueOf(i);
    }
}
