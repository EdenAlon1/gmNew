package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudh {
    public static final eudi a(eude eudeVar, BigInteger bigInteger, Integer num) {
        eujt a;
        if (eudeVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int i = eudeVar.b;
        int bitLength = bigInteger.bitLength();
        if (bitLength != i) {
            throw new GeneralSecurityException(a.r(i, bitLength, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (eudeVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!eudeVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        eudd euddVar = eudeVar.d;
        if (euddVar == eudd.d) {
            a = etsi.a;
        } else if (euddVar == eudd.c || euddVar == eudd.b) {
            a = etsi.a(num.intValue());
        } else {
            if (euddVar != eudd.a) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(String.valueOf(euddVar))));
            }
            a = etsi.b(num.intValue());
        }
        return new eudi(eudeVar, bigInteger, a, num);
    }
}
