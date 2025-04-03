package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwt implements ksz {
    private final String a;
    private final int b;
    private final bqe c;
    private final bve d;
    private final bef e;

    public bwt(String str, int i, bqe bqeVar, bve bveVar, bef befVar) {
        this.a = str;
        this.b = i;
        this.c = bqeVar;
        this.d = bveVar;
        this.e = befVar;
    }

    @Override // defpackage.ksz
    public final /* bridge */ /* synthetic */ Object a() {
        avw.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        bqe bqeVar = this.c;
        bef befVar = this.e;
        int a = befVar.a();
        bve bveVar = this.d;
        int a2 = bws.a(a, bveVar.d(), befVar.b(), bveVar.e(), befVar.e(), ((bqh) bqeVar).c);
        bxi f = bxj.f();
        f.e(this.a);
        f.f(this.b);
        f.h();
        f.d(this.d.d());
        f.g(this.d.e());
        f.c(a2);
        return f.b();
    }
}
