package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkz implements Runnable {
    final /* synthetic */ lld a;

    public lkz(lld lldVar) {
        this.a = lldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.a.c) {
            obj = this.a.f;
            this.a.f = lld.b;
        }
        this.a.m(obj);
    }
}
