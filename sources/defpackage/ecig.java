package defpackage;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import com.android.vcard.VCardConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecig {
    public static long a(HealthStats healthStats, int i) {
        boolean hasMeasurement;
        long measurement;
        if (healthStats == null) {
            return 0L;
        }
        hasMeasurement = healthStats.hasMeasurement(i);
        if (!hasMeasurement) {
            return 0L;
        }
        measurement = healthStats.getMeasurement(i);
        return measurement;
    }

    public static List b(HealthStats healthStats, int i) {
        boolean hasTimers;
        Map timers;
        if (healthStats != null) {
            hasTimers = healthStats.hasTimers(i);
            if (hasTimers) {
                ecif ecifVar = ecif.a;
                timers = healthStats.getTimers(i);
                return ecifVar.d(timers);
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static Map c(HealthStats healthStats, int i) {
        boolean hasStats;
        Map stats;
        if (healthStats != null) {
            hasStats = healthStats.hasStats(i);
            if (hasStats) {
                stats = healthStats.getStats(i);
                return stats;
            }
        }
        return Collections.EMPTY_MAP;
    }

    public static fgle d(String str) {
        fgld fgldVar = (fgld) fgle.a.createBuilder();
        fgldVar.copyOnWrite();
        fgle fgleVar = (fgle) fgldVar.instance;
        fgleVar.b |= 2;
        fgleVar.d = str;
        return (fgle) fgldVar.build();
    }

    public static fglo e(HealthStats healthStats, int i) {
        boolean hasTimer;
        TimerStat timer;
        if (healthStats != null) {
            hasTimer = healthStats.hasTimer(i);
            if (hasTimer) {
                timer = healthStats.getTimer(i);
                return g(null, timer);
            }
        }
        return null;
    }

    static fglo f(fglo fgloVar, fglo fgloVar2) {
        if (fgloVar == null || fgloVar2 == null) {
            return fgloVar;
        }
        int i = fgloVar.c - fgloVar2.c;
        long j = fgloVar.d - fgloVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        fgln fglnVar = (fgln) fglo.a.createBuilder();
        if ((fgloVar.b & 4) != 0) {
            fgle fgleVar = fgloVar.e;
            if (fgleVar == null) {
                fgleVar = fgle.a;
            }
            fglnVar.copyOnWrite();
            fglo fgloVar3 = (fglo) fglnVar.instance;
            fgleVar.getClass();
            fgloVar3.e = fgleVar;
            fgloVar3.b |= 4;
        }
        fglnVar.copyOnWrite();
        fglo fgloVar4 = (fglo) fglnVar.instance;
        fgloVar4.b |= 1;
        fgloVar4.c = i;
        fglnVar.copyOnWrite();
        fglo fgloVar5 = (fglo) fglnVar.instance;
        fgloVar5.b |= 2;
        fgloVar5.d = j;
        return (fglo) fglnVar.build();
    }

    public static fglo g(String str, TimerStat timerStat) {
        int count;
        long time;
        fgln fglnVar = (fgln) fglo.a.createBuilder();
        count = timerStat.getCount();
        fglnVar.copyOnWrite();
        fglo fgloVar = (fglo) fglnVar.instance;
        fgloVar.b |= 1;
        fgloVar.c = count;
        time = timerStat.getTime();
        fglnVar.copyOnWrite();
        fglo fgloVar2 = (fglo) fglnVar.instance;
        fgloVar2.b |= 2;
        fgloVar2.d = time;
        if (fgloVar2.c < 0) {
            fglnVar.copyOnWrite();
            fglo fgloVar3 = (fglo) fglnVar.instance;
            fgloVar3.b |= 1;
            fgloVar3.c = 0;
        }
        if (str != null) {
            fgle d = d(str);
            fglnVar.copyOnWrite();
            fglo fgloVar4 = (fglo) fglnVar.instance;
            d.getClass();
            fgloVar4.e = d;
            fgloVar4.b |= 4;
        }
        fglo fgloVar5 = (fglo) fglnVar.instance;
        if (fgloVar5.c == 0 && fgloVar5.d == 0) {
            return null;
        }
        return (fglo) fglnVar.build();
    }

    static fglq h(fglq fglqVar, fglq fglqVar2) {
        fglo fgloVar;
        fglo fgloVar2;
        fglo fgloVar3;
        fglo fgloVar4;
        fglo fgloVar5;
        fglo fgloVar6;
        fglo fgloVar7;
        fglo fgloVar8;
        fglo fgloVar9;
        fglo fgloVar10;
        fglo fgloVar11;
        fglo fgloVar12;
        fglo fgloVar13;
        fglo fgloVar14;
        fglo fgloVar15;
        fglo fgloVar16;
        fglo fgloVar17;
        fglo fgloVar18;
        fglo fgloVar19;
        fglo fgloVar20;
        fglo fgloVar21;
        fglo fgloVar22;
        fglo fgloVar23;
        fglo fgloVar24;
        fglo fgloVar25;
        fglo fgloVar26;
        fglo fgloVar27;
        fglo fgloVar28;
        fglo fgloVar29;
        fglo fgloVar30;
        fglo fgloVar31;
        fglo fgloVar32;
        if (fglqVar == null || fglqVar2 == null) {
            return fglqVar;
        }
        fglp fglpVar = (fglp) fglq.a.createBuilder();
        if ((fglqVar.b & 1) != 0) {
            long j = fglqVar.d - fglqVar2.d;
            if (j != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar3 = (fglq) fglpVar.instance;
                fglqVar3.b |= 1;
                fglqVar3.d = j;
            }
        }
        if ((fglqVar.b & 2) != 0) {
            long j2 = fglqVar.e - fglqVar2.e;
            if (j2 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar4 = (fglq) fglpVar.instance;
                fglqVar4.b |= 2;
                fglqVar4.e = j2;
            }
        }
        if ((fglqVar.b & 4) != 0) {
            long j3 = fglqVar.f - fglqVar2.f;
            if (j3 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar5 = (fglq) fglpVar.instance;
                fglqVar5.b |= 4;
                fglqVar5.f = j3;
            }
        }
        if ((fglqVar.b & 8) != 0) {
            long j4 = fglqVar.g - fglqVar2.g;
            if (j4 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar6 = (fglq) fglpVar.instance;
                fglqVar6.b |= 8;
                fglqVar6.g = j4;
            }
        }
        fglpVar.n(ecif.a.e(fglqVar.h, fglqVar2.h));
        fglpVar.o(ecif.a.e(fglqVar.i, fglqVar2.i));
        fglpVar.p(ecif.a.e(fglqVar.j, fglqVar2.j));
        fglpVar.m(ecif.a.e(fglqVar.k, fglqVar2.k));
        fglpVar.l(ecif.a.e(fglqVar.l, fglqVar2.l));
        fglpVar.h(ecif.a.e(fglqVar.m, fglqVar2.m));
        if ((fglqVar.b & 16) != 0) {
            fgloVar = fglqVar.n;
            if (fgloVar == null) {
                fgloVar = fglo.a;
            }
        } else {
            fgloVar = null;
        }
        if ((fglqVar2.b & 16) != 0) {
            fgloVar2 = fglqVar2.n;
            if (fgloVar2 == null) {
                fgloVar2 = fglo.a;
            }
        } else {
            fgloVar2 = null;
        }
        fglo f = f(fgloVar, fgloVar2);
        if (f != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar7 = (fglq) fglpVar.instance;
            fglqVar7.n = f;
            fglqVar7.b |= 16;
        }
        fglpVar.i(ecif.a.e(fglqVar.o, fglqVar2.o));
        fglpVar.k(ecic.a.e(fglqVar.q, fglqVar2.q));
        fglpVar.j(ecib.a.e(fglqVar.r, fglqVar2.r));
        if ((fglqVar.b & 32) != 0) {
            long j5 = fglqVar.s - fglqVar2.s;
            if (j5 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar8 = (fglq) fglpVar.instance;
                fglqVar8.b |= 32;
                fglqVar8.s = j5;
            }
        }
        if ((fglqVar.b & 64) != 0) {
            long j6 = fglqVar.t - fglqVar2.t;
            if (j6 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar9 = (fglq) fglpVar.instance;
                fglqVar9.b |= 64;
                fglqVar9.t = j6;
            }
        }
        if ((fglqVar.b & 128) != 0) {
            long j7 = fglqVar.u - fglqVar2.u;
            if (j7 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar10 = (fglq) fglpVar.instance;
                fglqVar10.b |= 128;
                fglqVar10.u = j7;
            }
        }
        if ((fglqVar.b & 256) != 0) {
            long j8 = fglqVar.v - fglqVar2.v;
            if (j8 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar11 = (fglq) fglpVar.instance;
                fglqVar11.b |= 256;
                fglqVar11.v = j8;
            }
        }
        if ((fglqVar.b & 512) != 0) {
            long j9 = fglqVar.w - fglqVar2.w;
            if (j9 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar12 = (fglq) fglpVar.instance;
                fglqVar12.b |= 512;
                fglqVar12.w = j9;
            }
        }
        if ((fglqVar.b & 1024) != 0) {
            long j10 = fglqVar.x - fglqVar2.x;
            if (j10 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar13 = (fglq) fglpVar.instance;
                fglqVar13.b |= 1024;
                fglqVar13.x = j10;
            }
        }
        if ((fglqVar.b & 2048) != 0) {
            long j11 = fglqVar.y - fglqVar2.y;
            if (j11 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar14 = (fglq) fglpVar.instance;
                fglqVar14.b |= 2048;
                fglqVar14.y = j11;
            }
        }
        if ((fglqVar.b & 4096) != 0) {
            long j12 = fglqVar.z - fglqVar2.z;
            if (j12 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar15 = (fglq) fglpVar.instance;
                fglqVar15.b |= 4096;
                fglqVar15.z = j12;
            }
        }
        if ((fglqVar.b & 8192) != 0) {
            long j13 = fglqVar.A - fglqVar2.A;
            if (j13 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar16 = (fglq) fglpVar.instance;
                fglqVar16.b |= 8192;
                fglqVar16.A = j13;
            }
        }
        if ((fglqVar.b & 16384) != 0) {
            long j14 = fglqVar.B - fglqVar2.B;
            if (j14 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar17 = (fglq) fglpVar.instance;
                fglqVar17.b |= 16384;
                fglqVar17.B = j14;
            }
        }
        if ((fglqVar.b & 32768) != 0) {
            long j15 = fglqVar.C - fglqVar2.C;
            if (j15 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar18 = (fglq) fglpVar.instance;
                fglqVar18.b |= 32768;
                fglqVar18.C = j15;
            }
        }
        if ((fglqVar.b & 65536) != 0) {
            long j16 = fglqVar.D - fglqVar2.D;
            if (j16 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar19 = (fglq) fglpVar.instance;
                fglqVar19.b |= 65536;
                fglqVar19.D = j16;
            }
        }
        if ((fglqVar.b & 131072) != 0) {
            long j17 = fglqVar.E - fglqVar2.E;
            if (j17 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar20 = (fglq) fglpVar.instance;
                fglqVar20.b |= 131072;
                fglqVar20.E = j17;
            }
        }
        if ((fglqVar.b & 262144) != 0) {
            long j18 = fglqVar.F - fglqVar2.F;
            if (j18 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar21 = (fglq) fglpVar.instance;
                fglqVar21.b |= 262144;
                fglqVar21.F = j18;
            }
        }
        if ((fglqVar.b & 524288) != 0) {
            fgloVar3 = fglqVar.G;
            if (fgloVar3 == null) {
                fgloVar3 = fglo.a;
            }
        } else {
            fgloVar3 = null;
        }
        if ((fglqVar2.b & 524288) != 0) {
            fgloVar4 = fglqVar2.G;
            if (fgloVar4 == null) {
                fgloVar4 = fglo.a;
            }
        } else {
            fgloVar4 = null;
        }
        fglo f2 = f(fgloVar3, fgloVar4);
        if (f2 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar22 = (fglq) fglpVar.instance;
            fglqVar22.G = f2;
            fglqVar22.b |= 524288;
        }
        if ((fglqVar.b & 1048576) != 0) {
            long j19 = fglqVar.H - fglqVar2.H;
            if (j19 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar23 = (fglq) fglpVar.instance;
                fglqVar23.b |= 1048576;
                fglqVar23.H = j19;
            }
        }
        if ((fglqVar.b & 2097152) != 0) {
            fgloVar5 = fglqVar.I;
            if (fgloVar5 == null) {
                fgloVar5 = fglo.a;
            }
        } else {
            fgloVar5 = null;
        }
        if ((fglqVar2.b & 2097152) != 0) {
            fgloVar6 = fglqVar2.I;
            if (fgloVar6 == null) {
                fgloVar6 = fglo.a;
            }
        } else {
            fgloVar6 = null;
        }
        fglo f3 = f(fgloVar5, fgloVar6);
        if (f3 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar24 = (fglq) fglpVar.instance;
            fglqVar24.I = f3;
            fglqVar24.b |= 2097152;
        }
        if ((fglqVar.b & 4194304) != 0) {
            fgloVar7 = fglqVar.J;
            if (fgloVar7 == null) {
                fgloVar7 = fglo.a;
            }
        } else {
            fgloVar7 = null;
        }
        if ((fglqVar2.b & 4194304) != 0) {
            fgloVar8 = fglqVar2.J;
            if (fgloVar8 == null) {
                fgloVar8 = fglo.a;
            }
        } else {
            fgloVar8 = null;
        }
        fglo f4 = f(fgloVar7, fgloVar8);
        if (f4 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar25 = (fglq) fglpVar.instance;
            fglqVar25.J = f4;
            fglqVar25.b |= 4194304;
        }
        if ((fglqVar.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
            fgloVar9 = fglqVar.K;
            if (fgloVar9 == null) {
                fgloVar9 = fglo.a;
            }
        } else {
            fgloVar9 = null;
        }
        if ((fglqVar2.b & VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT) != 0) {
            fgloVar10 = fglqVar2.K;
            if (fgloVar10 == null) {
                fgloVar10 = fglo.a;
            }
        } else {
            fgloVar10 = null;
        }
        fglo f5 = f(fgloVar9, fgloVar10);
        if (f5 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar26 = (fglq) fglpVar.instance;
            fglqVar26.K = f5;
            fglqVar26.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((fglqVar.b & 16777216) != 0) {
            fgloVar11 = fglqVar.L;
            if (fgloVar11 == null) {
                fgloVar11 = fglo.a;
            }
        } else {
            fgloVar11 = null;
        }
        if ((fglqVar2.b & 16777216) != 0) {
            fgloVar12 = fglqVar2.L;
            if (fgloVar12 == null) {
                fgloVar12 = fglo.a;
            }
        } else {
            fgloVar12 = null;
        }
        fglo f6 = f(fgloVar11, fgloVar12);
        if (f6 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar27 = (fglq) fglpVar.instance;
            fglqVar27.L = f6;
            fglqVar27.b |= 16777216;
        }
        if ((fglqVar.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
            fgloVar13 = fglqVar.M;
            if (fgloVar13 == null) {
                fgloVar13 = fglo.a;
            }
        } else {
            fgloVar13 = null;
        }
        if ((fglqVar2.b & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0) {
            fgloVar14 = fglqVar2.M;
            if (fgloVar14 == null) {
                fgloVar14 = fglo.a;
            }
        } else {
            fgloVar14 = null;
        }
        fglo f7 = f(fgloVar13, fgloVar14);
        if (f7 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar28 = (fglq) fglpVar.instance;
            fglqVar28.M = f7;
            fglqVar28.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if ((fglqVar.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
            fgloVar15 = fglqVar.N;
            if (fgloVar15 == null) {
                fgloVar15 = fglo.a;
            }
        } else {
            fgloVar15 = null;
        }
        if ((fglqVar2.b & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
            fgloVar16 = fglqVar2.N;
            if (fgloVar16 == null) {
                fgloVar16 = fglo.a;
            }
        } else {
            fgloVar16 = null;
        }
        fglo f8 = f(fgloVar15, fgloVar16);
        if (f8 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar29 = (fglq) fglpVar.instance;
            fglqVar29.N = f8;
            fglqVar29.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((fglqVar.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
            fgloVar17 = fglqVar.O;
            if (fgloVar17 == null) {
                fgloVar17 = fglo.a;
            }
        } else {
            fgloVar17 = null;
        }
        if ((fglqVar2.b & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
            fgloVar18 = fglqVar2.O;
            if (fgloVar18 == null) {
                fgloVar18 = fglo.a;
            }
        } else {
            fgloVar18 = null;
        }
        fglo f9 = f(fgloVar17, fgloVar18);
        if (f9 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar30 = (fglq) fglpVar.instance;
            fglqVar30.O = f9;
            fglqVar30.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        if ((fglqVar.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
            fgloVar19 = fglqVar.P;
            if (fgloVar19 == null) {
                fgloVar19 = fglo.a;
            }
        } else {
            fgloVar19 = null;
        }
        if ((fglqVar2.b & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0) {
            fgloVar20 = fglqVar2.P;
            if (fgloVar20 == null) {
                fgloVar20 = fglo.a;
            }
        } else {
            fgloVar20 = null;
        }
        fglo f10 = f(fgloVar19, fgloVar20);
        if (f10 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar31 = (fglq) fglpVar.instance;
            fglqVar31.P = f10;
            fglqVar31.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        if ((fglqVar.b & 536870912) != 0) {
            fgloVar21 = fglqVar.Q;
            if (fgloVar21 == null) {
                fgloVar21 = fglo.a;
            }
        } else {
            fgloVar21 = null;
        }
        if ((fglqVar2.b & 536870912) != 0) {
            fgloVar22 = fglqVar2.Q;
            if (fgloVar22 == null) {
                fgloVar22 = fglo.a;
            }
        } else {
            fgloVar22 = null;
        }
        fglo f11 = f(fgloVar21, fgloVar22);
        if (f11 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar32 = (fglq) fglpVar.instance;
            fglqVar32.Q = f11;
            fglqVar32.b |= 536870912;
        }
        if ((fglqVar.b & 1073741824) != 0) {
            fgloVar23 = fglqVar.R;
            if (fgloVar23 == null) {
                fgloVar23 = fglo.a;
            }
        } else {
            fgloVar23 = null;
        }
        if ((fglqVar2.b & 1073741824) != 0) {
            fgloVar24 = fglqVar2.R;
            if (fgloVar24 == null) {
                fgloVar24 = fglo.a;
            }
        } else {
            fgloVar24 = null;
        }
        fglo f12 = f(fgloVar23, fgloVar24);
        if (f12 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar33 = (fglq) fglpVar.instance;
            fglqVar33.R = f12;
            fglqVar33.b |= 1073741824;
        }
        if ((fglqVar.b & Integer.MIN_VALUE) != 0) {
            fgloVar25 = fglqVar.S;
            if (fgloVar25 == null) {
                fgloVar25 = fglo.a;
            }
        } else {
            fgloVar25 = null;
        }
        if ((fglqVar2.b & Integer.MIN_VALUE) != 0) {
            fgloVar26 = fglqVar2.S;
            if (fgloVar26 == null) {
                fgloVar26 = fglo.a;
            }
        } else {
            fgloVar26 = null;
        }
        fglo f13 = f(fgloVar25, fgloVar26);
        if (f13 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar34 = (fglq) fglpVar.instance;
            fglqVar34.S = f13;
            fglqVar34.b |= Integer.MIN_VALUE;
        }
        if ((fglqVar.c & 1) != 0) {
            fgloVar27 = fglqVar.T;
            if (fgloVar27 == null) {
                fgloVar27 = fglo.a;
            }
        } else {
            fgloVar27 = null;
        }
        if ((fglqVar2.c & 1) != 0) {
            fgloVar28 = fglqVar2.T;
            if (fgloVar28 == null) {
                fgloVar28 = fglo.a;
            }
        } else {
            fgloVar28 = null;
        }
        fglo f14 = f(fgloVar27, fgloVar28);
        if (f14 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar35 = (fglq) fglpVar.instance;
            fglqVar35.T = f14;
            fglqVar35.c |= 1;
        }
        if ((fglqVar.c & 2) != 0) {
            fgloVar29 = fglqVar.U;
            if (fgloVar29 == null) {
                fgloVar29 = fglo.a;
            }
        } else {
            fgloVar29 = null;
        }
        if ((fglqVar2.c & 2) != 0) {
            fgloVar30 = fglqVar2.U;
            if (fgloVar30 == null) {
                fgloVar30 = fglo.a;
            }
        } else {
            fgloVar30 = null;
        }
        fglo f15 = f(fgloVar29, fgloVar30);
        if (f15 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar36 = (fglq) fglpVar.instance;
            fglqVar36.U = f15;
            fglqVar36.c |= 2;
        }
        if ((fglqVar.c & 4) != 0) {
            long j20 = fglqVar.V - fglqVar2.V;
            if (j20 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar37 = (fglq) fglpVar.instance;
                fglqVar37.c |= 4;
                fglqVar37.V = j20;
            }
        }
        if ((fglqVar.c & 8) != 0) {
            long j21 = fglqVar.W - fglqVar2.W;
            if (j21 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar38 = (fglq) fglpVar.instance;
                fglqVar38.c |= 8;
                fglqVar38.W = j21;
            }
        }
        if ((fglqVar.c & 16) != 0) {
            long j22 = fglqVar.X - fglqVar2.X;
            if (j22 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar39 = (fglq) fglpVar.instance;
                fglqVar39.c |= 16;
                fglqVar39.X = j22;
            }
        }
        if ((fglqVar.c & 32) != 0) {
            long j23 = fglqVar.Y - fglqVar2.Y;
            if (j23 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar40 = (fglq) fglpVar.instance;
                fglqVar40.c |= 32;
                fglqVar40.Y = j23;
            }
        }
        if ((fglqVar.c & 64) != 0) {
            long j24 = fglqVar.Z - fglqVar2.Z;
            if (j24 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar41 = (fglq) fglpVar.instance;
                fglqVar41.c |= 64;
                fglqVar41.Z = j24;
            }
        }
        if ((fglqVar.c & 128) != 0) {
            long j25 = fglqVar.aa - fglqVar2.aa;
            if (j25 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar42 = (fglq) fglpVar.instance;
                fglqVar42.c |= 128;
                fglqVar42.aa = j25;
            }
        }
        if ((fglqVar.c & 256) != 0) {
            long j26 = fglqVar.ab - fglqVar2.ab;
            if (j26 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar43 = (fglq) fglpVar.instance;
                fglqVar43.c |= 256;
                fglqVar43.ab = j26;
            }
        }
        if ((fglqVar.c & 512) != 0) {
            long j27 = fglqVar.ac - fglqVar2.ac;
            if (j27 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar44 = (fglq) fglpVar.instance;
                fglqVar44.c |= 512;
                fglqVar44.ac = j27;
            }
        }
        if ((fglqVar.c & 1024) != 0) {
            long j28 = fglqVar.ad - fglqVar2.ad;
            if (j28 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar45 = (fglq) fglpVar.instance;
                fglqVar45.c |= 1024;
                fglqVar45.ad = j28;
            }
        }
        if ((fglqVar.c & 2048) != 0) {
            long j29 = fglqVar.ae - fglqVar2.ae;
            if (j29 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar46 = (fglq) fglpVar.instance;
                fglqVar46.c |= 2048;
                fglqVar46.ae = j29;
            }
        }
        if ((fglqVar.c & 4096) != 0) {
            long j30 = fglqVar.af - fglqVar2.af;
            if (j30 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar47 = (fglq) fglpVar.instance;
                fglqVar47.c |= 4096;
                fglqVar47.af = j30;
            }
        }
        if ((fglqVar.c & 8192) != 0) {
            long j31 = fglqVar.ag - fglqVar2.ag;
            if (j31 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar48 = (fglq) fglpVar.instance;
                fglqVar48.c |= 8192;
                fglqVar48.ag = j31;
            }
        }
        if ((fglqVar.c & 16384) != 0) {
            long j32 = fglqVar.ah - fglqVar2.ah;
            if (j32 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar49 = (fglq) fglpVar.instance;
                fglqVar49.c |= 16384;
                fglqVar49.ah = j32;
            }
        }
        if ((fglqVar.c & 32768) != 0) {
            long j33 = fglqVar.ai - fglqVar2.ai;
            if (j33 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar50 = (fglq) fglpVar.instance;
                fglqVar50.c = 32768 | fglqVar50.c;
                fglqVar50.ai = j33;
            }
        }
        if ((fglqVar.c & 65536) != 0) {
            long j34 = fglqVar.aj - fglqVar2.aj;
            if (j34 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar51 = (fglq) fglpVar.instance;
                fglqVar51.c |= 65536;
                fglqVar51.aj = j34;
            }
        }
        if ((fglqVar.c & 131072) != 0) {
            fgloVar31 = fglqVar.ak;
            if (fgloVar31 == null) {
                fgloVar31 = fglo.a;
            }
        } else {
            fgloVar31 = null;
        }
        if ((fglqVar2.c & 131072) != 0) {
            fgloVar32 = fglqVar2.ak;
            if (fgloVar32 == null) {
                fgloVar32 = fglo.a;
            }
        } else {
            fgloVar32 = null;
        }
        fglo f16 = f(fgloVar31, fgloVar32);
        if (f16 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar52 = (fglq) fglpVar.instance;
            fglqVar52.ak = f16;
            fglqVar52.c |= 131072;
        }
        if ((fglqVar.c & 262144) != 0) {
            long j35 = fglqVar.al - fglqVar2.al;
            if (j35 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar53 = (fglq) fglpVar.instance;
                fglqVar53.c |= 262144;
                fglqVar53.al = j35;
            }
        }
        if ((fglqVar.c & 524288) != 0) {
            long j36 = fglqVar.am - fglqVar2.am;
            if (j36 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar54 = (fglq) fglpVar.instance;
                fglqVar54.c |= 524288;
                fglqVar54.am = j36;
            }
        }
        if ((fglqVar.c & 1048576) != 0) {
            long j37 = fglqVar.an - fglqVar2.an;
            if (j37 != 0) {
                fglpVar.copyOnWrite();
                fglq fglqVar55 = (fglq) fglpVar.instance;
                fglqVar55.c |= 1048576;
                fglqVar55.an = j37;
            }
        }
        fglq fglqVar56 = (fglq) fglpVar.build();
        if (fglqVar56 == null || (fglqVar56.d <= 0 && fglqVar56.e <= 0 && fglqVar56.f <= 0 && fglqVar56.g <= 0 && fglqVar56.h.size() == 0 && fglqVar56.i.size() == 0 && fglqVar56.j.size() == 0 && fglqVar56.k.size() == 0 && fglqVar56.l.size() == 0 && fglqVar56.m.size() == 0 && fglqVar56.o.size() == 0 && fglqVar56.p.size() == 0 && fglqVar56.q.size() == 0 && fglqVar56.r.size() == 0 && fglqVar56.s <= 0 && fglqVar56.t <= 0 && fglqVar56.u <= 0 && fglqVar56.v <= 0 && fglqVar56.w <= 0 && fglqVar56.x <= 0 && fglqVar56.y <= 0 && fglqVar56.z <= 0 && fglqVar56.A <= 0 && fglqVar56.B <= 0 && fglqVar56.C <= 0 && fglqVar56.D <= 0 && fglqVar56.E <= 0 && fglqVar56.F <= 0 && fglqVar56.H <= 0 && fglqVar56.V <= 0 && fglqVar56.W <= 0 && fglqVar56.X <= 0 && fglqVar56.Y <= 0 && fglqVar56.Z <= 0 && fglqVar56.aa <= 0 && fglqVar56.ab <= 0 && fglqVar56.ac <= 0 && fglqVar56.ad <= 0 && fglqVar56.ae <= 0 && fglqVar56.af <= 0 && fglqVar56.ag <= 0 && fglqVar56.ah <= 0 && fglqVar56.ai <= 0 && fglqVar56.aj <= 0 && fglqVar56.al <= 0 && fglqVar56.am <= 0 && fglqVar56.an <= 0)) {
            return null;
        }
        return fglqVar56;
    }

    static boolean i(fglg fglgVar) {
        if (fglgVar != null) {
            return fglgVar.c.size() == 0 && fglgVar.d.size() == 0;
        }
        return true;
    }

    static boolean j(fglk fglkVar) {
        if (fglkVar != null) {
            return fglkVar.c <= 0 && fglkVar.d <= 0 && fglkVar.e <= 0 && fglkVar.f <= 0 && fglkVar.g <= 0 && fglkVar.h <= 0;
        }
        return true;
    }

    static boolean k(fglm fglmVar) {
        if (fglmVar != null) {
            return ((long) fglmVar.c) <= 0 && ((long) fglmVar.d) <= 0;
        }
        return true;
    }
}
