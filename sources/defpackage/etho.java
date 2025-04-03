package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etho {
    public static final ethp a(ethw ethwVar, eujv eujvVar, Integer num) {
        eujt b;
        if (ethwVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ethwVar.a != eujvVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ethwVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ethwVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ethv ethvVar = ethwVar.d;
        if (ethvVar == ethv.c) {
            b = etsi.a;
        } else if (ethvVar == ethv.b) {
            b = etsi.a(num.intValue());
        } else {
            if (ethvVar != ethv.a) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(ethvVar))));
            }
            b = etsi.b(num.intValue());
        }
        return new ethp(ethwVar, eujvVar, b, num);
    }
}
