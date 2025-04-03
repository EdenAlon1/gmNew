package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eujh implements etgh {
    public eujh(RSAPrivateCrtKey rSAPrivateCrtKey, euiu euiuVar, euiu euiuVar2) {
        if (etmk.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        eujq.d(euiuVar);
        if (!euiuVar.equals(euiuVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        eujq.b(rSAPrivateCrtKey.getModulus().bitLength());
        eujq.c(rSAPrivateCrtKey.getPublicExponent());
    }
}
