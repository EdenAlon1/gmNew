package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnv extends etpa {
    public final etnt a;
    public final ECPoint b;
    public final eujt c;
    public final eujt d;
    public final Integer e;

    private etnv(etnt etntVar, ECPoint eCPoint, eujt eujtVar, eujt eujtVar2, Integer num) {
        this.a = etntVar;
        this.b = eCPoint;
        this.c = eujtVar;
        this.d = eujtVar2;
        this.e = num;
    }

    public static etnv b(etnt etntVar, eujt eujtVar, Integer num) {
        if (!etntVar.b.equals(etnp.d)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        f(etntVar.e, num);
        if (eujtVar.a() == 32) {
            return new etnv(etntVar, null, eujtVar, e(etntVar.e, num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static etnv c(etnt etntVar, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        if (etntVar.b.equals(etnp.d)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        f(etntVar.e, num);
        etnp etnpVar = etntVar.b;
        if (etnpVar == etnp.a) {
            curve = etrc.a.getCurve();
        } else if (etnpVar == etnp.b) {
            curve = etrc.b.getCurve();
        } else {
            if (etnpVar != etnp.c) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(etnpVar))));
            }
            curve = etrc.c.getCurve();
        }
        etrc.f(eCPoint, curve);
        return new etnv(etntVar, eCPoint, null, e(etntVar.e, num), num);
    }

    private static eujt e(etns etnsVar, Integer num) {
        if (etnsVar == etns.c) {
            return etsi.a;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(etnsVar))));
        }
        if (etnsVar == etns.b) {
            return etsi.a(num.intValue());
        }
        if (etnsVar == etns.a) {
            return etsi.b(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(etnsVar))));
    }

    private static void f(etns etnsVar, Integer num) {
        if (!etnsVar.equals(etns.c) && num == null) {
            throw new GeneralSecurityException(a.F(etnsVar, "'idRequirement' must be non-null for ", " variant."));
        }
        if (etnsVar.equals(etns.c) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // defpackage.etfs
    public final Integer a() {
        return this.e;
    }

    @Override // defpackage.etpa
    public final eujt d() {
        return this.d;
    }
}
