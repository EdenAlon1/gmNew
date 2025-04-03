package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxwn implements erqj {
    final /* synthetic */ dxwe a;
    final /* synthetic */ dxbq b;
    final /* synthetic */ dxwo c;

    public dxwn(dxwo dxwoVar, dxwe dxweVar, dxbq dxbqVar) {
        this.a = dxweVar;
        this.b = dxbqVar;
        this.c = dxwoVar;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [dxwr, java.lang.Object] */
    @Override // defpackage.erqj
    public final /* synthetic */ void b(Object obj) {
        if (this.c.c.b.g()) {
            this.c.c.b.c().f(((dxvz) this.a).a);
        }
        this.c.c.d.e(((dxbp) this.b).a);
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [dxwr, java.lang.Object] */
    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dxth.k(th, "%s: Failed to run client onComplete", "DownloaderImp");
        if (this.c.c.b.g()) {
            this.c.c.b.c().f(((dxvz) this.a).a);
        }
        this.c.c.d.e(((dxbp) this.b).a);
    }
}
