package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etka extends etgp {
    public final etkg a;
    public final eujv b;
    public final eujt c;
    public final Integer d;

    private etka(etkg etkgVar, eujv eujvVar, eujt eujtVar, Integer num) {
        this.a = etkgVar;
        this.b = eujvVar;
        this.c = eujtVar;
        this.d = num;
    }

    public static etka b(etkf etkfVar, eujv eujvVar, Integer num) {
        eujt b;
        etkf etkfVar2 = etkf.c;
        if (etkfVar != etkfVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + etkfVar.d + " the value of idRequirement must be non-null");
        }
        if (etkfVar == etkfVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (eujvVar.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + eujvVar.a());
        }
        etkg etkgVar = new etkg(etkfVar);
        etkf etkfVar3 = etkgVar.a;
        if (etkfVar3 == etkfVar2) {
            b = etsi.a;
        } else if (etkfVar3 == etkf.b) {
            b = etsi.a(num.intValue());
        } else {
            if (etkfVar3 != etkf.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(etkfVar3.d));
            }
            b = etsi.b(num.intValue());
        }
        return new etka(etkgVar, eujvVar, b, num);
    }

    @Override // defpackage.etfs
    public final Integer a() {
        throw null;
    }
}
