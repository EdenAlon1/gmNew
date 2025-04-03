package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqx {
    private int a = 1;

    public final synchronized void a() {
        int i = this.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                throw new IllegalStateException("Attempted to START when already STARTED");
            }
            throw new IllegalStateException("Unhandled state transition: old: " + abqw.a(i) + " new: " + abqw.a(2));
        }
        this.a = 2;
    }

    public final synchronized boolean b() {
        boolean z;
        int i = this.a;
        z = i == 1;
        if (i == 0) {
            throw null;
        }
        return z;
    }
}
