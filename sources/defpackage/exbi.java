package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbi implements Runnable {
    final /* synthetic */ exbu a;

    public exbi(exbu exbuVar) {
        this.a = exbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k();
        this.a.f.setAlpha(1.0f);
    }
}
