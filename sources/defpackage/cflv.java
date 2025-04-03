package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cflv extends csld {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ cflw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cflv(cflw cflwVar, int i, String str, Runnable runnable) {
        super("Bugle.Async.Compose.updateMessageTextStats.Duration");
        this.a = i;
        this.b = str;
        this.c = runnable;
        this.d = cflwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.b(this.a, this.b);
        cslq.f(this.c);
    }
}
