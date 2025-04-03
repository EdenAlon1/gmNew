package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufi implements etgh {
    public eufi(RSAPrivateCrtKey rSAPrivateCrtKey, eudo eudoVar, eudo eudoVar2, int i) {
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        eujq.b(rSAPrivateCrtKey.getModulus().bitLength());
        eujq.c(rSAPrivateCrtKey.getPublicExponent());
        eufj.b(eudoVar);
        eufj.d(eudoVar, eudoVar2, i);
    }
}
