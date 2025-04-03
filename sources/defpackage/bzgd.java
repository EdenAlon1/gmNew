package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzgd {
    public static final cskc a = cskc.g("BugleNetwork", "DittoDesktops");
    public static final cfva b;
    public static final cfva c;
    public static final cfva d;
    public final cqoh e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    private final errl i;
    private final ctyx j;
    private final ejar k;
    private final ffbr l;

    static {
        cfvl.k(cfvl.b, "max_persistent_active_dittos", 2);
        b = cfvl.k(cfvl.b, "max_pwa_pairing_count", 1);
        c = cfvl.k(cfvl.b, "max_satellite_pairing_count", 2);
        d = cfvl.k(cfvl.b, "max_non_persistent_active_dittos", 1);
    }

    public bzgd(cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, ctyx ctyxVar, ejar ejarVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.e = cqohVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.i = errlVar;
        this.j = ctyxVar;
        this.k = ejarVar;
        this.l = ffbrVar3;
        this.h = ffbrVar4;
    }

    public static final elfl E(List list, Function function) {
        Object apply;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bzej bzejVar = (bzej) it.next();
            String e = bzejVar.e();
            if (TextUtils.isEmpty(e)) {
                a.m("Skip running the task on the desktop due to empty request Id.");
            } else {
                bzei g = bzej.g();
                g.b(bzejVar.d());
                bzeg bzegVar = (bzeg) g;
                bzegVar.a = e;
                g.c(bzejVar.b());
                g.d(bzejVar.f());
                bzegVar.b = bzejVar.c();
                apply = function.apply(g.a());
                arrayList.add((elfl) apply);
            }
        }
        return elfo.a(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r2.f != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.byyv e(defpackage.esls r2) {
        /*
            int r0 = r2.g
            int r0 = defpackage.eslp.a(r0)
            r1 = 1
            if (r0 != 0) goto La
            r0 = r1
        La:
            int r0 = r0 + (-2)
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 == r1) goto L1c
            r1 = 3
            if (r0 == r1) goto L19
            boolean r2 = r2.f
            if (r2 == 0) goto L1f
            goto L1c
        L19:
            byyv r2 = defpackage.byyv.PWA
            return r2
        L1c:
            byyv r2 = defpackage.byyv.SATELLITE
            return r2
        L1f:
            byyv r2 = defpackage.byyv.WEB
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzgd.e(esls):byyv");
    }

    public static boolean s(bsrt bsrtVar, String str) {
        return cuxt.h(bsrtVar.r(), str);
    }

    public static boolean x(esls eslsVar) {
        int a2 = eslp.a(eslsVar.g);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 2;
        if (i != 1) {
            return i == 2 || i == 3 || eslsVar.f;
        }
        return false;
    }

    public final boolean A(final fcek fcekVar, String str) {
        ekzz f = eleg.f("DittoDesktops#setDesktopActive");
        try {
            String[] strArr = bsve.a;
            bsvb bsvbVar = new bsvb();
            bsvbVar.al();
            bsvbVar.ap("setDesktopActive");
            bsvbVar.f(new Function() { // from class: bzfw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(fcek.this.c);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsvbVar.c(true);
            bsvbVar.e(str);
            boolean z = bsvbVar.b().e() > 0;
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean B(final fcek fcekVar) {
        ekzz f = eleg.f("DittoDesktops#setDesktopInactive");
        try {
            String[] strArr = bsve.a;
            bsvb bsvbVar = new bsvb();
            bsvbVar.ap("setDesktopInactive1");
            bsvbVar.f(new Function() { // from class: bzev
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(fcek.this.c);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsvbVar.c(false);
            bsvbVar.e("");
            boolean z = bsvbVar.b().e() > 0;
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean C(final fcek fcekVar, final String str) {
        ekzz f = eleg.f("DittoDesktops#setDesktopInactive");
        try {
            String[] strArr = bsve.a;
            bsvb bsvbVar = new bsvb();
            bsvbVar.ap("setDesktopInactive2");
            bsvbVar.f(new Function() { // from class: bzeu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(fcek.this.c);
                    int intValue = bsve.c().intValue();
                    if (intValue < 58010) {
                        dtub.w("request_id", intValue);
                    }
                    bsvdVar.aq(new dtrt("desktop.request_id", 1, String.valueOf(str)));
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsvbVar.c(false);
            bsvbVar.e("");
            boolean z = bsvbVar.b().e() > 0;
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean D(final fcek fcekVar) {
        ekzz f = eleg.f("DittoDesktops#updateStoredDesktopIdsLastConnectionTime");
        try {
            String[] strArr = bsve.a;
            bsvb bsvbVar = new bsvb();
            bsvbVar.al();
            bsvbVar.ap("updateStoredDesktopIdsLastConnectionTime");
            bsvbVar.f(new Function() { // from class: bzfn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(fcek.this.c);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsvbVar.a.put("last_connection_time", Long.valueOf(this.e.f().toEpochMilli()));
            bsvbVar.d(-1L);
            int e = bsvbVar.b().e();
            ((cbgf) this.f.b()).g();
            boolean z = e > 0;
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int a() {
        return o().size();
    }

    public final int b(boolean z) {
        ekzz f = eleg.f("DittoDesktops#setIsActiveForQrDesktopsWithRequestId");
        try {
            String[] strArr = bsve.a;
            bsvb bsvbVar = new bsvb();
            bsvbVar.ap("setIsActiveForQrDesktopsWithRequestId");
            bsvbVar.f(new Function() { // from class: bzfx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.d(byzd.ANONYMOUS);
                    bsvdVar.e();
                    bsvdVar.f();
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsvbVar.c(z);
            int e = bsvbVar.b().e();
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long c(final fcek fcekVar) {
        bsuz a2 = bsve.a();
        a2.z("getStoredStoredGetUpdatesRequestTime");
        a2.f(new Function() { // from class: bzgc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar = (bsvd) obj;
                cskc cskcVar = bzgd.a;
                bsvdVar.b(fcek.this.c);
                return bsvdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.e(new Function() { // from class: bzem
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bzgd.a;
                return ((bstr) obj).w;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.x(1);
        bstt bsttVar = (bstt) a2.b().o();
        try {
            long c2 = bsttVar.moveToFirst() ? bsttVar.c() : -1L;
            bsttVar.close();
            return c2;
        } catch (Throwable th) {
            try {
                bsttVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bcyo d(final fcek fcekVar) {
        bcyo bcyoVar;
        ekzz f = eleg.f("DittoDesktops#getDesktopEncryptionKeys");
        try {
            bsuz a2 = bsve.a();
            a2.z("getDesktopEncryptionKeys");
            a2.f(new Function() { // from class: bzgb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(fcek.this.c);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bstt bsttVar = (bstt) a2.b().o();
            try {
                if (bsttVar.moveToFirst()) {
                    bcyoVar = new bcyo(bsttVar.m(), bsttVar.n());
                    bsttVar.close();
                } else {
                    bsttVar.close();
                    bcyoVar = null;
                }
                f.close();
                return bcyoVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bzej f(final String str) {
        bzej bzejVar;
        ekzz f = eleg.f("DittoDesktops#getDesktop");
        try {
            bsuz a2 = bsve.a();
            a2.z("getDesktop");
            a2.f(new Function() { // from class: bzes
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(str);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bstt bsttVar = (bstt) a2.b().o();
            try {
                if (bsttVar.moveToFirst()) {
                    bzge g = g(bsttVar.i(), bsttVar.j(), m((bsrt) bsttVar.cO()));
                    bzei g2 = bzej.g();
                    g2.b(g.a);
                    g2.e(bsttVar.e());
                    g2.c(bsttVar.g());
                    g2.d(bsttVar.l());
                    ((bzeg) g2).b = g;
                    String k = bsttVar.k();
                    if (k != null) {
                        ((bzeg) g2).a = k;
                    }
                    bzejVar = g2.a();
                    bsttVar.close();
                } else {
                    a.m("getDesktop returning null because it did not find a matching id.");
                    bsttVar.close();
                    bzejVar = null;
                }
                f.close();
                return bzejVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bzge g(String str, String str2, Optional optional) {
        if (str2 == null) {
            return new bzge(bzar.b(str, byzd.ANONYMOUS), str, Optional.empty());
        }
        return new bzge(bzar.b(str2, byzd.GAIA), str, optional);
    }

    public final elfl h() {
        byte[] r = this.j.r("ditto_active_desktop_id");
        if (r == null) {
            return elfo.e(Optional.empty());
        }
        try {
            fcek fcekVar = (fcek) eyfy.parseFrom(fcek.a, r, eyfc.a());
            if (!y(fcekVar)) {
                return elfo.e(Optional.empty());
            }
            if (!((cgcu) this.l.b()).a()) {
                return elfo.e(Optional.empty());
            }
            String n = n(fcekVar.c);
            return emxe.c(n) ? elfo.e(Optional.empty()) : elfl.g(this.k.c(n)).h(new emwl() { // from class: bzfd
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return Optional.of((eisx) obj);
                }
            }, erpp.a);
        } catch (eygu e) {
            return elfo.d(e);
        }
    }

    public final elfl i(final String str) {
        return elfo.g(new Callable() { // from class: bzeo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = bzgd.a;
                efbd.b();
                bsuz a2 = bsve.a();
                a2.z("DittoDesktops#getGaiaDesktops");
                a2.f(new Function() { // from class: bzfb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsvd bsvdVar = (bsvd) obj;
                        cskc cskcVar2 = bzgd.a;
                        bsvdVar.d(byzd.GAIA);
                        return bsvdVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                a2.d(new bsuw(bsve.c.c));
                Stream stream = Collection.EL.stream(a2.b().y());
                final String str2 = str;
                Stream filter = stream.filter(new Predicate() { // from class: bzfc
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo439negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return bzgd.s((bsrt) obj, str2);
                    }
                });
                int i = engw.d;
                return (engw) filter.collect(endq.a);
            }
        }, this.i);
    }

    public final elfl j(final Function function) {
        return elfo.g(new Callable() { // from class: bzex
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bzgd.this.l();
            }
        }, this.i).i(new eroh() { // from class: bzey
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return bzgd.E((List) obj, Function.this);
            }
        }, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final engw k(engw engwVar) {
        fcek a2;
        int i = engw.d;
        engr engrVar = new engr();
        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
            bsrt bsrtVar = (bsrt) engwVar.get(i2);
            if (((cgcu) this.l.b()).a()) {
                String r = bsrtVar.r();
                if (!bsrtVar.o().equals(byzd.GAIA) || emxe.c(r)) {
                    a2 = bzar.b(bsrtVar.q(), bsrtVar.o());
                } else {
                    a2 = bzar.b(r, bsrtVar.o());
                }
            } else {
                a2 = bzar.a(bsrtVar.q());
            }
            bzei g = bzej.g();
            g.b(a2);
            bsrtVar.az(15, "request_id");
            bzeg bzegVar = (bzeg) g;
            bzegVar.a = emxe.b(bsrtVar.p);
            g.e(bsrtVar.m());
            g.c(bsrtVar.n());
            bsrtVar.az(16, "is_persistent");
            g.d(bsrtVar.q);
            bzegVar.b = new bzge(a2, bsrtVar.q(), m(bsrtVar));
            engrVar.h(g.a());
        }
        return engrVar.g();
    }

    public final engw l() {
        ekzz f = eleg.f("DittoDesktops#getActiveDesktops");
        try {
            bsuz a2 = bsve.a();
            a2.z("getActiveDesktops");
            a2.f(new Function() { // from class: bzez
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.c();
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a2.f(new Function() { // from class: bzfa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.e();
                    bsvdVar.f();
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            engw k = k(a2.b().y());
            f.close();
            return k;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Optional m(bsrt bsrtVar) {
        return (!((cgcu) this.l.b()).a() || bsrtVar.u() == null) ? Optional.empty() : Optional.of(eyee.x(bsrtVar.u()));
    }

    public final String n(final String str) {
        bsuz a2 = bsve.a();
        a2.z("getEmailForPairedDevice");
        a2.f(new Function() { // from class: bzfp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar = (bsvd) obj;
                cskc cskcVar = bzgd.a;
                bsvdVar.b(str);
                return bsvdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.e(new Function() { // from class: bzfq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = bzgd.a;
                return ((bstr) obj).u;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.x(1);
        bstt bsttVar = (bstt) a2.b().o();
        try {
            if (bsttVar.moveToFirst()) {
                String j = bsttVar.j();
                if (j != null) {
                    bsttVar.close();
                    return j;
                }
            }
            bsttVar.close();
            return "";
        } catch (Throwable th) {
            try {
                bsttVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List o() {
        ekzz f = eleg.f("DittoDesktops#getStoredDesktopIds");
        try {
            bsuz a2 = bsve.a();
            a2.z("getStoredDesktopIds");
            a2.e(new Function() { // from class: bzfy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bzgd.a;
                    return ((bstr) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bstt bsttVar = (bstt) a2.b().p(bsve.c.b);
            try {
                engw h = bsttVar.h();
                bsttVar.close();
                List list = (List) Collection.EL.stream(h).map(new Function() { // from class: bzfz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return bzar.a((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bzga
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                f.close();
                return list;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void p(final fcek fcekVar, long j) {
        ekzz f = eleg.f("DittoDesktops#updateStoredGetUpdatesRequestTimeMillis");
        try {
            String[] strArr = bsve.a;
            bsvb bsvbVar = new bsvb();
            bsvbVar.al();
            bsvbVar.ap("updateStoredGetUpdatesRequestTimeMillis");
            int intValue = bsve.c().intValue();
            int intValue2 = bsve.c().intValue();
            if (intValue2 < 60540) {
                dtub.w("get_updates_request_time_millis", intValue2);
            }
            if (intValue >= 60540) {
                bsvbVar.a.put("get_updates_request_time_millis", Long.valueOf(j));
            }
            bsvbVar.f(new Function() { // from class: bzfo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(fcek.this.c);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsvbVar.b().e();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean q(final Optional optional) {
        efbd.b();
        String[] strArr = bsve.a;
        bsvd bsvdVar = new bsvd();
        bsvdVar.d(byzd.GAIA);
        if (optional.isEmpty()) {
            bsuz a2 = bsve.a();
            a2.z("areAnyDesktopPairedOverGaia");
            a2.k(new bsvc(bsvdVar));
            return a2.b().T();
        }
        bsuz a3 = bsve.a();
        a3.z("DittoDesktops#areAnyDesktopPairedOverGaia");
        a3.k(new bsvc(bsvdVar));
        return Collection.EL.stream(a3.b().y()).filter(new Predicate() { // from class: bzep
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cskc cskcVar = bzgd.a;
                return bzgd.s((bsrt) obj, (String) Optional.this.get());
            }
        }).findFirst().isPresent();
    }

    public final boolean r() {
        efbd.b();
        bsuz a2 = bsve.a();
        a2.z("areAnyDesktopPairedOverQr");
        a2.f(new Function() { // from class: bzfs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar = (bsvd) obj;
                cskc cskcVar = bzgd.a;
                bsvdVar.d(byzd.ANONYMOUS);
                return bsvdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a2.b().T();
    }

    public final boolean t(final bzge bzgeVar) {
        boolean z;
        ekzz f = eleg.f("DittoDesktops#deleteScannedDesktopWithDittoIdContainer");
        try {
            String[] strArr = bsve.a;
            bsut bsutVar = new bsut();
            bsutVar.f("deleteScannedDesktopWithDittoIdContainer");
            bsutVar.c(new Function() { // from class: bzeq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(bzge.this.b);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int d2 = bsutVar.d();
            csjb c2 = a.c();
            c2.y("NumOfDesktopsDeleted", d2);
            c2.I("Desktops have been cleaned up");
            c2.r();
            if (d2 > 0) {
                ((cbgf) this.f.b()).f(bzgeVar.d);
                ((cbgf) this.f.b()).g();
                z = true;
            } else {
                z = false;
            }
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final boolean u(final fcek fcekVar) {
        boolean z;
        ekzz f = eleg.f("DittoDesktops#deleteScannedDesktop");
        try {
            String[] strArr = bsve.a;
            bsut bsutVar = new bsut();
            bsutVar.f("deleteScannedDesktop");
            bsutVar.c(new Function() { // from class: bzft
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsvd bsvdVar = (bsvd) obj;
                    cskc cskcVar = bzgd.a;
                    bsvdVar.b(fcek.this.c);
                    return bsvdVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int d2 = bsutVar.d();
            csjb c2 = a.c();
            c2.y("NumOfDesktopsDeleted", d2);
            c2.I("Desktops have been cleaned up");
            c2.r();
            if (d2 > 0) {
                ((cbgf) this.f.b()).f(fcekVar);
                z = true;
            } else {
                z = false;
            }
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean v() {
        return !l().isEmpty();
    }

    public final boolean w(final fcek fcekVar) {
        bsuz a2 = bsve.a();
        a2.z("isActiveDesktop");
        a2.f(new Function() { // from class: bzfr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar = (bsvd) obj;
                cskc cskcVar = bzgd.a;
                bsvdVar.b(fcek.this.c);
                bsvdVar.c();
                return bsvdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a2.b().T();
    }

    public final boolean y(final fcek fcekVar) {
        bsuz a2 = bsve.a();
        a2.z("isDesktopPairedOverGaia");
        a2.f(new Function() { // from class: bzfg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsvd bsvdVar = (bsvd) obj;
                cskc cskcVar = bzgd.a;
                bsvdVar.b(fcek.this.c);
                bsvdVar.d(byzd.GAIA);
                return bsvdVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a2.b().T();
    }

    public final boolean z(fcek fcekVar) {
        if (fcekVar == null) {
            return false;
        }
        Iterator it = o().iterator();
        while (it.hasNext()) {
            if (((fcek) it.next()).c.equals(fcekVar.c)) {
                return true;
            }
        }
        return false;
    }
}
