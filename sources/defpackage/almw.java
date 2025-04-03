package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.TrafficStats;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.analytics.recurringmetrics.AnalyticsAlarmReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarTimeZone;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class almw {
    public static final cskc a = cskc.g("BugleUsageStatistics", "RecurringMetricsUploader");
    public static final cfup b = cfvl.i(cfvl.b, "enable_device_resolution_upload", true);
    public static final cfva c = cfvl.q(151630898);
    static final emyl d = cfvl.w("log_subs_per_active_sim");
    static final cfup e = cfvl.e(cfvl.b, "num_of_last_phone_number_digits", 5);
    static final cfup f = cfvl.e(cfvl.b, "upper_limit_of_sub_per_number", 10);
    public static final long g = TimeUnit.DAYS.toMillis(1);
    public static final long h = TimeUnit.DAYS.toMillis(1);
    public static final long i = TimeUnit.DAYS.toMillis(1);
    public final aliv A;
    public final alir B;
    public final algm C;
    public final errl D;
    public final errl E;
    public final dkpp F;
    public final bzqf G;
    public final ffbr H;
    public final ffbr I;
    public final ffbr J;
    public final ffbr K;
    public final ffbr L;
    public final ffbr M;
    public final Optional N;
    public final ffbr O;
    public final ffbr P;
    public final ffbr Q;
    public final Optional R;
    public final Optional S;
    public final ffbr T;
    public final Optional U;
    public final ffbr V;
    public final ffbr W;
    public final ffbr X;
    public final ffbr Y;
    public final ffbr Z;
    public final ffbr aa;
    public final ffbr ab;
    public final ffbr ac;
    public final ffbr ad;
    public final alhk ae;
    private final crjx af;
    private final errl ag;
    private final Optional ah;
    private final Optional ai;
    private final ffbr aj;
    private final ffbr ak;
    private final ffbr al;
    public final Context j;
    public final bzgd k;
    public final csjk l;
    public final ctwb m;
    public final cthp n;
    public final altk o;
    public final akzt p;
    public final fazb q;
    public final ffbr r;
    public final ctyz s;
    public final ctvb t;
    public final ctyx u;
    public final ctud v;
    public final cqoh w;
    public final Optional x;
    public final crln y;
    public final ckds z;

    public almw(Context context, bzgd bzgdVar, ctwb ctwbVar, cthp cthpVar, altk altkVar, akzt akztVar, fazb fazbVar, ffbr ffbrVar, ctyz ctyzVar, csjk csjkVar, ctvb ctvbVar, crjx crjxVar, ctyx ctyxVar, ctud ctudVar, cqoh cqohVar, Optional optional, alhk alhkVar, crln crlnVar, ckds ckdsVar, aliv alivVar, alir alirVar, algm algmVar, errl errlVar, errl errlVar2, errl errlVar3, dkpp dkppVar, bzqf bzqfVar, ffbr ffbrVar2, Optional optional2, Optional optional3, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, Optional optional4, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, Optional optional5, Optional optional6, Optional optional7, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23) {
        this.j = context;
        this.k = bzgdVar;
        this.m = ctwbVar;
        this.n = cthpVar;
        this.o = altkVar;
        this.p = akztVar;
        this.q = fazbVar;
        this.r = ffbrVar;
        this.s = ctyzVar;
        this.l = csjkVar;
        this.t = ctvbVar;
        this.af = crjxVar;
        this.u = ctyxVar;
        this.v = ctudVar;
        this.w = cqohVar;
        this.x = optional;
        this.ae = alhkVar;
        this.y = crlnVar;
        this.z = ckdsVar;
        this.A = alivVar;
        this.B = alirVar;
        this.C = algmVar;
        this.D = errlVar;
        this.E = errlVar2;
        this.ag = errlVar3;
        this.F = dkppVar;
        this.G = bzqfVar;
        this.H = ffbrVar2;
        this.ah = optional2;
        this.ai = optional3;
        this.I = ffbrVar3;
        this.J = ffbrVar4;
        this.K = ffbrVar5;
        this.L = ffbrVar6;
        this.M = ffbrVar7;
        this.Y = ffbrVar15;
        this.N = optional4;
        this.O = ffbrVar8;
        this.P = ffbrVar9;
        this.Q = ffbrVar10;
        this.R = optional5;
        this.S = optional6;
        this.T = ffbrVar11;
        this.U = optional7;
        this.V = ffbrVar12;
        this.W = ffbrVar13;
        this.aj = ffbrVar14;
        this.X = ffbrVar17;
        this.ak = ffbrVar16;
        this.Z = ffbrVar18;
        this.aa = ffbrVar19;
        this.ab = ffbrVar20;
        this.ac = ffbrVar21;
        this.al = ffbrVar22;
        this.ad = ffbrVar23;
    }

    public static eoyq d() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        eoyp eoypVar = (eoyp) eoyq.a.createBuilder();
        int i2 = displayMetrics.widthPixels;
        eoypVar.copyOnWrite();
        eoyq eoyqVar = (eoyq) eoypVar.instance;
        eoyqVar.b |= 1;
        eoyqVar.c = i2;
        int i3 = displayMetrics.heightPixels;
        eoypVar.copyOnWrite();
        eoyq eoyqVar2 = (eoyq) eoypVar.instance;
        eoyqVar2.b |= 2;
        eoyqVar2.d = i3;
        return (eoyq) eoypVar.build();
    }

    public static int o(int i2) {
        if (i2 < 1000) {
            return 2;
        }
        if (i2 < 5000) {
            return 3;
        }
        if (i2 < 25000) {
            return 4;
        }
        if (i2 < 100000) {
            return 5;
        }
        if (i2 < 250000) {
            return 6;
        }
        if (i2 < 500000) {
            return 7;
        }
        return i2 < 1000000 ? 8 : 9;
    }

    public final elfl a(final eqwf eqwfVar, final eosr eosrVar, final enip enipVar) {
        elfl e2;
        final eolq eolqVar = (eolq) eolr.a.createBuilder();
        bzqf bzqfVar = this.G;
        final elfl h2 = bzqfVar.d.o() ? bzqfVar.c.d().h(new emwl() { // from class: bzqd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eolq eolqVar2 = eolq.this;
                if (booleanValue) {
                    eolqVar2.copyOnWrite();
                    eolr eolrVar = (eolr) eolqVar2.instance;
                    eolr eolrVar2 = eolr.a;
                    eolrVar.c = 1;
                    eolrVar.b = 1 | eolrVar.b;
                } else {
                    eolqVar2.copyOnWrite();
                    eolr eolrVar3 = (eolr) eolqVar2.instance;
                    eolr eolrVar4 = eolr.a;
                    eolrVar3.c = 2;
                    eolrVar3.b = 1 | eolrVar3.b;
                }
                return (eolr) eolqVar2.build();
            }
        }, bzqfVar.e) : elfo.e((eolr) eolqVar.build());
        final elfl g2 = elfl.g(elfr.d(h2).a(new Callable() { // from class: almd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                almw almwVar = almw.this;
                Resources resources = almwVar.j.getResources();
                boolean q = almwVar.u.q(resources.getString(R.string.share_typing_status_rcs_pref_key), resources.getBoolean(R.bool.share_typing_status_rcs_pref_default));
                boolean q2 = almwVar.u.q(resources.getString(R.string.send_seen_report_rcs_pref_key), resources.getBoolean(R.bool.send_seen_report_rcs_pref_default));
                eojc eojcVar = (eojc) eojd.a.createBuilder();
                eoss eossVar = (eoss) eost.a.createBuilder();
                boolean a2 = ((asqs) almwVar.aa.b()).a();
                eossVar.copyOnWrite();
                eost eostVar = (eost) eossVar.instance;
                eostVar.b |= 256;
                eostVar.j = a2;
                eossVar.copyOnWrite();
                eost eostVar2 = (eost) eossVar.instance;
                eostVar2.c = eqwfVar.N;
                eostVar2.b |= 1;
                int i2 = 3;
                int i3 = true != q ? 3 : 2;
                eossVar.copyOnWrite();
                eost eostVar3 = (eost) eossVar.instance;
                eostVar3.d = i3 - 1;
                eostVar3.b |= 8;
                int i4 = true != q2 ? 3 : 2;
                eossVar.copyOnWrite();
                eost eostVar4 = (eost) eossVar.instance;
                eostVar4.e = i4 - 1;
                eostVar4.b |= 16;
                int i5 = true != almwVar.u.q("auto_fallback_rcs", false) ? 5 : 2;
                eossVar.copyOnWrite();
                eost eostVar5 = (eost) eossVar.instance;
                eostVar5.f = i5 - 1;
                eostVar5.b |= 32;
                eossVar.copyOnWrite();
                eost eostVar6 = (eost) eossVar.instance;
                eostVar6.g = eosrVar.j;
                eostVar6.b |= 64;
                int d2 = almwVar.z.d();
                if (d2 == 0) {
                    i2 = 2;
                } else if (d2 != 1) {
                    i2 = 1;
                }
                eossVar.copyOnWrite();
                eost eostVar7 = (eost) eossVar.instance;
                eostVar7.h = i2 - 1;
                eostVar7.b |= 128;
                eossVar.copyOnWrite();
                eost eostVar8 = (eost) eossVar.instance;
                eygr eygrVar = eostVar8.i;
                if (!eygrVar.c()) {
                    eostVar8.i = eyfy.mutableCopy(eygrVar);
                }
                eydl.addAll(enipVar, eostVar8.i);
                eost eostVar9 = (eost) eossVar.build();
                eojcVar.copyOnWrite();
                eojd eojdVar = (eojd) eojcVar.instance;
                eostVar9.getClass();
                eojdVar.c = eostVar9;
                eojdVar.b |= 1;
                eota eotaVar = (eota) eotb.a.createBuilder();
                boolean g3 = almwVar.s.g();
                eotaVar.copyOnWrite();
                eotb eotbVar = (eotb) eotaVar.instance;
                eotbVar.b |= 1;
                eotbVar.c = g3;
                boolean i6 = almwVar.s.i();
                eotaVar.copyOnWrite();
                eotb eotbVar2 = (eotb) eotaVar.instance;
                eotbVar2.b |= 2;
                eotbVar2.d = i6;
                boolean l = almwVar.s.l();
                eotaVar.copyOnWrite();
                eotb eotbVar3 = (eotb) eotaVar.instance;
                eotbVar3.b |= 4;
                eotbVar3.e = l;
                eotb eotbVar4 = (eotb) eotaVar.build();
                eojcVar.copyOnWrite();
                eojd eojdVar2 = (eojd) eojcVar.instance;
                eotbVar4.getClass();
                eojdVar2.d = eotbVar4;
                eojdVar2.b |= 2;
                eoud eoudVar = (eoud) eoue.a.createBuilder();
                boolean e3 = cufg.a() ? ((culw) almwVar.ad.b()).e() : almwVar.s.p();
                elfl elflVar = h2;
                eoudVar.copyOnWrite();
                eoue eoueVar = (eoue) eoudVar.instance;
                eoueVar.b |= 1;
                eoueVar.c = e3;
                eoue eoueVar2 = (eoue) eoudVar.build();
                eojcVar.copyOnWrite();
                eojd eojdVar3 = (eojd) eojcVar.instance;
                eoueVar2.getClass();
                eojdVar3.e = eoueVar2;
                eojdVar3.b |= 4;
                eolr eolrVar = (eolr) erqt.q(elflVar);
                eojcVar.copyOnWrite();
                eojd eojdVar4 = (eojd) eojcVar.instance;
                eolrVar.getClass();
                eojdVar4.g = eolrVar;
                eojdVar4.b |= 32;
                return eojcVar;
            }
        }, this.ag));
        final eoqt eoqtVar = (eoqt) eoqv.a.createBuilder();
        int o = this.n.o("bugle_rcs_not_delivered_channel") - 1;
        int i2 = o != 0 ? o != 1 ? 4 : 3 : 2;
        eoqtVar.copyOnWrite();
        eoqv eoqvVar = (eoqv) eoqtVar.instance;
        eoqvVar.d = i2 - 1;
        eoqvVar.b |= 1;
        if (ddjr.b()) {
            this.ah.isPresent();
            final eoqp eoqpVar = (eoqp) eoqs.a.createBuilder();
            eoqpVar.copyOnWrite();
            eoqs eoqsVar = (eoqs) eoqpVar.instance;
            eoqsVar.c = 1;
            eoqsVar.b = 1 | eoqsVar.b;
            e2 = ((cnlo) this.ah.get()).b().h(new emwl() { // from class: ally
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cskc cskcVar = almw.a;
                    eoqt eoqtVar2 = eoqt.this;
                    eoqtVar2.a(eoqpVar);
                    return (eoqv) eoqtVar2.build();
                }
            }, this.E);
        } else {
            e2 = elfo.e((eoqv) eoqtVar.build());
        }
        return e2.i(new eroh() { // from class: almo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final eoqv eoqvVar2 = (eoqv) obj;
                cskc cskcVar = almw.a;
                return elfl.this.h(new emwl() { // from class: almp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        eojc eojcVar = (eojc) obj2;
                        cskc cskcVar2 = almw.a;
                        eojcVar.copyOnWrite();
                        eojd eojdVar = (eojd) eojcVar.instance;
                        eojd eojdVar2 = eojd.a;
                        eoqv eoqvVar3 = eoqv.this;
                        eoqvVar3.getClass();
                        eojdVar.f = eoqvVar3;
                        eojdVar.b |= 16;
                        return (eojd) eojcVar.build();
                    }
                }, erpp.a);
            }
        }, this.E);
    }

    public final elfl b(final NetworkStatsManager networkStatsManager) {
        final alti altiVar = new alti();
        final elfl g2 = elfl.g(elfr.j(this.C.a.a(), new emwl() { // from class: alge
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((alfi) obj).g);
            }
        }, erpp.a));
        final elfl g3 = elfl.g(elfr.j(this.C.a.a(), new emwl() { // from class: alga
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((alfi) obj).h);
            }
        }, erpp.a));
        return elfo.m(g2, g3).b(new erog() { // from class: allj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
                long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
                Long l = (Long) erqt.q(g2);
                long j = -1;
                long longValue = (l.longValue() < 0 || uidTxBytes < l.longValue()) ? -1L : uidTxBytes - l.longValue();
                Long l2 = (Long) erqt.q(g3);
                if (l2.longValue() >= 0 && uidRxBytes >= l2.longValue()) {
                    j = uidRxBytes - l2.longValue();
                }
                alti altiVar2 = altiVar;
                almw almwVar = almw.this;
                altiVar2.a = longValue;
                altiVar2.b = j;
                return csvs.a(elfo.a(Arrays.asList(almwVar.C.h(Long.valueOf(uidTxBytes)), almwVar.C.e(Long.valueOf(uidRxBytes)))));
            }
        }, this.D).h(new emwl() { // from class: allp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th;
                NetworkStats querySummary;
                final almw almwVar = almw.this;
                final long epochMilli = almwVar.w.f().toEpochMilli();
                final long j = epochMilli - altk.a;
                final alti altiVar2 = altiVar;
                final NetworkStatsManager networkStatsManager2 = networkStatsManager;
                if (networkStatsManager2 == null) {
                    return altiVar2;
                }
                altiVar2.d = 0L;
                altiVar2.c = 0L;
                try {
                    almwVar.m.o(new ctwa() { // from class: almi
                        @Override // defpackage.ctwa
                        public final boolean a(int i2) {
                            Throwable th2;
                            almw almwVar2 = almw.this;
                            String y = almwVar2.m.h(i2).y(almwVar2.j);
                            long j2 = j;
                            NetworkStatsManager networkStatsManager3 = networkStatsManager2;
                            long j3 = epochMilli;
                            alti altiVar3 = altiVar2;
                            NetworkStats networkStats = null;
                            try {
                                try {
                                    NetworkStats querySummary2 = networkStatsManager3.querySummary(0, y, j2, j3);
                                    if (querySummary2 != null) {
                                        try {
                                            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                                            while (querySummary2.getNextBucket(bucket)) {
                                                altiVar3.d += bucket.getRxBytes();
                                                altiVar3.c += bucket.getTxBytes();
                                            }
                                            cslm.b(querySummary2);
                                            return true;
                                        } catch (RemoteException e2) {
                                            e = e2;
                                            networkStats = querySummary2;
                                            csjb e3 = almw.a.e();
                                            e3.I("failed to query network stats for");
                                            e3.I(y);
                                            e3.s(e);
                                            cslm.b(networkStats);
                                            altiVar3.d = -1L;
                                            altiVar3.c = -1L;
                                            csjb e4 = almw.a.e();
                                            e4.I("failed to query network stats for");
                                            e4.I(y);
                                            e4.r();
                                            return false;
                                        } catch (SecurityException e5) {
                                            e = e5;
                                            networkStats = querySummary2;
                                            csjb e32 = almw.a.e();
                                            e32.I("failed to query network stats for");
                                            e32.I(y);
                                            e32.s(e);
                                            cslm.b(networkStats);
                                            altiVar3.d = -1L;
                                            altiVar3.c = -1L;
                                            csjb e42 = almw.a.e();
                                            e42.I("failed to query network stats for");
                                            e42.I(y);
                                            e42.r();
                                            return false;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            networkStats = querySummary2;
                                            cslm.b(networkStats);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th2 = th4;
                                }
                            } catch (RemoteException e6) {
                                e = e6;
                            } catch (SecurityException e7) {
                                e = e7;
                            }
                            cslm.b(networkStats);
                            altiVar3.d = -1L;
                            altiVar3.c = -1L;
                            csjb e422 = almw.a.e();
                            e422.I("failed to query network stats for");
                            e422.I(y);
                            e422.r();
                            return false;
                        }
                    });
                } catch (SecurityException e2) {
                    altiVar2.d = -1L;
                    altiVar2.c = -1L;
                    almw.a.o("fillTransferredMobileData: READ_PHONE_STATE required", e2);
                }
                altiVar2.f = 0L;
                altiVar2.e = 0L;
                NetworkStats networkStats = null;
                try {
                    try {
                        querySummary = networkStatsManager2.querySummary(1, null, j, epochMilli);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (RemoteException e3) {
                    e = e3;
                } catch (SecurityException e4) {
                    e = e4;
                }
                try {
                } catch (RemoteException e5) {
                    e = e5;
                    networkStats = querySummary;
                    almw.a.r("failed to query network stats: " + e.getLocalizedMessage());
                    cslm.b(networkStats);
                    altiVar2.f = -1L;
                    altiVar2.e = -1L;
                    return altiVar2;
                } catch (SecurityException e6) {
                    e = e6;
                    networkStats = querySummary;
                    almw.a.r("failed to query network stats: " + e.getLocalizedMessage());
                    cslm.b(networkStats);
                    altiVar2.f = -1L;
                    altiVar2.e = -1L;
                    return altiVar2;
                } catch (Throwable th3) {
                    th = th3;
                    networkStats = querySummary;
                    cslm.b(networkStats);
                    throw th;
                }
                if (querySummary == null) {
                    almw.a.r("failed to query network stats for wifi");
                    cslm.b(networkStats);
                    altiVar2.f = -1L;
                    altiVar2.e = -1L;
                    return altiVar2;
                }
                NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                while (querySummary.getNextBucket(bucket)) {
                    altiVar2.f += bucket.getRxBytes();
                    altiVar2.e += bucket.getTxBytes();
                }
                cslm.b(querySummary);
                return altiVar2;
            }
        }, this.D);
    }

    public final eotw c(int i2, int i3, int i4, int i5) {
        Object apply;
        ctwi h2 = this.m.h(i2);
        Optional i6 = h2.i(false);
        eotu eotuVar = (eotu) eotv.a.createBuilder();
        eotuVar.copyOnWrite();
        eotv eotvVar = (eotv) eotuVar.instance;
        eotvVar.b |= 1;
        eotvVar.c = i2 == i3;
        eotuVar.copyOnWrite();
        eotv eotvVar2 = (eotv) eotuVar.instance;
        eotvVar2.b |= 2;
        eotvVar2.d = i2 == i4;
        eotuVar.copyOnWrite();
        eotv eotvVar3 = (eotv) eotuVar.instance;
        eotvVar3.b |= 4;
        eotvVar3.e = i2 == i5;
        int f2 = this.m.f();
        eotuVar.copyOnWrite();
        eotv eotvVar4 = (eotv) eotuVar.instance;
        eotvVar4.b |= 8;
        eotvVar4.f = i2 == f2;
        eotv eotvVar5 = (eotv) eotuVar.build();
        boolean isPresent = i6.isPresent();
        final eots eotsVar = (eots) eotw.a.createBuilder();
        eotsVar.copyOnWrite();
        eotw eotwVar = (eotw) eotsVar.instance;
        eotwVar.b |= 1;
        eotwVar.c = i2;
        eotsVar.copyOnWrite();
        eotw eotwVar2 = (eotw) eotsVar.instance;
        eotwVar2.b |= 2;
        eotwVar2.d = isPresent;
        int i7 = true != isPresent ? 3 : 2;
        eotsVar.copyOnWrite();
        eotw eotwVar3 = (eotw) eotsVar.instance;
        eotwVar3.e = i7 - 1;
        eotwVar3.b |= 4;
        eotsVar.copyOnWrite();
        eotw eotwVar4 = (eotw) eotsVar.instance;
        eotvVar5.getClass();
        eotwVar4.f = eotvVar5;
        eotwVar4.b |= 8;
        eqwf eqwfVar = ((djrv) this.al.b()).d(i2).a;
        eotsVar.copyOnWrite();
        eotw eotwVar5 = (eotw) eotsVar.instance;
        eotwVar5.j = eqwfVar.N;
        eotwVar5.b |= 64;
        if (((Boolean) ((cfup) d.get()).e()).booleanValue()) {
            final String w = h2.w();
            azut a2 = azuy.a();
            a2.z("querySubscriptionsInRecurringMetrics");
            apply = new Function() { // from class: allr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = almw.a;
                    return ((azug) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(azuy.c);
            azuh[] azuhVarArr = {(azuh) apply};
            int intValue = azuy.c().intValue();
            if (((Integer) azuy.b.getOrDefault(azuhVarArr[0].toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
            a2.m(azuhVarArr);
            a2.c(new Function() { // from class: alls
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    azux azuxVar = (azux) obj;
                    cskc cskcVar = almw.a;
                    azuxVar.c(w);
                    return azuxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a2.x(((Integer) f.e()).intValue());
            Map.EL.forEach((HashMap) Collection.EL.stream(a2.b().y()).map(new Function() { // from class: allt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = almw.a;
                    String k = ((aztp) obj).k();
                    if (TextUtils.isEmpty(k)) {
                        return "";
                    }
                    int intValue2 = ((Integer) almw.e.e()).intValue();
                    return k.length() > intValue2 ? k.substring(k.length() - intValue2) : k;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.groupingBy(Function$CC.identity(), new Supplier() { // from class: allu
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new HashMap();
                }
            }, Collectors.counting())), new BiConsumer() { // from class: allv
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Long l = (Long) obj2;
                    cskc cskcVar = almw.a;
                    boolean isEmpty = TextUtils.isEmpty((String) obj);
                    eots eotsVar2 = eots.this;
                    if (isEmpty) {
                        int intValue2 = l.intValue();
                        eotsVar2.copyOnWrite();
                        eotw eotwVar6 = (eotw) eotsVar2.instance;
                        eotw eotwVar7 = eotw.a;
                        eotwVar6.b |= 16;
                        eotwVar6.g = intValue2;
                        return;
                    }
                    int intValue3 = l.intValue();
                    eotsVar2.copyOnWrite();
                    eotw eotwVar8 = (eotw) eotsVar2.instance;
                    eotw eotwVar9 = eotw.a;
                    eygi eygiVar = eotwVar8.h;
                    if (!eygiVar.c()) {
                        eotwVar8.h = eyfy.mutableCopy(eygiVar);
                    }
                    eotwVar8.h.h(intValue3);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
        }
        return (eotw) eotsVar.build();
    }

    public final String e() {
        return this.t.q() != null ? this.t.q() : "NOT_AVAILABLE";
    }

    public final void f(eoup eoupVar) {
        axmm axmmVar = (axmm) this.ak.b();
        axez c2 = ((axkm) this.aj.b()).c();
        int i2 = 1;
        if (!axmmVar.b.a() || !axmmVar.c.a()) {
            axmi b2 = axmi.b(c2.f);
            if (b2 == null) {
                b2 = axmi.INITIAL_SYNC_STATUS_NOT_SET;
            }
            switch (b2) {
                case INITIAL_SYNC_STATUS_NOT_SET:
                    i2 = 2;
                    break;
                case RESTORE:
                case RESTORE_KEYS:
                    i2 = 3;
                    break;
                case BACKUP:
                    i2 = 4;
                    break;
                case FAILED:
                case INITIAL_BACKUP_NEEDS_RETRY:
                case RESTORE_MESSAGES_COMPLETE:
                case STARTED:
                    break;
                case COMPLETE:
                    i2 = 5;
                    break;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(b2))));
            }
        }
        eoupVar.copyOnWrite();
        eovl eovlVar = (eovl) eoupVar.instance;
        eovl eovlVar2 = eovl.a;
        eovlVar.ao = i2 - 1;
        eovlVar.d |= 64;
    }

    public final void g(eoup eoupVar) {
        List o = this.k.o();
        boolean z = false;
        if (o != null && !o.isEmpty()) {
            z = true;
        }
        boolean ak = ((axkm) this.aj.b()).ak();
        if (z) {
            eoupVar.copyOnWrite();
            eovl eovlVar = (eovl) eoupVar.instance;
            eovl eovlVar2 = eovl.a;
            eovlVar.an = 2;
            eovlVar.d |= 32;
            return;
        }
        if (ak) {
            eoupVar.copyOnWrite();
            eovl eovlVar3 = (eovl) eoupVar.instance;
            eovl eovlVar4 = eovl.a;
            eovlVar3.an = 3;
            eovlVar3.d |= 32;
            return;
        }
        eoupVar.copyOnWrite();
        eovl eovlVar5 = (eovl) eoupVar.instance;
        eovl eovlVar6 = eovl.a;
        eovlVar5.an = 1;
        eovlVar5.d |= 32;
    }

    public final void h(enhk enhkVar, String str) {
        enqu listIterator = enhkVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            this.p.h(str, ((Boolean) entry.getValue()).booleanValue() ? 1L : 0L, (String) entry.getKey());
        }
    }

    public final void i(Calendar calendar) {
        cskc cskcVar = a;
        if (cskcVar.t(3)) {
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
            csjb a2 = cskcVar.a();
            a2.I("Scheduling analytics uploader for");
            a2.I(dateTimeInstance.format(calendar.getTime()));
            a2.r();
        }
        AlarmManager alarmManager = (AlarmManager) this.j.getSystemService("alarm");
        if (alarmManager == null) {
            cskcVar.r("Cannot schedule telemetry. AlarmManager is null");
            return;
        }
        Context context = this.j;
        akuv c2 = akuv.c(context, AnalyticsAlarmReceiver.class, "android.intent.action.VIEW");
        c2.f(context.getPackageName());
        PendingIntent d2 = eepf.d(this.j, 0, c2.a(), ctie.a(0));
        if (d2 == null) {
            cskcVar.r("Cannot schedule telemetry. Pending intent is null");
        } else {
            alarmManager.setInexactRepeating(0, calendar.getTimeInMillis(), 86400000L, d2);
        }
    }

    public final void j() {
        if (this.o.am()) {
            Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            Random random = new Random();
            long e2 = this.u.e("first_analytics_upload_time_in_millis", -1L);
            if (e2 == -1) {
                calendar.set(11, 11);
                calendar.add(10, random.nextInt(5));
                calendar.set(12, random.nextInt(60));
                calendar.set(13, random.nextInt(60));
                this.u.k("first_analytics_upload_time_in_millis", calendar.getTimeInMillis());
            } else {
                Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar2.setTimeInMillis(e2);
                calendar.set(10, calendar2.get(10));
                calendar.set(12, calendar2.get(12));
                calendar.set(13, calendar2.get(13));
            }
            calendar.set(5, Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).get(5));
            calendar.add(5, 1);
            i(calendar);
        }
    }

    public final void k(final cniz cnizVar) {
        elfl h2 = elfl.g(elfr.j(this.C.a.a(), new emwl() { // from class: alfy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((alfi) obj).i);
            }
        }, erpp.a)).h(new emwl() { // from class: almc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                long longValue = l.longValue();
                Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar.setTimeInMillis(longValue);
                Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                int i2 = calendar.get(0);
                int i3 = calendar2.get(0);
                almw almwVar = almw.this;
                if (i2 != i3 || calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                    ((batn) almwVar.H.b()).a().r(cnizVar);
                    almw.a.m("Recurring telemetry upload launched.");
                    return null;
                }
                long longValue2 = (l.longValue() + almw.i) - almwVar.w.f().toEpochMilli();
                csjb d2 = almw.a.d();
                d2.I("Recurring telemetry won't run; already updated today, scheduled in");
                d2.H(longValue2);
                d2.I("ms");
                d2.r();
                return null;
            }
        }, erpp.a);
        cnizVar.q("RecurringTelemetryUploader", h2);
        csvs.c(h2, "BugleUsageStatistics", "Failed to log recurring telemetry");
    }

    public final int l() {
        this.ai.isPresent();
        return ((ctif) this.ai.get()).b() ? 2 : 3;
    }

    public final int m() {
        return this.af.g() ? 4 : 3;
    }

    public final int n() {
        return ctid.h(this.j) ? 3 : 2;
    }
}
