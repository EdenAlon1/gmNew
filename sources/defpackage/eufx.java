package defpackage;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufx {
    private Integer b = null;
    private Integer c = null;
    public eufy a = null;
    private Integer d = null;

    public final eufz a() {
        if (this.b == null) {
            throw new GeneralSecurityException("keySizeBytes needs to be set");
        }
        Integer num = this.c;
        if (num == null) {
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("hkdfHashType needs to be set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be set");
        }
        if (num.intValue() != 16 && this.c.intValue() != 32) {
            Integer num2 = this.c;
            Objects.toString(num2);
            throw new GeneralSecurityException("derivedAesGcmKeySizeBytes needs to be 16 or 32, not ".concat(String.valueOf(num2)));
        }
        if (this.b.intValue() < this.c.intValue()) {
            Integer num3 = this.c;
            Objects.toString(num3);
            throw new GeneralSecurityException("keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., ".concat(String.valueOf(num3)));
        }
        if (this.d.intValue() > this.c.intValue() + 24) {
            return new eufz(this.b, this.c, this.a, this.d);
        }
        throw new GeneralSecurityException("ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., " + (this.c.intValue() + 25));
    }

    public final void b(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.b = Integer.valueOf(i);
    }
}
