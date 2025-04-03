package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethx {
    public static final ethy a(etif etifVar, eujv eujvVar, Integer num) {
        eujt b;
        if (etifVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (etifVar.a != eujvVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (etifVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!etifVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        etie etieVar = etifVar.b;
        if (etieVar == etie.c) {
            b = etsi.a;
        } else if (etieVar == etie.b) {
            b = etsi.a(num.intValue());
        } else {
            if (etieVar != etie.a) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(etieVar))));
            }
            b = etsi.b(num.intValue());
        }
        return new ethy(etifVar, eujvVar, b, num);
    }
}
