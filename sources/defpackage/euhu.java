package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhu implements etgh {
    public euhu(euiu euiuVar) {
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        eujp.b(euiuVar);
    }
}
