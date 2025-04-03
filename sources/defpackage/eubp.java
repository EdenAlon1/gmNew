package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eubp {
    public static final eubq a(eubs eubsVar, euju eujuVar) {
        BigInteger bigInteger = eujuVar.a;
        eubk eubkVar = eubsVar.a.b;
        BigInteger order = eubkVar.e.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (etrc.e(bigInteger, eubkVar.e).equals(eubsVar.b)) {
            return new eubq(eubsVar, eujuVar);
        }
        throw new GeneralSecurityException("Invalid private value");
    }
}
