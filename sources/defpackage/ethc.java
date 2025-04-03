package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethc {
    private Integer c = null;
    private Integer d = null;
    private Integer e = null;
    private Integer f = null;
    public ethd a = null;
    public ethe b = ethe.c;

    public final ethf a() {
        if (this.c == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.e == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = this.f;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int intValue = num.intValue();
        ethd ethdVar = this.a;
        if (ethdVar == ethd.a) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (ethdVar == ethd.b) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (ethdVar == ethd.c) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (ethdVar == ethd.d) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (ethdVar != ethd.e) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new ethf(this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.b, this.a);
    }

    public final void b(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void c(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    public final void d(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.e = Integer.valueOf(i);
    }

    public final void e(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.f = Integer.valueOf(i);
    }
}
