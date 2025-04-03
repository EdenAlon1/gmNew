package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzm implements tyw {
    final /* synthetic */ aqge a;
    private ctbx b;

    public tzm(aqge aqgeVar) {
        this.a = aqgeVar;
    }

    @Override // defpackage.tyw
    public final void a(final ffix ffixVar) {
        this.b = this.a.a(new aqgd() { // from class: tzl
            @Override // defpackage.aqgd
            public final elfl a() {
                ffix.this.invoke();
                return elfo.e(null);
            }
        });
    }

    @Override // defpackage.tyw
    public final void b() {
        ctbx ctbxVar = this.b;
        if (ctbxVar == null) {
            ffkj.c("subscriptionToken");
            ctbxVar = null;
        }
        ctbxVar.a();
    }
}
