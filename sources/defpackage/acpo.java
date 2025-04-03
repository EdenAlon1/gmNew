package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acpo implements ctbj {
    public static final cskc a = cskc.g("Bugle", "FailToLoadHandler");
    public final acuz b;
    public final ffbr c;
    public final ffbr d;
    public final errl e;
    public final elbx f;
    public ctbx h;
    public ctbx i;
    public ctbx j;
    private final errm l;
    private final AtomicReference k = new AtomicReference();
    public final AtomicBoolean g = new AtomicBoolean(false);

    public acpo(acuz acuzVar, ffbr ffbrVar, elbx elbxVar, ffbr ffbrVar2, errl errlVar, errm errmVar) {
        this.b = acuzVar;
        this.c = ffbrVar;
        this.f = elbxVar;
        this.d = ffbrVar2;
        this.e = errlVar;
        this.l = errmVar;
    }

    public final void a() {
        elfl elflVar = (elfl) this.k.get();
        if (elflVar == null || elflVar.isDone()) {
            a.p("failToLoadTimer is already done.");
        } else {
            elflVar.cancel(true);
            a.p("failToLoadTimer cancelled.");
        }
    }

    public final void d() {
        a();
        a.p("Starting failToLoadTimer.");
        this.k.set(elfl.g(this.l.schedule(new Runnable() { // from class: acpn
            @Override // java.lang.Runnable
            public final void run() {
                csjb c = acpo.a.c();
                c.I("failToLoadTimer triggered.");
                c.r();
                acpo acpoVar = acpo.this;
                ekzm b = acpoVar.f.b("triggerFailToLoadTimer");
                try {
                    csjb c2 = acpo.a.c();
                    c2.I("Store ShouldShowFailToLoadDialog.");
                    c2.r();
                    ((aclb) acpoVar.c.b()).j(true).k(axnw.b(), acpoVar.e);
                    b.close();
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, ((Long) acrz.f.e()).longValue(), TimeUnit.MILLISECONDS)));
    }

    @Override // defpackage.ctbj
    public final /* synthetic */ void fN() {
    }

    @Override // defpackage.ctbj
    public final /* synthetic */ void fO() {
    }
}
