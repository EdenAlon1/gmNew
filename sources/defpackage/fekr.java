package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekr implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ felb b;

    public fekr(felb felbVar, Object obj) {
        this.a = obj;
        this.b = felbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.f(this.a);
    }
}
