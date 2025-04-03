package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amk implements bjt {
    final /* synthetic */ amm a;

    public amk(amm ammVar) {
        this.a = ammVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        avw.d("ProcessingCaptureSession", "open session failed ", th);
        this.a.f();
        this.a.p();
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
