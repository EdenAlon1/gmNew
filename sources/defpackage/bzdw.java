package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzdw implements erqj {
    final /* synthetic */ bzdx a;

    public bzdw(bzdx bzdxVar) {
        this.a = bzdxVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bzdx.a.m("Settings update processed.");
        synchronized (this.a) {
            bzdx bzdxVar = this.a;
            if (bzdxVar.r) {
                bzdxVar.a();
            }
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        bzdx.a.o("Settings update failed to process.", th);
    }
}
