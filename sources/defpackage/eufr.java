package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufr extends eugp {
    public final eufz a;
    public final eujv b;

    private eufr(eufz eufzVar, eujv eujvVar) {
        this.a = eufzVar;
        this.b = eujvVar;
    }

    public static eufr b(eufz eufzVar, eujv eujvVar) {
        if (eufzVar.d() == eujvVar.a()) {
            return new eufr(eufzVar, eujvVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
