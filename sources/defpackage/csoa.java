package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.telephony.ims.ImsMmTelManager;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csoa implements csmz, copj {
    public static final enru c = enru.c("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl");
    private static final engw x = engw.v(new csml(2, csmy.BLUETOOTH), new csml(0, csmy.CELLULAR), new csml(3, csmy.ETHERNET), new csml(4, csmy.VPN), new csml(1, csmy.WIFI));
    private static final Duration y = Duration.ofSeconds(3);
    private final ffbr A;
    private final fazb B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final AtomicReference F;
    private final emyl G;
    private emyl H;
    private final ffbr I;
    private final ffbr J;
    private final ffbr K;
    public final Context d;
    public final csmo e;
    public final ffbr f;
    public final IntentFilter g;
    public final errl h;
    public final Executor i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final List n = new ArrayList();
    public final List o = new ArrayList();
    public final Semaphore p;
    public final AtomicReference q;
    public final AtomicReference r;
    public final AtomicBoolean s;
    public final AtomicInteger t;
    public final Map u;
    public final Map v;
    public final ffbr w;
    private final ffbr z;

    public csoa(ffbr ffbrVar, ffbr ffbrVar2, Context context, ffbr ffbrVar3, ffbr ffbrVar4, fazb fazbVar, errl errlVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14) {
        new ArrayList();
        this.p = new Semaphore(1, true);
        this.F = new AtomicReference(eplj.UNKNOWN_SIGNAL_STRENGTH);
        this.q = new AtomicReference(cnok.a);
        this.r = new AtomicReference(cnok.a);
        this.s = new AtomicBoolean(false);
        this.t = new AtomicInteger(4);
        this.u = new ConcurrentHashMap();
        this.v = new ConcurrentHashMap();
        this.I = ffbrVar;
        this.J = ffbrVar2;
        this.d = context;
        this.f = ffbrVar3;
        this.A = ffbrVar4;
        this.B = fazbVar;
        this.i = new ersb(errlVar);
        this.h = errlVar;
        this.z = ffbrVar5;
        this.C = ffbrVar6;
        this.E = ffbrVar7;
        this.j = ffbrVar8;
        this.D = ffbrVar10;
        this.k = ffbrVar9;
        this.l = ffbrVar11;
        this.m = ffbrVar12;
        this.K = ffbrVar14;
        IntentFilter intentFilter = new IntentFilter();
        this.g = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.e = new csmo(this);
        this.w = ffbrVar13;
        this.G = emys.b(new emyl() { // from class: csnt
            @Override // defpackage.emyl
            public final Object get() {
                boolean b = dksg.b(csoa.this.d);
                ensk e = csoa.c.e();
                e.Y(ente.a, "BugleConnectivity");
                enrr enrrVar = (enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "<init>", 232, "ConnectivityUtilImpl.java");
                Boolean valueOf = Boolean.valueOf(b);
                enrrVar.t("cached wifi connection %s", valueOf);
                return valueOf;
            }
        }, y);
    }

    private final boolean J(int i) {
        return (((atrj) this.I.b()).a() ? ((Boolean) ((cort) this.J.b()).i(i).map(new Function() { // from class: csnq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cosz) obj).o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() : ((dkpp) this.z.b()).t()) && w();
    }

    private static boolean K(ImsMmTelManager imsMmTelManager, Method method, int i) {
        try {
            return Boolean.TRUE.equals(method.invoke(imsMmTelManager, 8, Integer.valueOf(i)));
        } catch (IllegalAccessException e) {
            ensk i2 = c.i();
            i2.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) ((enrr) i2).g(e)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isImsCapabilityAvailable", 422, "ConnectivityUtilImpl.java")).u("IsImsCapabilityAvailable(%d, %d) method not accessible.", 8, i);
            return false;
        } catch (InvocationTargetException e2) {
            ensk i3 = c.i();
            i3.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) ((enrr) i3).g(e2)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isImsCapabilityAvailable", 426, "ConnectivityUtilImpl.java")).J("IsImsCapabilityAvailable(%d, %d) method threw exception. %s", 8, Integer.valueOf(i), e2);
            return false;
        }
    }

    @Override // defpackage.csmz
    public final eplj A() {
        return (eplj) this.F.get();
    }

    @Override // defpackage.csmz
    public final int B() {
        int ordinal = ((cnok) this.q.get()).ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2 || ordinal == 3) {
            return 3;
        }
        int i = 4;
        if (ordinal != 4) {
            i = 5;
            if (ordinal != 5) {
                return 1;
            }
        }
        return i;
    }

    public final csoe C(int i) {
        return ((csow) this.B.b()).a(i);
    }

    public final void D(String str) {
        ensk h = c.h();
        h.Y(ente.a, "BugleConnectivity");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "logConnectionStateOnEvent", 1251, "ConnectivityUtilImpl.java")).K("Connection state change: %s, data connection: %s, manual connection eligibility: %b, ntn roaming: %b", str, this.q, Boolean.valueOf(H()), Boolean.valueOf(this.s.get()));
    }

    public final void E(final cnol cnolVar, final String str) {
        try {
            this.p.acquire();
            axnw.h(elfo.f(new Runnable() { // from class: csnc
                @Override // java.lang.Runnable
                public final void run() {
                    final csoa csoaVar = csoa.this;
                    elfl a = ((azpx) csoaVar.j.b()).a();
                    final cnol cnolVar2 = cnolVar;
                    final String str2 = str;
                    a.h(new emwl() { // from class: csnf
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            Iterator it = ((Iterable) obj).iterator();
                            while (true) {
                                final csoa csoaVar2 = csoa.this;
                                if (!it.hasNext()) {
                                    csoaVar2.p.release();
                                    return true;
                                }
                                String str3 = str2;
                                final cnol cnolVar3 = cnolVar2;
                                final azop azopVar = (azop) it.next();
                                ensk h = csoa.c.h();
                                h.Y(ente.a, "BugleConnectivity");
                                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "notifySatelliteEvent", 991, "ConnectivityUtilImpl.java")).J("[%s] Notifying satellite event for state %s on identity: %s", str3, cnolVar3, azopVar.b());
                                ((azei) csoaVar2.k.b()).d(new Consumer() { // from class: csnj
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        csoa csoaVar3 = csoa.this;
                                        azop azopVar2 = azopVar;
                                        cnoz cnozVar = (cnoz) obj2;
                                        int ordinal = cnolVar3.ordinal();
                                        if (ordinal == 0) {
                                            cnozVar.d(azopVar2.b());
                                            return;
                                        }
                                        if (ordinal == 1) {
                                            if (csoaVar3.I(azopVar2)) {
                                                azopVar2.b();
                                                cnozVar.f();
                                                return;
                                            }
                                            return;
                                        }
                                        if (ordinal == 2) {
                                            if (csoaVar3.I(azopVar2)) {
                                                azopVar2.b();
                                                cnozVar.g();
                                                return;
                                            }
                                            return;
                                        }
                                        if (ordinal == 3) {
                                            azopVar2.b();
                                            cnozVar.e();
                                        } else if (ordinal == 4 && !csoaVar3.I(azopVar2)) {
                                            cnozVar.a(azopVar2.b());
                                        }
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                        }
                    }, csoaVar.i);
                }
            }, this.i));
        } catch (InterruptedException e) {
            ensk j = c.j();
            j.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "notifySatelliteEventForIdentities", (char) 985, "ConnectivityUtilImpl.java")).q("Failed to notify satellite event due to thread interruption");
        }
    }

    public final void F(cnok cnokVar) {
        this.r.set((cnok) this.q.getAndSet(cnokVar));
        ensk e = c.e();
        e.Y(ente.a, "BugleConnectivity");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "setDataConnection", 957, "ConnectivityUtilImpl.java")).D("Data connection changed from %s to %s", this.r.get(), this.q.get());
    }

    public final void G(Network network) {
        NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.f.b()).getNetworkCapabilities(network);
        if (networkCapabilities == null || !ctid.h) {
            ensk h = c.h();
            h.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 909, "ConnectivityUtilImpl.java")).q("Not updating default data network");
            return;
        }
        if (ctid.i && networkCapabilities.hasTransport(10)) {
            ensk h2 = c.h();
            h2.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 914, "ConnectivityUtilImpl.java")).q("New default data network: satellite");
            F(cnok.b);
            return;
        }
        try {
            if (networkCapabilities.hasTransport(10)) {
                ensk h3 = c.h();
                h3.Y(ente.a, "BugleConnectivity");
                ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 919, "ConnectivityUtilImpl.java")).q("New default data network: satellite");
                F(cnok.b);
                return;
            }
        } catch (IllegalArgumentException unused) {
            ensk e = c.e();
            e.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "networkCapabilitiesHasSatellite", 950, "ConnectivityUtilImpl.java")).q("IllegalArgumentException: Satellite features not supported");
        }
        if (networkCapabilities.hasTransport(0)) {
            ensk h4 = c.h();
            h4.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 924, "ConnectivityUtilImpl.java")).q("New default data network: cellular");
            F(cnok.c);
            return;
        }
        if (networkCapabilities.hasTransport(1)) {
            ensk h5 = c.h();
            h5.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 927, "ConnectivityUtilImpl.java")).q("New default data network: wifi");
            F(cnok.d);
            return;
        }
        F(cnok.f);
        enru enruVar = c;
        ensk h6 = enruVar.h();
        h6.Y(ente.a, "BugleConnectivity");
        ((enrr) ((enrr) h6).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 931, "ConnectivityUtilImpl.java")).q("New default data network: other");
        if (!H() || this.s.get()) {
            return;
        }
        ensk h7 = enruVar.h();
        h7.Y(ente.a, "BugleConnectivity");
        ((enrr) ((enrr) h7).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 933, "ConnectivityUtilImpl.java")).q("Manual satellite eligible and no active ntn roaming. Notifying listeners of eligibility.");
        E(cnol.a, "updateDefaultDataNetwork");
    }

    public final boolean H() {
        return this.v.containsValue(true);
    }

    public final boolean I(azop azopVar) {
        return ((Boolean) ((azpo) this.D.b()).a(azopVar).c().map(new Function() { // from class: csnn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(csoa.this.v(((Integer) obj).intValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    @Override // defpackage.copj
    public final /* synthetic */ void a(Set set) {
        set.getClass();
    }

    @Override // defpackage.copj
    public final void b(Set set) {
        if (((ausa) this.w.b()).a()) {
            D("SIM removed");
            Stream map = Collection.EL.stream(set).map(new Function() { // from class: csno
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((cosz) obj).d);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            final engw engwVar = (engw) map.collect(endq.a);
            boolean H = H();
            Collection.EL.removeIf(this.v.keySet(), new Predicate() { // from class: csnp
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
                    enru enruVar = csoa.c;
                    return engw.this.contains((Integer) obj);
                }
            });
            if (!H || H() || this.s.get()) {
                return;
            }
            ensk h = c.h();
            h.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "handleSimRemoved", 825, "ConnectivityUtilImpl.java")).q("Previously eligible SIM is no longer available and no other SIMs are satellite eligible. Notifying listeners of lost manual satellite eligibility.");
            E(cnol.e, "onSimStateChanged");
        }
    }

    @Override // defpackage.csmz
    public final int c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.b()).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    @Override // defpackage.csmz
    public final csod d(int i, int i2) {
        if (i == 0) {
            return g(i2);
        }
        if (i == 1) {
            return e(i2);
        }
        if (i == 3) {
            return f();
        }
        if (i == 7) {
            return csod.AVAILABLE;
        }
        throw new IllegalArgumentException(a.h(i, "The message protocol is invalid: "));
    }

    @Override // defpackage.csmz
    public final csod e(int i) {
        NetworkInfo networkInfo;
        if (J(i)) {
            return csod.AVAILABLE;
        }
        Network[] allNetworks = ((ConnectivityManager) this.f.b()).getAllNetworks();
        int length = allNetworks.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                Network network = allNetworks[i2];
                if (network != null && (networkInfo = ((ConnectivityManager) this.f.b()).getNetworkInfo(network)) != null && networkInfo.getType() == 0) {
                    z = networkInfo.isConnected();
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        csoe C = C(i);
        return (C == csoe.UNAVAILABLE || C == csoe.EMERGENCY_ONLY) ? csod.UNAVAILABLE : (r() && z) ? csod.AVAILABLE : csod.UNKNOWN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (r0.a(((defpackage.ctwb) r0.d.b()).f()) != defpackage.csoe.EMERGENCY_ONLY) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    @Override // defpackage.csmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.csod f() {
        /*
            r9 = this;
            boolean r0 = r9.r()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L54
            ffbr r0 = r9.A
            java.lang.Object r0 = r0.b()
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isDeviceIdleMode()
            ffbr r3 = r9.f
            java.lang.Object r3 = r3.b()
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            if (r3 == 0) goto L2a
            boolean r3 = r3.isAvailable()
            if (r3 == 0) goto L2a
            r3 = r1
            goto L2b
        L2a:
            r3 = r2
        L2b:
            enru r4 = defpackage.csoa.c
            ensk r4 = r4.g()
            ensn r5 = defpackage.ente.a
            java.lang.String r6 = "BugleConnectivity"
            r4.Y(r5, r6)
            enrr r4 = (defpackage.enrr) r4
            java.lang.String r5 = "isNetworkAvailableButDeviceInDozeMode"
            r6 = 677(0x2a5, float:9.49E-43)
            java.lang.String r7 = "com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl"
            java.lang.String r8 = "ConnectivityUtilImpl.java"
            ensk r4 = r4.h(r7, r5, r6, r8)
            enrr r4 = (defpackage.enrr) r4
            java.lang.String r5 = "dozing: %b, network available: %b"
            r4.I(r5, r0, r3)
            if (r0 == 0) goto L52
            if (r3 == 0) goto L52
            goto L54
        L52:
            r0 = r2
            goto L55
        L54:
            r0 = r1
        L55:
            ffbr r3 = r9.E
            java.lang.Object r3 = r3.b()
            atqv r3 = (defpackage.atqv) r3
            boolean r3 = r3.a()
            if (r3 != 0) goto L84
            if (r0 == 0) goto L82
            fazb r0 = r9.B
            java.lang.Object r0 = r0.b()
            csow r0 = (defpackage.csow) r0
            ffbr r3 = r0.d
            java.lang.Object r3 = r3.b()
            ctwb r3 = (defpackage.ctwb) r3
            int r3 = r3.f()
            csoe r0 = r0.a(r3)
            csoe r3 = defpackage.csoe.EMERGENCY_ONLY
            if (r0 == r3) goto L82
            goto L85
        L82:
            r1 = r2
            goto L85
        L84:
            r1 = r0
        L85:
            if (r1 == 0) goto L8a
            csod r0 = defpackage.csod.AVAILABLE
            return r0
        L8a:
            csod r0 = defpackage.csod.UNAVAILABLE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csoa.f():csod");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0228, code lost:
    
        if (r0 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01bb, code lost:
    
        if (K(r13, (java.lang.reflect.Method) r0, 3) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f8, code lost:
    
        if (r0.isAvailable(8, 3) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0269  */
    @Override // defpackage.csmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.csod g(int r20) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csoa.g(int):csod");
    }

    @Override // defpackage.csmz
    public final enip h() {
        try {
            Network activeNetwork = ((ConnectivityManager) this.f.b()).getActiveNetwork();
            if (activeNetwork == null) {
                return enpd.a;
            }
            final NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.f.b()).getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return enpd.a;
            }
            final enin eninVar = new enin();
            Collection.EL.stream(x).filter(new Predicate() { // from class: csng
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
                    enru enruVar = csoa.c;
                    return networkCapabilities.hasTransport(((csnz) obj).a());
                }
            }).map(new Function() { // from class: csnh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((csnz) obj).b();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).forEach(new Consumer() { // from class: csni
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    enin.this.c((csmy) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (networkCapabilities.hasTransport(5)) {
                eninVar.c(csmy.OTHER);
            }
            if (networkCapabilities.hasTransport(6)) {
                eninVar.c(csmy.OTHER);
            }
            return eninVar.g();
        } catch (SecurityException e) {
            ensk j = c.j();
            j.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "getActiveNetworkTransports", (char) 717, "ConnectivityUtilImpl.java")).q("Failed to get active network transports due to missing ACCESS_NETWORK_STATE permissions");
            return enpd.a;
        }
    }

    @Override // defpackage.csmz
    public final ListenableFuture i() {
        return !r() ? erqt.i(false) : this.h.submit(eldl.m(new Callable() { // from class: csns
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                enru enruVar = csoa.c;
                try {
                    try {
                        Socket socket = new Socket();
                        try {
                            TrafficStats.setThreadStatsTag(8960);
                            socket.connect(new InetSocketAddress("8.8.8.8", 53), 1500);
                            socket.close();
                            TrafficStats.clearThreadStatsTag();
                            z = true;
                        } catch (Throwable th) {
                            try {
                                socket.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        ensk e = csoa.c.e();
                        e.Y(ente.a, "BugleConnectivity");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isGoogleDnsAvailable", 698, "ConnectivityUtilImpl.java")).q("Cannot connect to Google DNS");
                        TrafficStats.clearThreadStatsTag();
                        z = false;
                    }
                    return Boolean.valueOf(z);
                } catch (Throwable th3) {
                    TrafficStats.clearThreadStatsTag();
                    throw th3;
                }
            }
        }));
    }

    @Override // defpackage.csmz
    public final void j() {
        this.H = emys.a(new emyl() { // from class: csnd
            @Override // defpackage.emyl
            public final Object get() {
                return new csny(csoa.this);
            }
        });
    }

    @Override // defpackage.csmz
    public final void k() {
        axos.a(new Runnable() { // from class: csnl
            @Override // java.lang.Runnable
            public final void run() {
                csoa csoaVar = csoa.this;
                for (final cyme cymeVar : csoaVar.n) {
                    cymeVar.getClass();
                    axos.a(new Runnable() { // from class: csnk
                        @Override // java.lang.Runnable
                        public final void run() {
                            cyme.this.a.a();
                        }
                    }, csoaVar.h);
                }
            }
        }, this.i);
    }

    @Override // defpackage.csmz
    public final void l(final csmw csmwVar) {
        axos.a(new Runnable() { // from class: csnm
            @Override // java.lang.Runnable
            public final void run() {
                csoa csoaVar = csoa.this;
                if (csoaVar.o.isEmpty()) {
                    csoaVar.d.registerReceiver(csoaVar.e, csoaVar.g, 2);
                }
                csoaVar.o.add(csmwVar);
            }
        }, this.i);
    }

    @Override // defpackage.csmz
    public final void m(final csmx csmxVar, csmv csmvVar) {
        int f;
        final csow csowVar = (csow) this.B.b();
        ensz enszVar = (ensz) csow.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "registerConnectivityStateListener", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "NetworkStateMonitorManager.java");
        csmu b = csmu.b(csmvVar.c);
        if (b == null) {
            b = csmu.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        enszVar.B("registerConnectivityStateListener: subscription type %s, subId %d.", b, csmvVar.d);
        int i = csmvVar.c;
        csmu b2 = csmu.b(i);
        if (b2 == null) {
            b2 = csmu.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        csmu csmuVar = csmu.SUBSCRIPTION_TYPE_UNSPECIFIED;
        if (b2 != csmuVar) {
            csmu b3 = csmu.b(i);
            if (b3 == null) {
                b3 = csmuVar;
            }
            if (b3 != csmu.SPECIFIED_SUBSCRIPTION || (csmvVar.b & 2) != 0) {
                if (csowVar.d()) {
                    csowVar.e.registerReceiver(csowVar.f, csowVar.g, 4);
                }
                int i2 = csmvVar.c;
                csmu b4 = csmu.b(i2);
                if (b4 == null) {
                    b4 = csmu.SUBSCRIPTION_TYPE_UNSPECIFIED;
                }
                if (b4 == csmu.ALL_ACTIVE_SUBSCRIPTIONS) {
                    ((ctwb) csowVar.d.b()).o(new ctwa() { // from class: csop
                        @Override // defpackage.ctwa
                        public final boolean a(int i3) {
                            csow csowVar2 = csow.this;
                            csmx csmxVar2 = csmxVar;
                            synchronized (csowVar2.j) {
                                csowVar2.c(i3);
                                csowVar2.b(csmxVar2, -1);
                            }
                            return true;
                        }
                    });
                    return;
                }
                csmu b5 = csmu.b(i2);
                if (b5 == null) {
                    b5 = csmu.SUBSCRIPTION_TYPE_UNSPECIFIED;
                }
                if (b5 != csmu.SPECIFIED_SUBSCRIPTION || (f = csmvVar.d) < 0) {
                    f = ((ctwb) csowVar.d.b()).f();
                }
                synchronized (csowVar.j) {
                    csowVar.c(f);
                    csowVar.b(csmxVar, f);
                }
                return;
            }
        }
        csmu b6 = csmu.b(i);
        if (b6 != null) {
            csmuVar = b6;
        }
        throw new IllegalArgumentException("Register ConnectivityStateListener for invalid subscription: subscription_type " + csmuVar.name() + ", subscription_id " + csmvVar.d);
    }

    @Override // defpackage.csmz
    public final void n(csmx csmxVar, csmv csmvVar) {
        int f;
        csof csofVar;
        csow csowVar = (csow) this.B.b();
        ensz enszVar = (ensz) csow.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "unregisterConnectivityStateListener", 153, "NetworkStateMonitorManager.java");
        csmu b = csmu.b(csmvVar.c);
        if (b == null) {
            b = csmu.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        enszVar.B("unregisterConnectivityStateListener: subscription type %s, subId %d.", b, csmvVar.d);
        int i = csmvVar.c;
        csmu b2 = csmu.b(i);
        if (b2 == null) {
            b2 = csmu.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        if (b2 == csmu.ALL_ACTIVE_SUBSCRIPTIONS) {
            f = -1;
        } else {
            csmu b3 = csmu.b(i);
            if (b3 == null) {
                b3 = csmu.SUBSCRIPTION_TYPE_UNSPECIFIED;
            }
            if (b3 != csmu.SPECIFIED_SUBSCRIPTION || (f = csmvVar.d) < 0) {
                f = ((ctwb) csowVar.d.b()).f();
            }
        }
        synchronized (csowVar.j) {
            Map map = csowVar.i;
            Integer valueOf = Integer.valueOf(f);
            List list = (List) map.get(valueOf);
            if (list == null) {
                ((ensz) ((ensz) csow.a.h()).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "removeConnectivityStateListener", 320, "NetworkStateMonitorManager.java")).r("removeConnectivityStateListener: Entry in connectivityListenerListsMap not found for subId %d.", f);
            } else {
                boolean remove = list.remove(csmxVar);
                if (list.isEmpty()) {
                    csowVar.i.remove(valueOf);
                }
                if (remove) {
                    boolean e = csowVar.e(-1);
                    enqu listIterator = enip.o(csowVar.h.keySet()).listIterator();
                    while (listIterator.hasNext()) {
                        Integer num = (Integer) listIterator.next();
                        int intValue = num.intValue();
                        if (e && csowVar.e(intValue) && (csofVar = (csof) csowVar.h.remove(num)) != null) {
                            csofVar.c();
                        }
                    }
                } else {
                    ((ensz) ((ensz) csow.a.h()).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "removeConnectivityStateListener", 331, "NetworkStateMonitorManager.java")).r("removeConnectivityStateListener: ConnectivityStateListener not found for subId %d.", f);
                }
            }
        }
        if (csowVar.d()) {
            try {
                csowVar.e.unregisterReceiver(csowVar.f);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // defpackage.csmz
    public final boolean o(int i) {
        return !v(i) || ((Boolean) this.G.get()).booleanValue();
    }

    @Override // defpackage.csmz
    public final boolean p() {
        return ((ConnectivityManager) this.f.b()).isActiveNetworkMetered();
    }

    @Override // defpackage.csmz
    public final boolean q() {
        return this.u.containsValue(true);
    }

    @Override // defpackage.csmz
    public final boolean r() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.b()).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // defpackage.csmz
    public final boolean s() {
        if (!ctid.h) {
            return false;
        }
        if (((cnok) this.q.get()).equals(cnok.a)) {
            emyl emylVar = this.H;
            if (emylVar != null) {
            } else {
                ensk j = c.j();
                j.Y(ente.a, "BugleConnectivity");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "registerSatelliteNetworkCallbacks", 1037, "ConnectivityUtilImpl.java")).q("defaultDataRegisterer has not been initialized");
            }
            Network activeNetwork = ((ConnectivityManager) this.f.b()).getActiveNetwork();
            if (activeNetwork != null) {
                G(activeNetwork);
            }
        }
        ensk j2 = c.j();
        j2.Y(ente.a, "BugleConnectivity");
        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isDefaultDataOverSatellite", 769, "ConnectivityUtilImpl.java")).t("Active connection is = %s", this.q.get());
        return ((cnok) this.q.get()).equals(cnok.b);
    }

    @Override // defpackage.csmz
    public final boolean t() {
        return s() && !H();
    }

    @Override // defpackage.csmz
    public final boolean u() {
        return s() && H();
    }

    @Override // defpackage.csmz
    public final boolean v(int i) {
        return ((Boolean) Map.EL.getOrDefault(this.u, Integer.valueOf(i), false)).booleanValue() || C(i).equals(csoe.SATELLITE);
    }

    @Override // defpackage.csmz
    public final boolean w() {
        return dksg.b(this.d);
    }

    @Override // defpackage.csmz
    public final boolean x() {
        return ctid.a;
    }

    @Override // defpackage.csmz
    public final void y(final cyme cymeVar) {
        axos.a(new Runnable() { // from class: csne
            @Override // java.lang.Runnable
            public final void run() {
                csoa.this.n.add(cymeVar);
            }
        }, this.i);
    }

    @Override // defpackage.csmz
    public final void z(final cyme cymeVar) {
        axos.a(new Runnable() { // from class: csnr
            @Override // java.lang.Runnable
            public final void run() {
                csoa.this.n.remove(cymeVar);
            }
        }, this.i);
    }
}
