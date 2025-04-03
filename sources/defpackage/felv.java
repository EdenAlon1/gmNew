package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felv implements Runnable {
    final /* synthetic */ fevq a;
    final /* synthetic */ felz b;

    public felv(felz felzVar, fevq fevqVar) {
        this.a = fevqVar;
        this.b = felzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
