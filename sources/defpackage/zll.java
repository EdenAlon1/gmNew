package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zll extends ffkh implements ffji {
    public zll(Object obj) {
        super(1, obj, zmw.class, "onScroll", "onScroll(Z)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        aawr aawrVar = ((zmw) this.g).S;
        aawrVar.e.f(bool);
        if (booleanValue) {
            if (!aawrVar.c.a()) {
                ((xie) aawrVar.b.b()).c(null);
            }
            if (aawrVar.d.a()) {
                aawrVar.g.a.remove(abjk.a);
            }
            ((ecmt) aawrVar.a.b()).d(alrv.q);
        } else {
            if (aawrVar.d.a()) {
                aawrVar.g.a(abjk.a);
            }
            ((ecmt) aawrVar.a.b()).g(alrv.q, null);
        }
        return ffcu.a;
    }
}
