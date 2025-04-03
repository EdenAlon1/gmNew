package com.google.android.apps.messaging.shared.receiver;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akwl;
import defpackage.akxl;
import defpackage.axnw;
import defpackage.bazb;
import defpackage.buxo;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.ciqg;
import defpackage.cnfu;
import defpackage.coyq;
import defpackage.cpvq;
import defpackage.cpxj;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.enhd;
import defpackage.eolt;
import defpackage.eolu;
import defpackage.eolv;
import defpackage.ephv;
import defpackage.epif;
import defpackage.epih;
import defpackage.epkm;
import defpackage.epkp;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.eykj;
import defpackage.fazb;
import defpackage.ffbr;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class RestoreReceiver extends cnfu {
    public ffbr A;
    public ffbr B;
    public ffbr C;
    public fazb m;
    public fazb n;
    public fazb o;
    public fazb p;
    public fazb q;
    public elbx r;
    public ffbr s;
    public ffbr t;
    public ffbr u;
    public ffbr v;
    public ffbr w;
    public ffbr x;
    public ffbr y;
    public ffbr z;
    public static final cskc a = cskc.g("Bugle", "RestoreReceiver");
    static final cfva b = cfvl.e(cfvl.b, "telephony_db_recreated_notification", 0);
    static final cfva c = cfvl.f(cfvl.b, "telephony_db_recreated_notification_back_off_ms", TimeUnit.DAYS.toMillis(7));
    public static final cfva d = cfvl.i(cfvl.b, "restore_receiver_run_wipeout_detector", true);
    public static final cfva e = cfvl.i(cfvl.b, "restore_receiver_run_wipeout_detector_on_telephony_db_initial_creation", false);
    public static final cfva f = cfvl.i(cfvl.b, "reverse_sync_instead_of_wipeout", false);
    static final cfva g = cfvl.f(cfvl.b, "reverse_sync_delay", 5000);
    public static final cfva h = cfvl.r(174024787, "wipeout_when_no_sms_permissions");
    static final cfva i = cfvl.i(cfvl.b, "use_sync_telephony_threads_action_instead_of_wipeout", false);
    public static final cfva j = cfvl.i(cfvl.b, "reverse_sync_when_inconclusive_db_recreated", false);
    public static final cfva k = cfvl.i(cfvl.b, "reverse_sync_when_inconclusive_db_initial_creation", false);
    public static final cfva l = cfvl.i(cfvl.b, "reverse_sync_check_throttle", true);
    private static final cfva P = cfvl.e(cfvl.b, "restore_receiver_sync_telephony_threads_action_delay_ms", 5000);

    public static int m() {
        return ((Boolean) i.e()).booleanValue() ? 3 : 4;
    }

    private final elfl u(Context context) {
        Resources resources = context.getResources();
        long longValue = ((Long) c.e()).longValue();
        ciqg ciqgVar = (ciqg) this.t.b();
        ephv ephvVar = ephv.TELEPHONY_DB_RECREATED;
        String string = resources.getString(R.string.report_telephone_db_recreation_message);
        enhd enhdVar = new enhd();
        enhdVar.k("TelephonyRecreatedTelephonySmsCountBucket", v(((coyq) this.w.b()).ao()));
        enhdVar.k("TelephonyRecreatedTelephonyMmsCountBucket", v(((coyq) this.w.b()).an()));
        buxo d2 = MessagesTable.d();
        d2.z("createPsdMap-messages1");
        d2.r();
        d2.h(new Function() { // from class: cngt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = RestoreReceiver.a;
                buxzVar.L(0);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        enhdVar.k("TelephonyRecreatedBugleSmsCountBucket", v(d2.b().i()));
        buxo d3 = MessagesTable.d();
        d3.z("createPsdMap-messages2");
        d3.r();
        d3.h(new Function() { // from class: cngu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = RestoreReceiver.a;
                buxzVar.L(1);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        enhdVar.k("TelephonyRecreatedBugleMmsCountBucket", v(d3.b().i()));
        return ciqgVar.S(ephvVar, string, longValue, enhdVar.c());
    }

    private static String v(int i2) {
        return i2 == -1 ? "unknown" : i2 == 0 ? "zero" : i2 <= 10 ? "one_to_ten" : i2 <= 50 ? "eleven_to_fifty" : "more_than_fifty";
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.r.b("RestoreReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 5;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.Restore.Latency";
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    public final elfl j(final Context context, final Intent intent) {
        return elfo.g(new Callable() { // from class: cngx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cnex cnexVar;
                cnex cnexVar2;
                Intent intent2 = intent;
                Optional empty = Optional.empty();
                ekzz f2 = eleg.f("RestoreReceiver.executeAction");
                if (intent2 != null) {
                    try {
                        String action = intent2.getAction();
                        csjb e2 = RestoreReceiver.a.e();
                        e2.I(intent2);
                        e2.r();
                        boolean equals = "com.lge.bnr.intent.action.REQUEST_MESSAGE".equals(action);
                        RestoreReceiver restoreReceiver = RestoreReceiver.this;
                        boolean z = false;
                        if (!equals || intent2.getIntExtra("BNR_MODE", 0) != 2) {
                            boolean equals2 = "android.telephony.action.CARRIER_CONFIG_CHANGED".equals(action);
                            Context context2 = context;
                            if (equals2) {
                                if (intent2.getBooleanExtra("RESET_DOWNLOAD_PREFERENCES", false)) {
                                    ctyx a2 = ((ctyw) restoreReceiver.n.b()).a(-1);
                                    RestoreReceiver.a.q("removePrefs - roaming prefs deleted");
                                    a2.n(context2.getString(R.string.auto_retrieve_mms_when_roaming_pref_key));
                                    a2.n(context2.getString(R.string.auto_retrieve_mms_pref_key));
                                }
                            } else if ("com.hicloud.android.clone.action.SMS_RESTORE_COMPLETE".equals(action)) {
                                if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
                                    empty = Optional.of(eqqh.HUAWEI_SMS_RESTORE);
                                } else {
                                    ((coxg) restoreReceiver.o.b()).k(eqqh.HUAWEI_SMS_RESTORE);
                                }
                            } else if ("com.samsung.android.messaging.intent.action.TP_SYNC_FOR_RESTORE_MESSAGE".equals(action)) {
                                if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
                                    empty = Optional.of(eqqh.SAMSUNG_TELEPHONY_RESTORE);
                                } else {
                                    ((coxg) restoreReceiver.o.b()).k(eqqh.SAMSUNG_TELEPHONY_RESTORE);
                                }
                            } else if ("android.provider.action.SMS_MMS_DB_CREATED".equals(action)) {
                                if (intent2.getBooleanExtra("android.provider.extra.IS_INITIAL_CREATE", false)) {
                                    ((akzt) restoreReceiver.p.b()).c("Bugle.Datamodel.DatabaseTelephonyDBCreationInitial.Counts");
                                    ((cpxr) restoreReceiver.s.b()).a(2);
                                    if (((Boolean) RestoreReceiver.e.e()).booleanValue()) {
                                        Optional a3 = ((cpwl) restoreReceiver.v.b()).a(eplb.SMS_MMS_DB_CREATED);
                                        if (a3.isPresent() && ((Boolean) a3.get()).booleanValue()) {
                                            cnexVar2 = new cnex(5, 6);
                                        } else if (a3.isEmpty() && ((Boolean) RestoreReceiver.k.e()).booleanValue()) {
                                            cnexVar2 = new cnex(5, 7);
                                        } else {
                                            cnexVar2 = new cnex(2, true != a3.isPresent() ? 7 : 8);
                                        }
                                    } else {
                                        cnexVar2 = new cnex(2, 10);
                                    }
                                    restoreReceiver.n(2, cnexVar2.a, cnexVar2.b);
                                    restoreReceiver.p(context2, cnexVar2.a);
                                } else {
                                    RestoreReceiver.a.r("DATAMODEL_DATABASE_TELEPHONY_DB_CREATED_REBUILD");
                                    ((cpxr) restoreReceiver.s.b()).a(3);
                                    ((akzt) restoreReceiver.p.b()).c("Bugle.Datamodel.DatabaseTelephonyDBCreationRebuild.Counts");
                                    ((cpxj) restoreReceiver.z.b()).g(Optional.of(eykj.b(((cqoh) restoreReceiver.A.b()).f())), Optional.empty());
                                    if (((Boolean) RestoreReceiver.h.e()).booleanValue() && !((cptp) restoreReceiver.B.b()).a()) {
                                        restoreReceiver.o(3);
                                        cnexVar = new cnex(RestoreReceiver.m(), 4);
                                    } else if (((Boolean) RestoreReceiver.d.e()).booleanValue()) {
                                        Optional b2 = ((cpwl) restoreReceiver.v.b()).b(eplb.SMS_MMS_DB_RECREATED);
                                        Optional flatMap = b2.flatMap(new Function() { // from class: cngw
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                cskc cskcVar = RestoreReceiver.a;
                                                return ((cpwm) obj).a;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        if (b2.isPresent()) {
                                            Object obj = b2.get();
                                            if (((Boolean) flatMap.orElse(false)).booleanValue()) {
                                                int intValue = ((Number) ((cpwm) obj).b.orElse(0)).intValue();
                                                Object orElse = ((cpwm) obj).c.orElse(0);
                                                orElse.getClass();
                                                if (intValue + ((Number) orElse).intValue() != 0) {
                                                    restoreReceiver.o(4);
                                                    cnexVar = new cnex(RestoreReceiver.m(), 5);
                                                }
                                            }
                                        }
                                        boolean z2 = flatMap.isEmpty() && !((Boolean) RestoreReceiver.j.e()).booleanValue();
                                        boolean z3 = flatMap.isEmpty() && ((Boolean) RestoreReceiver.j.e()).booleanValue();
                                        boolean booleanValue = ((Boolean) flatMap.orElse(false)).booleanValue();
                                        if (z2) {
                                            cnexVar = new cnex(RestoreReceiver.m(), 7);
                                        } else {
                                            if (!z3) {
                                                if (booleanValue) {
                                                    booleanValue = true;
                                                } else {
                                                    cnexVar = new cnex(2, true != flatMap.isPresent() ? 7 : 8);
                                                }
                                            }
                                            if (((Boolean) RestoreReceiver.l.e()).booleanValue() && ((cpvq) restoreReceiver.y.b()).c()) {
                                                z = true;
                                            }
                                            if (((Boolean) RestoreReceiver.f.e()).booleanValue()) {
                                                if (!z) {
                                                    cnexVar = new cnex(5, true != booleanValue ? 7 : 6);
                                                }
                                                restoreReceiver.o(2);
                                                cnexVar = new cnex(RestoreReceiver.m(), 3);
                                            } else {
                                                if (!z) {
                                                    cnexVar = new cnex(RestoreReceiver.m(), 11);
                                                }
                                                restoreReceiver.o(2);
                                                cnexVar = new cnex(RestoreReceiver.m(), 3);
                                            }
                                        }
                                    } else {
                                        cnexVar = new cnex(RestoreReceiver.m(), 9);
                                    }
                                    restoreReceiver.n(3, cnexVar.a, cnexVar.b);
                                    restoreReceiver.p(context2, cnexVar.a);
                                }
                            } else if ("android.provider.action.SMS_MMS_DB_LOST".equals(action)) {
                                ((cpxr) restoreReceiver.s.b()).a(4);
                                restoreReceiver.n(4, 2, 2);
                            }
                        } else if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
                            empty = Optional.of(eqqh.LG_TELEPHONY_RESTORE);
                        } else {
                            ((coxg) restoreReceiver.o.b()).p(true);
                        }
                    } finally {
                    }
                }
                f2.close();
                return empty;
            }
        }, (Executor) this.u.b()).i(new eroh() { // from class: cngy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                return (optional.isPresent() && ((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) ? ((coxg) RestoreReceiver.this.o.b()).f((eqqh) optional.get()).h(new emwl() { // from class: cngv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = RestoreReceiver.a;
                        return null;
                    }
                }, erpp.a) : elfo.e(null);
            }
        }, (Executor) this.u.b());
    }

    public final void n(int i2, int i3, int i4) {
        epkm epkmVar = (epkm) epkp.a.createBuilder();
        epkmVar.copyOnWrite();
        epkp epkpVar = (epkp) epkmVar.instance;
        epkpVar.c = i2 - 1;
        epkpVar.b |= 1;
        epkmVar.copyOnWrite();
        epkp epkpVar2 = (epkp) epkmVar.instance;
        epkpVar2.d = i3 - 1;
        epkpVar2.b |= 2;
        epkmVar.copyOnWrite();
        epkp epkpVar3 = (epkp) epkmVar.instance;
        epkpVar3.e = i4 - 1;
        epkpVar3.b |= 4;
        epkp epkpVar4 = (epkp) epkmVar.build();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.TELEPHONY_DATABASE_ACTION_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epkpVar4.getClass();
        eolvVar2.aj = epkpVar4;
        eolvVar2.d |= 4;
        ((akxl) this.x.b()).j(eoluVar);
    }

    public final void o(int i2) {
        akxl akxlVar = (akxl) this.x.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.TELEPHONY_REVERSE_SYNC_NOT_ATTEMPTED_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        epif epifVar = (epif) epih.a.createBuilder();
        epifVar.copyOnWrite();
        epih epihVar = (epih) epifVar.instance;
        epihVar.c = i2 - 1;
        epihVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epih epihVar2 = (epih) epifVar.build();
        epihVar2.getClass();
        eolvVar2.az = epihVar2;
        eolvVar2.d |= 1048576;
        akxlVar.j(eoluVar);
    }

    public final void p(Context context, int i2) {
        int i3 = i2 - 1;
        if (i3 == 2) {
            ((bazb) this.C.b()).a(true).x(((Integer) P.e()).intValue());
            return;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                return;
            }
            ((cpxj) this.z.b()).f(eykj.b(((cqoh) this.A.b()).f()));
            ((cpvq) this.y.b()).b(Duration.ofMillis(((Long) g.e()).longValue()));
            return;
        }
        int intValue = ((Integer) b.e()).intValue();
        csjb e2 = a.e();
        e2.I("Telephony DB recreated");
        e2.y("DB_RECREATED_NOTIFICATION", intValue);
        e2.r();
        elfl e3 = elfo.e(null);
        if (intValue == 1) {
            ((akwl) this.q.b()).a("android.provider.action.SMS_MMS_DB_CREATED");
        } else if (intValue == 2) {
            e3 = u(context);
        } else if (intValue == 3) {
            ((akwl) this.q.b()).a("android.provider.action.SMS_MMS_DB_CREATED");
            e3 = u(context);
        }
        e3.k(axnw.c(new Consumer() { // from class: cngs
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                RestoreReceiver restoreReceiver = RestoreReceiver.this;
                ffbr ffbrVar = restoreReceiver.x;
                if (ffbrVar != null && ffbrVar.b() != null) {
                    ((akxl) restoreReceiver.x.b()).b();
                }
                ((ActivityManager) ((cpdg) restoreReceiver.m.b()).c.getSystemService("activity")).clearApplicationUserData();
                cpdg.a.q("force exit.");
                System.exit(0);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), erpp.a);
    }
}
