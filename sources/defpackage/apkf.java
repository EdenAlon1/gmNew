package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apkf implements ctbj {
    final /* synthetic */ apkl a;

    public apkf(apkl apklVar) {
        this.a = apklVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final apkl apklVar = this.a;
        apklVar.m = apklVar.e.a(new aqgd() { // from class: apke
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                apkl apklVar2 = apkl.this;
                c = axol.c(apklVar2.c, ffhe.a, ffsm.a, new apkj(apklVar2, null));
                return c;
            }
        });
    }

    @Override // defpackage.ctbj
    public final void fO() {
        apkl apklVar = this.a;
        apklVar.d.d(apklVar.l);
        ctbx ctbxVar = this.a.m;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.m = null;
    }
}
