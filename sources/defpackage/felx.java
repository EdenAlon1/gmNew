package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felx implements Runnable {
    final /* synthetic */ febo a;
    final /* synthetic */ felz b;

    public felx(felz felzVar, febo feboVar) {
        this.a = feboVar;
        this.b = felzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
