package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etok extends etpa {
    public final etob a;
    public final eujt b;
    public final eujt c;
    public final Integer d;

    private etok(etob etobVar, eujt eujtVar, eujt eujtVar2, Integer num) {
        this.a = etobVar;
        this.b = eujtVar;
        this.c = eujtVar2;
        this.d = num;
    }

    public static etok b(etob etobVar, eujt eujtVar, Integer num) {
        EllipticCurve curve;
        eujt b;
        etoa etoaVar = etoa.c;
        etoa etoaVar2 = etobVar.d;
        if (!etoaVar2.equals(etoaVar) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + etoaVar2.d + " variant.");
        }
        if (etoaVar2.equals(etoa.c) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        etnz etnzVar = etobVar.a;
        int a = eujtVar.a();
        String str = "Encoded public key byte length for " + etnzVar.toString() + " must be %d, not " + a;
        etnz etnzVar2 = etnz.a;
        if (etnzVar == etnzVar2) {
            if (a != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (etnzVar == etnz.b) {
            if (a != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (etnzVar == etnz.c) {
            if (a != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (etnzVar != etnz.f) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(etnzVar.toString()));
            }
            if (a != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (etnzVar == etnzVar2 || etnzVar == etnz.b || etnzVar == etnz.c) {
            if (etnzVar == etnzVar2) {
                curve = etrc.a.getCurve();
            } else if (etnzVar == etnz.b) {
                curve = etrc.b.getCurve();
            } else {
                if (etnzVar != etnz.c) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(etnzVar.toString()));
                }
                curve = etrc.c.getCurve();
            }
            etrc.f(euif.i(curve, euie.UNCOMPRESSED, eujtVar.c()), curve);
        }
        etoa etoaVar3 = etobVar.d;
        if (etoaVar3 == etoa.c) {
            b = etsi.a;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(etoaVar3.d));
            }
            if (etoaVar3 == etoa.b) {
                b = etsi.a(num.intValue());
            } else {
                if (etoaVar3 != etoa.a) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(etoaVar3.d));
                }
                b = etsi.b(num.intValue());
            }
        }
        return new etok(etobVar, eujtVar, b, num);
    }

    @Override // defpackage.etfs
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.etpa
    public final eujt d() {
        return this.c;
    }
}
