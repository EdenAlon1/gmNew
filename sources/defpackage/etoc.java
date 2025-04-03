package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etoc extends etoz {
    public final etok a;
    public final eujv b;

    private etoc(etok etokVar, eujv eujvVar) {
        this.a = etokVar;
        this.b = eujvVar;
    }

    public static etoc d(etok etokVar, eujv eujvVar) {
        ECParameterSpec eCParameterSpec;
        int a = eujvVar.a();
        etnz etnzVar = etokVar.a.a;
        String str = "Encoded private key byte length for " + etnzVar.toString() + " must be %d, not " + a;
        if (etnzVar == etnz.a) {
            if (a != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (etnzVar == etnz.b) {
            if (a != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (etnzVar == etnz.c) {
            if (a != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (etnzVar != etnz.f) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(etnzVar.toString()));
            }
            if (a != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        etob etobVar = etokVar.a;
        byte[] c = etokVar.b.c();
        byte[] d = eujvVar.d();
        etnz etnzVar2 = etobVar.a;
        etnz etnzVar3 = etnz.a;
        if (etnzVar2 == etnzVar3 || etnzVar2 == etnz.b || etnzVar2 == etnz.c) {
            if (etnzVar2 == etnzVar3) {
                eCParameterSpec = etrc.a;
            } else if (etnzVar2 == etnz.b) {
                eCParameterSpec = etrc.b;
            } else {
                if (etnzVar2 != etnz.c) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(etnzVar2.toString()));
                }
                eCParameterSpec = etrc.c;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigInteger = new BigInteger(1, d);
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!etrc.e(bigInteger, eCParameterSpec).equals(euif.i(eCParameterSpec.getCurve(), euie.UNCOMPRESSED, c))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (etnzVar2 != etnz.f) {
                throw new IllegalArgumentException("Unable to validate key pair for ".concat(etnzVar2.toString()));
            }
            if (!Arrays.equals(eujr.c(d), c)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new etoc(etokVar, eujvVar);
    }

    @Override // defpackage.etoz, defpackage.etgg
    public final /* synthetic */ etfs b() {
        return this.a;
    }

    public final etob c() {
        return this.a.a;
    }

    @Override // defpackage.etoz
    public final /* synthetic */ etpa e() {
        return this.a;
    }
}
