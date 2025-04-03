package defpackage;

import android.os.Build;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apgw implements ctbj {
    final /* synthetic */ apgy a;

    public apgw(apgy apgyVar) {
        this.a = apgyVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        aqgd aqgdVar = new aqgd() { // from class: apgu
            @Override // defpackage.aqgd
            public final elfl a() {
                apgy apgyVar = apgw.this.a;
                synchronized (apgyVar.b) {
                    ctbx ctbxVar = apgyVar.x;
                    if (ctbxVar != null) {
                        apgyVar.w = null;
                        ctbxVar.a();
                        apgyVar.x = null;
                        apgyVar.k.b().k(eldl.i(new apgx(apgyVar)), apgyVar.f);
                    }
                }
                return apgyVar.g("Recipients");
            }
        };
        apgy apgyVar = this.a;
        apgyVar.u = ctbt.b(apgyVar.k.a(aqgdVar), this.a.j.a(new aqgd() { // from class: apgv
            @Override // defpackage.aqgd
            public final elfl a() {
                return apgw.this.a.g("Conversation Properties");
            }
        }));
        synchronized (this.a.b) {
            this.a.v = true;
        }
        synchronized (this.a.c) {
            emxf.l(this.a.y == null);
            emxf.l(this.a.z == null);
        }
        final apgy apgyVar2 = this.a;
        final elfl b = apgyVar2.j.b();
        final elfl b2 = apgyVar2.k.b();
        elfo.k(b, b2).a(new Callable() { // from class: apgl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                amfx amfxVar = (amfx) erqt.q(b);
                engw engwVar = (engw) erqt.q(b2);
                if (amfxVar.u() || engwVar.isEmpty()) {
                    return null;
                }
                apgy apgyVar3 = apgy.this;
                apgyVar3.h(amfxVar.f());
                if ((amfxVar.b() == alxi.ONE_ON_ONE || amfxVar.b() == alxi.RBM) && engwVar.size() != 1) {
                    ensz enszVar = (ensz) apgy.a.j();
                    enszVar.Y(csux.q, apgyVar3.i);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "maybeSubscribeToAllRcsObservables", 868, "DefaultBugleComposeConstraintsSupplier.java")).w("Compose Constraints: Found %s Recipients for 1:1 conversation. Properties: %s", engwVar.size(), amfxVar);
                }
                apgyVar3.e(engwVar);
                return null;
            }
        }, Build.VERSION.SDK_INT <= 26 ? apgyVar2.f : apgyVar2.e).k(axnw.b(), apgyVar2.e);
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar;
        ctbx ctbxVar2;
        synchronized (this.a.c) {
            apgy apgyVar = this.a;
            ctbxVar = apgyVar.y;
            apgyVar.y = null;
            apgyVar.z = null;
        }
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        synchronized (this.a.b) {
            apgy apgyVar2 = this.a;
            apgyVar2.v = false;
            ctbxVar2 = apgyVar2.x;
            apgyVar2.w = null;
            apgyVar2.x = null;
        }
        if (ctbxVar2 != null) {
            ctbxVar2.a();
        }
        ctbx ctbxVar3 = this.a.u;
        ctbxVar3.getClass();
        ctbxVar3.a();
        this.a.u = null;
    }
}
