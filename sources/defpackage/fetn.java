package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetn implements Runnable {
    final /* synthetic */ fetr a;

    public fetn(fetr fetrVar) {
        this.a = fetrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b.G = true;
        fetu fetuVar = this.a.b;
        feju fejuVar = fetuVar.C;
        feth fethVar = fetuVar.A;
        fejuVar.a(fethVar.a, fethVar.b, fethVar.c);
    }
}
