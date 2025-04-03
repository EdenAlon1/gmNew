package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetp implements Runnable {
    final /* synthetic */ fevq a;
    final /* synthetic */ fetr b;

    public fetp(fetr fetrVar, fevq fevqVar) {
        this.a = fevqVar;
        this.b = fetrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.C.d(this.a);
    }
}
