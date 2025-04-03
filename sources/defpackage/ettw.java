package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettw {
    private Integer b = null;
    private Integer c = null;
    public ettx a = ettx.d;

    public final etty a() {
        Integer num = this.b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.a != null) {
            return new etty(num.intValue(), this.c.intValue(), this.a);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final void b(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void c(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(a.h(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.c = Integer.valueOf(i);
    }
}
