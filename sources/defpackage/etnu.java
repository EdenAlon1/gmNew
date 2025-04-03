package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnu extends etoz {
    public final etnv a;
    public final euju b;
    public final eujv c;

    public etnu(etnv etnvVar, euju eujuVar, eujv eujvVar) {
        this.a = etnvVar;
        this.b = eujuVar;
        this.c = eujvVar;
    }

    public static etnu d(etnv etnvVar, euju eujuVar) {
        ECPoint eCPoint = etnvVar.b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        BigInteger bigInteger = eujuVar.a;
        etnp etnpVar = etnvVar.a.b;
        BigInteger order = g(etnpVar).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (etrc.e(bigInteger, g(etnpVar)).equals(eCPoint)) {
            return new etnu(etnvVar, eujuVar, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    private static ECParameterSpec g(etnp etnpVar) {
        if (etnpVar == etnp.a) {
            return etrc.a;
        }
        if (etnpVar == etnp.b) {
            return etrc.b;
        }
        if (etnpVar == etnp.c) {
            return etrc.c;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(etnpVar))));
    }

    @Override // defpackage.etoz, defpackage.etgg
    public final /* synthetic */ etfs b() {
        return this.a;
    }

    public final etnt c() {
        return this.a.a;
    }

    @Override // defpackage.etoz
    public final /* synthetic */ etpa e() {
        return this.a;
    }
}
