package defpackage;

import android.os.Process;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecqq extends ecqo implements ecje, ecgn {
    private final ecgt a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final AtomicBoolean e = new AtomicBoolean();
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public ecqq(ecgt ecgtVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, final fazb fazbVar) {
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.a = ecgtVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.f = new ffbr() { // from class: ecqp
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return false;
            }
        };
    }

    private static long a(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static fgnu b(ecqb ecqbVar) {
        fgnt fgntVar = (fgnt) fgnu.a.createBuilder();
        if (ecqbVar.a != null) {
            String str = ecqbVar.a;
            fgntVar.copyOnWrite();
            fgnu fgnuVar = (fgnu) fgntVar.instance;
            str.getClass();
            fgnuVar.b |= 1;
            fgnuVar.c = str;
        }
        if (ecqbVar.b != null) {
            long j = ((ecio) ecqbVar.b).a;
            fgntVar.copyOnWrite();
            fgnu fgnuVar2 = (fgnu) fgntVar.instance;
            fgnuVar2.b |= 2;
            fgnuVar2.d = j;
        }
        if (ecqbVar.c != null) {
            long j2 = ((ecio) ecqbVar.c).a;
            fgntVar.copyOnWrite();
            fgnu fgnuVar3 = (fgnu) fgntVar.instance;
            fgnuVar3.b |= 4;
            fgnuVar3.e = j2;
        }
        if (ecqbVar.d != null) {
            long j3 = ((ecio) ecqbVar.d).a;
            fgntVar.copyOnWrite();
            fgnu fgnuVar4 = (fgnu) fgntVar.instance;
            fgnuVar4.b |= 8;
            fgnuVar4.f = j3;
        }
        return (fgnu) fgntVar.build();
    }

    @Override // defpackage.ecgn
    public final void i(ecda ecdaVar) {
        Long l;
        long j;
        long startElapsedRealtime;
        this.a.b(this);
        ecqk ecqkVar = ecqk.a;
        ecjl ecjlVar = ecqkVar.j;
        ecjl ecjlVar2 = ecqkVar.k;
        ((Boolean) this.f.b()).booleanValue();
        if ((ecjlVar == null || ((ecio) ecjlVar).a <= 0) && (ecjlVar2 == null || ((ecio) ecjlVar2).a <= 0)) {
            ((enrr) ((enrr) ecdj.a.h()).h("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 307, "StartupMetricServiceImpl.java")).q("missing firstDraw timestamp");
            return;
        }
        ecjl ecjlVar3 = ecqkVar.f(((Boolean) this.g.b()).booleanValue(), ((Long) this.h.b()).longValue()) ? ecqkVar.c : ecqkVar.h;
        if (ecjlVar3 == null) {
            return;
        }
        long j2 = ((ecio) ecjlVar3).a;
        if (j2 > 0) {
            if ((ecjlVar == null || ((ecio) ecjlVar).a < j2) && (ecjlVar2 == null || ((ecio) ecjlVar2).a < j2)) {
                return;
            }
            ((Boolean) this.f.b()).booleanValue();
            final fgnv fgnvVar = (fgnv) fgnz.a.createBuilder();
            boolean f = ecqkVar.f(((Boolean) this.g.b()).booleanValue(), ((Long) this.h.b()).longValue());
            fgnvVar.copyOnWrite();
            fgnz fgnzVar = (fgnz) fgnvVar.instance;
            fgnzVar.b |= 65536;
            fgnzVar.r = f;
            if (ecqkVar.f(((Boolean) this.g.b()).booleanValue(), ((Long) this.h.b()).longValue())) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar2 = (fgnz) fgnvVar.instance;
                fgnzVar2.s = 1;
                fgnzVar2.b = 131072 | fgnzVar2.b;
            } else {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar3 = (fgnz) fgnvVar.instance;
                fgnzVar3.s = 2;
                fgnzVar3.b = 131072 | fgnzVar3.b;
            }
            ecjl ecjlVar4 = ecqkVar.c;
            ecjl ecjlVar5 = null;
            if (ecjlVar4 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar4 = (fgnz) fgnvVar.instance;
                fgnzVar4.b |= 16;
                long j3 = ((ecio) ecjlVar4).a;
                fgnzVar4.f = j3;
                l = Long.valueOf(j3);
            } else {
                l = null;
            }
            ecjl ecjlVar6 = ecqkVar.d;
            if (ecjlVar6 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar5 = (fgnz) fgnvVar.instance;
                fgnzVar5.b |= 128;
                long j4 = ((ecio) ecjlVar6).a;
                fgnzVar5.i = j4;
                l = Long.valueOf(a(l, j4));
            }
            ecjl ecjlVar7 = ecqkVar.e;
            ecjl ecjlVar8 = ecqkVar.f;
            ecjl ecjlVar9 = ecqkVar.g;
            ecjl ecjlVar10 = ecqkVar.h;
            if (ecjlVar10 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar6 = (fgnz) fgnvVar.instance;
                fgnzVar6.b |= 512;
                long j5 = ((ecio) ecjlVar10).a;
                fgnzVar6.k = j5;
                l = Long.valueOf(a(l, j5));
            }
            ecjl ecjlVar11 = ecqkVar.k;
            ecjl ecjlVar12 = ecqkVar.l;
            ecjl ecjlVar13 = ecqkVar.j;
            ecjl ecjlVar14 = ecqkVar.i;
            int intValue = ((Long) this.d.b()).intValue();
            if (intValue == 1) {
                ecjlVar5 = ecjlVar11;
            } else if (intValue == 2) {
                ecjlVar5 = ecjlVar12;
            } else if (intValue == 3) {
                ecjlVar5 = ecjlVar13;
            } else if (intValue == 4) {
                ecjlVar5 = ecjlVar14;
            }
            if (ecjlVar5 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar7 = (fgnz) fgnvVar.instance;
                fgnzVar7.b |= 1024;
                j = 0;
                long j6 = ((ecio) ecjlVar5).a;
                fgnzVar7.l = j6;
                l = Long.valueOf(a(l, j6));
            } else {
                j = 0;
            }
            if (ecjlVar13 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar8 = (fgnz) fgnvVar.instance;
                fgnzVar8.b |= 8192;
                long j7 = ((ecio) ecjlVar13).a;
                fgnzVar8.o = j7;
                l = Long.valueOf(a(l, j7));
            }
            if (ecjlVar14 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar9 = (fgnz) fgnvVar.instance;
                fgnzVar9.b |= 16384;
                long j8 = ((ecio) ecjlVar14).a;
                fgnzVar9.p = j8;
                l = Long.valueOf(a(l, j8));
            }
            if (ecjlVar11 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar10 = (fgnz) fgnvVar.instance;
                fgnzVar10.b |= 2048;
                long j9 = ((ecio) ecjlVar11).a;
                fgnzVar10.m = j9;
                l = Long.valueOf(a(l, j9));
            }
            if (ecjlVar12 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar11 = (fgnz) fgnvVar.instance;
                fgnzVar11.b |= 4096;
                long j10 = ((ecio) ecjlVar12).a;
                fgnzVar11.n = j10;
                l = Long.valueOf(a(l, j10));
            }
            ecjl ecjlVar15 = ecqkVar.m;
            if (ecjlVar15 != null) {
                fgnvVar.copyOnWrite();
                fgnz fgnzVar12 = (fgnz) fgnvVar.instance;
                fgnzVar12.b |= 32768;
                long j11 = ((ecio) ecjlVar15).a;
                fgnzVar12.q = j11;
                l = Long.valueOf(a(l, j11));
            }
            if (ecqkVar.o.b != null) {
                fgnu b = b(ecqkVar.o);
                fgnvVar.copyOnWrite();
                fgnz fgnzVar13 = (fgnz) fgnvVar.instance;
                b.getClass();
                fgnzVar13.u = b;
                fgnzVar13.b |= 524288;
                if ((b.b & 2) != 0) {
                    l = Long.valueOf(a(l, b.d));
                }
                if ((b.b & 4) != 0) {
                    l = Long.valueOf(a(l, b.e));
                }
                if ((b.b & 8) != 0) {
                    l = Long.valueOf(a(l, b.f));
                }
            }
            if (ecqkVar.p.b != null) {
                fgnu b2 = b(ecqkVar.p);
                fgnvVar.copyOnWrite();
                fgnz fgnzVar14 = (fgnz) fgnvVar.instance;
                b2.getClass();
                fgnzVar14.v = b2;
                fgnzVar14.b |= 1048576;
                if ((b2.b & 2) != 0) {
                    l = Long.valueOf(a(l, b2.d));
                }
                if ((b2.b & 4) != 0) {
                    l = Long.valueOf(a(l, b2.e));
                }
                if ((b2.b & 8) != 0) {
                    l = Long.valueOf(a(l, b2.f));
                }
            }
            emxc a = ecqr.a();
            if (a.g()) {
                Long l2 = (Long) a.c();
                long longValue = l2.longValue();
                fgnvVar.copyOnWrite();
                fgnz fgnzVar15 = (fgnz) fgnvVar.instance;
                fgnzVar15.b |= 2;
                fgnzVar15.d = longValue;
                l = Long.valueOf(a(l, l2.longValue()));
            }
            startElapsedRealtime = Process.getStartElapsedRealtime();
            fgnvVar.copyOnWrite();
            fgnz fgnzVar16 = (fgnz) fgnvVar.instance;
            fgnzVar16.b |= 4;
            fgnzVar16.e = startElapsedRealtime;
            long a2 = a(l, startElapsedRealtime);
            Long valueOf = Long.valueOf(a2);
            fgnvVar.copyOnWrite();
            fgnz fgnzVar17 = (fgnz) fgnvVar.instance;
            fgnzVar17.b |= 262144;
            fgnzVar17.t = true;
            valueOf.getClass();
            boolean booleanValue = ((Boolean) this.c.b()).booleanValue();
            if (a2 != j) {
                if (!booleanValue) {
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar18 = (fgnz) fgnvVar.instance;
                    fgnzVar18.b |= 1;
                    fgnzVar18.c = a2;
                }
                fgnz fgnzVar19 = (fgnz) fgnvVar.instance;
                if ((fgnzVar19.b & 16) != 0) {
                    long j12 = fgnzVar19.f - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar20 = (fgnz) fgnvVar.instance;
                    fgnzVar20.b |= 16;
                    fgnzVar20.f = j12;
                }
                fgnz fgnzVar21 = (fgnz) fgnvVar.instance;
                if ((fgnzVar21.b & 128) != 0) {
                    long j13 = fgnzVar21.i - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar22 = (fgnz) fgnvVar.instance;
                    fgnzVar22.b |= 128;
                    fgnzVar22.i = j13;
                }
                fgnz fgnzVar23 = (fgnz) fgnvVar.instance;
                if ((fgnzVar23.b & 256) != 0) {
                    long j14 = fgnzVar23.j - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar24 = (fgnz) fgnvVar.instance;
                    fgnzVar24.b |= 256;
                    fgnzVar24.j = j14;
                }
                fgnz fgnzVar25 = (fgnz) fgnvVar.instance;
                if ((fgnzVar25.b & 32) != 0) {
                    long j15 = fgnzVar25.g - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar26 = (fgnz) fgnvVar.instance;
                    fgnzVar26.b |= 32;
                    fgnzVar26.g = j15;
                }
                fgnz fgnzVar27 = (fgnz) fgnvVar.instance;
                if ((fgnzVar27.b & 64) != 0) {
                    long j16 = fgnzVar27.h - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar28 = (fgnz) fgnvVar.instance;
                    fgnzVar28.b |= 64;
                    fgnzVar28.h = j16;
                }
                fgnz fgnzVar29 = (fgnz) fgnvVar.instance;
                if ((fgnzVar29.b & 512) != 0) {
                    long j17 = fgnzVar29.k - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar30 = (fgnz) fgnvVar.instance;
                    fgnzVar30.b |= 512;
                    fgnzVar30.k = j17;
                }
                fgnz fgnzVar31 = (fgnz) fgnvVar.instance;
                if ((fgnzVar31.b & 1024) != 0) {
                    long j18 = fgnzVar31.l - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar32 = (fgnz) fgnvVar.instance;
                    fgnzVar32.b |= 1024;
                    fgnzVar32.l = j18;
                }
                fgnz fgnzVar33 = (fgnz) fgnvVar.instance;
                if ((fgnzVar33.b & 2048) != 0) {
                    long j19 = fgnzVar33.m - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar34 = (fgnz) fgnvVar.instance;
                    fgnzVar34.b |= 2048;
                    fgnzVar34.m = j19;
                }
                fgnz fgnzVar35 = (fgnz) fgnvVar.instance;
                if ((fgnzVar35.b & 4096) != 0) {
                    long j20 = fgnzVar35.n - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar36 = (fgnz) fgnvVar.instance;
                    fgnzVar36.b |= 4096;
                    fgnzVar36.n = j20;
                }
                fgnz fgnzVar37 = (fgnz) fgnvVar.instance;
                if ((fgnzVar37.b & 8192) != 0) {
                    long j21 = fgnzVar37.o - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar38 = (fgnz) fgnvVar.instance;
                    fgnzVar38.b |= 8192;
                    fgnzVar38.o = j21;
                }
                fgnz fgnzVar39 = (fgnz) fgnvVar.instance;
                if ((fgnzVar39.b & 16384) != 0) {
                    long j22 = fgnzVar39.p - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar40 = (fgnz) fgnvVar.instance;
                    fgnzVar40.b |= 16384;
                    fgnzVar40.p = j22;
                }
                fgnz fgnzVar41 = (fgnz) fgnvVar.instance;
                if ((fgnzVar41.b & 32768) != 0) {
                    long j23 = fgnzVar41.q - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar42 = (fgnz) fgnvVar.instance;
                    fgnzVar42.b = 32768 | fgnzVar42.b;
                    fgnzVar42.q = j23;
                }
                fgnz fgnzVar43 = (fgnz) fgnvVar.instance;
                if ((fgnzVar43.b & 524288) != 0) {
                    fgnu fgnuVar = fgnzVar43.u;
                    if (fgnuVar == null) {
                        fgnuVar = fgnu.a;
                    }
                    fgnu a3 = ecqs.a(fgnuVar, a2);
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar44 = (fgnz) fgnvVar.instance;
                    a3.getClass();
                    fgnzVar44.u = a3;
                    fgnzVar44.b |= 524288;
                }
                fgnz fgnzVar45 = (fgnz) fgnvVar.instance;
                if ((fgnzVar45.b & 1048576) != 0) {
                    fgnu fgnuVar2 = fgnzVar45.v;
                    if (fgnuVar2 == null) {
                        fgnuVar2 = fgnu.a;
                    }
                    fgnu a4 = ecqs.a(fgnuVar2, a2);
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar46 = (fgnz) fgnvVar.instance;
                    a4.getClass();
                    fgnzVar46.v = a4;
                    fgnzVar46.b |= 1048576;
                }
                fgnz fgnzVar47 = (fgnz) fgnvVar.instance;
                if ((fgnzVar47.b & 4) != 0) {
                    long j24 = fgnzVar47.e - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar48 = (fgnz) fgnvVar.instance;
                    fgnzVar48.b |= 4;
                    fgnzVar48.e = j24;
                }
                fgnz fgnzVar49 = (fgnz) fgnvVar.instance;
                if ((fgnzVar49.b & 2) != 0) {
                    long j25 = fgnzVar49.d - a2;
                    fgnvVar.copyOnWrite();
                    fgnz fgnzVar50 = (fgnz) fgnvVar.instance;
                    fgnzVar50.b |= 2;
                    fgnzVar50.d = j25;
                }
            }
            ecda ecdaVar2 = ecqkVar.n;
            if (this.e.getAndSet(true)) {
                ListenableFuture listenableFuture = erre.a;
                return;
            }
            final ecqn ecqnVar = (ecqn) this.b.b();
            final String d = ecda.d(ecdaVar2);
            erqt.n(new erog() { // from class: ecqm
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    int a5;
                    final ecqn ecqnVar2 = ecqn.this;
                    if (!ecqnVar2.a.c(null)) {
                        return erre.a;
                    }
                    final fgnv fgnvVar2 = fgnvVar;
                    fgnz fgnzVar51 = (fgnz) fgnvVar2.instance;
                    int i = fgnzVar51.s;
                    int a6 = fgny.a(i);
                    if (((a6 != 0 && a6 == 3) || ((a5 = fgny.a(i)) != 0 && a5 == 2)) && (fgnzVar51.b & 16) == 0) {
                        return erre.a;
                    }
                    final String str = d;
                    ecpy ecpyVar = (ecpy) ecqnVar2.b.b();
                    ecpyVar.d();
                    final ListenableFuture i2 = erqt.i(emux.a);
                    ecpyVar.e();
                    final ListenableFuture i3 = erqt.i(emux.a);
                    return erqt.b(i2, i3).b(new erog() { // from class: ecql
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            ListenableFuture listenableFuture2 = i2;
                            fgnv fgnvVar3 = fgnvVar2;
                            try {
                                Map map = (Map) ((emxc) erqt.q(listenableFuture2)).f();
                                if (map != null) {
                                    long j26 = ((fgnz) fgnvVar3.instance).c;
                                    for (Map.Entry entry : map.entrySet()) {
                                        Integer num = (Integer) entry.getKey();
                                        num.intValue();
                                        long longValue2 = ((Long) entry.getValue()).longValue() - j26;
                                        fgnvVar3.copyOnWrite();
                                        fgnz fgnzVar52 = (fgnz) fgnvVar3.instance;
                                        eyhm eyhmVar = fgnzVar52.w;
                                        if (!eyhmVar.b) {
                                            fgnzVar52.w = eyhmVar.a();
                                        }
                                        fgnzVar52.w.put(num, Long.valueOf(longValue2));
                                    }
                                }
                            } catch (Exception e) {
                                ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService", "setCustomTimestamps", 'v', "StartupMetricRecordingService.java")).q("Failed to get custom timestamps future");
                            }
                            String str2 = str;
                            ListenableFuture listenableFuture3 = i3;
                            ecqn ecqnVar3 = ecqn.this;
                            eciu m = eciv.m();
                            fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                            fgnn fgnnVar = (fgnn) fgnp.a.createBuilder();
                            long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                            fgnnVar.copyOnWrite();
                            fgnp fgnpVar = (fgnp) fgnnVar.instance;
                            fgnpVar.b |= 1;
                            fgnpVar.c = leastSignificantBits;
                            fgnnVar.copyOnWrite();
                            fgnp fgnpVar2 = (fgnp) fgnnVar.instance;
                            fgnpVar2.d = 2;
                            fgnpVar2.b = 2 | fgnpVar2.b;
                            fgnnVar.copyOnWrite();
                            fgnp fgnpVar3 = (fgnp) fgnnVar.instance;
                            fgnz fgnzVar53 = (fgnz) fgnvVar3.build();
                            fgnzVar53.getClass();
                            fgnpVar3.f = fgnzVar53;
                            fgnpVar3.b |= 16;
                            fgqwVar.copyOnWrite();
                            fgqx fgqxVar = (fgqx) fgqwVar.instance;
                            fgnp fgnpVar4 = (fgnp) fgnnVar.build();
                            fgnpVar4.getClass();
                            fgqxVar.m = fgnpVar4;
                            fgqxVar.b |= 2048;
                            m.f((fgqx) fgqwVar.build());
                            fgmh fgmhVar = (fgmh) ((emxc) erqt.q(listenableFuture3)).f();
                            ecim ecimVar = (ecim) m;
                            ecimVar.b = fgmhVar;
                            ecimVar.c = str2;
                            m.d(true);
                            return ecqnVar3.a.b(m.a());
                        }
                    }, erpp.a);
                }
            }, ecqnVar.c);
        }
    }

    @Override // defpackage.ecje
    public final void n() {
        this.a.a(this);
    }

    @Override // defpackage.ecgn
    public final /* synthetic */ void j(ecda ecdaVar) {
    }
}
