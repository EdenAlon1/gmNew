package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cike extends ceuj {
    public static final cskc a = cskc.g("BugleJobs", "DittoMessageRetryHandler");
    public final ffbr b;
    private final fazb c;
    private final ffbr d;
    private final fazb e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final fazb j;
    private final errl k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final cqoh p;
    private final atky q;
    private final chww r;

    public cike(chww chwwVar, fazb fazbVar, ffbr ffbrVar, fazb fazbVar2, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, fazb fazbVar3, ffbr ffbrVar6, errl errlVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, cqoh cqohVar, ffbr ffbrVar10, atky atkyVar) {
        this.r = chwwVar;
        this.c = fazbVar;
        this.d = ffbrVar;
        this.e = fazbVar2;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = fazbVar3;
        this.b = ffbrVar6;
        this.k = errlVar;
        this.l = ffbrVar7;
        this.m = ffbrVar8;
        this.n = ffbrVar10;
        this.o = ffbrVar9;
        this.p = cqohVar;
        this.q = atkyVar;
    }

    private final boolean m(erzn erznVar, boolean z) {
        if (!z) {
            return true;
        }
        return Instant.ofEpochMilli(TimeUnit.MICROSECONDS.toMillis(erznVar.h)).isAfter(this.p.f().minus(Duration.ofDays(((Long) this.o.b()).longValue())));
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        l.c(5);
        l.f(poa.EXPONENTIAL);
        l.g(TimeUnit.SECONDS.toMillis(((Integer) bzaq.f.e()).intValue()));
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DittoMessageRetryHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cila.a.getParserForType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceuj
    public final elfl j(final ceuw ceuwVar, final engw engwVar) {
        esac esacVar;
        HashSet hashSet;
        int i;
        int i2;
        int i3;
        int i4;
        erzn m;
        chwv a2;
        elfl e;
        HashSet hashSet2;
        int i5;
        HashSet hashSet3;
        int i6;
        erzn m2;
        engw engwVar2 = ((cetk) ceuwVar.a()).d;
        int size = engwVar2.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((Integer) engwVar2.get(i7)).intValue() == 0) {
                ((akzt) this.b.b()).c("Bugle.Ditto.MessageRetryHandler.Execution.Count");
            }
        }
        if (((bzef) this.e.b()).o()) {
            fcek fcekVar = ((cila) engwVar.get(0)).c;
            if (fcekVar == null) {
                fcekVar = fcek.a;
            }
            final fcek fcekVar2 = fcekVar;
            String str = ((cila) engwVar.get(0)).o;
            if (!((bzgd) this.j.b()).w(fcekVar2)) {
                a.m("Skipping retry because desktop is not active.");
                e = elfo.e(ceyt.k());
            } else if (((Optional) this.d.b()).isEmpty()) {
                a.r("DittoForegroundService is not supported on this device.");
                e = elfo.d(new UnsupportedOperationException("DittoForegroundService is not supported on this device."));
            } else {
                int i8 = 4;
                if (this.q.a()) {
                    esab esabVar = (esab) esac.a.createBuilder();
                    HashSet hashSet4 = new HashSet();
                    int i9 = ((enou) engwVar).c;
                    int i10 = 0;
                    while (i10 < i9) {
                        cila cilaVar = (cila) engwVar.get(i10);
                        try {
                            erxi erxiVar = (erxi) eyfy.parseFrom(erxi.a, cilaVar.f, eyfc.a());
                            int i11 = erxiVar.b;
                            if (erxh.a(i11) == 4) {
                                for (erzn erznVar : (i11 == 3 ? (esac) erxiVar.c : esac.a).b) {
                                    String str2 = erznVar.c;
                                    if (hashSet4.add(str2)) {
                                        HashSet hashSet5 = hashSet4;
                                        bifu bifuVar = (bifu) ((bcsy) this.m.b()).a(bdhb.b(str2)).o();
                                        try {
                                            if (bifuVar.moveToNext()) {
                                                bcse c = ((bcsf) this.f.b()).c(bifuVar);
                                                i3 = i9;
                                                i4 = i10;
                                                if (axuh.b.contains(Integer.valueOf(c.f()))) {
                                                    bifuVar.close();
                                                    hashSet4 = hashSet5;
                                                    i9 = i3;
                                                    i10 = i4;
                                                } else {
                                                    if (m(erznVar, cilaVar.p)) {
                                                        if (((Boolean) bzpf.a.e()).booleanValue()) {
                                                            bzpi bzpiVar = (bzpi) this.h.b();
                                                            bzpg bzpgVar = (bzpg) bzph.a.createBuilder();
                                                            bzpgVar.a(str2);
                                                            bzph bzphVar = (bzph) bzpgVar.build();
                                                            cetp cetpVar = new cetp();
                                                            cetpVar.b = a.t(str2, "blobstore-");
                                                            bzpiVar.b(bzphVar, cetpVar.a());
                                                        } else {
                                                            ((bbgi) this.g.b()).b(c).t();
                                                        }
                                                    }
                                                    m = ((cgzv) this.i.b()).n(((bcsf) this.f.b()).c(bifuVar));
                                                }
                                            } else {
                                                i3 = i9;
                                                i4 = i10;
                                                m = ((cgzv) this.i.b()).m(bdgq.b(erznVar.j), bdhb.b(str2));
                                            }
                                            esabVar.a(m);
                                            bifuVar.close();
                                            hashSet4 = hashSet5;
                                            i9 = i3;
                                            i10 = i4;
                                        } finally {
                                        }
                                    }
                                }
                            }
                            hashSet = hashSet4;
                            i = i9;
                            i2 = i10;
                        } catch (eygu e2) {
                            hashSet = hashSet4;
                            i = i9;
                            i2 = i10;
                            a.o("Failed to parse GetUpdatesResponse while retrying message update.", e2);
                        }
                        i10 = i2 + 1;
                        hashSet4 = hashSet;
                        i9 = i;
                    }
                    esacVar = (esac) esabVar.build();
                } else {
                    esab esabVar2 = (esab) esac.a.createBuilder();
                    HashSet hashSet6 = new HashSet();
                    int i12 = ((enou) engwVar).c;
                    int i13 = 0;
                    while (i13 < i12) {
                        cila cilaVar2 = (cila) engwVar.get(i13);
                        try {
                            erxi erxiVar2 = (erxi) eyfy.parseFrom(erxi.a, cilaVar2.f, eyfc.a());
                            int i14 = erxiVar2.b;
                            if (erxh.a(i14) == i8) {
                                Iterator it = (i14 == 3 ? (esac) erxiVar2.c : esac.a).b.iterator();
                                while (it.hasNext()) {
                                    erzn erznVar2 = (erzn) it.next();
                                    String str3 = erznVar2.c;
                                    if (hashSet6.add(str3)) {
                                        Iterator it2 = it;
                                        bjjd bjjdVar = (bjjd) ((bcsq) this.l.b()).b(bdhb.b(str3)).o();
                                        try {
                                            if (bjjdVar.moveToNext()) {
                                                bcse e3 = ((bcsf) this.f.b()).e(bjjdVar);
                                                hashSet3 = hashSet6;
                                                i6 = i12;
                                                if (axuh.b.contains(Integer.valueOf(e3.f()))) {
                                                    bjjdVar.close();
                                                    it = it2;
                                                    hashSet6 = hashSet3;
                                                    i12 = i6;
                                                } else {
                                                    if (m(erznVar2, cilaVar2.p)) {
                                                        if (((Boolean) bzpf.a.e()).booleanValue()) {
                                                            bzpi bzpiVar2 = (bzpi) this.h.b();
                                                            bzpg bzpgVar2 = (bzpg) bzph.a.createBuilder();
                                                            bzpgVar2.a(str3);
                                                            bzph bzphVar2 = (bzph) bzpgVar2.build();
                                                            cetp cetpVar2 = new cetp();
                                                            cetpVar2.b = a.t(str3, "blobstore-");
                                                            bzpiVar2.b(bzphVar2, cetpVar2.a());
                                                        } else {
                                                            ((bbgi) this.g.b()).b(e3).t();
                                                        }
                                                    }
                                                    m2 = ((cgzv) this.i.b()).n(((bcsf) this.f.b()).e(bjjdVar));
                                                }
                                            } else {
                                                hashSet3 = hashSet6;
                                                i6 = i12;
                                                m2 = ((cgzv) this.i.b()).m(bdgq.b(erznVar2.j), bdhb.b(str3));
                                            }
                                            esabVar2.a(m2);
                                            bjjdVar.close();
                                            it = it2;
                                            hashSet6 = hashSet3;
                                            i12 = i6;
                                        } finally {
                                        }
                                    }
                                }
                            }
                            hashSet2 = hashSet6;
                            i5 = i12;
                        } catch (eygu e4) {
                            hashSet2 = hashSet6;
                            i5 = i12;
                            a.o("Failed to parse GetUpdatesResponse while retrying message update.", e4);
                        }
                        i13++;
                        hashSet6 = hashSet2;
                        i12 = i5;
                        i8 = 4;
                    }
                    esacVar = (esac) esabVar2.build();
                }
                if (esacVar.b.size() == 0) {
                    e = elfo.e(ceyt.i());
                } else {
                    final String str4 = ((cila) engwVar.get(0)).e;
                    if (((cgcu) this.n.b()).a()) {
                        chwu b = this.r.b((cila) engwVar.get(0), esaa.GET_UPDATES);
                        b.c = str4;
                        erxg erxgVar = (erxg) erxi.a.createBuilder();
                        erxgVar.copyOnWrite();
                        erxi erxiVar3 = (erxi) erxgVar.instance;
                        esacVar.getClass();
                        erxiVar3.c = esacVar;
                        erxiVar3.b = 3;
                        b.b(erxgVar.build());
                        b.d = str;
                        a2 = b.a();
                    } else {
                        chwu c2 = this.r.c(fcekVar2, Optional.empty(), esaa.GET_UPDATES);
                        c2.c = str4;
                        erxg erxgVar2 = (erxg) erxi.a.createBuilder();
                        erxgVar2.copyOnWrite();
                        erxi erxiVar4 = (erxi) erxgVar2.instance;
                        esacVar.getClass();
                        erxiVar4.c = esacVar;
                        erxiVar4.b = 3;
                        c2.b(erxgVar2.build());
                        c2.d = str;
                        a2 = c2.a();
                    }
                    elfl b2 = ((cikg) this.c.b()).b(a2);
                    a2.q(b2);
                    e = b2.h(new emwl() { // from class: cikc
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            csjb a3 = cike.a.a();
                            a3.I("Ditto Message Update RPC retry succeeded");
                            a3.A("desktopId", fcek.this);
                            a3.A("requestId", str4);
                            a3.r();
                            return ceyt.i();
                        }
                    }, this.k).e(fedn.class, new emwl() { // from class: cikd
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            fedn fednVar = (fedn) obj;
                            boolean d = chfh.d(fednVar);
                            fcek fcekVar3 = fcek.this;
                            String str5 = str4;
                            if (d) {
                                csjb e5 = cike.a.e();
                                e5.I("Ditto Message Update RPC retry failed with retryable gRPC error");
                                e5.A("status", Status.c(fednVar));
                                e5.A("desktopId", fcekVar3);
                                e5.A("requestId", str5);
                                e5.r();
                                return ceyt.m();
                            }
                            csjb e6 = cike.a.e();
                            e6.I("Ditto Message Update RPC retry failed with non-retryable gRPC error");
                            e6.A("status", Status.c(fednVar));
                            e6.A("desktopId", fcekVar3);
                            e6.A("requestId", str5);
                            e6.r();
                            return ceyt.k();
                        }
                    }, this.k);
                }
            }
        } else {
            a.m("Skipping retry because not registered.");
            e = elfo.e(ceyt.k());
        }
        return e.h(new emwl() { // from class: cika
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ceyt ceytVar = (ceyt) obj;
                boolean equals = ceytVar.equals(ceyt.i());
                cike cikeVar = cike.this;
                ceuw ceuwVar2 = ceuwVar;
                int i15 = 0;
                if (equals) {
                    engw engwVar3 = ((cetk) ceuwVar2.a()).d;
                    int size2 = engwVar3.size();
                    while (i15 < size2) {
                        ((akzt) cikeVar.b.b()).e("Bugle.Ditto.MessageRetryHandler.Success.Count", ((Integer) engwVar3.get(i15)).intValue());
                        i15++;
                    }
                } else {
                    if (ceytVar.equals(ceyt.k())) {
                        cikeVar.k(ceuwVar2);
                        return ceytVar;
                    }
                    if (ceytVar.equals(ceyt.m())) {
                        while (i15 < ((enou) engwVar).c) {
                            if (!ceuwVar2.d(i15)) {
                                cikeVar.l(5);
                            }
                            i15++;
                        }
                    }
                }
                return ceytVar;
            }
        }, this.k).f(Exception.class, new eroh() { // from class: cikb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cike.this.k(ceuwVar);
                return elfo.d((Exception) obj);
            }
        }, this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(ceuw ceuwVar) {
        engw engwVar = ((cetk) ceuwVar.a()).d;
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            l(((Integer) engwVar.get(i)).intValue());
        }
    }

    public final void l(int i) {
        ((akzt) this.b.b()).e("Bugle.Ditto.MessageRetryHandler.Failure.Count", i);
    }
}
