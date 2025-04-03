package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ferg implements Runnable {
    final /* synthetic */ ferq a;

    public ferg(ferq ferqVar) {
        this.a = ferqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ferq ferqVar = this.a;
        ferqVar.p = null;
        ferqVar.i.c();
        this.a.d();
    }
}
