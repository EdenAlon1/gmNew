package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.reminder.ReminderReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddcy implements cnla {
    public static final cskc a = cskc.g("Bugle", "ReminderApiImpl");
    public static final emyl b = cfvl.x(196695273, "enable_skip_send_broadcast_to_close_system_dialog_in_reminder");
    public static final ConversationIdType c = bdgq.a;
    public final Context d;
    public final ffbr e;
    public final errl f;
    public final ffbr g;
    public final fazb h;
    public final ffbr i;
    private final ffbr j;
    private final errl k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final Optional s;

    public ddcy(Context context, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, ffbr ffbrVar3, fazb fazbVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, Optional optional) {
        this.d = context;
        this.j = ffbrVar;
        this.e = ffbrVar2;
        this.f = errlVar;
        this.k = errlVar2;
        this.g = ffbrVar3;
        this.h = fazbVar;
        this.l = ffbrVar4;
        this.m = ffbrVar5;
        this.n = ffbrVar6;
        this.i = ffbrVar7;
        this.o = ffbrVar8;
        this.p = ffbrVar9;
        this.q = ffbrVar10;
        this.r = ffbrVar11;
        this.s = optional;
    }

    public static boolean A(final String str) {
        String[] strArr = bxct.a;
        bxci bxciVar = new bxci();
        bxciVar.f("ReminderApiImpl#deleteReminder");
        bxciVar.a(new Function() { // from class: ddcr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxcs bxcsVar = (bxcs) obj;
                cskc cskcVar = ddcy.a;
                bxcsVar.c(str);
                return bxcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bxciVar.d() > 0;
    }

    public static boolean C(String[] strArr) {
        String[] strArr2 = bxct.a;
        bxcq bxcqVar = new bxcq();
        bxcqVar.ap("markReminderAsNotified");
        bxcqVar.c(byzf.NOTIFIED);
        bxcs bxcsVar = new bxcs();
        bxcsVar.aq(new dtrw("reminders._id", 3, bxcs.av(strArr), false));
        bxcqVar.d(bxcsVar);
        return bxcqVar.b().e() > 0;
    }

    public static boolean I(String str, long j) {
        String[] strArr = bxct.a;
        bxcq bxcqVar = new bxcq();
        bxcqVar.ap("updateReminderTriggerTimeAndResetNotified");
        bxcqVar.a.put("trigger_time", Long.valueOf(j));
        bxcqVar.c(byzf.SET);
        bxcs bxcsVar = new bxcs();
        bxcsVar.c(str);
        bxcqVar.d(bxcsVar);
        return bxcqVar.b().e() > 0;
    }

    private static int L(int i) {
        return i | VCardConfig.FLAG_APPEND_TYPE_PARAM;
    }

    private final long M() {
        long longValue = ((Long) ddjr.f.e()).longValue();
        return ((cqoh) this.g.b()).f().toEpochMilli() + (longValue > 0 ? TimeUnit.SECONDS.toMillis(longValue) : TimeUnit.MINUTES.toMillis(60L));
    }

    private final void N(eosy eosyVar) {
        if (!((altk) this.l.b()).am()) {
            a.m("Clearcut loggings are disabled.");
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_REMINDER;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eosz eoszVar = (eosz) eosyVar.build();
        eoszVar.getClass();
        eolvVar2.T = eoszVar;
        eolvVar2.c |= 32768;
        ((akxl) this.m.b()).j(eoluVar);
    }

    final boolean B(String str) {
        AlarmManager alarmManager = (AlarmManager) this.d.getSystemService("alarm");
        if (alarmManager == null) {
            a.r("Cannot delete reminder. Alarm Manager is null");
            return false;
        }
        alarmManager.cancel(y(str));
        a.p("Reminder is removed from AlarmManager");
        return true;
    }

    public final boolean D(final ConversationIdType conversationIdType, boolean z) {
        if (!conversationIdType.b()) {
            this.s.ifPresent(new Consumer() { // from class: ddci
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    aend aendVar = (aend) ((ffbr) obj).b();
                    ffbr ffbrVar = ddcy.this.g;
                    aendVar.d = Optional.of(new aehi(conversationIdType, aemb.REMINDER, ((cqoh) ffbrVar.b()).f().toEpochMilli()));
                    aendVar.b.a(elfo.e(null), "HOME_CONVERSATION_REFRESH_KEY");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (z) {
            return false;
        }
        return G();
    }

    public final boolean E(ConversationIdType conversationIdType) {
        return F(conversationIdType, false);
    }

    public final boolean F(ConversationIdType conversationIdType, boolean z) {
        if (!conversationIdType.b()) {
            ddkk ddkkVar = (ddkk) this.q.b();
            ddkkVar.b.a(erqt.i(null), "reminders_key".concat(String.valueOf(String.valueOf(conversationIdType))));
            if (ddjr.c()) {
                return D(conversationIdType, z);
            }
        }
        if (z) {
            return false;
        }
        return G();
    }

    public final boolean G() {
        ddjv ddjvVar = (ddjv) this.o.b();
        synchronized (ddjvVar.a) {
            Collection.EL.stream(ddjvVar.a).forEach(new Consumer() { // from class: ddju
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cyhq cyhqVar = (cyhq) obj;
                    cyhqVar.a.c.a(elfo.e(null), "REMINDERS_BANNER_STATE_KEY".concat(String.valueOf(String.valueOf(cyhqVar.b))));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ((cbgf) this.p.b()).c();
        return ((cins) this.h.b()).J();
    }

    final boolean H(String str, long j) {
        if (str == null) {
            a.r("Cannot set reminder. Reminder ID is null.");
            return false;
        }
        AlarmManager alarmManager = (AlarmManager) this.d.getSystemService("alarm");
        if (alarmManager == null) {
            a.r("Cannot set reminder. Alarm Manager is null.");
            return false;
        }
        alarmManager.setExactAndAllowWhileIdle(0, j, y(str));
        csjb c2 = a.c();
        c2.I(String.format(Locale.US, "Reminder scheduled for %d min later.", 60));
        c2.r();
        return true;
    }

    public final void J(int i, int i2, String str) {
        bxbi a2 = bxct.a(str);
        if (a2 != null) {
            K(i, i2, a2.k(), a2.m());
        }
    }

    public final void K(int i, int i2, long j, MessageIdType messageIdType) {
        MessageCoreData z = ((bdmq) this.j.b()).z(messageIdType);
        eosy eosyVar = (eosy) eosz.a.createBuilder();
        ephk ephkVar = (ephk) epho.a.createBuilder();
        ephkVar.copyOnWrite();
        epho ephoVar = (epho) ephkVar.instance;
        ephoVar.c = i - 1;
        ephoVar.b |= 1;
        ephkVar.copyOnWrite();
        epho ephoVar2 = (epho) ephkVar.instance;
        ephoVar2.d = i2 - 1;
        ephoVar2.b |= 2;
        ephkVar.copyOnWrite();
        epho ephoVar3 = (epho) ephkVar.instance;
        ephoVar3.b |= 4;
        ephoVar3.e = j;
        long d = z == null ? 0L : ((akvz) this.n.b()).d(z);
        ephkVar.copyOnWrite();
        epho ephoVar4 = (epho) ephkVar.instance;
        ephoVar4.b |= 8;
        ephoVar4.f = d;
        eosyVar.copyOnWrite();
        eosz eoszVar = (eosz) eosyVar.instance;
        epho ephoVar5 = (epho) ephkVar.build();
        ephoVar5.getClass();
        eoszVar.c = ephoVar5;
        eoszVar.b |= 1;
        N(eosyVar);
    }

    @Override // defpackage.cnla
    public final kma a(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        Context context = this.d;
        String string = context.getString(R.string.notification_set_reminder);
        Intent intent = new Intent(context, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.set_reminder");
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.putExtra("message_id", messageIdType.b());
        intent.setData(bcqc.c(this.d, conversationIdType, messageIdType, new String[0]));
        klz klzVar = new klz(R.drawable.quantum_ic_alarm_grey600_24, string, PendingIntent.getBroadcast(this.d, 129, intent, L(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES)));
        klzVar.d = false;
        return klzVar.a();
    }

    @Override // defpackage.cnla
    public final bxbi b(String str) {
        return bxct.a(str);
    }

    @Override // defpackage.cnla
    public final elfl c(final String[] strArr) {
        return elfo.g(eldl.m(new Callable() { // from class: ddcj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean C = ddcy.C(strArr);
                boolean z = false;
                if (((cins) ddcy.this.h.b()).J() && C) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), this.f);
    }

    @Override // defpackage.cnla
    public final elfl d() {
        return elfo.g(new Callable() { // from class: ddbx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bxco c2 = bxct.c();
                c2.z("getTriggeredReminders");
                bxcs bxcsVar = new bxcs();
                bxcsVar.e(((cqoh) ddcy.this.g.b()).f().toEpochMilli());
                bxcsVar.d(byzf.SET);
                c2.d(bxcsVar);
                bxca bxcaVar = (bxca) c2.b().p(bxct.c.a);
                try {
                    engw f = bxcaVar.f();
                    bxcaVar.close();
                    return f;
                } catch (Throwable th) {
                    try {
                        bxcaVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.f).i(new eroh() { // from class: ddby
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ddcy.this.c((String[]) ((List) obj).toArray(new String[0]));
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final elfl e() {
        return elfo.g(new Callable() { // from class: ddbz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ddcy ddcyVar = ddcy.this;
                boolean G = ddcyVar.G();
                if (ddjr.c()) {
                    ddcyVar.z();
                }
                return Boolean.valueOf(G);
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final elfl f(final String str) {
        return elfl.g(this.f.submit(eldl.m(new Callable() { // from class: ddce
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = ddcy.a;
                bxbi a2 = bxct.a(str);
                return a2 == null ? ddcy.c : a2.l();
            }
        }))).h(new emwl() { // from class: ddcf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ddcy ddcyVar = ddcy.this;
                boolean D = ddcyVar.D((ConversationIdType) obj, false);
                if (ddjr.c()) {
                    ddcyVar.z();
                }
                return Boolean.valueOf(D);
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final elfl g() {
        return elfo.g(new Callable() { // from class: ddco
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long longValue = ((Long) ddjr.d.e()).longValue();
                if (((Long) ddjr.g.e()).longValue() >= 0) {
                    longValue = ((Long) ddjr.g.e()).longValue() * 1000;
                }
                long epochMilli = ((cqoh) ddcy.this.g.b()).f().toEpochMilli() - longValue;
                bxco c2 = bxct.c();
                c2.z("getExpiredReminders");
                bxcs bxcsVar = new bxcs();
                bxcsVar.e(epochMilli);
                c2.k(new bxcr(bxcsVar));
                return c2.b().y();
            }
        }, this.f).i(new eroh() { // from class: ddcp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final engw engwVar = (engw) obj;
                final ddcy ddcyVar = ddcy.this;
                return elfo.g(eldl.m(new Callable() { // from class: ddcq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ddcy ddcyVar2;
                        HashSet hashSet = new HashSet();
                        final ArrayList arrayList = new ArrayList();
                        Iterator it = engwVar.iterator();
                        while (true) {
                            ddcyVar2 = ddcy.this;
                            if (!it.hasNext()) {
                                break;
                            }
                            bxbi bxbiVar = (bxbi) it.next();
                            hashSet.add(bxbiVar.l());
                            arrayList.add(bxbiVar.n());
                            ddcyVar2.K(12, 11, bxbiVar.k(), bxbiVar.m());
                            ddcyVar2.B(bxbiVar.n());
                        }
                        String[] strArr = bxct.a;
                        bxci bxciVar = new bxci();
                        bxciVar.f("ReminderApiImpl#deleteReminders");
                        bxciVar.a(new Function() { // from class: ddcv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                bxcs bxcsVar = (bxcs) obj2;
                                cskc cskcVar = ddcy.a;
                                bxcsVar.aq(new dtrw("reminders._id", 3, bxcs.at(arrayList), false));
                                return bxcsVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int d = bxciVar.d();
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            ddcyVar2.F((ConversationIdType) it2.next(), true);
                        }
                        ddcyVar2.G();
                        return Integer.valueOf(d);
                    }
                }), ddcyVar.f);
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final elfl h(final MessageIdType messageIdType, final ConversationIdType conversationIdType) {
        return elfo.g(new Callable() { // from class: ddch
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MessageIdType messageIdType2 = messageIdType;
                bxbi b2 = bxct.b(messageIdType2);
                boolean z = false;
                if (b2 == null) {
                    return false;
                }
                ddcy ddcyVar = ddcy.this;
                ddcyVar.K(6, 4, b2.k(), messageIdType2);
                if (ddcyVar.B(b2.n()) && ddcy.A(b2.n()) && ddcyVar.E(conversationIdType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final ListenableFuture i(final ConversationId conversationId, final String str) {
        return ddjr.c() ? elfo.g(new Callable() { // from class: ddcs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean C = ddcy.C(new String[]{str});
                ddcy ddcyVar = ddcy.this;
                if (!ctid.e || !((Boolean) ((cfup) ddcy.b.get()).e()).booleanValue()) {
                    ddcyVar.d.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                }
                boolean z = false;
                if (C && ddcyVar.G()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f) : elfo.g(new Callable() { // from class: ddct
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = ddcy.a;
                bxbi a2 = bxct.a(str);
                return a2 == null ? bdhb.a : a2.m();
            }
        }, this.f).h(new emwl() { // from class: ddcu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                MessageIdType messageIdType = (MessageIdType) obj;
                boolean z = false;
                if (messageIdType.c()) {
                    return false;
                }
                String str2 = str;
                ConversationId conversationId2 = conversationId;
                ddcy ddcyVar = ddcy.this;
                ((ayfg) ddcyVar.i.b()).B(ddcyVar.d, conversationId2, messageIdType);
                boolean C = ddcy.C(new String[]{str2});
                if (!ctid.e || !((Boolean) ((cfup) ddcy.b.get()).e()).booleanValue()) {
                    ddcyVar.d.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                }
                if (C && ddcyVar.G()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final void j() {
        csvs.c(this.f.submit(eldl.l(new Runnable() { // from class: ddbv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                bxco c2 = bxct.c();
                c2.z("getFutureReminders");
                bxcs bxcsVar = new bxcs();
                ddcy ddcyVar = ddcy.this;
                bxcsVar.aq(new dtwe("reminders.trigger_time", 7, Long.valueOf(((cqoh) ddcyVar.g.b()).f().toEpochMilli())));
                bxcsVar.d(byzf.SET);
                c2.d(bxcsVar);
                engw y = c2.b().y();
                int i = ((enou) y).c;
                for (int i2 = 0; i2 < i; i2++) {
                    bxbi bxbiVar = (bxbi) y.get(i2);
                    ddcyVar.H(bxbiVar.n(), bxbiVar.k());
                }
            }
        })), "Bugle", "Failed to reschedule future reminders.");
        final cins cinsVar = (cins) this.h.b();
        cinsVar.getClass();
        csvs.c(this.f.submit(eldl.l(new Runnable() { // from class: ddcg
            @Override // java.lang.Runnable
            public final void run() {
                cins.this.J();
            }
        })), "Bugle", "Failed to refresh reminder notifications.");
    }

    @Override // defpackage.cnla
    public final void k(aeiy aeiyVar) {
        if (aeiyVar != null) {
            ((ddkn) this.r.b()).a.add(aeiyVar);
        }
    }

    @Override // defpackage.cnla
    public final PendingIntent l(String[] strArr) {
        Intent intent = new Intent(this.d, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.dismiss_reminder_notifications");
        intent.putExtra("reminder_ids", strArr);
        intent.setData(Uri.parse(TextUtils.join(",", strArr)));
        return PendingIntent.getBroadcast(this.d, 132, intent, L(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    @Override // defpackage.cnla
    public final PendingIntent m(String str) {
        Intent intent = new Intent(this.d, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.mark_as_done");
        intent.putExtra("reminder_id", str);
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(this.d, 133, intent, L(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    @Override // defpackage.cnla
    public final PendingIntent n(ConversationIdType conversationIdType, String str) {
        Intent intent = new Intent(this.d, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.snooze_reminder");
        intent.putExtra("reminder_id", str);
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(this.d, 134, intent, L(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    @Override // defpackage.cnla
    public final PendingIntent o(Context context, ConversationIdType conversationIdType, String str) {
        if (ddjr.c()) {
            bxbi a2 = bxct.a(str);
            return ((ayfg) this.i.b()).q(context, new BugleConversationId(conversationIdType), a2 == null ? bdhb.a : a2.m(), str);
        }
        Intent intent = new Intent(context, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.view_reminder");
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.putExtra("reminder_id", str);
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(context, 135, intent, L(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    @Override // defpackage.cnla
    public final elfl p(final ConversationIdType conversationIdType) {
        return elfo.g(eldl.m(new Callable() { // from class: ddbw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = engw.d;
                engr engrVar = new engr();
                long epochMilli = ((cqoh) ddcy.this.g.b()).f().toEpochMilli();
                String[] strArr = ddjn.a;
                ddjk ddjkVar = new ddjk(ddjn.a);
                ddjkVar.z("+getTriggeredReminderMessages");
                ddjm ddjmVar = new ddjm();
                ddjmVar.aq(new dtrt("messages.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
                ddjmVar.aq(new dtwe("reminders.trigger_time", 10, Long.valueOf(epochMilli)));
                ddjkVar.k(new ddjl(ddjmVar));
                ddjkVar.C((String) DesugarArrays.stream(new ddjh[]{new ddjh(ddjn.b.a)}).map(new Function() { // from class: ddjj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ddjh) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining(", ")));
                ddjg ddjgVar = (ddjg) ddjkVar.b().o();
                while (ddjgVar.moveToNext()) {
                    try {
                        engrVar.h(ddjgVar.c());
                    } catch (Throwable th) {
                        try {
                            ddjgVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                ddjgVar.close();
                return engrVar.g();
            }
        }), this.f);
    }

    @Override // defpackage.cnla
    public final void q(aeiy aeiyVar) {
        if (aeiyVar == null) {
            return;
        }
        ((ddkn) this.r.b()).a.remove(aeiyVar);
    }

    @Override // defpackage.cnla
    public final elfl r(final String str, final ConversationIdType conversationIdType, final int i) {
        return elfo.g(new Callable() { // from class: ddcn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ddcy ddcyVar = ddcy.this;
                int i2 = i;
                String str2 = str;
                ddcyVar.J(i2, 6, str2);
                boolean A = ddcy.A(str2);
                boolean z = false;
                if (A && ddcyVar.E(conversationIdType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final elfl s(MessageIdType messageIdType, ConversationIdType conversationIdType, int i) {
        final long M = M();
        return elfl.g(v(messageIdType, conversationIdType, M, i)).h(new emwl() { // from class: ddcd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                cskc cskcVar = ddcy.a;
                if (bool == null || !bool.booleanValue()) {
                    return 0L;
                }
                return Long.valueOf(M);
            }
        }, this.k);
    }

    @Override // defpackage.cnla
    public final elfl t(final ConversationIdType conversationIdType, final String str, final int i) {
        final long M = M();
        return elfo.g(new Callable() { // from class: ddca
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(ddcy.this.H(str, M));
            }
        }, this.k).h(new emwl() { // from class: ddcb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = ddcy.a;
                boolean z = false;
                if (((Boolean) obj).booleanValue()) {
                    if (ddcy.I(str, M)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }, this.f).h(new emwl() { // from class: ddcc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ddcy ddcyVar = ddcy.this;
                ddcyVar.J(i, 5, str);
                if (((Boolean) obj).booleanValue() && ddcyVar.E(conversationIdType)) {
                    return Long.valueOf(M);
                }
                return 0L;
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final elfl u(final MessageIdType messageIdType, final ConversationIdType conversationIdType, final long j, final int i) {
        return elfo.g(new Callable() { // from class: ddcw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = ddcy.a;
                return Optional.ofNullable(bxct.b(MessageIdType.this));
            }
        }, this.f).h(new emwl() { // from class: ddcx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bxbi bxbiVar = (bxbi) ((Optional) obj).orElse(null);
                boolean z = false;
                if (bxbiVar == null) {
                    ddcy.a.r("Cannot update reminder. Reminder is not found by messageId.");
                    return false;
                }
                long j2 = j;
                int i2 = i;
                ddcy ddcyVar = ddcy.this;
                ddcyVar.J(i2, 3, bxbiVar.n());
                if (ddcyVar.H(bxbiVar.n(), j2) && ddcy.I(bxbiVar.n(), j2) && ddcyVar.E(conversationIdType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final ListenableFuture v(final MessageIdType messageIdType, final ConversationIdType conversationIdType, final long j, final int i) {
        return elfo.g(new Callable() { // from class: ddck
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = ddcy.a;
                ConversationIdType conversationIdType2 = ConversationIdType.this;
                final MessageIdType messageIdType2 = messageIdType;
                final long j2 = j;
                if (!conversationIdType2.b()) {
                    return cnld.a(conversationIdType2, messageIdType2, j2);
                }
                if (messageIdType2.c()) {
                    return null;
                }
                return (String) MessagesTable.i(messageIdType2, new Function() { // from class: cnlb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ConversationIdType C = ((MessagesTable.BindData) obj).C();
                        if (C.b()) {
                            return null;
                        }
                        return cnld.a(C, MessageIdType.this, j2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.f).h(new emwl() { // from class: ddcl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ddcy ddcyVar = ddcy.this;
                ConversationIdType conversationIdType2 = conversationIdType;
                String str = (String) obj;
                if (!conversationIdType2.b()) {
                    cirp cirpVar = (cirp) ddcyVar.e.b();
                    cirn cirnVar = (cirn) ciro.a.createBuilder();
                    String a2 = conversationIdType2.a();
                    cirnVar.copyOnWrite();
                    ciro ciroVar = (ciro) cirnVar.instance;
                    a2.getClass();
                    ciroVar.a();
                    ciroVar.b.add(a2);
                    ((cevh) cirpVar.a.b()).a(ceyr.g("mark_as_notified", (ciro) cirnVar.build()));
                }
                return Boolean.valueOf(ddcyVar.H(str, j));
            }
        }, this.f).h(new emwl() { // from class: ddcm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ddcy ddcyVar = ddcy.this;
                ddcyVar.K(i, 2, j, messageIdType);
                boolean z = false;
                if (((Boolean) obj).booleanValue() && ddcyVar.E(conversationIdType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.cnla
    public final void w(int i, int i2) {
        eosy eosyVar = (eosy) eosz.a.createBuilder();
        ephk ephkVar = (ephk) epho.a.createBuilder();
        ephkVar.copyOnWrite();
        epho ephoVar = (epho) ephkVar.instance;
        ephoVar.c = i - 1;
        ephoVar.b |= 1;
        ephkVar.copyOnWrite();
        epho ephoVar2 = (epho) ephkVar.instance;
        ephoVar2.d = i2 - 1;
        ephoVar2.b |= 2;
        eosyVar.copyOnWrite();
        eosz eoszVar = (eosz) eosyVar.instance;
        epho ephoVar3 = (epho) ephkVar.build();
        ephoVar3.getClass();
        eoszVar.c = ephoVar3;
        eoszVar.b |= 1;
        N(eosyVar);
    }

    @Override // defpackage.cnla
    public final void x(int i) {
        if (!((altk) this.l.b()).am()) {
            a.m("Clearcut loggings are disabled.");
            return;
        }
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_REMINDER;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eosy eosyVar = (eosy) eosz.a.createBuilder();
        ephp ephpVar = (ephp) ephr.a.createBuilder();
        ephpVar.copyOnWrite();
        ephr ephrVar = (ephr) ephpVar.instance;
        ephrVar.c = i - 1;
        ephrVar.b |= 1;
        eosyVar.copyOnWrite();
        eosz eoszVar = (eosz) eosyVar.instance;
        ephr ephrVar2 = (ephr) ephpVar.build();
        ephrVar2.getClass();
        eoszVar.d = ephrVar2;
        eoszVar.b |= 2;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eosz eoszVar2 = (eosz) eosyVar.build();
        eoszVar2.getClass();
        eolvVar2.T = eoszVar2;
        eolvVar2.c |= 32768;
        ((akxl) this.m.b()).j(eoluVar);
    }

    final PendingIntent y(String str) {
        Intent intent = new Intent(this.d, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.trigger_reminder");
        intent.putExtra("reminder_id", str);
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(this.d, 130, intent, L(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z() {
        engw n = engw.n(((ddkn) this.r.b()).a);
        int size = n.size();
        for (int i = 0; i < size; i++) {
            aeiy aeiyVar = (aeiy) n.get(i);
            aeiz.a.p("Invalidating current data source since a reminder has triggered.");
            aeij aeijVar = aeiyVar.a.b;
            if (aeijVar != null) {
                aeijVar.c();
            }
        }
    }
}
