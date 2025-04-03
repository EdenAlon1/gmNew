package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class chfr implements eroh {
    public final /* synthetic */ chfz a;

    public /* synthetic */ chfr(chfz chfzVar) {
        this.a = chfzVar;
    }

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        final chbu chbuVar = (chbu) obj;
        final elfl g = elfl.g(chbuVar.u());
        final elfl h = chbuVar.m().d().h(new emwl() { // from class: chaa
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                choc chocVar = (choc) obj2;
                enru enruVar = chbu.a;
                boolean z = true;
                if (chocVar != choc.REGISTERED_WITH_PREKEYS && chocVar != choc.REGISTERED_WITHOUT_PREKEYS) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, erpp.a);
        final elfl h2 = chbuVar.m().d().h(new emwl() { // from class: chas
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                choc chocVar = (choc) obj2;
                enru enruVar = chbu.a;
                return Boolean.valueOf(chocVar == choc.REGISTERED_WITH_PREKEYS);
            }
        }, erpp.a);
        elfn m = elfo.m(g, h, h2);
        final chfz chfzVar = this.a;
        return m.b(new erog() { // from class: chfl
            @Override // defpackage.erog
            public final ListenableFuture a() {
                boolean booleanValue = ((Boolean) erqt.q(g)).booleanValue();
                chfz chfzVar2 = chfz.this;
                chbu chbuVar2 = chbuVar;
                if (!booleanValue) {
                    chfz.a.m("Performing registration because it is currently not registered.");
                    return chfzVar2.g(chbuVar2);
                }
                if (chfzVar2.i.get()) {
                    chfz.a.m("Forcing a refresh.");
                    return chfzVar2.g(chbuVar2);
                }
                if (!((Boolean) erqt.q(h)).booleanValue()) {
                    chfz.a.m("Forcing a re-register because the state is set to not registered.");
                    return chfzVar2.g(chbuVar2);
                }
                if (!((bzqc) chfzVar2.h.b()).g() || ((Boolean) erqt.q(h2)).booleanValue()) {
                    chfz.a.m("Already registered, skipping refresh");
                    return elfo.e(fcdu.a);
                }
                chfz.a.m("Forcing a refresh for etouffee.");
                return chfzVar2.g(chbuVar2);
            }
        }, chfzVar.f);
    }
}
