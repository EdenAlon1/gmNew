package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etuc {
    public static final etud a(etum etumVar, eujv eujvVar, Integer num) {
        eujt a;
        if (etumVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (etumVar.a != eujvVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (etumVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!etumVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        etul etulVar = etumVar.c;
        if (etulVar == etul.d) {
            a = etsi.a;
        } else if (etulVar == etul.c || etulVar == etul.b) {
            a = etsi.a(num.intValue());
        } else {
            if (etulVar != etul.a) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(etulVar))));
            }
            a = etsi.b(num.intValue());
        }
        return new etud(etumVar, eujvVar, a, num);
    }
}
