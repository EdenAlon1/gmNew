package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dccz {
    public final csjk b;
    public final errm c;
    public final errl d;
    public boolean e;
    csmx f;
    private final ctyx h;
    private final errl i;
    private ListenableFuture j;
    private final bayw k;
    private static final cskc g = cskc.g("Bugle", "SetupExpressiveStickersManager");
    static final cfva a = cfvl.q(166643423);

    public dccz(bayw baywVar, ctyx ctyxVar, csjk csjkVar, errl errlVar, errm errmVar, errl errlVar2) {
        this.k = baywVar;
        ctyxVar.getClass();
        this.h = ctyxVar;
        csjkVar.getClass();
        this.b = csjkVar;
        errlVar.getClass();
        this.i = errlVar;
        errmVar.getClass();
        this.c = errmVar;
        errlVar2.getClass();
        this.d = errlVar2;
    }

    final void a() {
        if (this.f != null) {
            return;
        }
        dccy dccyVar = new dccy(this);
        this.f = dccyVar;
        csmz csmzVar = (csmz) this.b.a();
        csms csmsVar = (csms) csmv.a.createBuilder();
        csmu csmuVar = csmu.ALL_ACTIVE_SUBSCRIPTIONS;
        csmsVar.copyOnWrite();
        csmv csmvVar = (csmv) csmsVar.instance;
        csmvVar.c = csmuVar.e;
        csmvVar.b |= 1;
        csmzVar.m(dccyVar, (csmv) csmsVar.build());
        g.m("Register stickers setup connectivity state listener");
    }

    public final void b() {
        if (((Boolean) a.e()).booleanValue()) {
            if (this.e) {
                return;
            }
            elfo.h(new erog() { // from class: dcct
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    dccz dcczVar = dccz.this;
                    if (dcczVar.e()) {
                        return elfo.c();
                    }
                    dcczVar.e = true;
                    return elfl.g(((csmz) dcczVar.b.a()).i());
                }
            }, this.c).h(new emwl() { // from class: dccu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dccz dcczVar = dccz.this;
                    Boolean bool = (Boolean) obj;
                    if (!dcczVar.e()) {
                        if (bool.booleanValue()) {
                            dcczVar.c();
                        } else {
                            dcczVar.a();
                        }
                    }
                    dcczVar.e = false;
                    return true;
                }
            }, this.c).k(axnw.b(), this.d);
            return;
        }
        if (e() || this.j != null) {
            return;
        }
        g.m("Start initializing default stickers");
        ListenableFuture i = ((csmz) this.b.a()).i();
        this.j = i;
        erqt.r(i, axou.a(new dccx(this)), this.i);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [fazb, java.lang.Object] */
    public final void c() {
        g.m("Schedule SetupExpressiveStickersAction");
        this.h.h("has_try_expressive_stickers_setup", true);
        bayw baywVar = this.k;
        Context context = (Context) baywVar.a.b();
        context.getClass();
        ctyx ctyxVar = (ctyx) baywVar.c.b();
        ctyxVar.getClass();
        ((csum) baywVar.d.b()).getClass();
        cqoh cqohVar = (cqoh) baywVar.e.b();
        cqohVar.getClass();
        ?? b = baywVar.f.b();
        b.getClass();
        errl errlVar = (errl) baywVar.g.b();
        errlVar.getClass();
        errl errlVar2 = (errl) baywVar.h.b();
        errlVar2.getClass();
        errm errmVar = (errm) baywVar.i.b();
        errmVar.getClass();
        eeui eeuiVar = (eeui) baywVar.j.b();
        eeuiVar.getClass();
        dtuu dtuuVar = (dtuu) baywVar.k.b();
        dtuuVar.getClass();
        new SetupExpressiveStickersAction(context, baywVar.b, ctyxVar, cqohVar, b, errlVar, errlVar2, errmVar, eeuiVar, dtuuVar).G(Action.r);
    }

    public final void d() {
        csmx csmxVar = this.f;
        if (csmxVar != null) {
            this.f = null;
            csmz csmzVar = (csmz) this.b.a();
            csms csmsVar = (csms) csmv.a.createBuilder();
            csmu csmuVar = csmu.ALL_ACTIVE_SUBSCRIPTIONS;
            csmsVar.copyOnWrite();
            csmv csmvVar = (csmv) csmsVar.instance;
            csmvVar.c = csmuVar.e;
            csmvVar.b |= 1;
            csmzVar.n(csmxVar, (csmv) csmsVar.build());
            g.m("Unregister stickers setup connectivity state listener");
        }
    }

    public final boolean e() {
        return this.h.q("is_expressive_stickers_setup_done", false) || this.h.q("has_try_expressive_stickers_setup", false);
    }
}
