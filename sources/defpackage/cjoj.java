package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjoj implements cjmi {
    final /* synthetic */ cjok a;
    final /* synthetic */ ffrf b;
    final /* synthetic */ cjmw c;

    public cjoj(cjok cjokVar, ffrf ffrfVar, cjmw cjmwVar) {
        this.a = cjokVar;
        this.b = ffrfVar;
        this.c = cjmwVar;
    }

    @Override // defpackage.cjmi
    public final Object a(cjmw cjmwVar, int i) {
        cjok.d(this.b, this.c, cjmwVar, i);
        this.a.b.f(this);
        return ffcu.a;
    }

    @Override // defpackage.cjmi
    public final Object b(cjmw cjmwVar) {
        cjok.d(this.b, this.c, cjmwVar, -1);
        this.a.b.f(this);
        return ffcu.a;
    }

    @Override // defpackage.cjmi
    public final Object c(cjmw cjmwVar) {
        cjok.d(this.b, this.c, cjmwVar, 0);
        this.a.b.f(this);
        return ffcu.a;
    }
}
