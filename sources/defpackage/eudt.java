package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudt {
    public static final eudu a(eudq eudqVar, BigInteger bigInteger, Integer num) {
        eujt a;
        if (eudqVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int i = eudqVar.b;
        int bitLength = bigInteger.bitLength();
        if (bitLength != i) {
            throw new GeneralSecurityException(a.r(i, bitLength, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (eudqVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!eudqVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        eudp eudpVar = eudqVar.d;
        if (eudpVar == eudp.d) {
            a = etsi.a;
        } else if (eudpVar == eudp.c || eudpVar == eudp.b) {
            a = etsi.a(num.intValue());
        } else {
            if (eudpVar != eudp.a) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(String.valueOf(eudpVar))));
            }
            a = etsi.b(num.intValue());
        }
        return new eudu(eudqVar, bigInteger, a, num);
    }
}
