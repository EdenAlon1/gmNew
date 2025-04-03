package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felf implements Runnable {
    final /* synthetic */ feli a;

    public felf(feli feliVar) {
        this.a = feliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        emxf.m(((fepf) this.a.f).a.B.get(), "Channel must have been shut down");
    }
}
