package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ozt {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ par b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ozt(Runnable runnable, par parVar, Runnable runnable2) {
        this.a = runnable;
        this.b = parVar;
        this.c = runnable2;
    }

    public final void a() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            return;
        }
        Runnable runnable2 = this.c;
        this.b.n();
        runnable2.run();
    }
}
