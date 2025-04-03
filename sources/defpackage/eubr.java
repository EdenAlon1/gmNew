package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eubr {
    public static final eubs a(eubo euboVar, ECPoint eCPoint, Integer num) {
        eujt a;
        if (euboVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        etrc.f(eCPoint, euboVar.b.e.getCurve());
        if (euboVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!euboVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        eubn eubnVar = euboVar.d;
        if (eubnVar == eubn.d) {
            a = etsi.a;
        } else if (eubnVar == eubn.c || eubnVar == eubn.b) {
            a = etsi.a(num.intValue());
        } else {
            if (eubnVar != eubn.a) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(eubnVar.e));
            }
            a = etsi.b(num.intValue());
        }
        return new eubs(euboVar, eCPoint, a, num);
    }
}
