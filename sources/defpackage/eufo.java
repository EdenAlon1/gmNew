package defpackage;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufo {
    private Integer d = null;
    private Integer e = null;
    public eufp a = null;
    public eufp b = null;
    public Integer c = null;
    private Integer f = null;

    public final eufq a() {
        if (this.d == null) {
            throw new GeneralSecurityException("keySizeBytes needs to be set");
        }
        Integer num = this.e;
        if (num == null) {
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("hkdfHashType needs to be set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("hmacHashType needs to be set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("hmacTagSizeBytes needs to be set");
        }
        if (this.f == null) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        }
        if (num.intValue() != 16 && this.e.intValue() != 32) {
            Integer num2 = this.e;
            Objects.toString(num2);
            throw new GeneralSecurityException("derivedKeySizeBytes needs to be 16 or 32, not ".concat(String.valueOf(num2)));
        }
        if (this.d.intValue() < this.e.intValue()) {
            Integer num3 = this.e;
            Objects.toString(num3);
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedKeySizeBytes, i.e., ".concat(String.valueOf(num3)));
        }
        if (this.f.intValue() <= this.e.intValue() + this.c.intValue() + 8) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedKeySizeBytes + hmacTagSizeBytes + 9, i.e., " + (this.e.intValue() + this.c.intValue() + 9));
        }
        eufp eufpVar = this.b;
        int i = eufpVar != eufp.b ? eufpVar == eufp.a ? 20 : 0 : 32;
        if (eufpVar == eufp.c) {
            i = 64;
        }
        if (this.c.intValue() >= 10 && this.c.intValue() <= i) {
            return new eufq(this.d, this.e, this.a, this.b, this.c, this.f);
        }
        throw new GeneralSecurityException("hmacTagSize must be in range [10, " + i + "], but is " + this.c);
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }
}
