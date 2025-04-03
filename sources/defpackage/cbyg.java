package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbyg implements cbyl {
    private final Optional a;

    public cbyg(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.cbyl
    public final elfl a(btih btihVar) {
        emxf.a(d(btihVar));
        if (!this.a.isEmpty()) {
        }
        return elfo.e(true);
    }

    @Override // defpackage.cbyl
    public final boolean d(btih btihVar) {
        return (btihVar.o() & 4) != 0 && btihVar.m() == 1;
    }
}
