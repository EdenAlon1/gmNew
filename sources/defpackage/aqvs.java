package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqvs implements aqge {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/connection/ConnectionTypeObservableSupplier");
    public final ffsk a;
    public final cnpd b;
    public ffud c;
    private final ffbz e;
    private final ffbz f = ffca.a(new ffix() { // from class: aqvn
        @Override // defpackage.ffix
        public final Object invoke() {
            return new AtomicReference(aqvj.a);
        }
    });

    public aqvs(final ctbk ctbkVar, ffsk ffskVar, cnpd cnpdVar) {
        this.a = ffskVar;
        this.b = cnpdVar;
        this.e = ffca.a(new ffix() { // from class: aqvm
            @Override // defpackage.ffix
            public final Object invoke() {
                return ctbk.this.a(new aqvr(this));
            }
        });
    }

    public static final aqvj g(cnpk cnpkVar) {
        int ordinal = cnpkVar.ordinal();
        if (ordinal == 0) {
            return aqvj.a;
        }
        if (ordinal == 1) {
            return aqvj.d;
        }
        if (ordinal == 2) {
            return aqvj.e;
        }
        if (ordinal == 3) {
            return aqvj.c;
        }
        if (ordinal == 4) {
            return aqvj.b;
        }
        throw new ffcd();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return e().a(new ctbf() { // from class: aqvk
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "SatelliteConnectionStateSupplier::register", "SatelliteConnectionStateSupplier::callback", "SatelliteConnectionStateSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new aqvo(this, null));
        return c;
    }

    @Override // defpackage.aqge
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aqvj c() {
        if (f().get() != aqvj.a) {
            Object obj = f().get();
            obj.getClass();
            return (aqvj) obj;
        }
        ensk j = d.j();
        j.Y(ente.a, "BugleSatellite");
        ((enrr) j.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/connection/ConnectionTypeObservableSupplier", "getBlocking", 43, "ConnectionTypeObservableSupplier.kt")).q("getBlocking called before supplier is initialized");
        this.b.i();
        return g((cnpk) this.b.h().c());
    }

    public final ctbl e() {
        Object a = this.e.a();
        a.getClass();
        return (ctbl) a;
    }

    public final AtomicReference f() {
        return (AtomicReference) this.f.a();
    }
}
