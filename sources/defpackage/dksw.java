package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dksw implements erqj {
    final /* synthetic */ dflc a;

    public dksw(dflc dflcVar) {
        this.a = dflcVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dhvh dhvhVar = (dhvh) obj;
        if (dhvhVar == null) {
            return;
        }
        if (dhvhVar.a()) {
            this.a.c();
        } else {
            dkty.d(dksy.a, "skipped logging metric due to user logging consent preferences", new Object[0]);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        dkty.h(dksy.a, "failed to get User consent with cause %s", th.getMessage());
    }
}
