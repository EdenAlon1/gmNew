package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekx implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ fela b;

    public fekx(fela felaVar, Object obj) {
        this.a = obj;
        this.b = felaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
