package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.car.app.model.Alert;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akya implements akxl {
    public static final entd a = entd.c("BugleClearcutLogger");
    static final cfup b = cfvl.i(cfvl.b, "filter_non_northstar_clearcut_logs_enable", false);
    private static final int e = (int) TimeUnit.SECONDS.toMillis(1);
    public dfmc c;
    public final errm d;
    private final boolean f;
    private final ffbr g;
    private final ffbr h;
    private dfld i;
    private dfld j;
    private dfld k;
    private Map l;
    private final cqoh m;
    private final algm n;
    private Map o;
    private final emyl p;
    private final akyb q;
    private final akyb r;
    private final akyb s;
    private final diky t;

    public akya(Context context, errm errmVar, final csxu csxuVar, ffbr ffbrVar, cskx cskxVar, ffbr ffbrVar2, cqoh cqohVar, algm algmVar, diky dikyVar, akxp akxpVar, ffbr ffbrVar3, akyb akybVar, akyb akybVar2, akyb akybVar3) {
        this.h = ffbrVar;
        this.m = cqohVar;
        this.n = algmVar;
        this.d = errmVar;
        boolean i = csxuVar.i("bugle_enable_analytics", true);
        this.f = i;
        this.g = ffbrVar3;
        if (i && cskxVar.a(context)) {
            Context context2 = akxpVar.a;
            List list = dfld.m;
            this.i = new dfla(context2, "ANDROID_MESSAGING").c();
            this.j = akxpVar.a();
            this.k = akxpVar.b();
            this.c = new dfmc(this.i, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
            if (((Boolean) cful.E.e()).booleanValue()) {
                this.c.h(errmVar, e);
            }
            ffbrVar2.b();
            B(ffbrVar, this.c, true, this.i);
            this.l = new HashMap();
        } else if (i) {
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "<init>", 178, "BugleClearcutLoggerImpl.java")).q("Clearcut logging is disabled because Google Play Services isn't available.");
        } else {
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "<init>", 175, "BugleClearcutLoggerImpl.java")).q("Clearcut logging is disabled because analytics GServices is not enabled.");
        }
        this.p = emys.a(new emyl() { // from class: akxt
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = akya.a;
                String e2 = csjc.i() ? csxu.this.e("bugle_testing_simulation_session_id", "") : "";
                if ("".equals(e2)) {
                    return Optional.empty();
                }
                eouj eoujVar = (eouj) eouk.a.createBuilder();
                ((ensz) ((ensz) akya.a.h()).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "extractBugleTestingInfo", 205, "BugleClearcutLoggerImpl.java")).t("Associating clearcut log with simulation: %s", e2);
                eoujVar.copyOnWrite();
                eouk eoukVar = (eouk) eoujVar.instance;
                e2.getClass();
                eoukVar.b |= 2;
                eoukVar.d = e2;
                return Optional.of((eouk) eoujVar.build());
            }
        });
        this.t = dikyVar;
        this.q = akybVar;
        this.r = akybVar2;
        this.s = akybVar3;
    }

    private final void A(final eolu eoluVar, dfld dfldVar, epyw epywVar, double d, Long l, Long l2, boolean z) {
        emxf.a(d >= eobe.a);
        emxf.a(d <= 100.0d);
        if (this.t.a() < d) {
            if (((Boolean) b.e()).booleanValue()) {
                eolt b2 = eolt.b(((eolv) eoluVar.instance).j);
                if (b2 == null) {
                    b2 = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
                }
                int ordinal = b2.ordinal();
                if (ordinal == 12 || ordinal == 18 || ordinal == 23 || ordinal == 37 || ordinal == 40 || ordinal == 44 || ordinal == 60 || ordinal == 88 || ordinal == 108 || ordinal == 28 || ordinal == 29) {
                    return;
                }
            }
            eolv eolvVar = (eolv) eoluVar.instance;
            eolt b3 = eolt.b(eolvVar.j);
            if (b3 == null) {
                b3 = eolt.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            if (b3 == eolt.BUGLE_MESSAGE) {
                eopq eopqVar = eolvVar.l;
                if (eopqVar == null) {
                    eopqVar = eopq.a;
                }
                int b4 = eoom.b(eopqVar.g);
                if (b4 == 0 || b4 == 1) {
                    return;
                }
            }
            elfr.l(this.n.f(this.m.f().toEpochMilli()), new csvw(new Consumer() { // from class: akxv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    entd entdVar = akya.a;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: akxw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((ensz) ((ensz) ((ensz) akya.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "sendBugleEventToClearcut", 326, "BugleClearcutLoggerImpl.java")).q("Failed to log lastPassiveEventTime");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), erpp.a);
            if (!this.f || dfldVar == null) {
                return;
            }
            if (eoluVar != null) {
                ((Optional) this.p.get()).ifPresent(new Consumer() { // from class: akxr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        eolu eoluVar2 = eolu.this;
                        eouk eoukVar = (eouk) obj;
                        eoluVar2.copyOnWrite();
                        eolv eolvVar2 = (eolv) eoluVar2.instance;
                        eolv eolvVar3 = eolv.a;
                        eoukVar.getClass();
                        eolvVar2.s = eoukVar;
                        eolvVar2.b |= 2048;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (dfldVar.e()) {
                z(this.s, eoluVar, epywVar, l, l2);
            } else if (dfldVar.k.equals(dfmi.c) || z) {
                z(this.r, eoluVar, epywVar, l, l2);
            } else {
                z(this.q, eoluVar, epywVar, l, l2);
            }
        }
    }

    private static void B(ffbr ffbrVar, dfmc dfmcVar, boolean z, dfld dfldVar) {
        eoli a2 = ((akzx) ffbrVar.b()).a();
        ensk o = a.o();
        o.Y(algr.h, a2.c);
        ensn ensnVar = algr.i;
        int a3 = eolh.a(a2.e);
        if (a3 == 0) {
            a3 = 1;
        }
        o.Y(ensnVar, Integer.valueOf(a3 - 1));
        o.Y(algr.j, a2.r);
        o.Y(algr.k, a2.f);
        o.Y(algr.l, a2.g);
        ((ensz) o.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "logCustomDimensions", 700, "BugleClearcutLoggerImpl.java")).q("---COUNTER DIMENSIONS---");
        if (C(dfmcVar, z, dfldVar)) {
            dfmcVar.i(a2);
        }
    }

    private static boolean C(dfmc dfmcVar, boolean z, dfld dfldVar) {
        if (!z) {
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "shouldLogCounters", 707, "BugleClearcutLoggerImpl.java")).q("Clearcut logging disabled via GServices.");
            return false;
        }
        if (dfldVar != null && dfmcVar != null) {
            return true;
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "shouldLogCounters", 712, "BugleClearcutLoggerImpl.java")).q("Clearcut logging disabled because Play Services isn't available.");
        return false;
    }

    private final void D(final dfmc dfmcVar, final String str, final long j) {
        if (t(dfmcVar, str)) {
            ensk o = a.o();
            o.Y(algr.b, str);
            o.Y(algr.f, Long.valueOf(j));
            o.Y(algr.a, 1L);
            ((ensz) o.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementLongHistogram", 630, "BugleClearcutLoggerImpl.java")).q("Incrementing long histogram.");
            w(dfmcVar, str, new Runnable() { // from class: akxy
                @Override // java.lang.Runnable
                public final void run() {
                    entd entdVar = akya.a;
                    dflz e2 = dfmc.this.e(str);
                    dflt dfltVar = e2.f;
                    e2.a(j, 1L, dfmc.b);
                }
            });
        }
    }

    private final synchronized Optional u(String str) {
        Map map = this.l;
        if (map == null) {
            return Optional.empty();
        }
        if (!map.containsKey(str)) {
            dfmc dfmcVar = new dfmc(this.i, "BUGLE_COUNTERS", Alert.DURATION_SHOW_INDEFINITELY);
            dfmcVar.i(((akzx) this.h.b()).b(str));
            this.l.put(str, dfmcVar);
        }
        return Optional.of((dfmc) this.l.get(str));
    }

    private final synchronized Map v() {
        if (this.o == null) {
            this.o = new ArrayMap();
            for (String str : emye.b(',').g((String) cful.v.e())) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        int indexOf = str.indexOf(58);
                        this.o.put(str.substring(0, indexOf), Double.valueOf(Double.parseDouble(str.substring(indexOf + 1))));
                    } catch (Exception e2) {
                        ((ensz) ((ensz) ((ensz) a.i()).g(e2)).h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "getHistogramUploadRatios", 750, "BugleClearcutLoggerImpl.java")).t("Error parsing %s", str);
                    }
                }
            }
        }
        return this.o;
    }

    private final void w(final dfmc dfmcVar, String str, final Runnable runnable) {
        elfl c;
        aleo aleoVar = (aleo) this.g.b();
        str.getClass();
        c = axol.c(aleoVar.a, ffhe.a, ffsm.a, new alek(aleoVar, str, null));
        axnw.h(c.h(new emwl() { // from class: akxs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                final Runnable runnable2 = runnable;
                if (((Boolean) cful.E.e()).booleanValue()) {
                    runnable2.run();
                    return null;
                }
                final dfmc dfmcVar2 = dfmcVar;
                axos.a(new Runnable() { // from class: akxz
                    @Override // java.lang.Runnable
                    public final void run() {
                        entd entdVar = akya.a;
                        runnable2.run();
                        dfmcVar2.f();
                    }
                }, akya.this.d);
                return null;
            }
        }, this.d));
    }

    private final void x(final dfmc dfmcVar, final String str, final long j) {
        if (C(this.c, this.f, this.i)) {
            ensk o = a.o();
            o.Y(algr.b, str);
            o.Y(algr.a, Long.valueOf(j));
            ((ensz) o.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementCounterBy", 551, "BugleClearcutLoggerImpl.java")).q("Incrementing counter.");
            w(dfmcVar, str, new Runnable() { // from class: akxu
                @Override // java.lang.Runnable
                public final void run() {
                    entd entdVar = akya.a;
                    dfmc dfmcVar2 = dfmc.this;
                    dfmcVar2.c(str).a(0L, j, dfmc.b);
                }
            });
        }
    }

    private final void y(final dfmc dfmcVar, final String str, final int i, final long j) {
        if (t(dfmcVar, str)) {
            ensk o = a.o();
            o.Y(algr.b, str);
            o.Y(algr.e, Integer.valueOf(i));
            o.Y(algr.a, Long.valueOf(j));
            ((ensz) o.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementIntegerHistogram", 588, "BugleClearcutLoggerImpl.java")).q("Incrementing integer histogram.");
            w(dfmcVar, str, new Runnable() { // from class: akxq
                @Override // java.lang.Runnable
                public final void run() {
                    entd entdVar = akya.a;
                    dfmc.this.d(str).a(i, j, dfmc.b);
                }
            });
        }
    }

    private static void z(akyb akybVar, eolu eoluVar, epyw epywVar, Long l, Long l2) {
        akxn a2 = akybVar.a();
        a2.d(epywVar);
        if (l != null && l2 != null) {
            a2.f(new akzo(l.longValue(), l2.longValue()));
        }
        a2.h(eoluVar, alal.LOG_SPEC_LEGACY_LOGGING);
    }

    @Override // defpackage.akxl
    public final void a() {
        efbd.b();
        dfmc dfmcVar = this.c;
        if (dfmcVar == null) {
            return;
        }
        try {
            dhrt.g(dfmcVar.f(), 1100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
    }

    @Override // defpackage.akxl
    public final void b() {
        efbd.b();
        dfmc dfmcVar = this.c;
        if (dfmcVar == null) {
            return;
        }
        cqoh cqohVar = this.m;
        dhre f = dfmcVar.f();
        long a2 = cqohVar.a();
        this.i.h.c(TimeUnit.MILLISECONDS);
        try {
            dhrt.g(f, Math.max(0L, 1100 - (this.m.a() - a2)), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
    }

    @Override // defpackage.akxl
    public final void c(final String str, eogt eogtVar, final long j) {
        if (t(this.c, str)) {
            ensk o = a.o();
            o.Y(algr.b, str);
            o.Y(algr.g, eogtVar.name());
            o.Y(algr.a, Long.valueOf(j));
            ((ensz) o.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementActionHistogramBy", 652, "BugleClearcutLoggerImpl.java")).q("Incrementing action histogram.");
            eole eoleVar = (eole) eoli.a.createBuilder();
            eoleVar.copyOnWrite();
            eoli eoliVar = (eoli) eoleVar.instance;
            eoliVar.t = eogtVar.bI;
            eoliVar.b |= 131072;
            eovw eovwVar = csjc.a;
            eoleVar.copyOnWrite();
            eoli eoliVar2 = (eoli) eoleVar.instance;
            eoliVar2.u = eovwVar.x;
            eoliVar2.b |= 262144;
            final eoli eoliVar3 = (eoli) eoleVar.build();
            w(this.c, str, new Runnable() { // from class: akxx
                @Override // java.lang.Runnable
                public final void run() {
                    dflz e2 = akya.this.c.e(str);
                    dflt dfltVar = e2.f;
                    e2.a(j, 1L, dflv.a(eoliVar3));
                }
            });
        }
    }

    @Override // defpackage.akxl
    public final void d(String str) {
        x(this.c, str, 1L);
    }

    @Override // defpackage.akxl
    public final void e(String str, int i) {
        x(this.c, str, i);
    }

    @Override // defpackage.akxl
    public final void f(String str, int i) {
        y(this.c, str, i, 1L);
    }

    @Override // defpackage.akxl
    public final void g(String str, int i, long j) {
        y(this.c, str, i, j);
    }

    @Override // defpackage.akxl
    public final void h(String str, long j) {
        D(this.c, str, j);
    }

    @Override // defpackage.akxl
    public final void i(String str, long j, String str2) {
        Optional u = u(str2);
        if (u.isPresent()) {
            D((dfmc) u.get(), str, j);
            return;
        }
        ensk o = a.o();
        o.Y(algr.b, str);
        o.Y(algr.k, str2);
        o.Y(algr.f, Long.valueOf(j));
        ((ensz) o.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementLongHistogram", 610, "BugleClearcutLoggerImpl.java")).q("Unable to increment long histogram for rbm bot.");
    }

    @Override // defpackage.akxl
    public final void j(eolu eoluVar) {
        k(eoluVar, epyw.UNKNOWN_BUGLE_EVENT_CODE);
    }

    @Override // defpackage.akxl
    public final void k(eolu eoluVar, epyw epywVar) {
        A(eoluVar, this.i, epywVar, 100.0d, null, null, false);
    }

    @Override // defpackage.akxl
    public final void l(eolu eoluVar, epyw epywVar, long j) {
        A(eoluVar, this.i, epywVar, 100.0d, Long.valueOf(j), null, false);
    }

    @Override // defpackage.akxl
    public final void m(eolu eoluVar, epyw epywVar, akzo akzoVar) {
        long j = akzoVar.b;
        A(eoluVar, this.i, epywVar, 100.0d, Long.valueOf(akzoVar.a), Long.valueOf(j), false);
    }

    @Override // defpackage.akxl
    public final void n(eolu eoluVar) {
        q(eoluVar, 100.0d);
    }

    @Override // defpackage.akxl
    public final void o(eolu eoluVar) {
        A(eoluVar, this.k, epyw.UNKNOWN_BUGLE_EVENT_CODE, 100.0d, null, null, true);
    }

    @Override // defpackage.akxl
    public final void p(eolu eoluVar, double d) {
        A(eoluVar, this.i, epyw.UNKNOWN_BUGLE_EVENT_CODE, d, null, null, false);
    }

    @Override // defpackage.akxl
    public final void q(eolu eoluVar, double d) {
        A(eoluVar, this.j, epyw.UNKNOWN_BUGLE_EVENT_CODE, d, null, null, false);
    }

    @Override // defpackage.akxl
    public final void r() {
        B(this.h, this.c, this.f, this.i);
    }

    @Override // defpackage.akxl
    public final void s() {
        Optional u = u("112855188");
        if (u.isPresent()) {
            x((dfmc) u.get(), "Bugle.BugOccurrence.Counts", 1L);
            return;
        }
        ensk o = a.o();
        o.Y(algr.b, "Bugle.BugOccurrence.Counts");
        o.Y(algr.k, "112855188");
        o.Y(algr.a, 1L);
        ((ensz) o.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerImpl", "incrementCounterBy", 533, "BugleClearcutLoggerImpl.java")).q("Unable to increment counter for rbm bot.");
    }

    final boolean t(dfmc dfmcVar, String str) {
        if (!C(dfmcVar, this.f, this.i)) {
            return false;
        }
        Double d = (Double) v().get(str);
        return d == null || ThreadLocalRandom.current().nextDouble() < d.doubleValue();
    }
}
