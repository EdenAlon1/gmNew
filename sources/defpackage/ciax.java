package defpackage;

import android.content.Context;
import defpackage.ciax;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciax implements ciap {
    public final Context a;
    public final ffhd b;
    public final ffbr c;
    public final bzgw d;
    public final ejar e;
    public final ffbr f;
    public final enru g;
    private final ffsk h;
    private final ffbr i;
    private final ffbr j;

    /* compiled from: PG */
    public interface a {
        cilj dr();
    }

    public ciax(Context context, ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar, bzgw bzgwVar, ejar ejarVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        bzgwVar.getClass();
        ejarVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.a = context;
        this.b = ffhdVar;
        this.h = ffskVar;
        this.c = ffbrVar;
        this.d = bzgwVar;
        this.e = ejarVar;
        this.f = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.g = enru.c("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl");
    }

    private final elfl i(fcek fcekVar, Object obj, ffji ffjiVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.h, ekxi.a(ffheVar), ffsmVar, new ciay(null, this, fcekVar, obj, ffjiVar)));
    }

    @Override // defpackage.ciap
    public final elfl a(final fcek fcekVar) {
        fcekVar.getClass();
        ensk h = this.g.h();
        h.Y(ente.a, "BugleGDitto");
        ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "pullMessages", 157, "GaiaDittoBindManagerImpl.kt")).q("Pull messages for GDitto");
        return i(fcekVar, null, new ffji() { // from class: ciaq
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eisx eisxVar = (eisx) obj;
                eisxVar.getClass();
                Optional of = Optional.of(eisxVar);
                final fcek fcekVar2 = fcekVar;
                return ciax.this.b(of, null, new ffji() { // from class: ciav
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        cilj ciljVar = (cilj) obj2;
                        ciljVar.getClass();
                        return ciljVar.b(fcek.this);
                    }
                });
            }
        });
    }

    public final elfl b(Optional optional, Object obj, ffji ffjiVar) {
        if (!optional.isEmpty()) {
            return (elfl) ffjiVar.invoke(((a) ekhv.a(this.a, a.class, (eisx) optional.get())).dr());
        }
        ensk h = this.g.h();
        h.Y(ente.a, "BugleGDitto");
        ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "pullMessages", 171, "GaiaDittoBindManagerImpl.kt")).q("Missing accountId in pullMessages for GDitto");
        elfl e = elfo.e(obj);
        e.getClass();
        return e;
    }

    @Override // defpackage.ciap
    public final elfl c(final fcek fcekVar) {
        fcekVar.getClass();
        ensk h = this.g.h();
        h.Y(ente.a, "BugleGDitto");
        ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "pullMessagesFromWorker", 146, "GaiaDittoBindManagerImpl.kt")).q("Pull messages from worker for GDitto");
        return i(fcekVar, new ppn(), new ffji() { // from class: ciaw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eisx eisxVar = (eisx) obj;
                eisxVar.getClass();
                Optional of = Optional.of(eisxVar);
                ppn ppnVar = new ppn();
                final fcek fcekVar2 = fcekVar;
                return ciax.this.b(of, ppnVar, new ffji() { // from class: ciau
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        cilj ciljVar = (cilj) obj2;
                        ciljVar.getClass();
                        return ciljVar.c(fcek.this);
                    }
                });
            }
        });
    }

    @Override // defpackage.ciap
    public final elfl d() {
        ensk h = this.g.h();
        h.Y(ente.a, "BugleGDitto");
        ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "startBindHandlerIfLinked", 79, "GaiaDittoBindManagerImpl.kt")).q("Start bind handler if Gaia pairing is enabled, and if at least one device is paired");
        return i(null, null, new ffji() { // from class: ciar
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eisx eisxVar = (eisx) obj;
                eisxVar.getClass();
                return ciax.this.e(Optional.of(eisxVar), false, "");
            }
        });
    }

    public final elfl e(Optional optional, boolean z, String str) {
        if (((aslq) this.i.b()).a() && !((cspt) this.j.b()).a()) {
            ensk h = this.g.h();
            h.Y(ente.a, "BugleGDitto");
            ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "startBindHandler", 111, "GaiaDittoBindManagerImpl.kt")).q("Device data over satellite, skipping start bind");
            elfl e = elfo.e(null);
            e.getClass();
            return e;
        }
        if (!optional.isEmpty()) {
            a aVar = (a) ekhv.a(this.a, a.class, (eisx) optional.get());
            return z ? aVar.dr().f(str) : aVar.dr().d();
        }
        ensk h2 = this.g.h();
        h2.Y(ente.a, "BugleGDitto");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "startBindHandler", 115, "GaiaDittoBindManagerImpl.kt")).q("Missing accountId in startBindHandler for GDitto");
        elfl e2 = elfo.e(null);
        e2.getClass();
        return e2;
    }

    @Override // defpackage.ciap
    public final elfl f(fcek fcekVar, final String str) {
        fcekVar.getClass();
        str.getClass();
        ensk h = this.g.h();
        h.Y(ente.a, "BugleGDitto");
        ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "startBindHandlerFromTickle", 70, "GaiaDittoBindManagerImpl.kt")).q("Start bind handler from Tickle for GDitto if checks pass");
        return i(fcekVar, null, new ffji() { // from class: ciat
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eisx eisxVar = (eisx) obj;
                eisxVar.getClass();
                return ciax.this.e(Optional.of(eisxVar), true, str);
            }
        });
    }

    @Override // defpackage.ciap
    public final void g() {
        d();
    }

    @Override // defpackage.ciap
    public final void h() {
        i(null, null, new ffji() { // from class: cias
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ciax.a aVar;
                eisx eisxVar = (eisx) obj;
                eisxVar.getClass();
                Optional of = Optional.of(eisxVar);
                boolean isEmpty = of.isEmpty();
                ciax ciaxVar = ciax.this;
                if (isEmpty) {
                    ensk j = ciaxVar.g.j();
                    j.Y(ente.a, "BugleGDitto");
                    ((enrr) j.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "getAccountScopedInjector", 224, "GaiaDittoBindManagerImpl.kt")).q("No Gaia Account Found, skipping Account scoped injection");
                    aVar = null;
                } else {
                    aVar = (ciax.a) ekhv.a(ciaxVar.a, ciax.a.class, (eisx) of.get());
                }
                if (aVar != null) {
                    ensk h = ciaxVar.g.h();
                    h.Y(ente.a, "BugleGDitto");
                    ((enrr) h.h("com/google/android/apps/messaging/shared/net/handler/bindhandler/GaiaDittoBindManagerImpl", "stopBindHandler", 134, "GaiaDittoBindManagerImpl.kt")).q("stop bind handler for Gaia pairing");
                    aVar.dr().e();
                    ((akzt) ciaxVar.c.b()).e("Bugle.Ditto.Binding.Stop.Counts", 2);
                }
                elfl e = elfo.e(null);
                e.getClass();
                return e;
            }
        });
    }
}
