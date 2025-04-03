package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crvf implements erqj {
    final /* synthetic */ int a;
    final /* synthetic */ crvg b;

    public crvf(crvg crvgVar, int i) {
        this.a = i;
        this.b = crvgVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.j.e("Bugle.Cms.Backup.Disable.Success.Count", this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.b.j.e("Bugle.Cms.Backup.Disable.Failure.Count", this.a);
        crvg.a.s("Failed to disable CMS backup", th);
    }
}
