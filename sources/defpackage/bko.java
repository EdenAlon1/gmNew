package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bko implements kfd {
    final /* synthetic */ bkr a;

    public bko(bkr bkrVar) {
        this.a = bkrVar;
    }

    @Override // defpackage.kfd
    public final Object a(kfb kfbVar) {
        ksw.d(this.a.c == null, "The result can only set once!");
        this.a.c = kfbVar;
        return a.i(this, "ListFuture[", "]");
    }
}
