package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uin implements dqlv {
    private final /* synthetic */ uls a;

    public uin(alcb alcbVar, final uco ucoVar, Supplier supplier) {
        this.a = new uls(alcbVar, supplier, new ffji() { // from class: uim
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ufr ufrVar = (ufr) obj;
                ufrVar.getClass();
                return uco.this.a(ufrVar, (dcle) uiq.a.a());
            }
        });
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        return this.a.a((ufr) doxsVar, ffguVar);
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void c(doxs doxsVar) {
        ((ufr) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        this.a.d((ufr) doxsVar);
    }

    @Override // defpackage.dqlv
    public final void b() {
    }
}
