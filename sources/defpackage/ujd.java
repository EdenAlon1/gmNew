package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujd implements dqlv {
    private final /* synthetic */ uls a;

    public ujd(alcb alcbVar, final uco ucoVar, Supplier supplier) {
        this.a = new uls(alcbVar, supplier, new ffji() { // from class: ujc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ufi ufiVar = (ufi) obj;
                ufiVar.getClass();
                return uco.this.a(ufiVar, (dcle) ujg.a.a());
            }
        });
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        return this.a.a((ufi) doxsVar, ffguVar);
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void c(doxs doxsVar) {
        ((ufi) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        this.a.d((ufi) doxsVar);
    }

    @Override // defpackage.dqlv
    public final void b() {
    }
}
