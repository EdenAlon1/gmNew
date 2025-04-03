package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etml {
    public static final etmm a(etmt etmtVar, eujv eujvVar, Integer num) {
        eujt b;
        if (etmtVar == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (etmtVar.a != eujvVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (etmtVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!etmtVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        etms etmsVar = etmtVar.b;
        if (etmsVar == etms.c) {
            b = etsi.a;
        } else if (etmsVar == etms.b) {
            b = etsi.a(num.intValue());
        } else {
            if (etmsVar != etms.a) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(String.valueOf(etmsVar))));
            }
            b = etsi.b(num.intValue());
        }
        return new etmm(etmtVar, eujvVar, b, num);
    }
}
