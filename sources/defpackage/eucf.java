package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eucf extends euec {
    public final euby a;
    public final eujt b;
    public final eujt c;
    public final Integer d;

    private eucf(euby eubyVar, eujt eujtVar, eujt eujtVar2, Integer num) {
        this.a = eubyVar;
        this.b = eujtVar;
        this.c = eujtVar2;
        this.d = num;
    }

    public static eucf c(eubx eubxVar, eujt eujtVar, Integer num) {
        eujt a;
        euby eubyVar = new euby(eubxVar);
        if (!eubxVar.equals(eubx.d) && num == null) {
            throw new GeneralSecurityException("For given Variant " + eubxVar.e + " the value of idRequirement must be non-null");
        }
        if (eubxVar.equals(eubx.d) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (eujtVar.a() != 32) {
            throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + eujtVar.a());
        }
        eubx eubxVar2 = eubyVar.a;
        if (eubxVar2 == eubx.d) {
            a = etsi.a;
        } else if (eubxVar2 == eubx.b || eubxVar2 == eubx.c) {
            a = etsi.a(num.intValue());
        } else {
            if (eubxVar2 != eubx.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(eubxVar2.e));
            }
            a = etsi.b(num.intValue());
        }
        return new eucf(eubyVar, eujtVar, a, num);
    }

    @Override // defpackage.etfs
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.euec
    public final eujt b() {
        return this.c;
    }
}
