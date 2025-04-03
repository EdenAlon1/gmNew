package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axbf implements cjmi {
    final /* synthetic */ axbh a;
    final /* synthetic */ ffrf b;
    final /* synthetic */ cjmw c;

    public axbf(axbh axbhVar, ffrf ffrfVar, cjmw cjmwVar) {
        this.a = axbhVar;
        this.b = ffrfVar;
        this.c = cjmwVar;
    }

    @Override // defpackage.cjmi
    public final Object a(cjmw cjmwVar, int i) {
        this.a.f(this.b, this.c, cjmwVar, 1);
        return ffcu.a;
    }

    @Override // defpackage.cjmi
    public final Object b(cjmw cjmwVar) {
        this.a.f(this.b, this.c, cjmwVar, -1);
        return ffcu.a;
    }

    @Override // defpackage.cjmi
    public final Object c(cjmw cjmwVar) {
        this.a.f(this.b, this.c, cjmwVar, 0);
        return ffcu.a;
    }
}
