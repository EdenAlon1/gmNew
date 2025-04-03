package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyb extends ffkk implements ffji {
    final /* synthetic */ eyh a;
    final /* synthetic */ jlk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyb(eyh eyhVar, jlk jlkVar) {
        super(1);
        this.a = eyhVar;
        this.b = jlkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jpg a;
        jlk d;
        icv o;
        idd iddVar = (idd) obj;
        eyh eyhVar = this.a;
        if (!new eyd(eyhVar).invoke().booleanValue() || (a = eyhVar.a()) == null || (d = eyh.d(this.b, a)) == null) {
            o = null;
        } else {
            o = a.o(d.b, d.c);
            iam m = a.m(d.b);
            o.n(((Float.floatToRawIntBits(m.c) & 4294967295L) | (Float.floatToRawIntBits(a.h(d.b) == a.h(d.c + (-1)) ? Math.min(a.m(d.c - 1).b, m.b) : 0.0f) << 32)) ^ (-9223372034707292160L));
        }
        eyc eycVar = o != null ? new eyc(o) : null;
        if (eycVar != null) {
            iddVar.A(eycVar);
            iddVar.r(true);
        }
        return ffcu.a;
    }
}
