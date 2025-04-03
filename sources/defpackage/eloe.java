package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eloe extends eloo {
    private Optional a = Optional.empty();

    @Override // defpackage.eloo, defpackage.elpd
    public final /* bridge */ /* synthetic */ Object a() {
        return new elof(this.a);
    }

    @Override // defpackage.eloo
    public final void b(elyt elytVar) {
        this.a = Optional.of(elytVar);
    }
}
