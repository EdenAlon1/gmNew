package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetk implements Runnable {
    final /* synthetic */ febo a;
    final /* synthetic */ fetr b;

    public fetk(fetr fetrVar, febo feboVar) {
        this.a = feboVar;
        this.b = fetrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.C.c(this.a);
    }
}
