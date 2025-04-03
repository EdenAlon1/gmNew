package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etoq {
    private static final etrh a = b();

    public static etfn a() {
        if (etmk.a()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV0 in FIPS mode");
        }
        return a;
    }

    private static etrh b() {
        try {
            etsw etswVar = new etsw();
            etswVar.b(etow.a);
            etswVar.a(new etst(etnv.class, etfr.class, new etsu() { // from class: etom
                @Override // defpackage.etsu
                public final Object a(etfs etfsVar) {
                    return euhx.b((etnv) etfsVar);
                }
            }));
            etswVar.a(new etst(etok.class, etfr.class, new etsu() { // from class: eton
                @Override // defpackage.etsu
                public final Object a(etfs etfsVar) {
                    return etpt.b((etok) etfsVar);
                }
            }));
            etswVar.b(etot.a);
            etswVar.a(new etst(etnu.class, etfq.class, new etsu() { // from class: etoo
                @Override // defpackage.etsu
                public final Object a(etfs etfsVar) {
                    return euhw.b((etnu) etfsVar);
                }
            }));
            etswVar.a(new etst(etoc.class, etfq.class, new etsu() { // from class: etop
                @Override // defpackage.etsu
                public final Object a(etfs etfsVar) {
                    return etps.b((etoc) etfsVar);
                }
            }));
            return new etrg(new etsy(etswVar));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
