package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgw {
    public static final etgx a(ethf ethfVar, eujv eujvVar, eujv eujvVar2, Integer num) {
        eujt b;
        if (ethfVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        if (ethfVar.a != eujvVar.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (ethfVar.b != eujvVar2.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (ethfVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ethfVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ethe etheVar = ethfVar.e;
        if (etheVar == ethe.c) {
            b = etsi.a;
        } else if (etheVar == ethe.b) {
            b = etsi.a(num.intValue());
        } else {
            if (etheVar != ethe.a) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(etheVar))));
            }
            b = etsi.b(num.intValue());
        }
        return new etgx(ethfVar, eujvVar, eujvVar2, b, num);
    }
}
