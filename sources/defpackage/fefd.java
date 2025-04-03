package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fefd implements fevb {
    public final fevb a;
    public boolean b = false;
    public int c = 0;
    private final Runnable d;

    public fefd(fevb fevbVar, Runnable runnable) {
        this.a = fevbVar;
        this.d = runnable;
    }

    public final Runnable a() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }
}
