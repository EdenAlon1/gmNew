package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avls implements avlp {
    private static final cskc a = cskc.g("Bugle", "RcsContactsTransportProxy");
    private final enhk b;
    private final ffbr c;
    private final chco d;

    public avls(Map map, ffbr ffbrVar, chco chcoVar) {
        this.b = enhk.j(map);
        this.c = ffbrVar;
        this.d = chcoVar;
    }

    private final avlp b() {
        eqna d = ((crgh) this.c.b()).d();
        ffbr ffbrVar = (ffbr) this.b.get(d);
        d.name();
        ffbrVar.getClass();
        return (avlp) ffbrVar.b();
    }

    @Override // defpackage.avlp
    public final ephj a(aoku aokuVar) {
        return b().a(aokuVar);
    }

    @Override // defpackage.avlp
    public final Optional c(aoku aokuVar) {
        String i;
        Optional of;
        ekzz f = eleg.f("RcsContactsTransportProxy::getCachedCapabilities");
        try {
            if (aokuVar.e().isEmpty()) {
                of = Optional.of(avlk.d());
            } else {
                ekzz f2 = eleg.f("RcsContactsTransportProxy::isOwnMsisdn");
                try {
                    final chco chcoVar = this.d;
                    final int i2 = chcoVar.f;
                    if (i2 == -2) {
                        chbz.a(chcoVar.g, elfo.f(new Runnable() { // from class: chcl
                            @Override // java.lang.Runnable
                            public final void run() {
                                csjb a2 = chco.a.a();
                                a2.I("Initializing subscription map with value for self identity.");
                                a2.r();
                                final chco chcoVar2 = chco.this;
                                chcoVar2.f = ((ckby) chcoVar2.c.b()).a(ckcf.n);
                                final Optional n = ((ckds) chcoVar2.b.b()).n();
                                if (chco.d(n).isEmpty()) {
                                    n = chcoVar2.e(((ckby) chcoVar2.c.b()).a(ckcf.o), true);
                                }
                                chco.d(n).ifPresent(new Consumer() { // from class: chcd
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        csjb a3 = chco.a.a();
                                        a3.I("Updating subscription map with: ");
                                        a3.k((String) obj);
                                        a3.I(" for subscription: ");
                                        chco chcoVar3 = chco.this;
                                        a3.G(chcoVar3.f);
                                        a3.r();
                                        chcoVar3.e.put(Integer.valueOf(chcoVar3.f), n);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                chcoVar2.g.set(null);
                            }
                        }, chcoVar.d));
                        i = "";
                    } else {
                        Optional optional = (Optional) chcoVar.e.get(Integer.valueOf(i2));
                        i = optional != null ? (String) chco.d(optional).orElseGet(new Supplier() { // from class: chcj
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return chco.this.i(i2);
                            }
                        }) : chcoVar.i(i2);
                    }
                    String o = aokuVar.o();
                    boolean equals = emxe.c(i) ? false : i.equals(o);
                    csjb a2 = a.a();
                    a2.I("Checking isOwnNumber for: ");
                    a2.k(i);
                    a2.I(" = ");
                    a2.k(o);
                    a2.I(", result: ");
                    a2.J(equals);
                    a2.r();
                    f2.close();
                    of = equals ? Optional.of(avlk.d()) : b().c(aokuVar);
                } finally {
                }
            }
            f.close();
            return of;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
