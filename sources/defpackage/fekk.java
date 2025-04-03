package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fekk implements Runnable {
    private final fdyn a;

    protected fekk(fdyn fdynVar) {
        this.a = fdynVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        fdyn a = this.a.a();
        try {
            a();
        } finally {
            this.a.f(a);
        }
    }
}
