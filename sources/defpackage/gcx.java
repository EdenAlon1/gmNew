package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcx implements ffxy {
    final /* synthetic */ eey a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ham c;
    final /* synthetic */ ffmj d;

    public gcx(eey eeyVar, ffji ffjiVar, ham hamVar, ffmj ffmjVar) {
        this.a = eeyVar;
        this.b = ffjiVar;
        this.c = hamVar;
        this.d = ffmjVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        ((Number) obj).intValue();
        int b = this.a.b() / 12;
        int b2 = this.a.b() % 12;
        this.b.invoke(new Long(this.c.g(this.d.a + b, b2 + 1).e));
        return ffcu.a;
    }
}
