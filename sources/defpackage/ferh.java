package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ferh implements Runnable {
    final /* synthetic */ ferq a;

    public ferh(ferq ferqVar) {
        this.a = ferqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ferq ferqVar = this.a;
        ferqVar.l = null;
        if (ferqVar.i.e()) {
            this.a.d();
        }
    }
}
