package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etju extends etgp {
    public final etjz a;
    public final eujv b;
    public final eujt c;
    public final Integer d;

    private etju(etjz etjzVar, eujv eujvVar, eujt eujtVar, Integer num) {
        this.a = etjzVar;
        this.b = eujvVar;
        this.c = eujtVar;
        this.d = num;
    }

    public static etju b(etjz etjzVar, eujv eujvVar, Integer num) {
        eujt b;
        etjy etjyVar = etjy.b;
        etjy etjyVar2 = etjzVar.a;
        if (etjyVar2 != etjyVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + etjyVar2.c + " the value of idRequirement must be non-null");
        }
        if (etjyVar2 == etjyVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (eujvVar.a() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + eujvVar.a());
        }
        if (etjyVar2 == etjyVar) {
            b = etsi.a;
        } else {
            if (etjyVar2 != etjy.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(etjyVar2.c));
            }
            b = etsi.b(num.intValue());
        }
        return new etju(etjzVar, eujvVar, b, num);
    }

    @Override // defpackage.etfs
    public final Integer a() {
        throw null;
    }
}
