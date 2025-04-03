package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiiy implements Runnable {
    final /* synthetic */ filq a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    public fiiy(filq filqVar, int i, long j, int i2) {
        this.a = filqVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onRttObservation(this.b, this.c, this.d);
    }
}
