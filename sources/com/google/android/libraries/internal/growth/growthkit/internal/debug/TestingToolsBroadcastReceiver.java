package com.google.android.libraries.internal.growth.growthkit.internal.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dvbn;
import defpackage.dvbu;
import defpackage.dvmq;
import defpackage.dvmt;
import defpackage.dvmu;
import defpackage.dvmx;
import defpackage.dvsf;
import defpackage.dvuq;
import defpackage.eafv;
import defpackage.eafz;
import defpackage.eagp;
import defpackage.eajj;
import defpackage.eakf;
import defpackage.ealw;
import defpackage.eamf;
import defpackage.eamh;
import defpackage.easy;
import defpackage.elav;
import defpackage.eldl;
import defpackage.emwl;
import defpackage.emxc;
import defpackage.emxn;
import defpackage.emxs;
import defpackage.enhk;
import defpackage.ensz;
import defpackage.entd;
import defpackage.erny;
import defpackage.erog;
import defpackage.erpp;
import defpackage.erqc;
import defpackage.erqt;
import defpackage.errl;
import defpackage.evts;
import defpackage.evxu;
import defpackage.evyu;
import defpackage.evzc;
import defpackage.evzd;
import defpackage.eyfy;
import defpackage.fazb;
import defpackage.fdno;
import defpackage.fdoq;
import defpackage.ffbr;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TestingToolsBroadcastReceiver extends BroadcastReceiver {
    public static final entd a = entd.c("GnpSdk");
    public eafv b;
    public dvmt c;
    public eafv d;
    public dvmq e;
    public dvmx f;
    public dvbu g;
    public errl h;
    public fazb i;
    public eafz j;
    public errl k;
    public Context l;
    public ListenableFuture m;
    public Map n;
    public Map o;
    public eafv p;
    public emxc q;
    public ffbr r;

    public static void b(BroadcastReceiver.PendingResult pendingResult, int i) {
        pendingResult.setResultCode(i);
        pendingResult.finish();
    }

    private final ListenableFuture c(evts evtsVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(erny.f(this.m, new emwl() { // from class: dvem
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((SharedPreferences) obj).edit().putString("SYNC_LANGUAGE", dvdl.a(TestingToolsBroadcastReceiver.this.l)).apply();
                return null;
            }
        }, this.h));
        Map map = this.n;
        evzd evzdVar = evtsVar.f;
        if (evzdVar == null) {
            evzdVar = evzd.a;
        }
        evzc b = evzc.b(evzdVar.e);
        if (b == null) {
            b = evzc.UITYPE_NONE;
        }
        ffbr ffbrVar = (ffbr) map.get(b);
        if (ffbrVar != null) {
            dvsf dvsfVar = (dvsf) ffbrVar.b();
            evzd evzdVar2 = evtsVar.f;
            if (evzdVar2 == null) {
                evzdVar2 = evzd.a;
            }
            arrayList.addAll(dvsfVar.a(evzdVar2.c == 2 ? (evxu) evzdVar2.d : evxu.a));
            dvsf dvsfVar2 = (dvsf) ffbrVar.b();
            evzd evzdVar3 = evtsVar.f;
            if (evzdVar3 == null) {
                evzdVar3 = evzd.a;
            }
            evxu evxuVar = (evzdVar3.c == 6 ? (evyu) evzdVar3.d : evyu.a).d;
            if (evxuVar == null) {
                evxuVar = evxu.a;
            }
            arrayList.addAll(dvsfVar2.a(evxuVar));
        }
        return erqt.e(arrayList);
    }

    public final eamh a(easy easyVar, eagp eagpVar) {
        Object obj = ((emxn) this.q).a;
        eagpVar.getClass();
        emxc a2 = ((eamf) obj).a.a(easyVar, eagpVar);
        ealw ealwVar = new ealw();
        ealwVar.b(0);
        ealwVar.a = "";
        return (eamh) a2.e(ealwVar.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        char c2;
        if (intent == null || intent.getAction() == null) {
            ((ensz) ((ensz) a.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 140, "TestingToolsBroadcastReceiver.java")).q("Intent or Intent.action is null");
            return;
        }
        final String action = intent.getAction();
        entd entdVar = a;
        ((ensz) entdVar.o().h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 145, "TestingToolsBroadcastReceiver.java")).t("Received TestingToolsBroadcastReceiver with action [%s].", action);
        try {
            ((dvbn) ((ffbr) eajj.a(context).fL().get(TestingToolsBroadcastReceiver.class)).b()).a(this);
            ListenableFuture i = erqt.i(false);
            elav a2 = this.j.a("TestingToolsBroadcastReceiver");
            try {
                if (fdno.b()) {
                    final BroadcastReceiver.PendingResult goAsync = goAsync();
                    switch (action.hashCode()) {
                        case -984653766:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.CLEAR_COUNTERS")) {
                                c = 6;
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case -981080074:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.CLEAR_EVAL_RESULTS")) {
                                c = '\t';
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case -147885911:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.FETCH_EVAL_RESULTS")) {
                                c = '\b';
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case -140035475:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.FETCH_COUNTERS")) {
                                c = '\n';
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case 424896455:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.DELETE_PROMOS")) {
                                c = 1;
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case 565136958:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.ACTION_DELETE_ALL_PROMOS")) {
                                c = 2;
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case 593764134:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.FETCH_PROMOTIONS")) {
                                c = 7;
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case 729328716:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.SYNC")) {
                                c = 5;
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case 1366117509:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.GET_REGISTRATION_STATE")) {
                                c = 11;
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        case 1466296994:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.LOG_DEBUG_DATA")) {
                                c2 = 3;
                                c = 4;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                            break;
                        case 1742998601:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.ADD_PREVIEW_PROMO")) {
                                c2 = 3;
                                c = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                            break;
                        case 1943132320:
                            if (action.equals("com.google.android.libraries.internal.growth.growthkit.ADD_PROMO")) {
                                c = 0;
                                c2 = 3;
                                break;
                            }
                            c = 65535;
                            c2 = 3;
                        default:
                            c = 65535;
                            c2 = 3;
                            break;
                    }
                    switch (c) {
                        case 0:
                            try {
                                final String stringExtra = intent.getStringExtra("account");
                                final evts evtsVar = (evts) eyfy.parseFrom(evts.a, Base64.decode(intent.getStringExtra("proto"), 0));
                                ((ensz) ((ensz) entdVar.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "storePromotion", 577, "TestingToolsBroadcastReceiver.java")).q("Saving custom promotion received from broadcast.");
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(c(evtsVar));
                                if (fdoq.b()) {
                                    for (String str : this.g.a()) {
                                        arrayList.add(((dvmt) this.b.a(str)).a());
                                        arrayList.add(((dvmt) this.d.a(str)).a());
                                    }
                                }
                                if (fdoq.c()) {
                                    arrayList.add(((dvmt) this.b.a(null)).a());
                                    arrayList.add(((dvmt) this.d.a(null)).a());
                                }
                                i = erny.f(erqt.c(arrayList).b(eldl.c(new erog() { // from class: dvep
                                    @Override // defpackage.erog
                                    public final ListenableFuture a() {
                                        dvmt dvmtVar = (dvmt) TestingToolsBroadcastReceiver.this.b.a(stringExtra);
                                        evts evtsVar2 = evtsVar;
                                        return dvmtVar.d(dvmu.a(evtsVar2), evtsVar2);
                                    }
                                }), this.h), new emwl() { // from class: dveq
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                        return true;
                                    }
                                }, erpp.a);
                            } catch (Exception e) {
                                ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "addPromo", (char) 493, "TestingToolsBroadcastReceiver.java")).q("Failed to parse custom promotion received in BroadcastReceiver");
                                i = erqt.i(false);
                            }
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case 1:
                            try {
                                String stringExtra2 = intent.getStringExtra("account");
                                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("promo_ids");
                                ArrayList arrayList2 = new ArrayList(stringArrayListExtra.size());
                                Iterator<String> it = stringArrayListExtra.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((dvmt) this.b.a(stringExtra2)).e(it.next()));
                                }
                                i = erny.f(erqt.e(arrayList2), new emwl() { // from class: dvee
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                        return true;
                                    }
                                }, erpp.a);
                            } catch (Exception e2) {
                                ((ensz) ((ensz) ((ensz) a.i()).g(e2)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "deletePromos", (char) 510, "TestingToolsBroadcastReceiver.java")).q("Failed to parse custom promotion received in BroadcastReceiver");
                                i = erqt.i(false);
                            }
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case 2:
                            try {
                                i = erny.f(((dvmt) this.b.a(intent.getStringExtra("account"))).a(), new emwl() { // from class: dvet
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                        return true;
                                    }
                                }, erpp.a);
                            } catch (Exception e3) {
                                ((ensz) ((ensz) ((ensz) a.i()).g(e3)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "deleteAllPromos", (char) 523, "TestingToolsBroadcastReceiver.java")).q("Failed to parse custom promotion received in BroadcastReceiver");
                                i = erqt.i(false);
                            }
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case 3:
                            try {
                                evts evtsVar2 = (evts) eyfy.parseFrom(evts.a, Base64.decode(intent.getStringExtra("proto"), 0));
                                String a3 = dvmu.a(evtsVar2);
                                ((ensz) ((ensz) entdVar.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "storePreviewPromotion", 611, "TestingToolsBroadcastReceiver.java")).q("Saving custom preview promotion received from broadcast.");
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(c(evtsVar2));
                                if (fdoq.b()) {
                                    for (String str2 : this.g.a()) {
                                        arrayList3.add(((dvmt) this.b.a(str2)).b(enhk.l(a3, evtsVar2)));
                                        arrayList3.add(((dvmt) this.d.a(str2)).a());
                                    }
                                }
                                if (fdoq.c()) {
                                    arrayList3.add(((dvmt) this.b.a(null)).b(enhk.l(a3, evtsVar2)));
                                    arrayList3.add(((dvmt) this.d.a(null)).a());
                                }
                                i = erqt.c(arrayList3).a(new Callable() { // from class: dvel
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                        return true;
                                    }
                                }, erpp.a);
                            } catch (Exception e4) {
                                ((ensz) ((ensz) ((ensz) a.i()).g(e4)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "addPreviewPromo", (char) 538, "TestingToolsBroadcastReceiver.java")).q("Failed to parse custom preview promotion received in BroadcastReceiver");
                                i = erqt.i(false);
                            }
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case 4:
                            try {
                                String stringExtra3 = intent.getStringExtra("account");
                                final ListenableFuture c3 = ((dvmt) this.b.a(stringExtra3)).c();
                                final ListenableFuture c4 = this.c.c();
                                final ListenableFuture d = this.e.d(stringExtra3);
                                final ListenableFuture d2 = this.f.d(stringExtra3);
                                ArrayList arrayList4 = new ArrayList();
                                Iterator<E> it2 = ((enhk) this.o).values().iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(((dvuq) it2.next()).b());
                                }
                                final ListenableFuture e5 = erqt.e(arrayList4);
                                ListenableFuture[] listenableFutureArr = new ListenableFuture[5];
                                listenableFutureArr[0] = c3;
                                listenableFutureArr[1] = c4;
                                listenableFutureArr[2] = d;
                                listenableFutureArr[c2] = d2;
                                listenableFutureArr[4] = e5;
                                i = erny.f(erqt.d(listenableFutureArr).a(new Callable() { // from class: dvef
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                        Map map = (Map) ListenableFuture.this.get();
                                        Map map2 = (Map) d2.get();
                                        Map map3 = (Map) c3.get();
                                        Map map4 = (Map) c4.get();
                                        List<dvus> list = (List) e5.get();
                                        for (Map.Entry entry : map.entrySet()) {
                                            evwj evwjVar = (evwj) entry.getKey();
                                            ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "printDebugData", 717, "TestingToolsBroadcastReceiver.java")).K("ClearcutEvent[package: %s, log_source: %s, event_code: %s] Count: %d", evwjVar.e, Integer.valueOf(evwjVar.c), Integer.valueOf(evwjVar.d), entry.getValue());
                                        }
                                        for (Map.Entry entry2 : map2.entrySet()) {
                                            ewan ewanVar = (ewan) entry2.getKey();
                                            ensz enszVar = (ensz) ((ensz) TestingToolsBroadcastReceiver.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "printDebugData", 727, "TestingToolsBroadcastReceiver.java");
                                            ewal b = ewal.b(ewanVar.d);
                                            if (b == null) {
                                                b = ewal.UNKNOWN;
                                            }
                                            enszVar.J("VisualElementEvent[action: %s, path: %s] Count: %d", b.name(), TextUtils.join(", ", ewanVar.c), entry2.getValue());
                                        }
                                        for (evts evtsVar3 : map3.values()) {
                                            ensz enszVar2 = (ensz) ((ensz) TestingToolsBroadcastReceiver.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "printDebugData", 735, "TestingToolsBroadcastReceiver.java");
                                            evub evubVar = evtsVar3.c;
                                            if (evubVar == null) {
                                                evubVar = evub.a;
                                            }
                                            Integer valueOf = Integer.valueOf(evubVar.b);
                                            evub evubVar2 = evtsVar3.c;
                                            if (evubVar2 == null) {
                                                evubVar2 = evub.a;
                                            }
                                            Integer valueOf2 = Integer.valueOf(evubVar2.c.d(0));
                                            evzd evzdVar = evtsVar3.f;
                                            if (evzdVar == null) {
                                                evzdVar = evzd.a;
                                            }
                                            evzc b2 = evzc.b(evzdVar.e);
                                            if (b2 == null) {
                                                b2 = evzc.UITYPE_NONE;
                                            }
                                            String name = b2.name();
                                            evzd evzdVar2 = evtsVar3.f;
                                            if (evzdVar2 == null) {
                                                evzdVar2 = evzd.a;
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            int i2 = evzdVar2.c;
                                            int a4 = evyy.a(i2);
                                            int i3 = a4 - 1;
                                            if (a4 == 0) {
                                                throw null;
                                            }
                                            if (i3 == 0) {
                                                sb.append((i2 == 2 ? (evxu) evzdVar2.d : evxu.a).e);
                                            } else if (i3 == 2) {
                                                sb.append((i2 == 4 ? (evvz) evzdVar2.d : evvz.a).b);
                                            } else if (i3 == 3) {
                                                sb.append((i2 == 5 ? (ewab) evzdVar2.d : ewab.a).g);
                                            } else if (i3 == 4) {
                                                evxu evxuVar = (i2 == 6 ? (evyu) evzdVar2.d : evyu.a).d;
                                                if (evxuVar == null) {
                                                    evxuVar = evxu.a;
                                                }
                                                sb.append(evxuVar.e);
                                            }
                                            if (sb.length() > 0) {
                                                sb.insert(0, ". Title: ");
                                            }
                                            enszVar2.K("Promotion[impressionCappingId: %d, mendelId: %d] uiType: %s%s", valueOf, valueOf2, name, sb);
                                        }
                                        for (evtj evtjVar : map4.values()) {
                                            eyja eyjaVar = evtjVar.d;
                                            if (eyjaVar == null) {
                                                eyjaVar = eyja.a;
                                            }
                                            long millis = TimeUnit.SECONDS.toMillis(eyjaVar.b);
                                            eyja eyjaVar2 = evtjVar.d;
                                            if (eyjaVar2 == null) {
                                                eyjaVar2 = eyja.a;
                                            }
                                            ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "printDebugData", 748, "TestingToolsBroadcastReceiver.java")).w("CappedPromotion[impressionCappingId: %d] expiration: %s", evtjVar.c, SimpleDateFormat.getDateTimeInstance().format(new Date(millis + TimeUnit.NANOSECONDS.toMillis(eyjaVar2.c))));
                                        }
                                        for (dvus dvusVar : list) {
                                            if (dvusVar.b.b() - 1 != 1) {
                                                ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "printDebugData", 765, "TestingToolsBroadcastReceiver.java")).t("App State[id: %s, value: INVALID]", dvusVar.a);
                                            } else {
                                                ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "printDebugData", 757, "TestingToolsBroadcastReceiver.java")).B("App State[id: %s, value: %d]", dvusVar.a, dvusVar.b.a());
                                            }
                                        }
                                        return null;
                                    }
                                }, erpp.a), new emwl() { // from class: dveg
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                        return true;
                                    }
                                }, erpp.a);
                            } catch (Exception e6) {
                                ((ensz) ((ensz) ((ensz) a.i()).g(e6)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "logDebugData", (char) 671, "TestingToolsBroadcastReceiver.java")).q("Failed to dump event counts in BroadcastReceiver");
                                i = erqt.i(false);
                            }
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case 5:
                            ((ensz) ((ensz) entdVar.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", 417, "TestingToolsBroadcastReceiver.java")).q("Syncing all accounts with the server.");
                            i = erny.f(erny.f(erqc.o(this.k.submit(new Callable() { // from class: dvdz
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    try {
                                        dhoz.a(TestingToolsBroadcastReceiver.this.l);
                                        return true;
                                    } catch (dfqc | dfqd e7) {
                                        ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g(e7)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", (char) 428, "TestingToolsBroadcastReceiver.java")).q("Failed to install security provider, GrowthKit sync can't run.");
                                        return false;
                                    }
                                }
                            })), eldl.a(new emwl() { // from class: dvek
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        return false;
                                    }
                                    TestingToolsBroadcastReceiver testingToolsBroadcastReceiver = TestingToolsBroadcastReceiver.this;
                                    if (!((Boolean) testingToolsBroadcastReceiver.r.b()).booleanValue()) {
                                        return true;
                                    }
                                    try {
                                        eafl eaflVar = (eafl) ((eamf) ((emxn) testingToolsBroadcastReceiver.q).a).a(exyd.COLLABORATOR_API_CALL, eagp.b).get();
                                        if (eaflVar.g()) {
                                            return true;
                                        }
                                        ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.j()).g(eaflVar.d())).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", (char) 454, "TestingToolsBroadcastReceiver.java")).q("Failed to register");
                                        return false;
                                    } catch (Exception e7) {
                                        ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.j()).g(e7)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", (char) 458, "TestingToolsBroadcastReceiver.java")).q("Failed to register");
                                        return false;
                                    }
                                }
                            }), this.h), eldl.a(new emwl() { // from class: dven
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    boolean booleanValue = ((Boolean) obj).booleanValue();
                                    TestingToolsBroadcastReceiver testingToolsBroadcastReceiver = TestingToolsBroadcastReceiver.this;
                                    if (!booleanValue) {
                                        return false;
                                    }
                                    try {
                                        ((dvpl) testingToolsBroadcastReceiver.i.b()).a(14).get();
                                        return true;
                                    } catch (Exception e7) {
                                        ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.j()).g(e7)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "sync", (char) 476, "TestingToolsBroadcastReceiver.java")).q("Failed to sync");
                                        return false;
                                    }
                                }
                            }), this.h);
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case 6:
                            try {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.add(this.e.c());
                                arrayList5.add(this.f.c());
                                arrayList5.add(this.c.a());
                                i = erny.f(erqt.a(arrayList5).a(new Callable() { // from class: dveb
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "clearCounters", 687, "TestingToolsBroadcastReceiver.java")).q("Cleared all counters");
                                        return null;
                                    }
                                }, erpp.a), new emwl() { // from class: dvec
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                        return true;
                                    }
                                }, erpp.a);
                            } catch (Exception e7) {
                                ((ensz) ((ensz) ((ensz) a.i()).g(e7)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "clearCounters", (char) 695, "TestingToolsBroadcastReceiver.java")).q("Failed to clear event counts in BroadcastReceiver");
                                i = erqt.i(false);
                            }
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case 7:
                            final ListenableFuture c5 = ((dvmt) this.b.a(intent.getExtras().getString("account"))).c();
                            final ListenableFuture c6 = this.c.c();
                            i = erny.f(erqt.d(c5, c6).a(new Callable() { // from class: dvei
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    Bundle bundle = new Bundle();
                                    dvfe dvfeVar = (dvfe) dvff.a.createBuilder();
                                    Collection values = ((Map) ListenableFuture.this.get()).values();
                                    dvfeVar.copyOnWrite();
                                    dvff dvffVar = (dvff) dvfeVar.instance;
                                    eygr eygrVar = dvffVar.b;
                                    if (!eygrVar.c()) {
                                        dvffVar.b = eyfy.mutableCopy(eygrVar);
                                    }
                                    ListenableFuture listenableFuture = c6;
                                    eydl.addAll(values, dvffVar.b);
                                    bundle.putByteArray("promotion", ((dvff) dvfeVar.build()).toByteArray());
                                    dvew dvewVar = (dvew) dvex.a.createBuilder();
                                    Collection values2 = ((Map) listenableFuture.get()).values();
                                    dvewVar.copyOnWrite();
                                    dvex dvexVar = (dvex) dvewVar.instance;
                                    eygr eygrVar2 = dvexVar.b;
                                    if (!eygrVar2.c()) {
                                        dvexVar.b = eyfy.mutableCopy(eygrVar2);
                                    }
                                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                                    eydl.addAll(values2, dvexVar.b);
                                    bundle.putByteArray("capped_promotion", ((dvex) dvewVar.build()).toByteArray());
                                    pendingResult.setResultExtras(bundle);
                                    return true;
                                }
                            }, erpp.a), new emwl() { // from class: dvej
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    return true;
                                }
                            }, erpp.a);
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case '\b':
                            Bundle extras = intent.getExtras();
                            String string = extras.getString("account");
                            final String string2 = extras.getString("promo_id");
                            i = erny.f(((dvmt) this.p.a(string)).c(), new emwl() { // from class: dveo
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    Bundle bundle = new Bundle();
                                    dvfc dvfcVar = (dvfc) dvfd.a.createBuilder();
                                    for (dvfl dvflVar : ((Map) obj).values()) {
                                        evts evtsVar3 = dvflVar.c;
                                        if (evtsVar3 == null) {
                                            evtsVar3 = evts.a;
                                        }
                                        evub evubVar = evtsVar3.c;
                                        if (evubVar == null) {
                                            evubVar = evub.a;
                                        }
                                        if (string2.equals(dvmu.b(evubVar))) {
                                            dvfcVar.copyOnWrite();
                                            dvfd dvfdVar = (dvfd) dvfcVar.instance;
                                            dvflVar.getClass();
                                            eygr eygrVar = dvfdVar.b;
                                            if (!eygrVar.c()) {
                                                dvfdVar.b = eyfy.mutableCopy(eygrVar);
                                            }
                                            dvfdVar.b.add(dvflVar);
                                        }
                                    }
                                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                                    bundle.putByteArray("eval_result", ((dvfd) dvfcVar.build()).toByteArray());
                                    pendingResult.setResultExtras(bundle);
                                    return true;
                                }
                            }, erpp.a);
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case '\t':
                            Bundle extras2 = intent.getExtras();
                            final String string3 = extras2.getString("account");
                            final String string4 = extras2.getString("promo_id");
                            i = erny.f(((dvmt) this.p.a(string3)).c(), new emwl() { // from class: dved
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                                        evts evtsVar3 = ((dvfl) entry.getValue()).c;
                                        if (evtsVar3 == null) {
                                            evtsVar3 = evts.a;
                                        }
                                        evub evubVar = evtsVar3.c;
                                        if (evubVar == null) {
                                            evubVar = evub.a;
                                        }
                                        if (string4.equals(dvmu.b(evubVar))) {
                                            ((dvmt) TestingToolsBroadcastReceiver.this.p.a(string3)).e((String) entry.getKey());
                                        }
                                    }
                                    return true;
                                }
                            }, erpp.a);
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case '\n':
                            String string5 = intent.getExtras().getString("account");
                            final ListenableFuture d3 = this.e.d(string5);
                            final ListenableFuture d4 = this.f.d(string5);
                            i = erny.f(erqt.d(d3, d4).a(new Callable() { // from class: dver
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    Bundle bundle = new Bundle();
                                    dvey dveyVar = (dvey) dvfb.a.createBuilder();
                                    for (Map.Entry entry : ((Map) ListenableFuture.this.get()).entrySet()) {
                                        dvez dvezVar = (dvez) dvfa.a.createBuilder();
                                        evwj evwjVar = (evwj) entry.getKey();
                                        dvezVar.copyOnWrite();
                                        dvfa dvfaVar = (dvfa) dvezVar.instance;
                                        evwjVar.getClass();
                                        dvfaVar.c = evwjVar;
                                        dvfaVar.b = 1 | dvfaVar.b;
                                        int intValue = ((Integer) entry.getValue()).intValue();
                                        dvezVar.copyOnWrite();
                                        dvfa dvfaVar2 = (dvfa) dvezVar.instance;
                                        dvfaVar2.b |= 2;
                                        dvfaVar2.d = intValue;
                                        dvfa dvfaVar3 = (dvfa) dvezVar.build();
                                        dveyVar.copyOnWrite();
                                        dvfb dvfbVar = (dvfb) dveyVar.instance;
                                        dvfaVar3.getClass();
                                        eygr eygrVar = dvfbVar.b;
                                        if (!eygrVar.c()) {
                                            dvfbVar.b = eyfy.mutableCopy(eygrVar);
                                        }
                                        dvfbVar.b.add(dvfaVar3);
                                    }
                                    ListenableFuture listenableFuture = d4;
                                    bundle.putByteArray("clearcut", ((dvfb) dveyVar.build()).toByteArray());
                                    dvfg dvfgVar = (dvfg) dvfj.a.createBuilder();
                                    for (Map.Entry entry2 : ((Map) listenableFuture.get()).entrySet()) {
                                        dvfh dvfhVar = (dvfh) dvfi.a.createBuilder();
                                        ewan ewanVar = (ewan) entry2.getKey();
                                        dvfhVar.copyOnWrite();
                                        dvfi dvfiVar = (dvfi) dvfhVar.instance;
                                        ewanVar.getClass();
                                        dvfiVar.c = ewanVar;
                                        dvfiVar.b |= 1;
                                        int intValue2 = ((Integer) entry2.getValue()).intValue();
                                        dvfhVar.copyOnWrite();
                                        dvfi dvfiVar2 = (dvfi) dvfhVar.instance;
                                        dvfiVar2.b |= 2;
                                        dvfiVar2.d = intValue2;
                                        dvfi dvfiVar3 = (dvfi) dvfhVar.build();
                                        dvfgVar.copyOnWrite();
                                        dvfj dvfjVar = (dvfj) dvfgVar.instance;
                                        dvfiVar3.getClass();
                                        eygr eygrVar2 = dvfjVar.b;
                                        if (!eygrVar2.c()) {
                                            dvfjVar.b = eyfy.mutableCopy(eygrVar2);
                                        }
                                        dvfjVar.b.add(dvfiVar3);
                                    }
                                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                                    bundle.putByteArray("visualelement", ((dvfj) dvfgVar.build()).toByteArray());
                                    pendingResult.setResultExtras(bundle);
                                    return true;
                                }
                            }, erpp.a), new emwl() { // from class: dves
                                @Override // defpackage.emwl
                                public final Object apply(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    return true;
                                }
                            }, erpp.a);
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        case 11:
                            final String string6 = intent.getExtras().getString("account");
                            i = this.h.submit(new Callable() { // from class: dveh
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    String str3 = string6;
                                    easy eatfVar = TextUtils.isEmpty(str3) ? eaua.a : new eatf(str3);
                                    BroadcastReceiver.PendingResult pendingResult = goAsync;
                                    TestingToolsBroadcastReceiver testingToolsBroadcastReceiver = TestingToolsBroadcastReceiver.this;
                                    eamh a4 = testingToolsBroadcastReceiver.a(eatfVar, eagp.a);
                                    eamh a5 = testingToolsBroadcastReceiver.a(eatfVar, eagp.c);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("fcm_registration_status", a4.a);
                                    bundle.putString("fcm_registered_environment", a4.b);
                                    bundle.putInt("fetch_registration_status", a5.a);
                                    bundle.putString("fetch_registered_environment", a5.b);
                                    pendingResult.setResultExtras(bundle);
                                    return true;
                                }
                            });
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                        default:
                            ((ensz) ((ensz) entdVar.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 207, "TestingToolsBroadcastReceiver.java")).t("Action not supported [%s]", action);
                            eakf.a(i, new emxs() { // from class: dveu
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    entd entdVar2 = TestingToolsBroadcastReceiver.a;
                                    TestingToolsBroadcastReceiver.b(goAsync, true != ((Boolean) obj).booleanValue() ? -1 : 0);
                                }
                            }, new emxs() { // from class: dvea
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ((ensz) ((ensz) ((ensz) TestingToolsBroadcastReceiver.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 214, "TestingToolsBroadcastReceiver.java")).t("Failed to perform action %s", action);
                                    TestingToolsBroadcastReceiver.b(goAsync, -1);
                                }
                            });
                            break;
                    }
                } else {
                    ((ensz) ((ensz) entdVar.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", 163, "TestingToolsBroadcastReceiver.java")).q("Testing Feature is not enabled. Did you forget to override the phenotype flag?");
                    setResultCode(-2);
                }
                a2.close();
            } finally {
            }
        } catch (Exception e8) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e8)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/TestingToolsBroadcastReceiver", "onReceive", (char) 157, "TestingToolsBroadcastReceiver.java")).q("Failed to initialize TestingToolsBroadcastReceiver");
        }
    }
}
