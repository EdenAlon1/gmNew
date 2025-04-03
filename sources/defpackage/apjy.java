package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apjy implements ctbj {
    final /* synthetic */ apjz a;

    public apjy(apjz apjzVar) {
        this.a = apjzVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final apjz apjzVar = this.a;
        apjzVar.b = apjzVar.d.a.a(new ctbf() { // from class: apjv
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                apjz apjzVar2 = apjz.this;
                c = axol.c(apjzVar2.a, ffhe.a, ffsm.a, new apjx(apjzVar2, null));
                return c;
            }
        }, "LocationPermissionManagerImpl::Register", "LocationPermissionManagerImpl::Callback", "LocationPermissionManagerImpl::Unregister");
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.b;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.b = null;
    }
}
