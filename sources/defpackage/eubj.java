package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eubj {
    public static final eubo a(eubm eubmVar, eubk eubkVar, eubl eublVar, eubn eubnVar) {
        if (eubkVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        if (eubkVar == eubk.a && eublVar != eubl.a) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (eubkVar == eubk.b && eublVar != eubl.b && eublVar != eubl.c) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (eubkVar != eubk.c || eublVar == eubl.c) {
            return new eubo(eubmVar, eubkVar, eublVar, eubnVar);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }
}
