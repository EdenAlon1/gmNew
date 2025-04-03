package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etig extends etgp {
    public final etil a;
    public final eujv b;
    public final eujt c;
    public final Integer d;

    private etig(etil etilVar, eujv eujvVar, eujt eujtVar, Integer num) {
        this.a = etilVar;
        this.b = eujvVar;
        this.c = eujtVar;
        this.d = num;
    }

    public static etig b(etik etikVar, eujv eujvVar, Integer num) {
        eujt b;
        etik etikVar2 = etik.c;
        if (etikVar != etikVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + etikVar.d + " the value of idRequirement must be non-null");
        }
        if (etikVar == etikVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (eujvVar.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + eujvVar.a());
        }
        etil etilVar = new etil(etikVar);
        etik etikVar3 = etilVar.a;
        if (etikVar3 == etikVar2) {
            b = etsi.a;
        } else if (etikVar3 == etik.b) {
            b = etsi.a(num.intValue());
        } else {
            if (etikVar3 != etik.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(etikVar3.d));
            }
            b = etsi.b(num.intValue());
        }
        return new etig(etilVar, eujvVar, b, num);
    }

    @Override // defpackage.etfs
    public final Integer a() {
        throw null;
    }
}
