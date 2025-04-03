package defpackage;

import defpackage.ernr;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class errq extends ernr.i implements Runnable {
    private final Runnable a;

    public errq(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.ernr
    protected final String gP() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }
}
