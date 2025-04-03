package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mie extends mta {
    private final lrt c;

    public mie(lru lruVar) {
        super(lruVar);
        this.c = new lrt();
    }

    @Override // defpackage.mta, defpackage.lru
    public final lrs d(int i, lrs lrsVar, boolean z) {
        lrs d = super.d(i, lrsVar, z);
        if (super.p(d.c, this.c).c()) {
            d.l(lrsVar.a, lrsVar.b, lrsVar.c, lrsVar.d, lrsVar.e, lph.a, true);
            return d;
        }
        d.f = true;
        return d;
    }
}
