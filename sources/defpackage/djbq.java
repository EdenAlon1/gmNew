package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djbq implements fbbf {
    private final djbr a;
    private final int b;

    public djbq(djbr djbrVar, int i) {
        this.a = djbrVar;
        this.b = i;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.b;
        if (i == 0) {
            return fbco.a(this.a.i, fbbh.a);
        }
        if (i == 1) {
            djbr djbrVar = this.a;
            dktn dktnVar = djdq.a;
            return djbrVar.a;
        }
        if (i == 2) {
            djbr djbrVar2 = this.a;
            return new djfv(djbrVar2.b, (dkgw) ((fbbb) djbrVar2.p).a, new eijy(djbrVar2.c), new edzf(djbrVar2.d));
        }
        if (i == 3) {
            djbr djbrVar3 = this.a;
            return new djch(djbrVar3.I, djbrVar3.p, djbrVar3.w, djbrVar3.J, djbrVar3.K);
        }
        if (i == 4) {
            return new eind();
        }
        if (i == 5) {
            return new einl();
        }
        djbr djbrVar4 = this.a;
        return new djgi(djbrVar4.e, djbrVar4.ae, djbrVar4.b);
    }
}
