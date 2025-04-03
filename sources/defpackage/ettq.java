package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettq {
    public static final ettr a(etty ettyVar, eujv eujvVar, Integer num) {
        eujt a;
        if (ettyVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ettyVar.a != eujvVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ettyVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ettyVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ettx ettxVar = ettyVar.c;
        if (ettxVar == ettx.d) {
            a = etsi.a;
        } else if (ettxVar == ettx.c || ettxVar == ettx.b) {
            a = etsi.a(num.intValue());
        } else {
            if (ettxVar != ettx.a) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(ettxVar))));
            }
            a = etsi.b(num.intValue());
        }
        return new ettr(ettyVar, eujvVar, a, num);
    }
}
