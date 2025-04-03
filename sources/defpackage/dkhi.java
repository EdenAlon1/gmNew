package defpackage;

import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dkhi implements dkrl {
    public final String b;
    public final ffbr c;
    public final dkqu d;
    public eehr e;
    public boolean h;
    public String i;
    public String[] j;
    public final dkur m;
    private final dkrm n;
    private final dkrm o;
    private final djjr p;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public String f = "application/pidf+xml,application/rlmi+xml,multipart/related";
    protected String g = "eventlist";
    public int k = 3600;
    public long l = dkvj.a().longValue() + (this.k * 1000);
    private final eein q = new dkhg(this);
    private final eein r = new dkhh(this);

    public dkhi(djjr djjrVar, ffbr ffbrVar, String str, String str2, dkrm dkrmVar, dkrm dkrmVar2, dkur dkurVar) {
        this.p = djjrVar;
        this.c = ffbrVar;
        this.b = str2;
        this.n = dkrmVar;
        this.o = dkrmVar2;
        this.m = dkurVar;
        this.d = new dkqu(djjrVar.c());
        this.i = str;
        this.e = b(ffbrVar);
    }

    protected static final String s(eenk eenkVar) {
        String j = eenkVar.j("Subscription-State");
        if (j == null) {
            return null;
        }
        int indexOf = j.indexOf(59);
        return indexOf > 0 ? j.substring(0, indexOf) : j;
    }

    private final void u(eenk eenkVar) {
        eenkVar.r("Event: ".concat(String.valueOf(this.b)));
        eenkVar.r("Accept: ".concat(String.valueOf(this.f)));
        if (dktk.d(this.g)) {
            return;
        }
        eenkVar.r("Supported: ".concat(String.valueOf(this.g)));
    }

    private final void v(dkqr dkqrVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dkhk) it.next()).r(dkqrVar);
        }
    }

    private final void w(eenk eenkVar) {
        String[] strArr = this.j;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("Accept-Contact: *");
        for (int i = 0; i < this.j.length; i++) {
            sb.append(';');
            sb.append(this.j[i]);
        }
        eenkVar.r(sb.toString());
    }

    @Override // defpackage.dkre
    public final int a() {
        return this.k;
    }

    public final eehr b(ffbr ffbrVar) {
        djjr djjrVar = this.p;
        djjrVar.getClass();
        eehy eehyVar = ((eehz) ffbrVar).a;
        if (eehyVar.v()) {
            throw new eejg("The sip stack is not available");
        }
        ArrayList q = eehyVar.q();
        if (Objects.isNull(djjrVar.c())) {
            throw new eejg("ims.getConfiguration() failed");
        }
        String str = this.i;
        if (Objects.isNull(str)) {
            throw new eejg("Remote URI is null. Failed to create dialog path.");
        }
        String e = djjrVar.e();
        if (Objects.isNull(e)) {
            throw new eejg("Public User Identity is null. Failed to create dialog path.");
        }
        return new eehr(eehy.w(), 1, str, e, str, q);
    }

    public final eehy c() {
        eehy eehyVar = ((eehz) this.c).a;
        if (eehyVar.v()) {
            throw new eejg("imsModule.getSipStack() returned null");
        }
        return eehyVar;
    }

    public final void d(dkhk dkhkVar) {
        this.a.add(dkhkVar);
    }

    protected final void e(String str) {
        if (str == null || !str.startsWith("terminated")) {
            return;
        }
        g(null);
    }

    public final void f(int i, String str) {
        l(false);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dkhk) it.next()).q(i, str);
        }
    }

    public final void g(dkqr dkqrVar) {
        l(false);
        if (dkqrVar == null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((dkhk) it.next()).u();
            }
        } else {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((dkhk) it2.next()).v(dkqrVar);
            }
        }
    }

    public void h(eenk eenkVar) {
        try {
            j(eenkVar);
            String s = s(eenkVar);
            List<eenh> o = eenkVar.o();
            dkty.c("Got notify containing: %d parts", Integer.valueOf(o.size()));
            if (eenkVar.h() == null) {
                t(null, new byte[0]);
            } else if (o.size() == 0) {
                t(null, new byte[0]);
            } else {
                for (eenh eenhVar : o) {
                    t(eenhVar.b, eenhVar.a);
                }
            }
            e(s);
        } catch (Exception e) {
            dkty.i(e, "Error while processing notify: %s", e.getMessage());
        }
    }

    public final void i(dkhk dkhkVar) {
        if (Objects.isNull(dkhkVar)) {
            return;
        }
        this.a.remove(dkhkVar);
    }

    protected final void j(eenk eenkVar) {
        c().s(this.m.n(eenkVar));
    }

    protected void k(eenk eenkVar) {
        u(eenkVar);
        w(eenkVar);
        c().k(eenkVar, this.q);
    }

    public final void l(boolean z) {
        dkty.c("Stop refreshing subscription for %s", dktx.URI.c(this.i));
        dkty.c("Remove subscription %s", this);
        dkhj dkhjVar = (dkhj) this.n;
        dkhjVar.a.remove(this);
        dkrk dkrkVar = dkhjVar.b;
        dkty.d(dkrkVar.c, "removing refreshable: %s", this);
        synchronized (dkrkVar.b) {
            dkrkVar.b.remove(new dkrj(this));
            if (dkrkVar.b.isEmpty()) {
                if (ctid.d) {
                    if (dkrkVar.e.get() != null) {
                        dkty.d(dkrkVar.c, "Removed last refreshable - stopping timer", new Object[0]);
                        DesugarAtomicReference.getAndUpdate(dkrkVar.e, new UnaryOperator() { // from class: dkrh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                errk errkVar = (errk) obj;
                                int i = dkrk.f;
                                if (errkVar == null) {
                                    return null;
                                }
                                errkVar.cancel(false);
                                return null;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                } else if (dkrkVar.d != null) {
                    dkty.d(dkrkVar.c, "Removed last refreshable - stopping timer", new Object[0]);
                    dkrkVar.a.b();
                    dkrkVar.d = null;
                }
            }
        }
        if (z) {
            dkhr dkhrVar = (dkhr) this.o;
            dkhrVar.a();
            dkhrVar.a.add(this);
        }
    }

    public final void m() {
        dkty.c("Sending subscribe for event: %s to %s", this.b, dktx.URI.c(this.i));
        this.e.a();
        try {
            String[] strArr = this.j;
            if (strArr == null) {
                strArr = new String[0];
            }
            eenk e = this.m.e(c(), this.e, this.k, this.b, strArr);
            dkrm dkrmVar = this.n;
            dkty.c("Adding subscription %s", this);
            ((dkhj) dkrmVar).a.add(this);
            ((dkhj) dkrmVar).b.b(this);
            k(e);
        } catch (Exception e2) {
            dkty.i(e2, "Error while subscribing: %s", e2.getMessage());
            v(new dkqt("Error while subscribing refer: ".concat(String.valueOf(e2.getMessage())), e2));
        }
    }

    public final void n() {
        this.e.a();
        try {
            String[] strArr = this.j;
            if (strArr == null) {
                strArr = new String[0];
            }
            c().k(this.m.e(c(), this.e, 0, this.b, strArr), this.r);
        } catch (Exception e) {
            dkty.i(e, "Error while unsubscribing: %s", e.getMessage());
            g(new dkqt("Error while unsubscribing refer: ".concat(String.valueOf(e.getMessage())), e));
        }
    }

    public final void o(eenl eenlVar) {
        String l = eenlVar.l();
        this.e.e = dkut.i(l);
    }

    @Override // defpackage.dkrl
    public final boolean p() {
        return dkvj.a().longValue() > this.l;
    }

    @Override // defpackage.dkre
    public final void q(dkri dkriVar) {
        dkty.c("Sending subscribe refresh for event: %s to %s", this.b, dktx.URI.c(this.i));
        this.e.a();
        try {
            String[] strArr = this.j;
            if (strArr == null) {
                strArr = new String[0];
            }
            eenk e = this.m.e(c(), this.e, this.k, this.b, strArr);
            u(e);
            w(e);
            c().k(e, new dkhf(this, dkriVar));
        } catch (Exception e2) {
            dkty.i(e2, "Error while subscribing: %s", e2.getMessage());
            v(new dkqt("Error while subscribing refer: ".concat(String.valueOf(e2.getMessage())), e2));
        }
    }

    protected final void t(String str, byte[] bArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dkhk) it.next()).d(this, str, bArr);
        }
    }
}
