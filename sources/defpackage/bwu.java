package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwu implements ksz {
    private final String a;
    private final int b;
    private final bqe c;
    private final bve d;

    public bwu(String str, int i, bqe bqeVar, bve bveVar) {
        this.a = str;
        this.b = i;
        this.c = bqeVar;
        this.d = bveVar;
    }

    @Override // defpackage.ksz
    public final /* bridge */ /* synthetic */ Object a() {
        avw.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        bve bveVar = this.d;
        int a = bws.a(156000, bveVar.d(), 2, bveVar.e(), 48000, ((bqh) this.c).c);
        bxi f = bxj.f();
        f.e(this.a);
        f.f(this.b);
        f.h();
        f.d(this.d.d());
        f.g(this.d.e());
        f.c(a);
        return f.b();
    }
}
