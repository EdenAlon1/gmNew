package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffvc implements Runnable {
    private final ffsd a;
    private final ffrf b;

    public ffvc(ffsd ffsdVar, ffrf ffrfVar) {
        this.a = ffsdVar;
        this.b = ffrfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(this.a, ffcu.a);
    }
}
