package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class buh implements bjt {
    final /* synthetic */ buj a;

    public buh(buj bujVar) {
        this.a = bujVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        avw.g("VideoEncoderSession", "VideoEncoder configuration failed.", th);
        this.a.b();
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }
}
