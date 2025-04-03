package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etid {
    private Integer b = null;
    public etie a = etie.c;

    public final etif a() {
        Integer num = this.b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.a != null) {
            return new etif(num.intValue(), this.a);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void b(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }
}
