package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufk extends eugp {
    public final eufq a;
    public final eujv b;

    private eufk(eufq eufqVar, eujv eujvVar) {
        this.a = eufqVar;
        this.b = eujvVar;
    }

    public static eufk b(eufq eufqVar, eujv eujvVar) {
        if (eufqVar.e() == eujvVar.a()) {
            return new eufk(eufqVar, eujvVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
