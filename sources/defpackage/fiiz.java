package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiiz implements Runnable {
    final /* synthetic */ filr a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    public fiiz(filr filrVar, int i, long j, int i2) {
        this.a = filrVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onThroughputObservation(this.b, this.c, this.d);
    }
}
