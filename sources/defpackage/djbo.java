package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djbo implements fbbf {
    private final djbp a;
    private final int b;

    public djbo(djbp djbpVar, int i) {
        this.a = djbpVar;
        this.b = i;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.b;
        if (i == 0) {
            return fbco.a(this.a.g, fbbh.a);
        }
        if (i == 1) {
            djbp djbpVar = this.a;
            diyy diyyVar = djcx.a;
            return djbpVar.a;
        }
        if (i != 2) {
            return i != 3 ? i != 4 ? new eimi(new eimo()) : new eimm() : new eima();
        }
        djbp djbpVar2 = this.a;
        return new djgi(djbpVar2.b, djbpVar2.o, djbpVar2.c);
    }
}
