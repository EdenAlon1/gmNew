package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugn {
    private static final etrh a = b();

    public static etfn a() {
        if (etmk.a()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant StreamingAead in FIPS mode");
        }
        return a;
    }

    private static etrh b() {
        try {
            etsw etswVar = new etsw();
            etswVar.b(eugs.a);
            etswVar.a(new etst(eufr.class, etgl.class, new etsu() { // from class: eugl
                @Override // defpackage.etsu
                public final Object a(etfs etfsVar) {
                    return new euho((eufr) etfsVar);
                }
            }));
            etswVar.a(new etst(eufk.class, etgl.class, new etsu() { // from class: eugm
                @Override // defpackage.etsu
                public final Object a(etfs etfsVar) {
                    return new euhg((eufk) etfsVar);
                }
            }));
            return new etrg(new etsy(etswVar));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
