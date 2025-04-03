package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethg {
    public static final ethh a(ethn ethnVar, eujv eujvVar, Integer num) {
        eujt b;
        if (ethnVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ethnVar.a != eujvVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ethnVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ethnVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ethm ethmVar = ethnVar.d;
        if (ethmVar == ethm.c) {
            b = etsi.a;
        } else if (ethmVar == ethm.b) {
            b = etsi.a(num.intValue());
        } else {
            if (ethmVar != ethm.a) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(ethmVar))));
            }
            b = etsi.b(num.intValue());
        }
        return new ethh(ethnVar, eujvVar, b, num);
    }
}
