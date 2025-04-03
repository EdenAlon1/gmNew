package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etjb extends etgp {
    public final etje a;
    public final eujt b;
    public final Integer c;

    private etjb(etje etjeVar, eujt eujtVar, Integer num) {
        this.a = etjeVar;
        this.b = eujtVar;
        this.c = num;
    }

    public static etjb b(etje etjeVar, Integer num) {
        eujt b;
        etjd etjdVar = etjeVar.a;
        if (etjdVar == etjd.b) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b = etsi.a;
        } else {
            if (etjdVar != etjd.a) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(etjdVar.c));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b = etsi.b(num.intValue());
        }
        return new etjb(etjeVar, b, num);
    }

    @Override // defpackage.etfs
    public final Integer a() {
        throw null;
    }
}
