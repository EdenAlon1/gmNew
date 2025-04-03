package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class opt implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ opu b;

    public opt(opu opuVar, int i) {
        this.b = opuVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.r(this.a, "Selection-Changed");
    }
}
