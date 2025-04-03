package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pdg implements Runnable {
    final /* synthetic */ pdq a;

    public pdg(pdq pdqVar) {
        this.a = pdqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pdq pdqVar = this.a;
        pdqVar.g = false;
        pdqVar.G();
    }
}
