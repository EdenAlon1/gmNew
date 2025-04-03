package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Message;
import android.os.PowerManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpe extends djop {
    final /* synthetic */ djqf b;
    private PowerManager.WakeLock c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djpe(djqf djqfVar) {
        super(djqfVar);
        this.b = djqfVar;
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "ConnectingState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void b() {
        super.b();
        if (djao.a() > 0) {
            PowerManager.WakeLock newWakeLock = this.b.S.newWakeLock(1, "rcs:ConnectingState");
            this.c = newWakeLock;
            newWakeLock.acquire((djao.a() + 1) * 1000);
        }
        this.b.F(new Runnable() { // from class: djoq
            @Override // java.lang.Runnable
            public final void run() {
                djpe djpeVar = djpe.this;
                djqf djqfVar = djpeVar.b;
                if (djqfVar.l || djqfVar.w != null) {
                    djpeVar.b.q(10);
                    return;
                }
                dkty.r(djpeVar.b.m, "ImsNetworkInterface is not selected.", new Object[0]);
                djqf djqfVar2 = djpeVar.b;
                djqfVar2.w(djqfVar2.Y);
            }
        });
        if (!((Boolean) djqf.j.a()).booleanValue() || djao.a() <= 0) {
            return;
        }
        this.b.t(18, djao.a() * 1200);
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final void c() {
        PowerManager.WakeLock wakeLock = this.c;
        if (wakeLock != null) {
            try {
                wakeLock.release();
            } catch (RuntimeException unused) {
                dkty.c("Wakelock is already released.", new Object[0]);
            }
        }
        if (((Boolean) djqf.j.a()).booleanValue()) {
            this.b.p(18);
        }
        super.c();
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        eehy x;
        int i = message.what;
        if (i == 8) {
            dkty.l(this.b.m, "Disconnecting socket.", new Object[0]);
            this.b.N(message.obj);
            djqf djqfVar = this.b;
            djqfVar.w(djqfVar.ah);
            return true;
        }
        if (i == 10) {
            djqf djqfVar2 = this.b;
            if (djqfVar2.l) {
                final djkr djkrVar = djqfVar2.B;
                if (djkrVar != null) {
                    dkty.d(djqfVar2.m, "Creating SIP transport: NetworkInterface: %s", dktx.GENERIC.c(djkrVar));
                    Optional findFirst = dizg.O() ? Collection.EL.stream(djkrVar.d()).filter(new Predicate() { // from class: djpa
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
                            return ((InetAddress) obj) instanceof Inet6Address;
                        }
                    }).findFirst() : Collection.EL.stream(djkrVar.d()).filter(new Predicate() { // from class: djpb
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
                            return ((InetAddress) obj) instanceof Inet4Address;
                        }
                    }).findFirst();
                    if (findFirst.isEmpty()) {
                        findFirst = Collection.EL.stream(djkrVar.d()).findFirst();
                    }
                    final String hostAddress = findFirst.isPresent() ? ((InetAddress) findFirst.get()).getHostAddress() : "";
                    if (emxe.c(hostAddress)) {
                        dkty.r(this.b.m, "Empty IP address.", new Object[0]);
                        djqf djqfVar3 = this.b;
                        djqfVar3.w(djqfVar3.Y);
                    } else {
                        dkty.p(this.b.m, "Selected local IP address: %s", dktx.IP_ADDRESS.c(hostAddress));
                        djtr djtrVar = this.b.I;
                        final eeiv eeivVar = new eeiv(djtrVar.f(), djtrVar.g(), djtrVar.h());
                        final long millis = TimeUnit.SECONDS.toMillis(djao.a());
                        ListenableFuture m = erqt.m(new Callable() { // from class: djpc
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                djpe djpeVar = djpe.this;
                                djkr djkrVar2 = djkrVar;
                                String str = hostAddress;
                                try {
                                    Network a = djkrVar2.a();
                                    eejk a2 = djks.a(djkrVar2, djpeVar.b.I);
                                    NetworkCapabilities b = djkrVar2.b();
                                    return djpeVar.g(a, a2, b.hasTransport(0) ? "Mobile" : b.hasTransport(1) ? "WiFi" : b.hasTransport(4) ? "VPN" : "Unknown", str, (List) Collection.EL.stream(djkrVar2.c()).map(new Function() { // from class: djoz
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return ((InetAddress) obj).getHostAddress();
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(Collectors.toList()));
                                } catch (eejg e) {
                                    throw new IOException("Failed to create a SIP transport.", e);
                                }
                            }
                        }, this.b.R);
                        if (millis > 0) {
                            ernq.f(ernq.f(((erqc) erny.f(erqc.o(m), new emwl() { // from class: djpd
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    eeno eenoVar = (eeno) obj;
                                    Object[] objArr = {eenoVar, Long.valueOf(millis)};
                                    djpe djpeVar = djpe.this;
                                    dkty.l(djpeVar.b.m, "discoverSipServerWithNetworkInterface: connected SIP transport[%s] to PCSCF within %d ms, sending MSG_CONNECTED_TO_SERVER", objArr);
                                    djpeVar.b.s(13, eenoVar);
                                    return Optional.of(eenoVar);
                                }
                            }, this.b.R)).p(millis, TimeUnit.MILLISECONDS, this.b.R), TimeoutException.class, new emwl() { // from class: djor
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    djpe.this.b.q(18);
                                    return Optional.empty();
                                }
                            }, this.b.R), IOException.class, new emwl() { // from class: djos
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    IOException iOException = (IOException) obj;
                                    dkty.i(iOException, "Connection Failed.", new Object[0]);
                                    djpe.this.b.s(19, iOException);
                                    return Optional.empty();
                                }
                            }, this.b.R);
                        } else {
                            ernq.f(erny.f(erqc.o(m), new emwl() { // from class: djot
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    eeno eenoVar = (eeno) obj;
                                    djpe djpeVar = djpe.this;
                                    dkty.l(djpeVar.b.m, "discoverSipServerWithNetworkInterface: connected SIP transport[%s] to PCSCF, sending MSG_CONNECTED_TO_SERVER", eenoVar);
                                    djpeVar.b.s(13, eenoVar);
                                    return Optional.of(eenoVar);
                                }
                            }, this.b.R), IOException.class, new emwl() { // from class: djou
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    IOException iOException = (IOException) obj;
                                    dkty.i(iOException, "Connection Failed.", new Object[0]);
                                    djpe.this.b.s(19, iOException);
                                    return Optional.empty();
                                }
                            }, this.b.R);
                        }
                    }
                } else {
                    dkty.r(djqfVar2.m, "Null NetworkInterface.", new Object[0]);
                    djqf djqfVar4 = this.b;
                    djqfVar4.w(djqfVar4.Y);
                }
            } else {
                dkty.d(djqfVar2.m, "Creating SIP transport.", new Object[0]);
                final djjt djjtVar = this.b.w;
                if (djjtVar == null) {
                    dkty.g("ImsNetworkInterface is not selected.", new Object[0]);
                    djqf djqfVar5 = this.b;
                    djqfVar5.w(djqfVar5.Y);
                } else {
                    djtr djtrVar2 = this.b.I;
                    final eeiv eeivVar2 = new eeiv(djtrVar2.f(), djtrVar2.g(), djtrVar2.h());
                    final Network network = djjtVar.g;
                    final String str = djjtVar.e.a;
                    if (network == null) {
                        dkty.g("Failed to create SipTransport. Null Network.", new Object[0]);
                        djqf djqfVar6 = this.b;
                        djqfVar6.w(djqfVar6.ak);
                    } else if (str == null) {
                        dkty.g("Failed to create SipTransport. Null IP Address.", new Object[0]);
                        djqf djqfVar7 = this.b;
                        djqfVar7.w(djqfVar7.ak);
                    } else if (djao.a() > 0) {
                        final long millis2 = TimeUnit.SECONDS.toMillis(djao.a());
                        ernq.f(ernq.f(((erqc) erny.f(erqc.o(erqt.m(new Callable() { // from class: djoy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                djpe djpeVar = djpe.this;
                                Network network2 = network;
                                djjt djjtVar2 = djjtVar;
                                try {
                                    return djpeVar.g(network2, djjtVar2.e(djpeVar.b.I), djjtVar2.g(), str, djjtVar2.h());
                                } catch (eejg e) {
                                    throw new IOException("Failed to create a SIP transport.", e);
                                }
                            }
                        }, this.b.R)), new emwl() { // from class: djov
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                eeno eenoVar = (eeno) obj;
                                djpe djpeVar = djpe.this;
                                dkty.l(djpeVar.b.m, "discoverSipServer: connected SIP transport[%s] to PCSCF, sending MSG_CONNECTED_TO_SERVER", eenoVar);
                                djpeVar.b.s(13, eenoVar);
                                return Optional.of(eenoVar);
                            }
                        }, this.b.R)).p(millis2, TimeUnit.MILLISECONDS, this.b.R), TimeoutException.class, new emwl() { // from class: djow
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                dkty.i((TimeoutException) obj, "Timed out connecting to PCSCF in %d ms", Long.valueOf(millis2));
                                djpe.this.b.q(18);
                                return Optional.empty();
                            }
                        }, this.b.R), IOException.class, new emwl() { // from class: djox
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                IOException iOException = (IOException) obj;
                                dkty.i(iOException, "Connection Failed.", new Object[0]);
                                djpe.this.b.s(19, iOException);
                                return Optional.empty();
                            }
                        }, this.b.R);
                    } else {
                        try {
                            djqf djqfVar8 = this.b;
                            djqfVar8.x = g(network, djjtVar.e(djqfVar8.I), djjtVar.g(), str, djjtVar.h());
                            this.b.q(12);
                        } catch (eejg | IllegalArgumentException e) {
                            dkty.j(e, this.b.m, "Failed to create a SIP transport.", new Object[0]);
                            djqf djqfVar9 = this.b;
                            djqfVar9.w(djqfVar9.ak);
                        }
                    }
                }
            }
        } else {
            if (i == 21) {
                dkty.r(this.b.m, "Network is lost.", new Object[0]);
                this.b.O();
                djqf djqfVar10 = this.b;
                djqfVar10.w(djqfVar10.ak);
                return true;
            }
            if (i == 12) {
                this.b.q(13);
                return true;
            }
            if (i != 13) {
                switch (i) {
                    case 17:
                        this.b.N(dilc.SIM_REMOVED);
                        djqf djqfVar11 = this.b;
                        djqfVar11.w(djqfVar11.ah);
                        return true;
                    case 18:
                        dkty.g("Connection Timeout.", new Object[0]);
                        djqf djqfVar12 = this.b;
                        djqfVar12.w(djqfVar12.ak);
                        return true;
                    case 19:
                        djqf djqfVar13 = this.b;
                        djqfVar13.w(djqfVar13.ak);
                        return true;
                    default:
                        return super.e(message);
                }
            }
            if (message.obj instanceof eeno) {
                this.b.x = (eeno) message.obj;
            }
            eeno eenoVar = this.b.x;
            if (Objects.isNull(eenoVar)) {
                dkty.g("Null SipTransport.", new Object[0]);
                djqf djqfVar14 = this.b;
                djqfVar14.w(djqfVar14.ak);
            } else {
                if (((Boolean) djqf.d.a()).booleanValue()) {
                    this.b.I();
                    this.b.A();
                }
                djqf djqfVar15 = this.b;
                if (djqfVar15.l) {
                    djkr djkrVar2 = djqfVar15.B;
                    if (djkrVar2 == null) {
                        dkty.g("NetworkInterface is not available.", new Object[0]);
                        djqf djqfVar16 = this.b;
                        djqfVar16.w(djqfVar16.Y);
                    } else {
                        x = djqfVar15.x(djks.a(djkrVar2, djqfVar15.I), eenoVar, djqfVar15.p);
                    }
                } else {
                    djjt djjtVar2 = djqfVar15.w;
                    if (djjtVar2 == null) {
                        dkty.g("ImsNetworkInterface is not selected.", new Object[0]);
                        djqf djqfVar17 = this.b;
                        djqfVar17.w(djqfVar17.Y);
                    } else {
                        djqf djqfVar18 = this.b;
                        x = djqfVar18.x(djjtVar2.e(djqfVar18.I), eenoVar, djqfVar18.p);
                    }
                }
                djqf djqfVar19 = this.b;
                djqfVar19.t.a = x;
                djqfVar19.K.a();
                djqf djqfVar20 = this.b;
                djqfVar20.F = 600000;
                djqfVar20.w(djqfVar20.aa);
            }
        }
        return true;
    }

    public final eeno g(Network network, eejk eejkVar, String str, String str2, List list) {
        djqf djqfVar = this.b;
        djtr djtrVar = djqfVar.I;
        eeno a = djqfVar.u.a(eejkVar, network, str, str2, list, djtrVar.q(), djtrVar.c());
        ((eeny) a).c = new djqi(this.b);
        return a;
    }
}
