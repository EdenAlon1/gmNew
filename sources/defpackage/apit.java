package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apit implements ctbj {
    final /* synthetic */ apix a;

    public apit(apix apixVar) {
        this.a = apixVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final apix apixVar = this.a;
        apixVar.c = apixVar.b.a(new aqgd() { // from class: apis
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                apix apixVar2 = apix.this;
                c = axol.c(apixVar2.a, ffhe.a, ffsm.a, new apiw(apixVar2, null));
                return c;
            }
        });
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.c;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.c = null;
    }
}
