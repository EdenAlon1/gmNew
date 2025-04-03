package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class faxc implements Runnable {
    private final fawn a;
    private final fawj b;

    public faxc(fawn fawnVar, fawj fawjVar) {
        this.a = fawnVar;
        this.b = fawjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
