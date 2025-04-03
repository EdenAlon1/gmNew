package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcm implements Runnable {
    final /* synthetic */ ffgu a;
    final /* synthetic */ Exception b;

    public fjcm(ffgu ffguVar, Exception exc) {
        this.a = ffguVar;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ffhi.c(this.a).w(ffci.a(this.b));
    }
}
