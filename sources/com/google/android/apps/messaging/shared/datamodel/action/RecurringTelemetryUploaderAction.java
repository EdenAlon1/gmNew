package com.google.android.apps.messaging.shared.datamodel.action;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.usage.NetworkStatsManager;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akzt;
import defpackage.almw;
import defpackage.alns;
import defpackage.batm;
import defpackage.batn;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.cort;
import defpackage.cpvq;
import defpackage.cpwl;
import defpackage.cskc;
import defpackage.cszl;
import defpackage.cvjg;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emwl;
import defpackage.enin;
import defpackage.eogt;
import defpackage.eovb;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.errl;
import defpackage.ffbr;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RecurringTelemetryUploaderAction extends Action<Void> implements Parcelable {
    public final Context e;
    public final almw f;
    public final akzt g;
    public final cpwl h;
    public final cpvq i;
    public final ffbr j;
    private final alns k;
    private final errl l;
    private final errl m;
    public static final cskc a = cskc.g("BugleUsageStatistics", "RecurringTelemetryUploaderAction");
    public static final cfva b = cfvl.i(cfvl.b, "recurring_telemetry_uploader_run_wipeout_detector", true);
    public static final cfva c = cfvl.i(cfvl.b, "reverse_sync_after_wipeout_in_telemetry_action", false);
    public static final long d = TimeUnit.MINUTES.toMillis(1);
    public static final Parcelable.Creator<Action<Void>> CREATOR = new batm();

    /* compiled from: PG */
    public interface a {
        batn ik();
    }

    public RecurringTelemetryUploaderAction(Context context, almw almwVar, akzt akztVar, alns alnsVar, cpwl cpwlVar, cpvq cpvqVar, errl errlVar, errl errlVar2, ffbr ffbrVar) {
        super(eogt.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = almwVar;
        this.g = akztVar;
        this.k = alnsVar;
        this.l = errlVar;
        this.m = errlVar2;
        this.h = cpwlVar;
        this.i = cpvqVar;
        this.j = ffbrVar;
        this.t.r("retry_count", 0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("RecurringTelemetryUploaderAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        w();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.RecurringTelemetryUpload.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl fS() {
        final elfl i;
        final elfl elflVar;
        final int a2 = this.t.a("retry_count");
        final elfl g = elfo.g(new Callable() { // from class: batj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(((Long) RecurringTelemetryUploaderAction.this.j.b()).intValue());
            }
        }, this.l);
        final elfl g2 = elfo.g(new Callable() { // from class: batk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(RecurringTelemetryUploaderAction.d);
            }
        }, this.l);
        final alns alnsVar = this.k;
        final almw almwVar = alnsVar.a;
        final long epochMilli = almwVar.w.f().toEpochMilli();
        final elfl i2 = elfl.g(almwVar.C.d()).h(new emwl() { // from class: allq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() < almw.g);
            }
        }, erpp.a).i(new eroh() { // from class: allo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return elfo.e(eouv.ENGAGEMENT_LEVEL_ACTIVE);
                }
                final long j = epochMilli;
                return elfr.k(elfr.j(almw.this.C.a.a(), new emwl() { // from class: alfp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return Long.valueOf(((alfi) obj2).c);
                    }
                }, erpp.a), new eroh() { // from class: almq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return j - ((Long) obj2).longValue() < almw.h ? elfo.e(eouv.ENGAGEMENT_LEVEL_PASSIVE) : elfo.e(eouv.ENGAGEMENT_LEVEL_INACTIVE);
                    }
                }, erpp.a);
            }
        }, almwVar.D);
        final elfl g3 = elfo.g(new Callable() { // from class: alnk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((ckge) alns.this.c.a()).x();
            }
        }, alnsVar.e);
        final enin eninVar = new enin();
        final elfl h = ((cort) alnsVar.j.b()).c().h(new emwl() { // from class: alnj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Iterator it = ((Set) obj).iterator();
                while (true) {
                    enin eninVar2 = eninVar;
                    if (!it.hasNext()) {
                        return eninVar2.g();
                    }
                    alns alnsVar2 = alns.this;
                    djrm djrmVar = (djrm) it.next();
                    eqpc b2 = ((dijt) alnsVar2.k.b()).b(djrmVar);
                    eqwf w = ((ckge) alnsVar2.c.a()).w(djrmVar);
                    eqwn eqwnVar = (eqwn) eqwo.a.createBuilder();
                    eqwnVar.copyOnWrite();
                    eqwo eqwoVar = (eqwo) eqwnVar.instance;
                    eqwoVar.c = w.N;
                    eqwoVar.b |= 1;
                    eqwnVar.copyOnWrite();
                    eqwo eqwoVar2 = (eqwo) eqwnVar.instance;
                    b2.getClass();
                    eqwoVar2.d = b2;
                    eqwoVar2.b |= 2;
                    eninVar2.c((eqwo) eqwnVar.build());
                }
            }
        }, alnsVar.e);
        final elfl h2 = g3.h(new emwl() { // from class: alnp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((ckge) alns.this.c.a()).c();
            }
        }, alnsVar.d);
        final elfl a3 = alnsVar.a(new Callable() { // from class: alnq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(alns.this.b.a(altk.a));
            }
        });
        final elfl a4 = alnsVar.a(new Callable() { // from class: alnr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(alns.this.b.a(altk.c));
            }
        });
        final elfl a5 = alnsVar.a(new Callable() { // from class: alnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(alns.this.b.c(altk.a));
            }
        });
        final elfl a6 = alnsVar.a(new Callable() { // from class: alne
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(alns.this.b.c(altk.c));
            }
        });
        final elfl a7 = alnsVar.a(new Callable() { // from class: alnf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(alns.this.b.b(altk.a));
            }
        });
        final elfl a8 = alnsVar.a(new Callable() { // from class: alng
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(alns.this.b.b(altk.c));
            }
        });
        if (((cvjg) alnsVar.i.b()).a()) {
            elflVar = elfo.e(0);
            i = elfo.e(eovb.UNKNOWN_HAPPINESS_TRACKING_MODE);
        } else {
            cszl cszlVar = (cszl) alnsVar.f.b();
            elfl a9 = cszlVar.a();
            i = cszlVar.c().i(new eroh() { // from class: alnh
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return elfo.e(eovb.HAPPINESS_TRACKING_MODE_HIDDEN);
                    }
                    alns alnsVar2 = alns.this;
                    return ((cszs) alnsVar2.g.b()).a().h(new emwl() { // from class: alnc
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return ((cszb) obj2).c();
                        }
                    }, alnsVar2.h);
                }
            }, alnsVar.h);
            elflVar = a9;
        }
        final elfl a10 = alnsVar.a(new Callable() { // from class: alni
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return alns.this.b.d(altk.a);
            }
        });
        final elfl a11 = alnsVar.a(new Callable() { // from class: alnl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return alns.this.b.d(altk.b);
            }
        });
        final elfl a12 = alnsVar.a(new Callable() { // from class: alnm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return alns.this.b.d(altk.c);
            }
        });
        final elfl a13 = alnsVar.a(new Callable() { // from class: alnn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                buxo d2 = MessagesTable.d();
                d2.z("SharedRecurringMetrics#create");
                d2.r();
                return Integer.valueOf(d2.b().i());
            }
        });
        final elfl a14 = elfo.m(g3, h2, a3, a4, a5, a6, a7, a8, i, elflVar, a10, a11, a12, a13, h).a(new Callable() { // from class: alno
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new alkz(elfl.this, (eqwf) erqt.q(g3), (eosr) erqt.q(h2), ((Integer) erqt.q(a3)).intValue(), ((Integer) erqt.q(a4)).intValue(), ((Integer) erqt.q(a5)).intValue(), ((Integer) erqt.q(a6)).intValue(), ((Integer) erqt.q(a7)).intValue(), ((Integer) erqt.q(a8)).intValue(), (eovb) erqt.q(i), ((Integer) erqt.q(elflVar)).intValue(), (enhk) erqt.q(a10), (enhk) erqt.q(a11), (enhk) erqt.q(a12), ((Integer) erqt.q(a13)).intValue(), (enip) erqt.q(h));
            }
        }, alnsVar.h);
        return elfo.m(g, g2, a14).a(new Callable() { // from class: batl
            /* JADX WARN: Type inference failed for: r0v185, types: [comc, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v239, types: [ffbr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [ffbr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v30, types: [ffbr, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v18, types: [comc, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int length;
                List pinnedShortcuts;
                elfl e;
                elfl e2;
                elfl e3;
                elfl f;
                List notificationChannels;
                int i3;
                int importance;
                Uri sound;
                String str;
                boolean shouldVibrate;
                int lockscreenVisibility;
                boolean canShowBadge;
                boolean canBypassDnd;
                Uri sound2;
                List notificationChannels2;
                NotificationManager notificationManager;
                int bubblePreference;
                int intValue = ((Integer) erqt.q(g)).intValue();
                long longValue = ((Long) erqt.q(g2)).longValue();
                final alnt alntVar = (alnt) erqt.q(a14);
                int i4 = a2;
                RecurringTelemetryUploaderAction recurringTelemetryUploaderAction = RecurringTelemetryUploaderAction.this;
                boolean z = true;
                if (i4 == intValue || !(alntVar == null || alntVar.p() == eqwf.BUGLE_LOADING_AVAILABILITY_EXCEPTION)) {
                    final almw almwVar2 = recurringTelemetryUploaderAction.f;
                    NetworkStatsManager networkStatsManager = (NetworkStatsManager) recurringTelemetryUploaderAction.e.getSystemService(NetworkStatsManager.class);
                    efbd.b();
                    int a15 = almwVar2.A.a();
                    csjb d2 = almw.a.d();
                    d2.I("Message status rows deleted");
                    d2.G(a15);
                    d2.r();
                    int a16 = almwVar2.B.a();
                    csjb d3 = almw.a.d();
                    d3.I("App event rows deleted");
                    d3.G(a16);
                    d3.r();
                    if (almwVar2.o.am()) {
                        efbd.b();
                        ctvb ctvbVar = almwVar2.t;
                        ctwb ctwbVar = almwVar2.m;
                        Optional optional = almwVar2.x;
                        boolean G = ctvbVar.G();
                        int e4 = ctwbVar.e();
                        if (optional.isPresent()) {
                            length = 0;
                        } else {
                            Context context = almwVar2.j;
                            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                            length = appWidgetManager.getAppWidgetIds(new ComponentName(context, "com.google.android.apps.messaging.widget.WidgetConversationProvider")).length + appWidgetManager.getAppWidgetIds(new ComponentName(almwVar2.j, "com.google.android.apps.messaging.widget.BugleWidgetProvider")).length;
                        }
                        pinnedShortcuts = kox$$ExternalSyntheticApiModelOutline0.m471m(almwVar2.j.getSystemService(kox$$ExternalSyntheticApiModelOutline0.m())).getPinnedShortcuts();
                        int size = pinnedShortcuts.size();
                        ctwb ctwbVar2 = almwVar2.m;
                        int d4 = ctwbVar2.d();
                        int c2 = ctwbVar2.c();
                        int b2 = ctwbVar2.b();
                        ArrayList arrayList = new ArrayList();
                        if (almwVar2.v.l()) {
                            Iterator it = almwVar2.m.m().iterator();
                            while (it.hasNext()) {
                                arrayList.add(almwVar2.c(((ctwi) it.next()).a(), d4, c2, b2));
                                z = z;
                            }
                        }
                        boolean z2 = z;
                        ctyx ctyxVar = almwVar2.u;
                        Context context2 = almwVar2.j;
                        long e5 = ctyxVar.e("total_millis_spent", 0L);
                        boolean j = crnx.j(context2);
                        final elfl b3 = almwVar2.b(networkStatsManager);
                        final eoup eoupVar = (eoup) eovl.a.createBuilder();
                        eoupVar.copyOnWrite();
                        eovl eovlVar = (eovl) eoupVar.instance;
                        eovlVar.b |= 1;
                        eovlVar.e = G;
                        int i5 = z2 != G ? 3 : 2;
                        eoupVar.copyOnWrite();
                        eovl eovlVar2 = (eovl) eoupVar.instance;
                        eovlVar2.r = i5 - 1;
                        eovlVar2.b |= 131072;
                        eoul eoulVar = (eoul) eoum.a.createBuilder();
                        eoulVar.copyOnWrite();
                        eoum eoumVar = (eoum) eoulVar.instance;
                        eoumVar.b |= 2;
                        eoumVar.d = e5;
                        eoum eoumVar2 = (eoum) eoulVar.build();
                        eoupVar.copyOnWrite();
                        eovl eovlVar3 = (eovl) eoupVar.instance;
                        eoumVar2.getClass();
                        eovlVar3.f = eoumVar2;
                        eovlVar3.b |= 2;
                        eoupVar.copyOnWrite();
                        eovl eovlVar4 = (eovl) eoupVar.instance;
                        eovlVar4.b |= 16;
                        eovlVar4.h = e4;
                        eoupVar.copyOnWrite();
                        eovl eovlVar5 = (eovl) eoupVar.instance;
                        eygr eygrVar = eovlVar5.i;
                        if (!eygrVar.c()) {
                            eovlVar5.i = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(arrayList, eovlVar5.i);
                        almwVar2.R.isPresent();
                        boolean b4 = ((cviz) almwVar2.R.get().b()).b();
                        eoupVar.copyOnWrite();
                        eovl eovlVar6 = (eovl) eoupVar.instance;
                        eovlVar6.b |= 64;
                        eovlVar6.j = b4;
                        almwVar2.S.isPresent();
                        boolean b5 = ((cvhr) almwVar2.S.get().b()).b();
                        eoupVar.copyOnWrite();
                        eovl eovlVar7 = (eovl) eoupVar.instance;
                        eovlVar7.d |= 1024;
                        eovlVar7.as = b5;
                        eoupVar.copyOnWrite();
                        eovl eovlVar8 = (eovl) eoupVar.instance;
                        eovlVar8.b |= 128;
                        eovlVar8.k = length;
                        eoupVar.copyOnWrite();
                        eovl eovlVar9 = (eovl) eoupVar.instance;
                        eovlVar9.b |= 512;
                        eovlVar9.l = j;
                        int i6 = 1 != (almwVar2.j.getApplicationInfo().flags & 1) ? 3 : 2;
                        eoupVar.copyOnWrite();
                        eovl eovlVar10 = (eovl) eoupVar.instance;
                        eovlVar10.m = i6 - 1;
                        eovlVar10.b |= 4096;
                        int n = almwVar2.n();
                        eoupVar.copyOnWrite();
                        eovl eovlVar11 = (eovl) eoupVar.instance;
                        eovlVar11.n = n - 1;
                        eovlVar11.b |= 8192;
                        int a17 = alntVar.a();
                        eoupVar.copyOnWrite();
                        eovl eovlVar12 = (eovl) eoupVar.instance;
                        eovlVar12.b |= 262144;
                        eovlVar12.s = a17;
                        int b6 = alntVar.b();
                        eoupVar.copyOnWrite();
                        eovl eovlVar13 = (eovl) eoupVar.instance;
                        eovlVar13.b |= 524288;
                        eovlVar13.t = b6;
                        int g4 = alntVar.g();
                        eoupVar.copyOnWrite();
                        eovl eovlVar14 = (eovl) eoupVar.instance;
                        eovlVar14.b |= 1048576;
                        eovlVar14.u = g4;
                        int h3 = alntVar.h();
                        eoupVar.copyOnWrite();
                        eovl eovlVar15 = (eovl) eoupVar.instance;
                        eovlVar15.b |= 2097152;
                        eovlVar15.v = h3;
                        eoupVar.copyOnWrite();
                        eovl eovlVar16 = (eovl) eoupVar.instance;
                        eovlVar16.b |= 65536;
                        eovlVar16.q = size;
                        int s = almwVar2.s.s();
                        eoupVar.copyOnWrite();
                        eovl eovlVar17 = (eovl) eoupVar.instance;
                        eovlVar17.y = s - 1;
                        eovlVar17.b |= 16777216;
                        int a18 = eouz.a(almwVar2.s.a.d("fast_track_onboarding_progress", 0));
                        if (a18 == 0) {
                            a18 = 1;
                        }
                        eoupVar.copyOnWrite();
                        eovl eovlVar18 = (eovl) eoupVar.instance;
                        eovlVar18.S = a18 - 1;
                        eovlVar18.c |= 8192;
                        eovw eovwVar = csjc.a;
                        eoupVar.copyOnWrite();
                        eovl eovlVar19 = (eovl) eoupVar.instance;
                        eovlVar19.ae = eovwVar.x;
                        eovlVar19.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                        int i7 = almwVar2.j.getResources().getDisplayMetrics().densityDpi;
                        eoupVar.copyOnWrite();
                        eovl eovlVar20 = (eovl) eoupVar.instance;
                        eovlVar20.c |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                        eovlVar20.af = i7;
                        eowr eowrVar = (eowr) eowt.a.createBuilder();
                        int d5 = almwVar2.o.d();
                        eowrVar.copyOnWrite();
                        eowt eowtVar = (eowt) eowrVar.instance;
                        eowtVar.b |= 1;
                        eowtVar.c = d5;
                        int at = almwVar2.o.at();
                        eowrVar.copyOnWrite();
                        eowt eowtVar2 = (eowt) eowrVar.instance;
                        eowtVar2.d = at - 1;
                        eowtVar2.b |= 2;
                        eowt eowtVar3 = (eowt) eowrVar.build();
                        eoupVar.copyOnWrite();
                        eovl eovlVar21 = (eovl) eoupVar.instance;
                        eowtVar3.getClass();
                        eovlVar21.z = eowtVar3;
                        eovlVar21.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                        int u = ((ckge) almwVar2.l.a()).u();
                        eoupVar.copyOnWrite();
                        eovl eovlVar22 = (eovl) eoupVar.instance;
                        eovlVar22.A = u - 1;
                        eovlVar22.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                        int l = almwVar2.l();
                        eoupVar.copyOnWrite();
                        eovl eovlVar23 = (eovl) eoupVar.instance;
                        eovlVar23.E = l - 1;
                        eovlVar23.b |= 1073741824;
                        int c3 = alntVar.c();
                        eoupVar.copyOnWrite();
                        eovl eovlVar24 = (eovl) eoupVar.instance;
                        eovlVar24.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                        eovlVar24.C = c3;
                        int d6 = alntVar.d();
                        eoupVar.copyOnWrite();
                        eovl eovlVar25 = (eovl) eoupVar.instance;
                        eovlVar25.b |= 536870912;
                        eovlVar25.D = d6;
                        String e6 = almwVar2.e();
                        eoupVar.copyOnWrite();
                        eovl eovlVar26 = (eovl) eoupVar.instance;
                        e6.getClass();
                        eovlVar26.b |= Integer.MIN_VALUE;
                        eovlVar26.F = e6;
                        eovb o = alntVar.o();
                        eoupVar.copyOnWrite();
                        eovl eovlVar27 = (eovl) eoupVar.instance;
                        eovlVar27.M = o.h;
                        eovlVar27.c |= 64;
                        int e7 = alntVar.e();
                        eoupVar.copyOnWrite();
                        eovl eovlVar28 = (eovl) eoupVar.instance;
                        eovlVar28.c |= 128;
                        eovlVar28.N = e7;
                        eoux i8 = almwVar2.o.i("last_video_call_button_click_time_millis");
                        eoupVar.copyOnWrite();
                        eovl eovlVar29 = (eovl) eoupVar.instance;
                        eovlVar29.O = i8.f;
                        eovlVar29.c |= 256;
                        eoux i9 = almwVar2.o.i("last_rbm_active_event_time_millis");
                        eoupVar.copyOnWrite();
                        eovl eovlVar30 = (eovl) eoupVar.instance;
                        eovlVar30.P = i9.f;
                        eovlVar30.c |= 512;
                        eoux i10 = almwVar2.o.i("last_rbm_interactive_event_time_millis");
                        eoupVar.copyOnWrite();
                        eovl eovlVar31 = (eovl) eoupVar.instance;
                        eovlVar31.Q = i10.f;
                        eovlVar31.c |= 1024;
                        int t = almwVar2.s.t();
                        eoupVar.copyOnWrite();
                        eovl eovlVar32 = (eovl) eoupVar.instance;
                        eovlVar32.V = t - 1;
                        eovlVar32.c |= 65536;
                        eoupVar.copyOnWrite();
                        eovl eovlVar33 = (eovl) eoupVar.instance;
                        eovlVar33.T = 3;
                        eovlVar33.c |= 16384;
                        int m = almwVar2.m();
                        eoupVar.copyOnWrite();
                        eovl eovlVar34 = (eovl) eoupVar.instance;
                        eovlVar34.R = m - 1;
                        eovlVar34.c |= 4096;
                        eosa eosaVar = (eosa) eosc.a.createBuilder();
                        String m2 = almwVar2.F.m();
                        if (!TextUtils.isEmpty(m2)) {
                            eosaVar.copyOnWrite();
                            eosc eoscVar = (eosc) eosaVar.instance;
                            m2.getClass();
                            eoscVar.b |= 1;
                            eoscVar.c = m2;
                        }
                        String i11 = almwVar2.F.i();
                        if (!TextUtils.isEmpty(i11)) {
                            eosaVar.copyOnWrite();
                            eosc eoscVar2 = (eosc) eosaVar.instance;
                            i11.getClass();
                            eoscVar2.b |= 2;
                            eoscVar2.d = i11;
                        }
                        boolean t2 = almwVar2.F.t();
                        eosaVar.copyOnWrite();
                        eosc eoscVar3 = (eosc) eosaVar.instance;
                        eoscVar3.b |= 4;
                        eoscVar3.e = t2;
                        int i12 = true != dimn.E().K() ? 2 : 3;
                        eosaVar.copyOnWrite();
                        eosc eoscVar4 = (eosc) eosaVar.instance;
                        eoscVar4.f = i12 - 1;
                        eoscVar4.b |= 8;
                        eosc eoscVar5 = (eosc) eosaVar.build();
                        eoupVar.copyOnWrite();
                        eovl eovlVar35 = (eovl) eoupVar.instance;
                        eoscVar5.getClass();
                        eovlVar35.U = eoscVar5;
                        eovlVar35.c |= 32768;
                        int a19 = eovk.a(almwVar2.u.d("rcs_tos_state", 0));
                        eoupVar.copyOnWrite();
                        eovl eovlVar36 = (eovl) eoupVar.instance;
                        int i13 = a19 - 1;
                        if (a19 == 0) {
                            throw null;
                        }
                        eovlVar36.W = i13;
                        eovlVar36.c |= 262144;
                        boolean i14 = dkuy.i(almwVar2.j);
                        eoupVar.copyOnWrite();
                        eovl eovlVar37 = (eovl) eoupVar.instance;
                        eovlVar37.c |= 536870912;
                        eovlVar37.ah = i14;
                        boolean z3 = !dkvw.c(almwVar2.j);
                        eoupVar.copyOnWrite();
                        eovl eovlVar38 = (eovl) eoupVar.instance;
                        eovlVar38.c |= 1073741824;
                        eovlVar38.ai = z3;
                        if (((Boolean) almw.c.e()).booleanValue()) {
                            int o2 = almw.o(alntVar.f());
                            eoupVar.copyOnWrite();
                            eovl eovlVar39 = (eovl) eoupVar.instance;
                            eovlVar39.al = o2 - 1;
                            eovlVar39.d |= 2;
                        }
                        if (((Boolean) almw.b.e()).booleanValue()) {
                            eoyq d7 = almw.d();
                            eoupVar.copyOnWrite();
                            eovl eovlVar40 = (eovl) eoupVar.instance;
                            d7.getClass();
                            eovlVar40.aj = d7;
                            eovlVar40.c |= Integer.MIN_VALUE;
                        }
                        try {
                            almwVar2.f(eoupVar);
                            almwVar2.g(eoupVar);
                            almwVar2.ae.f().ifPresent(new Consumer() { // from class: almr
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    long longValue2 = ((Long) obj).longValue();
                                    eoup eoupVar2 = eoup.this;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar41 = (eovl) eoupVar2.instance;
                                    eovl eovlVar42 = eovl.a;
                                    eovlVar41.c |= 524288;
                                    eovlVar41.X = longValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            almwVar2.ae.e().ifPresent(new Consumer() { // from class: alms
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    long longValue2 = ((Long) obj).longValue();
                                    eoup eoupVar2 = eoup.this;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar41 = (eovl) eoupVar2.instance;
                                    eovl eovlVar42 = eovl.a;
                                    eovlVar41.c |= 1048576;
                                    eovlVar41.Y = longValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            almwVar2.ae.c().ifPresent(new Consumer() { // from class: almt
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    long longValue2 = ((Long) obj).longValue();
                                    eoup eoupVar2 = eoup.this;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar41 = (eovl) eoupVar2.instance;
                                    eovl eovlVar42 = eovl.a;
                                    eovlVar41.c |= 2097152;
                                    eovlVar41.Z = longValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            almwVar2.ae.b().ifPresent(new Consumer() { // from class: almu
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    long longValue2 = ((Long) obj).longValue();
                                    eoup eoupVar2 = eoup.this;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar41 = (eovl) eoupVar2.instance;
                                    eovl eovlVar42 = eovl.a;
                                    eovlVar41.c |= 4194304;
                                    eovlVar41.aa = longValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            almwVar2.ae.d().ifPresent(new Consumer() { // from class: almv
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    long longValue2 = ((Long) obj).longValue();
                                    eoup eoupVar2 = eoup.this;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar41 = (eovl) eoupVar2.instance;
                                    eovl eovlVar42 = eovl.a;
                                    eovlVar41.c |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                                    eovlVar41.ab = longValue2;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            almwVar2.ae.a().ifPresent(new Consumer() { // from class: allk
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    eoup eoupVar2 = eoup.this;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar41 = (eovl) eoupVar2.instance;
                                    eovl eovlVar42 = eovl.a;
                                    eovlVar41.ac = ((epgt) obj).t;
                                    eovlVar41.c |= 16777216;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            long a20 = almwVar2.y.a();
                            eoupVar.copyOnWrite();
                            eovl eovlVar41 = (eovl) eoupVar.instance;
                            eovlVar41.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                            eovlVar41.ad = a20;
                            final elfl i15 = alntVar.i();
                            final elfl g5 = elfl.g(almwVar2.C.c());
                            final elfl g6 = elfl.g(almwVar2.o.j());
                            final elfl h4 = elfl.g(almwVar2.C.d()).h(new emwl() { // from class: alll
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    Long l2 = (Long) obj;
                                    if (l2 == null) {
                                        return eoux.UNKNOWN_EVENT_AGE;
                                    }
                                    almw almwVar3 = almw.this;
                                    return almwVar3.o.h(l2.longValue());
                                }
                            }, erpp.a);
                            algm algmVar = almwVar2.C;
                            ffbr ffbrVar = almwVar2.ac;
                            final elfl b7 = algmVar.b();
                            boolean a21 = chru.a();
                            final Boolean valueOf = Boolean.valueOf(a21);
                            valueOf.getClass();
                            if (a21) {
                                bzqf bzqfVar = almwVar2.G;
                                String s2 = almwVar2.z.s();
                                if (TextUtils.isEmpty(s2)) {
                                    e = elfo.e(epaf.a);
                                } else {
                                    final elfl d8 = bzqfVar.a.d(s2);
                                    final elfl h5 = bzqfVar.b.a(s2).b.h().h(new emwl() { // from class: chps
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            chod chodVar = (chod) obj;
                                            choc b8 = choc.b(chodVar.i);
                                            if (b8 == null) {
                                                b8 = choc.UNRECOGNIZED;
                                            }
                                            epae l2 = chpy.l(b8);
                                            chob b9 = chob.b(chodVar.j);
                                            if (b9 == null) {
                                                b9 = chob.UNRECOGNIZED;
                                            }
                                            return Pair.create(l2, chpy.k(b9));
                                        }
                                    }, erpp.a);
                                    e = elfo.m(d8, h5).a(new Callable() { // from class: bzqe
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            Pair pair = (Pair) erqt.q(ListenableFuture.this);
                                            eozy eozyVar = (eozy) epaf.a.createBuilder();
                                            epaa epaaVar = (epaa) erqt.q(d8);
                                            eozyVar.copyOnWrite();
                                            epaf epafVar = (epaf) eozyVar.instance;
                                            epafVar.c = epaaVar.f;
                                            epafVar.b |= 1;
                                            epae epaeVar = (epae) pair.first;
                                            eozyVar.copyOnWrite();
                                            epaf epafVar2 = (epaf) eozyVar.instance;
                                            epafVar2.e = epaeVar.e;
                                            epafVar2.b |= 4;
                                            epac epacVar = (epac) pair.second;
                                            eozyVar.copyOnWrite();
                                            epaf epafVar3 = (epaf) eozyVar.instance;
                                            epafVar3.d = epacVar.d;
                                            epafVar3.b |= 2;
                                            return (epaf) eozyVar.build();
                                        }
                                    }, bzqfVar.e);
                                }
                            } else {
                                e = elfo.e(epaf.a);
                            }
                            final elfl elflVar2 = e;
                            final elfl a22 = almwVar2.a(alntVar.p(), alntVar.n(), alntVar.m());
                            final elfl e8 = almwVar2.C.a().h(new emwl() { // from class: almm
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    cskc cskcVar = almw.a;
                                    return eykj.b(((Instant) obj).truncatedTo(ChronoUnit.DAYS));
                                }
                            }, almwVar2.D).e(Exception.class, new emwl() { // from class: almn
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    almw.a.n("Failed to upload firstHomeScreenVisitDay: ".concat(String.valueOf(((Exception) obj).getMessage())));
                                    return eyja.a;
                                }
                            }, almwVar2.D);
                            final elfl a23 = ((alli) almwVar2.M.b()).a();
                            final elfl a24 = ((cgfd) almwVar2.V.b()).a();
                            final elfl b8 = ((cgfd) almwVar2.V.b()).b();
                            cgfd cgfdVar = (cgfd) almwVar2.V.b();
                            final elfl h6 = cgfdVar.c.h().h(new emwl() { // from class: cgev
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    cgea cgeaVar = (cgea) obj;
                                    ejui ejuiVar = cgfd.a;
                                    boolean z4 = cgeaVar.f;
                                    eyja eyjaVar = cgeaVar.g;
                                    if (eyjaVar == null) {
                                        eyjaVar = eyja.a;
                                    }
                                    return new cgfc(z4, eyjaVar);
                                }
                            }, cgfdVar.d);
                            final elfl h7 = ((cgfd) almwVar2.V.b()).c.h().h(new emwl() { // from class: cgeu
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    return Boolean.valueOf(((cgea) obj).h);
                                }
                            }, erpp.a);
                            final elfl h8 = ((cgfd) almwVar2.V.b()).c.h().h(new emwl() { // from class: cgel
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    return Boolean.valueOf(((cgea) obj).i);
                                }
                            }, erpp.a);
                            final elfl h9 = ((cgfd) almwVar2.V.b()).c.h().h(new emwl() { // from class: cgee
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    cgdz b9 = cgdz.b(((cgea) obj).j);
                                    return b9 == null ? cgdz.GSOS_UNKNOWN : b9;
                                }
                            }, erpp.a);
                            if (((Optional) almwVar2.K.b()).isPresent()) {
                                e2 = ((cjqj) ((Optional) almwVar2.K.b()).get()).b();
                                e3 = ((cjqj) ((Optional) almwVar2.K.b()).get()).a();
                            } else {
                                e2 = elfo.e(eorl.a);
                                e3 = elfo.e(eorh.a);
                            }
                            final elfl elflVar3 = e2;
                            final elfl elflVar4 = e3;
                            int i16 = 2;
                            csvs.c(elfr.d(i15, g5, g6, h4, b7, b3, elflVar2, a22, e8, a23, a24, b8, h6, elflVar3, elflVar4, h8, h9, h7).a(new Callable() { // from class: allm
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    elfl elflVar5 = h6;
                                    boolean z4 = ((cgfc) erqt.q(elflVar5)).a;
                                    eyja eyjaVar = ((cgfc) erqt.q(elflVar5)).b;
                                    alti altiVar = (alti) erqt.q(b3);
                                    eorl eorlVar = (eorl) erqt.q(elflVar3);
                                    eorh eorhVar = (eorh) erqt.q(elflVar4);
                                    eouv eouvVar = (eouv) erqt.q(i15);
                                    final eoup eoupVar2 = eoupVar;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar42 = (eovl) eoupVar2.instance;
                                    eovl eovlVar43 = eovl.a;
                                    eovlVar42.o = eouvVar.e;
                                    eovlVar42.b |= 16384;
                                    long longValue2 = ((Long) erqt.q(g5)).longValue();
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar44 = (eovl) eoupVar2.instance;
                                    eovlVar44.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                                    eovlVar44.B = longValue2;
                                    eoum eoumVar3 = (eoum) erqt.q(g6);
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar45 = (eovl) eoupVar2.instance;
                                    eoumVar3.getClass();
                                    eovlVar45.g = eoumVar3;
                                    eovlVar45.b |= 4;
                                    eoux eouxVar = (eoux) erqt.q(h4);
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar46 = (eovl) eoupVar2.instance;
                                    eovlVar46.w = eouxVar.f;
                                    eovlVar46.b |= 4194304;
                                    long longValue3 = ((Long) erqt.q(b7)).longValue();
                                    almw almwVar3 = almw.this;
                                    eoux h10 = almwVar3.o.h(longValue3);
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar47 = (eovl) eoupVar2.instance;
                                    eovlVar47.x = h10.f;
                                    eovlVar47.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                                    long j2 = altiVar.a;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar48 = (eovl) eoupVar2.instance;
                                    eovlVar48.c |= 1;
                                    eovlVar48.G = j2;
                                    long j3 = altiVar.b;
                                    elfl elflVar6 = a22;
                                    elfl elflVar7 = e8;
                                    Boolean bool = valueOf;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar49 = (eovl) eoupVar2.instance;
                                    eovlVar49.c |= 2;
                                    eovlVar49.H = j3;
                                    long j4 = altiVar.c;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar50 = (eovl) eoupVar2.instance;
                                    eovlVar50.c |= 4;
                                    eovlVar50.I = j4;
                                    long j5 = altiVar.d;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar51 = (eovl) eoupVar2.instance;
                                    eovlVar51.c |= 8;
                                    eovlVar51.J = j5;
                                    long j6 = altiVar.e;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar52 = (eovl) eoupVar2.instance;
                                    eovlVar52.c |= 16;
                                    eovlVar52.K = j6;
                                    long j7 = altiVar.f;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar53 = (eovl) eoupVar2.instance;
                                    eovlVar53.c |= 32;
                                    eovlVar53.L = j7;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar54 = (eovl) eoupVar2.instance;
                                    eorlVar.getClass();
                                    eovlVar54.aq = eorlVar;
                                    eovlVar54.d |= 256;
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar55 = (eovl) eoupVar2.instance;
                                    eorhVar.getClass();
                                    eovlVar55.ar = eorhVar;
                                    eovlVar55.d |= 512;
                                    eojd eojdVar = (eojd) erqt.q(elflVar6);
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar56 = (eovl) eoupVar2.instance;
                                    eojdVar.getClass();
                                    eovlVar56.p = eojdVar;
                                    eovlVar56.b |= 32768;
                                    eyja eyjaVar2 = (eyja) erqt.q(elflVar7);
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar57 = (eovl) eoupVar2.instance;
                                    eyjaVar2.getClass();
                                    eovlVar57.ap = eyjaVar2;
                                    eovlVar57.d |= 128;
                                    if (bool.booleanValue()) {
                                        epaf epafVar = (epaf) erqt.q(elflVar2);
                                        eoupVar2.copyOnWrite();
                                        eovl eovlVar58 = (eovl) eoupVar2.instance;
                                        epafVar.getClass();
                                        eovlVar58.ag = epafVar;
                                        eovlVar58.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                                    }
                                    int i17 = ((Boolean) erqt.q(h7)).booleanValue() ? 5 : true != ((Boolean) erqt.q(a24)).booleanValue() ? 2 : 3;
                                    elfl elflVar8 = a23;
                                    elfl elflVar9 = h9;
                                    elfl elflVar10 = h8;
                                    elfl elflVar11 = b8;
                                    epbk epbkVar = (epbk) epbm.a.createBuilder();
                                    epbkVar.copyOnWrite();
                                    epbm epbmVar = (epbm) epbkVar.instance;
                                    epbmVar.c = i17 - 1;
                                    epbmVar.b |= 1;
                                    long longValue4 = ((Long) erqt.q(elflVar11)).longValue();
                                    epbkVar.copyOnWrite();
                                    epbm epbmVar2 = (epbm) epbkVar.instance;
                                    epbmVar2.b |= 2;
                                    epbmVar2.d = longValue4;
                                    long epochMilli2 = eykj.d(eyjaVar).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
                                    epbkVar.copyOnWrite();
                                    epbm epbmVar3 = (epbm) epbkVar.instance;
                                    epbmVar3.b |= 4;
                                    epbmVar3.e = epochMilli2;
                                    epbm epbmVar4 = (epbm) epbkVar.build();
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar59 = (eovl) eoupVar2.instance;
                                    epbmVar4.getClass();
                                    eovlVar59.am = epbmVar4;
                                    eovlVar59.d |= 8;
                                    cgdv cgdvVar = (cgdv) cgdw.a.createBuilder();
                                    boolean booleanValue = ((Boolean) erqt.q(elflVar10)).booleanValue();
                                    cgdvVar.copyOnWrite();
                                    cgdw cgdwVar = (cgdw) cgdvVar.instance;
                                    cgdwVar.b |= 1;
                                    cgdwVar.c = booleanValue;
                                    cgdz cgdzVar = (cgdz) erqt.q(elflVar9);
                                    cgdvVar.copyOnWrite();
                                    cgdw cgdwVar2 = (cgdw) cgdvVar.instance;
                                    cgdwVar2.d = cgdzVar.d;
                                    cgdwVar2.b |= 2;
                                    cgdw cgdwVar3 = (cgdw) cgdvVar.build();
                                    eoupVar2.copyOnWrite();
                                    eovl eovlVar60 = (eovl) eoupVar2.instance;
                                    cgdwVar3.getClass();
                                    eovlVar60.at = cgdwVar3;
                                    eovlVar60.d |= 2048;
                                    ((Optional) erqt.q(elflVar8)).ifPresent(new Consumer() { // from class: alme
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj) {
                                            eoup eoupVar3 = eoup.this;
                                            String str2 = (String) obj;
                                            eoupVar3.copyOnWrite();
                                            eovl eovlVar61 = (eovl) eoupVar3.instance;
                                            eovl eovlVar62 = eovl.a;
                                            str2.getClass();
                                            eovlVar61.d |= 1;
                                            eovlVar61.ak = str2;
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                                    eolt eoltVar = eolt.BUGLE_USER_AND_DEVICE_INFO;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar = (eolv) eoluVar.instance;
                                    eolvVar.j = eoltVar.dk;
                                    eolvVar.b |= 1;
                                    eoluVar.copyOnWrite();
                                    eolv eolvVar2 = (eolv) eoluVar.instance;
                                    eovl eovlVar61 = (eovl) eoupVar2.build();
                                    eovlVar61.getClass();
                                    eolvVar2.q = eovlVar61;
                                    eolvVar2.b |= 256;
                                    ((akxl) almwVar3.r.b()).j(eoluVar);
                                    return new Object();
                                }
                            }, erpp.a), "BugleUsageStatistics", "Failed to send bugler user and device info");
                            cinf cinfVar = (cinf) almwVar2.Q.b();
                            if (ctid.e && (notificationManager = (NotificationManager) cinfVar.b.getSystemService("notification")) != null) {
                                akxl akxlVar = (akxl) cinfVar.a.b();
                                eolu eoluVar = (eolu) eolv.a.createBuilder();
                                eolt eoltVar = eolt.BUBBLE_SETTING_EVENT;
                                eoluVar.copyOnWrite();
                                eolv eolvVar = (eolv) eoluVar.instance;
                                eolvVar.j = eoltVar.dk;
                                eolvVar.b |= 1;
                                eppj eppjVar = (eppj) eppl.a.createBuilder();
                                bubblePreference = notificationManager.getBubblePreference();
                                int i17 = bubblePreference != 1 ? bubblePreference != 2 ? 1 : 3 : 2;
                                eppjVar.copyOnWrite();
                                eppl epplVar = (eppl) eppjVar.instance;
                                epplVar.c = i17;
                                epplVar.b |= 1;
                                eoluVar.copyOnWrite();
                                eolv eolvVar2 = (eolv) eoluVar.instance;
                                eppl epplVar2 = (eppl) eppjVar.build();
                                epplVar2.getClass();
                                eolvVar2.aX = epplVar2;
                                eolvVar2.e |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                                akxlVar.j(eoluVar);
                            }
                            cipm cipmVar = (cipm) almwVar2.T.b();
                            if (efbd.g()) {
                                ((ensz) ((ensz) cipm.a.h()).h("com/google/android/apps/messaging/shared/notification/NotificationMetricsEventLogger", "logNotificationCounter", 209, "NotificationMetricsEventLogger.java")).q("Unable to log notification counter because running on main thread is not allowed");
                            } else {
                                try {
                                    eqvk eqvkVar = (eqvk) eqvm.a.createBuilder();
                                    boolean b9 = cipmVar.b();
                                    eqvkVar.copyOnWrite();
                                    eqvm eqvmVar = (eqvm) eqvkVar.instance;
                                    eqvmVar.b |= 2;
                                    eqvmVar.f = b9;
                                    eqvd eqvdVar = (eqvd) cipmVar.c.get().l();
                                    eqvc eqvcVar = (eqvc) eqvd.a.createBuilder(eqvdVar);
                                    if ((eqvdVar.b & 1) == 0) {
                                        eqvcVar.copyOnWrite();
                                        eqvd.b((eqvd) eqvcVar.instance);
                                    }
                                    if ((eqvdVar.b & 2) == 0) {
                                        eqvcVar.copyOnWrite();
                                        eqvd.c((eqvd) eqvcVar.instance);
                                    }
                                    if ((eqvdVar.b & 8) == 0) {
                                        eqvcVar.copyOnWrite();
                                        eqvd.d((eqvd) eqvcVar.instance);
                                    }
                                    if ((eqvdVar.b & 4) == 0) {
                                        eqvcVar.copyOnWrite();
                                        eqvd eqvdVar2 = (eqvd) eqvcVar.instance;
                                        eqvdVar2.b |= 4;
                                        eqvdVar2.c = 0;
                                    }
                                    if ((eqvdVar.b & 16) == 0) {
                                        eqvcVar.copyOnWrite();
                                        eqvd.a((eqvd) eqvcVar.instance);
                                    }
                                    eqvkVar.copyOnWrite();
                                    eqvm eqvmVar2 = (eqvm) eqvkVar.instance;
                                    eqvd eqvdVar3 = (eqvd) eqvcVar.build();
                                    eqvdVar3.getClass();
                                    eqvmVar2.d = eqvdVar3;
                                    eqvmVar2.c = 6;
                                    akxl akxlVar2 = (akxl) cipmVar.b.b();
                                    eolu eoluVar2 = (eolu) eolv.a.createBuilder();
                                    eolt eoltVar2 = eolt.NOTIFICATION_METRICS_EVENT;
                                    eoluVar2.copyOnWrite();
                                    eolv eolvVar3 = (eolv) eoluVar2.instance;
                                    eolvVar3.j = eoltVar2.dk;
                                    eolvVar3.b |= 1;
                                    eoluVar2.copyOnWrite();
                                    eolv eolvVar4 = (eolv) eoluVar2.instance;
                                    eqvm eqvmVar3 = (eqvm) eqvkVar.build();
                                    eqvmVar3.getClass();
                                    eolvVar4.bn = eqvmVar3;
                                    eolvVar4.f |= 2048;
                                    akxlVar2.j(eoluVar2);
                                    cipmVar.c.get().m(new emwl() { // from class: cipi
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            entd entdVar = cipm.a;
                                            eqvc eqvcVar2 = (eqvc) ((eqvd) obj).toBuilder();
                                            eqvcVar2.copyOnWrite();
                                            eqvd.b((eqvd) eqvcVar2.instance);
                                            eqvcVar2.copyOnWrite();
                                            eqvd.c((eqvd) eqvcVar2.instance);
                                            eqvcVar2.copyOnWrite();
                                            eqvd eqvdVar4 = (eqvd) eqvcVar2.instance;
                                            eqvdVar4.b |= 4;
                                            eqvdVar4.c = 0;
                                            eqvcVar2.copyOnWrite();
                                            eqvd.d((eqvd) eqvcVar2.instance);
                                            eqvcVar2.copyOnWrite();
                                            eqvd.a((eqvd) eqvcVar2.instance);
                                            return (eqvd) eqvcVar2.build();
                                        }
                                    });
                                } catch (eygu e9) {
                                    throw new IllegalStateException("Unexpected error while getting notification counter data", e9);
                                }
                            }
                            ((Optional) almwVar2.L.b()).ifPresent(new Consumer() { // from class: almh
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    elfl a25 = ((aqbs) obj).a();
                                    final almw almwVar3 = almw.this;
                                    axnw.h(a25.h(new emwl() { // from class: allx
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            cvqf cvqfVar = (cvqf) almw.this.I.b();
                                            final int intValue2 = ((Integer) obj2).intValue();
                                            cvqfVar.o(new Supplier() { // from class: cvqe
                                                @Override // java.util.function.Supplier
                                                public final Object get() {
                                                    eqgv eqgvVar = (eqgv) eqgw.a.createBuilder();
                                                    eqgvVar.copyOnWrite();
                                                    eqgw eqgwVar = (eqgw) eqgvVar.instance;
                                                    eqgwVar.b |= 1;
                                                    eqgwVar.c = intValue2;
                                                    return (eqgw) eqgvVar.build();
                                                }
                                            });
                                            return null;
                                        }
                                    }, almwVar3.E));
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            axnw.h(elfo.g(new Callable() { // from class: almf
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return Integer.valueOf(csre.a());
                                }
                            }, almwVar2.D).h(new emwl() { // from class: almg
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    twk twkVar = (twk) almw.this.W.b();
                                    int intValue2 = ((Integer) obj).intValue();
                                    epup epupVar = (epup) epur.a.createBuilder();
                                    int i18 = (intValue2 < 0 || intValue2 >= 10) ? (intValue2 < 10 || intValue2 >= 100) ? (intValue2 < 100 || intValue2 >= 500) ? (intValue2 < 500 || intValue2 >= 1000) ? (intValue2 < 1000 || intValue2 >= 5000) ? intValue2 >= 5000 ? 7 : 1 : 6 : 5 : 4 : 3 : 2;
                                    epupVar.copyOnWrite();
                                    epur epurVar = (epur) epupVar.instance;
                                    epurVar.c = i18 - 1;
                                    epurVar.b |= 1;
                                    eyfy build = epupVar.build();
                                    build.getClass();
                                    final epur epurVar2 = (epur) build;
                                    twkVar.b(new ffji() { // from class: twh
                                        @Override // defpackage.ffji
                                        public final Object invoke(Object obj2) {
                                            eqnk eqnkVar = (eqnk) obj2;
                                            eqnkVar.getClass();
                                            epub epubVar = eqnkVar.a;
                                            epubVar.copyOnWrite();
                                            epuc epucVar = (epuc) epubVar.instance;
                                            epuc epucVar2 = epuc.a;
                                            epucVar.c = epur.this;
                                            epucVar.b = 5;
                                            return ffcu.a;
                                        }
                                    });
                                    return null;
                                }
                            }, almwVar2.E));
                            final ajht ajhtVar = (ajht) almwVar2.J.b();
                            axnw.h(elfo.g(new Callable() { // from class: ajhs
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    String[] strArr = bryh.a;
                                    brye bryeVar = new brye(bryh.a);
                                    bryeVar.z("logPinToTopDailyEventLogger");
                                    int i18 = bryeVar.b().i();
                                    eqvt eqvtVar = (eqvt) eqvu.a.createBuilder();
                                    eqvtVar.copyOnWrite();
                                    eqvu eqvuVar = (eqvu) eqvtVar.instance;
                                    eqvuVar.b |= 1;
                                    eqvuVar.c = i18;
                                    eqvu eqvuVar2 = (eqvu) eqvtVar.build();
                                    akxl akxlVar3 = (akxl) ajht.this.a.b();
                                    eolu eoluVar3 = (eolu) eolv.a.createBuilder();
                                    eolt eoltVar3 = eolt.PIN_TO_TOP_EVENT;
                                    eoluVar3.copyOnWrite();
                                    eolv eolvVar5 = (eolv) eoluVar3.instance;
                                    eolvVar5.j = eoltVar3.dk;
                                    eolvVar5.b |= 1;
                                    eqvw eqvwVar = (eqvw) eqvy.a.createBuilder();
                                    eqvwVar.copyOnWrite();
                                    eqvy eqvyVar = (eqvy) eqvwVar.instance;
                                    eqvuVar2.getClass();
                                    eqvyVar.c = eqvuVar2;
                                    eqvyVar.b = 5;
                                    eoluVar3.copyOnWrite();
                                    eolv eolvVar6 = (eolv) eoluVar3.instance;
                                    eqvy eqvyVar2 = (eqvy) eqvwVar.build();
                                    eqvyVar2.getClass();
                                    eolvVar6.aZ = eqvyVar2;
                                    eolvVar6.e |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                                    akxlVar3.j(eoluVar3);
                                    return null;
                                }
                            }, ajhtVar.b));
                            almwVar2.z.v();
                            csvs.c(elfr.j(almwVar2.C.b().i(new eroh() { // from class: alln
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj) {
                                    Long l2 = (Long) obj;
                                    if (l2 == null) {
                                        return elfo.e(false);
                                    }
                                    almw almwVar3 = almw.this;
                                    final long longValue2 = l2.longValue();
                                    return elfo.g(new Callable() { // from class: almk
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            return Long.valueOf(almw.g);
                                        }
                                    }, almwVar3.D).h(new emwl() { // from class: alml
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            cskc cskcVar = almw.a;
                                            return Boolean.valueOf(longValue2 < ((Long) obj2).longValue());
                                        }
                                    }, erpp.a);
                                }
                            }, almwVar2.D), new emwl() { // from class: allz
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        return null;
                                    }
                                    alnt alntVar2 = alntVar;
                                    almw almwVar3 = almw.this;
                                    int a25 = alntVar2.a();
                                    int b10 = alntVar2.b();
                                    almwVar3.p.e("Bugle.Rcs.Groups.Active.1Day.Counts", a25);
                                    almwVar3.p.e("Bugle.Rcs.Groups.Active.28Day.Counts", b10);
                                    int g7 = alntVar2.g();
                                    int h10 = alntVar2.h();
                                    almwVar3.p.e("Bugle.Rcs.Files.Transfer.Outgoing.Success.1Day.Counts", g7);
                                    almwVar3.p.e("Bugle.Rcs.Files.Transfer.Outgoing.Success.28Day.Counts", h10);
                                    return null;
                                }
                            }, almwVar2.D), "BugleUsageStatistics", "Failed to log rcs active");
                            final ayzj ayzjVar = (ayzj) almwVar2.P.b();
                            if (((Boolean) ayzj.a.e()).booleanValue()) {
                                ekzz f2 = eleg.f("PhoneNumberMinMatchGuessLogger#computeAndLog");
                                try {
                                    f = ((ayzk) ayzjVar.c.b()).a().h(new emwl() { // from class: ayzh
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            Optional optional2 = (Optional) obj;
                                            epvt epvtVar = (epvt) epvu.a.createBuilder();
                                            if (optional2.isPresent()) {
                                                long intValue2 = ((Integer) optional2.get()).intValue();
                                                epvtVar.copyOnWrite();
                                                epvu epvuVar = (epvu) epvtVar.instance;
                                                epvuVar.b |= 1;
                                                epvuVar.c = intValue2;
                                            }
                                            ayzj ayzjVar2 = ayzj.this;
                                            long a25 = ayvs.a();
                                            epvtVar.copyOnWrite();
                                            epvu epvuVar2 = (epvu) epvtVar.instance;
                                            epvuVar2.b |= 2;
                                            epvuVar2.d = a25;
                                            akxl akxlVar3 = (akxl) ayzjVar2.b.b();
                                            eolu eoluVar3 = (eolu) eolv.a.createBuilder();
                                            eolt eoltVar3 = eolt.FUZZY_MATCH_LENGTH;
                                            eoluVar3.copyOnWrite();
                                            eolv eolvVar5 = (eolv) eoluVar3.instance;
                                            eolvVar5.j = eoltVar3.dk;
                                            eolvVar5.b |= 1;
                                            eoluVar3.copyOnWrite();
                                            eolv eolvVar6 = (eolv) eoluVar3.instance;
                                            epvu epvuVar3 = (epvu) epvtVar.build();
                                            epvuVar3.getClass();
                                            eolvVar6.aR = epvuVar3;
                                            eolvVar6.e |= 32768;
                                            akxlVar3.j(eoluVar3);
                                            return null;
                                        }
                                    }, ayzjVar.e).f(Throwable.class, new eroh() { // from class: ayzi
                                        @Override // defpackage.eroh
                                        public final ListenableFuture a(Object obj) {
                                            return ((cfyt) ayzj.this.d.b()).b((Throwable) obj);
                                        }
                                    }, ayzjVar.e);
                                    f2.b(f);
                                    f2.close();
                                } finally {
                                }
                            } else {
                                f = elfo.e(null);
                            }
                            axnw.h(f);
                            if (((Boolean) cful.i.e()).booleanValue()) {
                                efbd.b();
                                almwVar2.p.g("Bugle.Ditto.Pairing.Computers.Count.Daily", almwVar2.k.a());
                            }
                            enhk j2 = alntVar.j();
                            enhk l2 = alntVar.l();
                            enhk k = alntVar.k();
                            almwVar2.h(j2, "Bugle.Rbm.UniqueBotConversations.1Day.Counts");
                            almwVar2.h(l2, "Bugle.Rbm.UniqueBotConversations.7Days.Counts");
                            almwVar2.h(k, "Bugle.Rbm.UniqueBotConversations.28Days.Counts");
                            efbd.b();
                            cthp cthpVar = almwVar2.n;
                            notificationChannels = ((NotificationManager) cthpVar.a.b()).getNotificationChannels();
                            if (notificationChannels != null) {
                                notificationChannels2 = ((NotificationManager) cthpVar.a.b()).getNotificationChannels();
                                i3 = notificationChannels2.size();
                            } else {
                                i3 = 0;
                            }
                            almwVar2.p.e("Bugle.Notification.Channel.Count", i3);
                            efbd.b();
                            NotificationChannel a25 = ((cjam) almwVar2.X.b()).a();
                            akzt akztVar = almwVar2.p;
                            importance = a25.getImportance();
                            akztVar.e("Bugle.Notification.DefaultChannel.Importance.Count", importance);
                            sound = a25.getSound();
                            if (sound != null) {
                                sound2 = a25.getSound();
                                str = sound2.toString();
                            } else {
                                str = null;
                            }
                            almwVar2.p.e("Bugle.Notification.DefaultChannel.Sound.Count", (str == null || str.endsWith("notification_sound")) ? 1 : 2);
                            shouldVibrate = a25.shouldVibrate();
                            almwVar2.p.e("Bugle.Notification.DefaultChannel.Vibrate.Count", true != shouldVibrate ? 2 : 1);
                            lockscreenVisibility = a25.getLockscreenVisibility();
                            almwVar2.p.e("Bugle.Notification.DefaultChannel.LockScreenVisibility.Count", lockscreenVisibility == -1 ? 3 : lockscreenVisibility == 1 ? 1 : lockscreenVisibility == 0 ? 2 : 0);
                            canShowBadge = a25.canShowBadge();
                            almwVar2.p.e("Bugle.Notification.DefaultChannel.ShowOnBadge.Count", true != canShowBadge ? 2 : 1);
                            canBypassDnd = a25.canBypassDnd();
                            akzt akztVar2 = almwVar2.p;
                            if (true == canBypassDnd) {
                                i16 = 1;
                            }
                            akztVar2.e("Bugle.Notification.DefaultChannel.OverrideDoNotDisturb.Count", i16);
                            if (almwVar2.v.l()) {
                                ((alwu) almwVar2.q.b()).b();
                            }
                            Iterator it2 = ((Set) almwVar2.Y.b()).iterator();
                            while (it2.hasNext()) {
                                ((alkx) it2.next()).b();
                            }
                            almwVar2.U.ifPresent(new Consumer() { // from class: alma
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    cskc cskcVar = almw.a;
                                    ((cvhn) ((ffbr) obj).b()).a();
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ((Optional) almwVar2.K.b()).ifPresent(new Consumer() { // from class: almb
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    cskc cskcVar = almw.a;
                                    axnw.h(((cjqj) obj).c());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            csvs.c(almwVar2.C.g(almwVar2.w.f().toEpochMilli()), "BugleUsageStatistics", "Failed to update LastRecurrentAnalyticsUploadTimeInMillis");
                            almwVar2.N.isPresent();
                            axnw.h(((aevc) almwVar2.N.get().b()).a().h(new emwl() { // from class: almj
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    final almw almwVar3 = almw.this;
                                    ((Optional) obj).ifPresent(new Consumer() { // from class: allw
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj2) {
                                            epyu epyuVar = (epyu) obj2;
                                            aeva aevaVar = (aeva) almw.this.O.b();
                                            epyo epyoVar = (epyo) epys.a.createBuilder();
                                            epyoVar.copyOnWrite();
                                            epys epysVar = (epys) epyoVar.instance;
                                            epyuVar.getClass();
                                            epysVar.e = epyuVar;
                                            epysVar.b |= 4;
                                            aevaVar.a((epys) epyoVar.build());
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return true;
                                }
                            }, almwVar2.E));
                            cgfj cgfjVar = (cgfj) almwVar2.Z.b();
                            axnw.e(axol.i(cgfjVar.b, new cgfg(cgfjVar, null)));
                            cghj cghjVar = (cghj) almwVar2.ab.b();
                            if (cghjVar.b.b()) {
                                cghjVar.a.c("Bugle.Kids.Engagement.Supervised.Count");
                            }
                        } catch (eygu e10) {
                            throw new IllegalStateException("Could not populate BugleUserAndDeviceInfo", e10);
                        }
                    } else {
                        almw.a.m("Clearcut loggings are disabled.");
                    }
                    recurringTelemetryUploaderAction.g.e("Bugle.DataModel.Action.RecurringTelemetryUpload.Retry.Count", i4);
                } else {
                    csjb e11 = RecurringTelemetryUploaderAction.a.e();
                    e11.I("failed to get availability, will retry in");
                    e11.H(longValue);
                    e11.I("ms");
                    e11.r();
                    batn ik = ((RecurringTelemetryUploaderAction.a) ctba.a(RecurringTelemetryUploaderAction.a.class)).ik();
                    Context context3 = (Context) ik.a.b();
                    context3.getClass();
                    almw almwVar3 = (almw) ik.b.b();
                    almwVar3.getClass();
                    akzt akztVar3 = (akzt) ik.c.b();
                    akztVar3.getClass();
                    alns alnsVar2 = (alns) ik.d.b();
                    alnsVar2.getClass();
                    cpwl cpwlVar = (cpwl) ik.e.b();
                    cpwlVar.getClass();
                    cpvq cpvqVar = (cpvq) ik.f.b();
                    cpvqVar.getClass();
                    errl errlVar = (errl) ik.g.b();
                    errlVar.getClass();
                    errl errlVar2 = (errl) ik.h.b();
                    errlVar2.getClass();
                    new RecurringTelemetryUploaderAction(context3, almwVar3, akztVar3, alnsVar2, cpwlVar, cpvqVar, errlVar, errlVar2, ik.i, i4 + 1).y(109, longValue);
                }
                if (!((Boolean) RecurringTelemetryUploaderAction.b.e()).booleanValue()) {
                    return null;
                }
                Optional a26 = recurringTelemetryUploaderAction.h.a(eplb.RECURRING_EVENT);
                if (!a26.isPresent() || !((Boolean) a26.get()).booleanValue()) {
                    return null;
                }
                RecurringTelemetryUploaderAction.a.r("Telephony database was wiped out!");
                if (!((Boolean) RecurringTelemetryUploaderAction.c.e()).booleanValue()) {
                    return null;
                }
                RecurringTelemetryUploaderAction.a.p("Starting reverse telephony sync due to wipeout");
                recurringTelemetryUploaderAction.i.a();
                return null;
            }
        }, this.m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public RecurringTelemetryUploaderAction(Context context, almw almwVar, akzt akztVar, alns alnsVar, cpwl cpwlVar, cpvq cpvqVar, errl errlVar, errl errlVar2, ffbr ffbrVar, int i) {
        super(eogt.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = almwVar;
        this.g = akztVar;
        this.h = cpwlVar;
        this.k = alnsVar;
        this.i = cpvqVar;
        this.l = errlVar;
        this.m = errlVar2;
        this.j = ffbrVar;
        this.t.r("retry_count", i);
    }

    public RecurringTelemetryUploaderAction(Context context, almw almwVar, akzt akztVar, alns alnsVar, errl errlVar, errl errlVar2, cpwl cpwlVar, cpvq cpvqVar, ffbr ffbrVar, Parcel parcel) {
        super(parcel, eogt.RECURRING_TELEMETRY_UPLOADER_ACTION);
        this.e = context;
        this.f = almwVar;
        this.g = akztVar;
        this.k = alnsVar;
        this.h = cpwlVar;
        this.i = cpvqVar;
        this.l = errlVar;
        this.m = errlVar2;
        this.j = ffbrVar;
    }
}
