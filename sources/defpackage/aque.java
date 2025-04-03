package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aque implements aqux {
    public final azop a;
    public final Optional b;
    public final ffbr c;
    public final csjk d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final Optional h;
    private final ffbr i;
    private final crji j;
    private final aolr k;
    private final ffbr l;
    private final ffsk m;
    private final ffsk n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final atte s;
    private final attd t;
    private final emyl u;
    private final emyl v;
    private final emyl w;
    private final azop x;

    public aque(azop azopVar, Optional optional, ffbr ffbrVar, Optional optional2, ffbr ffbrVar2, crji crjiVar, aolr aolrVar, csjk csjkVar, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar, ffsk ffskVar2, final ffbr ffbrVar5, final ffbr ffbrVar6, final ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, atte atteVar, attd attdVar) {
        azopVar.getClass();
        optional2.getClass();
        ffbrVar2.getClass();
        crjiVar.getClass();
        aolrVar.getClass();
        csjkVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        atteVar.getClass();
        attdVar.getClass();
        this.a = azopVar;
        this.h = optional;
        this.i = ffbrVar;
        this.b = optional2;
        this.c = ffbrVar2;
        this.j = crjiVar;
        this.k = aolrVar;
        this.d = csjkVar;
        this.e = ffbrVar3;
        this.l = ffbrVar4;
        this.m = ffskVar;
        this.n = ffskVar2;
        this.o = ffbrVar8;
        this.p = ffbrVar9;
        this.q = ffbrVar10;
        this.f = ffbrVar11;
        this.g = ffbrVar12;
        this.r = ffbrVar13;
        this.s = atteVar;
        this.t = attdVar;
        this.u = emys.a(new emyl() { // from class: aqtx
            @Override // defpackage.emyl
            public final Object get() {
                aque aqueVar = aque.this;
                Optional l = ((ctwb) aqueVar.c.b()).l(aqueVar.a);
                final ffbr ffbrVar14 = ffbrVar5;
                final ffji ffjiVar = new ffji() { // from class: aqtp
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return ((aqzb) ffbr.this.b()).a((ctwi) obj);
                    }
                };
                return (aqge) l.map(new Function() { // from class: aqtr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(new aqgf(aqys.b));
            }
        });
        this.v = emys.a(new emyl() { // from class: aqty
            @Override // defpackage.emyl
            public final Object get() {
                final aque aqueVar = aque.this;
                Optional l = ((ctwb) aqueVar.c.b()).l(aqueVar.a);
                final ffbr ffbrVar14 = ffbrVar6;
                final ffji ffjiVar = new ffji() { // from class: aqtt
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return ((aqwd) ffbr.this.b()).a(aqueVar.a.f(), (ctwi) obj);
                    }
                };
                return l.map(new Function() { // from class: aqtu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        });
        this.w = emys.a(new emyl() { // from class: aqtz
            @Override // defpackage.emyl
            public final Object get() {
                return ((aqwa) ffbr.this.b()).a();
            }
        });
        this.x = azopVar;
    }

    @Override // defpackage.aqux
    public final int a() {
        Optional l = ((ctwb) this.c.b()).l(this.a);
        final ffji ffjiVar = new ffji() { // from class: aqtf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Integer.valueOf(((ctwi) obj).b());
            }
        };
        Object orElse = l.map(new Function() { // from class: aqtq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(0);
        orElse.getClass();
        return ((Number) orElse).intValue();
    }

    @Override // defpackage.aqux
    public final int b() {
        final azpp a = ((azpo) this.e.b()).a(this.x);
        Collection a2 = a.a();
        a2.getClass();
        Object obj = null;
        if (a2 instanceof List) {
            List list = (List) a2;
            if (list.size() == 1) {
                obj = list.get(0);
            }
        } else {
            Iterator it = a2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj = next;
                }
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        Object orElseGet = a.c().orElseGet(new Supplier() { // from class: aqts
            @Override // java.util.function.Supplier
            public final Object get() {
                enip a3 = azpp.this.a();
                a3.getClass();
                return (Integer) ffdx.J(a3);
            }
        });
        orElseGet.getClass();
        return ((Number) orElseGet).intValue();
    }

    @Override // defpackage.aqux
    public final Uri c() {
        aqvv aqvvVar = (aqvv) this.i.b();
        Uri g = this.j.g(aqvvVar.b, aqvvVar.a, (aoku) this.a.f().orElse(this.k.f()), new ParticipantColor(), false, false, false);
        g.getClass();
        return g;
    }

    @Override // defpackage.aqux
    public final aqge d() {
        return ((atti) this.p.b()).a() ? ((aqvt) this.q.b()).a() : new aqgf(aqvj.a);
    }

    @Override // defpackage.aqux
    public final aqge e() {
        Object obj = this.u.get();
        obj.getClass();
        return (aqge) obj;
    }

    @Override // defpackage.aqux
    public final aqge f() {
        Optional optional = (Optional) this.v.get();
        final ffji ffjiVar = new ffji() { // from class: aqtv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((aqwc) obj).a();
            }
        };
        Object orElse = optional.map(new Function() { // from class: aqtw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new aqgf(false));
        orElse.getClass();
        return (aqge) orElse;
    }

    @Override // defpackage.aqux
    public final SelfIdentityId g() {
        String crmfVar = this.a.b().toString();
        crmfVar.getClass();
        Object orElse = this.h.orElse(aqvf.a(crmfVar, this.a.b()));
        orElse.getClass();
        return (SelfIdentityId) orElse;
    }

    @Override // defpackage.aqux
    public final aqvx h() {
        Object obj = this.w.get();
        obj.getClass();
        return (aqvx) obj;
    }

    @Override // defpackage.aqux
    public final aqyt i() {
        return ((aqyu) this.o.b()).b(this.a);
    }

    @Override // defpackage.aqux
    public final elfl j() {
        elfl c;
        c = axol.c(this.n, ffhe.a, ffsm.a, new aqud(this, null));
        return c;
    }

    @Override // defpackage.aqux
    public final elfl k(boolean z, boolean z2) {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new aqub(this, z, z2, null));
        return c;
    }

    @Override // defpackage.aqux
    public final elfl l(alyx alyxVar) {
        elfl c;
        alyxVar.getClass();
        c = axol.c(this.m, ffhe.a, ffsm.a, new aquc(alyxVar, this, null));
        return c;
    }

    @Override // defpackage.aqux
    public final Optional m() {
        Optional f = this.a.f();
        f.getClass();
        return f;
    }

    @Override // defpackage.aqux
    public final String n() {
        Optional f = this.a.f();
        final ffji ffjiVar = new ffji() { // from class: aqtn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((aoku) obj).H(true).toString();
            }
        };
        Optional map = f.map(new Function() { // from class: aqto
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        return (String) fflm.b(map);
    }

    @Override // defpackage.aqux
    public final String o() {
        return this.a.h();
    }

    @Override // defpackage.aqux
    public final String p() {
        return this.a.h();
    }

    @Override // defpackage.aqux
    public final String q() {
        return ((aqvv) this.i.b()).a;
    }

    @Override // defpackage.aqux
    public final String r() {
        Optional f = this.a.f();
        final ffji ffjiVar = new ffji() { // from class: aqtl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return String.valueOf(((aoku) obj).m(true));
            }
        };
        Optional map = f.map(new Function() { // from class: aqtm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        return (String) fflm.b(map);
    }

    @Override // defpackage.aqux
    public final boolean s() {
        if (this.t.a()) {
            return true;
        }
        if (!this.s.a()) {
            return false;
        }
        return ((ezgu) this.r.b()).b.contains(Integer.valueOf(((ctwb) this.c.b()).h(b()).c()));
    }

    @Override // defpackage.aqux
    public final boolean t() {
        return ((azpo) this.e.b()).a(this.a).c().isPresent();
    }

    @Override // defpackage.aqux
    public final boolean u() {
        return ((ctwb) this.c.b()).s(this.a);
    }

    @Override // defpackage.aqux
    public final boolean v() {
        Optional l = ((ctwb) this.c.b()).l(this.a);
        final ffji ffjiVar = new ffji() { // from class: aqtg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((ctwi) obj).C());
            }
        };
        Object orElse = l.map(new Function() { // from class: aqth
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false);
        orElse.getClass();
        return ((Boolean) orElse).booleanValue();
    }

    @Override // defpackage.aqux
    public final boolean w(SelfIdentityId selfIdentityId) {
        return ffkj.e(this.x.b(), selfIdentityId.a());
    }

    @Override // defpackage.aqux
    public final elfl x(final int i, final Optional optional) {
        if (i == 0) {
            throw null;
        }
        optional.getClass();
        Optional optional2 = (Optional) this.l.b();
        final ffji ffjiVar = new ffji() { // from class: aqti
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                int i2 = i;
                aqwr aqwrVar = (aqwr) obj;
                aque aqueVar = this;
                return (i2 == 2 || i2 == 3) ? aqwrVar.a(aqueVar, optional) : elfo.e(aqwrVar.d(aqueVar, aqueVar.b));
            }
        };
        Object orElseGet = optional2.map(new Function() { // from class: aqtj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: aqtk
            @Override // java.util.function.Supplier
            public final Object get() {
                return elfo.e(Optional.empty());
            }
        });
        orElseGet.getClass();
        return (elfl) orElseGet;
    }
}
