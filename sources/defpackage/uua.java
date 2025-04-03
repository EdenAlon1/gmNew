package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uua implements ejxk {
    final /* synthetic */ uuy a;

    public uua(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        csjy.p("Bugle", th, "outGoingReactionsCountDatasource onLoadError");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        uuy uuyVar = this.a;
        uuyVar.aW = booleanValue;
        upx upxVar = uuyVar.aB;
        if (upxVar != null) {
            upxVar.c.q(0);
        }
    }
}
