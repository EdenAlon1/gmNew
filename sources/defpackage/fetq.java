package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetq implements Runnable {
    final /* synthetic */ fetr a;

    public fetq(fetr fetrVar) {
        this.a = fetrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fetu fetuVar = this.a.b;
        if (fetuVar.G) {
            return;
        }
        fetuVar.C.e();
    }
}
