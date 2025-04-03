package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krd implements Runnable {
    final /* synthetic */ kru a;
    final /* synthetic */ int b;

    public krd(kru kruVar, int i) {
        this.a = kruVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
