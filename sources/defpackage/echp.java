package defpackage;

import android.os.health.HealthStats;
import com.android.vcard.VCardConfig;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class echp {
    static final ecii a(Long l, Long l2, HealthStats healthStats, fgkx fgkxVar, fgmh fgmhVar, echq echqVar) {
        echz echzVar;
        fglp fglpVar = (fglp) fglq.a.createBuilder();
        long a = ecig.a(healthStats, 10001);
        if (a != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar = (fglq) fglpVar.instance;
            fglqVar.b |= 1;
            fglqVar.d = a;
        }
        long a2 = ecig.a(healthStats, 10002);
        if (a2 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar2 = (fglq) fglpVar.instance;
            fglqVar2.b |= 2;
            fglqVar2.e = a2;
        }
        long a3 = ecig.a(healthStats, 10003);
        if (a3 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar3 = (fglq) fglpVar.instance;
            fglqVar3.b |= 4;
            fglqVar3.f = a3;
        }
        long a4 = ecig.a(healthStats, 10004);
        if (a4 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar4 = (fglq) fglpVar.instance;
            fglqVar4.b |= 8;
            fglqVar4.g = a4;
        }
        fglpVar.n(ecig.b(healthStats, 10005));
        fglpVar.o(ecig.b(healthStats, 10006));
        fglpVar.p(ecig.b(healthStats, 10007));
        fglpVar.m(ecig.b(healthStats, 10008));
        fglpVar.l(ecig.b(healthStats, 10009));
        fglpVar.h(ecig.b(healthStats, 10010));
        fglo e = ecig.e(healthStats, 10011);
        if (e != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar5 = (fglq) fglpVar.instance;
            fglqVar5.n = e;
            fglqVar5.b |= 16;
        }
        fglpVar.i(ecig.b(healthStats, 10012));
        fglpVar.k(ecic.a.d(ecig.c(healthStats, 10014)));
        fglpVar.j(ecib.a.d(ecig.c(healthStats, 10015)));
        long a5 = ecig.a(healthStats, 10016);
        if (a5 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar6 = (fglq) fglpVar.instance;
            fglqVar6.b |= 32;
            fglqVar6.s = a5;
        }
        long a6 = ecig.a(healthStats, 10017);
        if (a6 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar7 = (fglq) fglpVar.instance;
            fglqVar7.b |= 64;
            fglqVar7.t = a6;
        }
        long a7 = ecig.a(healthStats, 10018);
        if (a7 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar8 = (fglq) fglpVar.instance;
            fglqVar8.b |= 128;
            fglqVar8.u = a7;
        }
        long a8 = ecig.a(healthStats, 10019);
        if (a8 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar9 = (fglq) fglpVar.instance;
            fglqVar9.b |= 256;
            fglqVar9.v = a8;
        }
        long a9 = ecig.a(healthStats, 10020);
        if (a9 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar10 = (fglq) fglpVar.instance;
            fglqVar10.b |= 512;
            fglqVar10.w = a9;
        }
        long a10 = ecig.a(healthStats, 10021);
        if (a10 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar11 = (fglq) fglpVar.instance;
            fglqVar11.b |= 1024;
            fglqVar11.x = a10;
        }
        long a11 = ecig.a(healthStats, 10022);
        if (a11 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar12 = (fglq) fglpVar.instance;
            fglqVar12.b |= 2048;
            fglqVar12.y = a11;
        }
        long a12 = ecig.a(healthStats, 10023);
        if (a12 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar13 = (fglq) fglpVar.instance;
            fglqVar13.b |= 4096;
            fglqVar13.z = a12;
        }
        long a13 = ecig.a(healthStats, 10024);
        if (a13 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar14 = (fglq) fglpVar.instance;
            fglqVar14.b |= 8192;
            fglqVar14.A = a13;
        }
        long a14 = ecig.a(healthStats, 10025);
        if (a14 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar15 = (fglq) fglpVar.instance;
            fglqVar15.b |= 16384;
            fglqVar15.B = a14;
        }
        long a15 = ecig.a(healthStats, 10026);
        if (a15 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar16 = (fglq) fglpVar.instance;
            fglqVar16.b |= 32768;
            fglqVar16.C = a15;
        }
        long a16 = ecig.a(healthStats, 10027);
        if (a16 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar17 = (fglq) fglpVar.instance;
            fglqVar17.b |= 65536;
            fglqVar17.D = a16;
        }
        long a17 = ecig.a(healthStats, 10028);
        if (a17 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar18 = (fglq) fglpVar.instance;
            fglqVar18.b |= 131072;
            fglqVar18.E = a17;
        }
        long a18 = ecig.a(healthStats, 10029);
        if (a18 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar19 = (fglq) fglpVar.instance;
            fglqVar19.b |= 262144;
            fglqVar19.F = a18;
        }
        fglo e2 = ecig.e(healthStats, 10030);
        if (e2 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar20 = (fglq) fglpVar.instance;
            fglqVar20.G = e2;
            fglqVar20.b |= 524288;
        }
        long a19 = ecig.a(healthStats, 10031);
        if (a19 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar21 = (fglq) fglpVar.instance;
            fglqVar21.b |= 1048576;
            fglqVar21.H = a19;
        }
        fglo e3 = ecig.e(healthStats, 10032);
        if (e3 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar22 = (fglq) fglpVar.instance;
            fglqVar22.I = e3;
            fglqVar22.b |= 2097152;
        }
        fglo e4 = ecig.e(healthStats, 10033);
        if (e4 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar23 = (fglq) fglpVar.instance;
            fglqVar23.J = e4;
            fglqVar23.b |= 4194304;
        }
        fglo e5 = ecig.e(healthStats, 10034);
        if (e5 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar24 = (fglq) fglpVar.instance;
            fglqVar24.K = e5;
            fglqVar24.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        fglo e6 = ecig.e(healthStats, 10035);
        if (e6 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar25 = (fglq) fglpVar.instance;
            fglqVar25.L = e6;
            fglqVar25.b |= 16777216;
        }
        fglo e7 = ecig.e(healthStats, 10036);
        if (e7 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar26 = (fglq) fglpVar.instance;
            fglqVar26.M = e7;
            fglqVar26.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        fglo e8 = ecig.e(healthStats, 10037);
        if (e8 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar27 = (fglq) fglpVar.instance;
            fglqVar27.N = e8;
            fglqVar27.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        fglo e9 = ecig.e(healthStats, 10038);
        if (e9 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar28 = (fglq) fglpVar.instance;
            fglqVar28.O = e9;
            fglqVar28.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        fglo e10 = ecig.e(healthStats, 10039);
        if (e10 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar29 = (fglq) fglpVar.instance;
            fglqVar29.P = e10;
            fglqVar29.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        fglo e11 = ecig.e(healthStats, 10040);
        if (e11 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar30 = (fglq) fglpVar.instance;
            fglqVar30.Q = e11;
            fglqVar30.b |= 536870912;
        }
        fglo e12 = ecig.e(healthStats, 10041);
        if (e12 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar31 = (fglq) fglpVar.instance;
            fglqVar31.R = e12;
            fglqVar31.b |= 1073741824;
        }
        fglo e13 = ecig.e(healthStats, 10042);
        if (e13 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar32 = (fglq) fglpVar.instance;
            fglqVar32.S = e13;
            fglqVar32.b |= Integer.MIN_VALUE;
        }
        fglo e14 = ecig.e(healthStats, 10043);
        if (e14 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar33 = (fglq) fglpVar.instance;
            fglqVar33.T = e14;
            fglqVar33.c |= 1;
        }
        fglo e15 = ecig.e(healthStats, 10044);
        if (e15 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar34 = (fglq) fglpVar.instance;
            fglqVar34.U = e15;
            fglqVar34.c |= 2;
        }
        long a20 = ecig.a(healthStats, 10045);
        if (a20 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar35 = (fglq) fglpVar.instance;
            fglqVar35.c |= 4;
            fglqVar35.V = a20;
        }
        long a21 = ecig.a(healthStats, 10046);
        if (a21 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar36 = (fglq) fglpVar.instance;
            fglqVar36.c |= 8;
            fglqVar36.W = a21;
        }
        long a22 = ecig.a(healthStats, 10047);
        if (a22 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar37 = (fglq) fglpVar.instance;
            fglqVar37.c |= 16;
            fglqVar37.X = a22;
        }
        long a23 = ecig.a(healthStats, 10048);
        if (a23 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar38 = (fglq) fglpVar.instance;
            fglqVar38.c |= 32;
            fglqVar38.Y = a23;
        }
        long a24 = ecig.a(healthStats, 10049);
        if (a24 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar39 = (fglq) fglpVar.instance;
            fglqVar39.c |= 64;
            fglqVar39.Z = a24;
        }
        long a25 = ecig.a(healthStats, 10050);
        if (a25 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar40 = (fglq) fglpVar.instance;
            fglqVar40.c |= 128;
            fglqVar40.aa = a25;
        }
        long a26 = ecig.a(healthStats, 10051);
        if (a26 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar41 = (fglq) fglpVar.instance;
            fglqVar41.c |= 256;
            fglqVar41.ab = a26;
        }
        long a27 = ecig.a(healthStats, 10052);
        if (a27 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar42 = (fglq) fglpVar.instance;
            fglqVar42.c |= 512;
            fglqVar42.ac = a27;
        }
        long a28 = ecig.a(healthStats, 10053);
        if (a28 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar43 = (fglq) fglpVar.instance;
            fglqVar43.c |= 1024;
            fglqVar43.ad = a28;
        }
        long a29 = ecig.a(healthStats, 10054);
        if (a29 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar44 = (fglq) fglpVar.instance;
            fglqVar44.c |= 2048;
            fglqVar44.ae = a29;
        }
        long a30 = ecig.a(healthStats, 10055);
        if (a30 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar45 = (fglq) fglpVar.instance;
            fglqVar45.c |= 4096;
            fglqVar45.af = a30;
        }
        long a31 = ecig.a(healthStats, 10056);
        if (a31 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar46 = (fglq) fglpVar.instance;
            fglqVar46.c |= 8192;
            fglqVar46.ag = a31;
        }
        long a32 = ecig.a(healthStats, 10057);
        if (a32 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar47 = (fglq) fglpVar.instance;
            fglqVar47.c |= 16384;
            fglqVar47.ah = a32;
        }
        long a33 = ecig.a(healthStats, 10058);
        if (a33 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar48 = (fglq) fglpVar.instance;
            fglqVar48.c |= 32768;
            fglqVar48.ai = a33;
        }
        long a34 = ecig.a(healthStats, 10059);
        if (a34 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar49 = (fglq) fglpVar.instance;
            fglqVar49.c = 65536 | fglqVar49.c;
            fglqVar49.aj = a34;
        }
        fglo e16 = ecig.e(healthStats, 10061);
        if (e16 != null) {
            fglpVar.copyOnWrite();
            fglq fglqVar50 = (fglq) fglpVar.instance;
            fglqVar50.ak = e16;
            fglqVar50.c |= 131072;
        }
        long a35 = ecig.a(healthStats, 10062);
        if (a35 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar51 = (fglq) fglpVar.instance;
            fglqVar51.c |= 262144;
            fglqVar51.al = a35;
        }
        long a36 = ecig.a(healthStats, 10063);
        if (a36 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar52 = (fglq) fglpVar.instance;
            fglqVar52.c = 524288 | fglqVar52.c;
            fglqVar52.am = a36;
        }
        long a37 = ecig.a(healthStats, 10064);
        if (a37 != 0) {
            fglpVar.copyOnWrite();
            fglq fglqVar53 = (fglq) fglpVar.instance;
            fglqVar53.c |= 1048576;
            fglqVar53.an = a37;
        }
        fglp fglpVar2 = (fglp) ((fglq) fglpVar.build()).toBuilder();
        DesugarCollections.unmodifiableList(((fglq) fglpVar2.instance).h);
        int i = 0;
        while (true) {
            ecik ecikVar = echqVar.a;
            int size = ((fglq) fglpVar2.instance).h.size();
            echzVar = ecikVar.b;
            if (i >= size) {
                break;
            }
            fglpVar2.u(i, echzVar.b(echy.WAKELOCK, fglpVar2.e(i)));
            i++;
        }
        DesugarCollections.unmodifiableList(((fglq) fglpVar2.instance).i);
        for (int i2 = 0; i2 < ((fglq) fglpVar2.instance).i.size(); i2++) {
            fglpVar2.v(i2, echzVar.b(echy.WAKELOCK, fglpVar2.f(i2)));
        }
        DesugarCollections.unmodifiableList(((fglq) fglpVar2.instance).j);
        for (int i3 = 0; i3 < ((fglq) fglpVar2.instance).j.size(); i3++) {
            fglpVar2.w(i3, echzVar.b(echy.WAKELOCK, fglpVar2.g(i3)));
        }
        DesugarCollections.unmodifiableList(((fglq) fglpVar2.instance).k);
        for (int i4 = 0; i4 < ((fglq) fglpVar2.instance).k.size(); i4++) {
            fglpVar2.t(i4, echzVar.b(echy.WAKELOCK, fglpVar2.d(i4)));
        }
        DesugarCollections.unmodifiableList(((fglq) fglpVar2.instance).l);
        for (int i5 = 0; i5 < ((fglq) fglpVar2.instance).l.size(); i5++) {
            fglpVar2.s(i5, echzVar.b(echy.SYNC, fglpVar2.c(i5)));
        }
        DesugarCollections.unmodifiableList(((fglq) fglpVar2.instance).m);
        for (int i6 = 0; i6 < ((fglq) fglpVar2.instance).m.size(); i6++) {
            fglpVar2.q(i6, echzVar.b(echy.JOB, fglpVar2.a(i6)));
        }
        DesugarCollections.unmodifiableList(((fglq) fglpVar2.instance).o);
        for (int i7 = 0; i7 < ((fglq) fglpVar2.instance).o.size(); i7++) {
            fglpVar2.r(i7, echzVar.b(echy.SENSOR, fglpVar2.b(i7)));
        }
        return new ecii((fglq) fglpVar2.build(), l, l2, 728121172L, Long.valueOf(echqVar.c != null ? r1.hashCode() : 0L), fgkxVar, null, fgmhVar, null);
    }
}
