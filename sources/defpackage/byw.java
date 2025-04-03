package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class byw implements bjt {
    final /* synthetic */ bzy a;

    public byw(bzy bzyVar) {
        this.a = bzyVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        this.a.i(0, "Unable to acquire InputBuffer.", th);
    }

    @Override // defpackage.bjt
    public final /* synthetic */ void b(Object obj) {
        cac cacVar = (cac) obj;
        cacVar.b(caf.b());
        cacVar.c();
        cacVar.b = true;
        cacVar.e();
        bkj.i(cacVar.a(), new byv(this), this.a.h);
    }
}
