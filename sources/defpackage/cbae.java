package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbae extends csld {
    final /* synthetic */ cbaf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbae(cbaf cbafVar) {
        super("Bugle.Async.VCardResource.destroyAsync.Duration");
        this.a = cbafVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (cbaj cbajVar : this.a.a) {
            csix.h();
            if (cbgi.k(cbajVar.c, cbajVar.a)) {
                cbajVar.a.getContentResolver().delete(cbajVar.c, null, null);
            }
        }
    }
}
