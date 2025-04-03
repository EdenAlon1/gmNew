package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fesm implements Runnable {
    final /* synthetic */ fesn a;

    public fesm(fesn fesnVar) {
        this.a = fesnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.G = true;
        fetu fetuVar = this.a.f;
        feju fejuVar = fetuVar.C;
        feth fethVar = fetuVar.A;
        fejuVar.a(fethVar.a, fethVar.b, fethVar.c);
    }
}
