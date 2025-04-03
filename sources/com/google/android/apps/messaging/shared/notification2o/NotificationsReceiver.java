package com.google.android.apps.messaging.shared.notification2o;

import android.app.ActivityOptions;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.notification2o.NotificationsReceiver;
import defpackage.cird;
import defpackage.cisu;
import defpackage.cisw;
import defpackage.ciut;
import defpackage.ciuu;
import defpackage.ciux;
import defpackage.civa;
import defpackage.civq;
import defpackage.civr;
import defpackage.civu;
import defpackage.ciwb;
import defpackage.cixf;
import defpackage.cixp;
import defpackage.cixq;
import defpackage.ctho;
import defpackage.cthp;
import defpackage.dxbr;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.elfr;
import defpackage.enrr;
import defpackage.ensk;
import defpackage.ensn;
import defpackage.ensz;
import defpackage.entd;
import defpackage.ente;
import defpackage.erpp;
import defpackage.ffbr;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class NotificationsReceiver extends ciut {
    public static final entd a = entd.c("BugleNotifications");
    public ffbr b;
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;

    private final void m(PendingIntent pendingIntent) {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        try {
            if (Build.VERSION.SDK_INT < 34) {
                pendingIntent.send();
                return;
            }
            pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
            pendingIntent.send((Context) this.f.b(), 0, null, null, null, null, pendingIntentBackgroundActivityStartMode.toBundle());
        } catch (PendingIntent.CanceledException e) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "launchPendingIntent", (char) 292, "NotificationsReceiver.java")).q("Error running pending intent for notification action");
        }
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.b.b()).b("NotificationsReceiver receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.Notification2o.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }

    @Override // defpackage.cnhy
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.Notification2o.Latency";
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        String id;
        String id2;
        NotificationChannel notificationChannel;
        String id3;
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "doInBackground", 52, "NotificationsReceiver.java")).q("Notifications receiver do in background");
        if (Objects.equals(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
            ciwb ciwbVar = (ciwb) this.e.b();
            HashSet hashSet = (HashSet) Collection.EL.stream(ciwbVar.b.c()).map(new Function() { // from class: civy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String id4;
                    id4 = akb$$ExternalSyntheticApiModelOutline0.m(obj).getId();
                    return id4;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: civz
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new HashSet();
                }
            }));
            for (civa civaVar : ((Map) ciwbVar.d.b()).values()) {
                Optional f = civaVar.f();
                if (f.isEmpty() || !hashSet.contains(((cisu) f.get()).a)) {
                    ensk h = ciwb.a.h();
                    h.Y(ente.a, "BugleNotifications");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(new ensn("channel_builder_empty", Boolean.class, false, false), Boolean.valueOf(f.isEmpty()));
                    enrrVar.Y(cird.k, (String) f.map(new Function() { // from class: ciwa
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((civu) obj).h();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(null));
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 94, "NotificationChannelManager.java")).q("Channel does not exist or builder info is empty for blueprint, not refreshing channel name");
                } else {
                    NotificationChannel e = ciwbVar.e((civu) f.get());
                    ensk h2 = ciwb.a.h();
                    h2.Y(ente.a, "BugleNotifications");
                    enrr enrrVar2 = (enrr) h2;
                    enrrVar2.Y(cird.n, civaVar.d());
                    ensn ensnVar = cird.k;
                    id3 = e.getId();
                    enrrVar2.Y(ensnVar, id3);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 105, "NotificationChannelManager.java")).q("Updating channel for locale change");
                }
            }
            NotificationChannel g = ciwbVar.g();
            ensk h3 = ciwb.a.h();
            h3.Y(ente.a, "BugleNotifications");
            enrr enrrVar3 = (enrr) h3;
            ensn ensnVar2 = cird.k;
            id = g.getId();
            enrrVar3.Y(ensnVar2, id);
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 112, "NotificationChannelManager.java")).q("Updating misc channels for locale change");
            NotificationChannel f2 = ciwbVar.f();
            ensk h4 = ciwb.a.h();
            h4.Y(ente.a, "BugleNotifications");
            enrr enrrVar4 = (enrr) h4;
            ensn ensnVar3 = cird.k;
            id2 = f2.getId();
            enrrVar4.Y(ensnVar3, id2);
            ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 117, "NotificationChannelManager.java")).q("Updating foreground channel for locale change");
            cthp cthpVar = (cthp) ciwbVar.c.b();
            cthpVar.i("bugle_reminder_channel", cthpVar.b.getString(R.string.bugle_notification_reminders_channel_name), ctho.REMINDERS.e);
            notificationChannel = ((NotificationManager) cthpVar.a.b()).getNotificationChannel("download-notification-channel-id");
            if (notificationChannel != null) {
                dxbr.c(cthpVar.b);
            }
            cthpVar.i("bugle_while_using_web_channel_v1", cthpVar.b.getString(R.string.bugle_notification_silent_default_channel_name), ctho.WEB_SETTINGS.e);
            cthpVar.i("bugle_connected_to_web_channel_v1", cthpVar.b.getResources().getString(R.string.bugle_notification_ditto_channel_name), ctho.WEB_SETTINGS.e);
            cthpVar.i("bugle_report_issue_channel", cthpVar.b.getResources().getString(R.string.bugle_notification_report_issue_channel_name), null);
            cthpVar.i("bugle_auto_moved_spam_channel", cthpVar.b.getString(R.string.automoved_spam_notification_channel_name), null);
            cthpVar.i("bugle_rcs_not_delivered_channel", cthpVar.b.getResources().getString(R.string.rcs_not_delivered_notification_channel_name), ctho.DEFAULT_SETTINGS.e);
            cthpVar.i("bugle_business_messages_channel", cthpVar.b.getResources().getString(R.string.bugle_notification_business_messages_channel_name), ctho.DEFAULT_SETTINGS.e);
            ensk h5 = ciwb.a.h();
            h5.Y(ente.a, "BugleNotifications");
            ((enrr) ((enrr) h5).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "refreshExistingNotificationChannelNames", 120, "NotificationChannelManager.java")).q("Updating legacy channels for locale change");
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("extra_notification_type")) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runCallbacks", 66, "NotificationsReceiver.java")).q("Skipping notification callbacks, missing notificationType or extras");
            return;
        }
        cixf b = cixf.b(extras.getInt("extra_notification_type", cixf.NT_UNKNOWN.j));
        b.getClass();
        Optional ofNullable = Optional.ofNullable(extras.getString("extra_notification_tag"));
        boolean z = extras.getBoolean("extra_is_summary_notification", false);
        Bundle bundle = extras.getBundle("extra_notification_bundle");
        if (bundle == null) {
            bundle = new Bundle();
        }
        cisw ciswVar = new cisw(b, ofNullable, bundle, z);
        ciux b2 = ciux.b(intent.getIntExtra("extra_notification_action_type", ciux.NAT_UNKNOWN.p));
        b2.getClass();
        if (b2 == ciux.NAT_UNKNOWN) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cird.n, ciswVar.a);
            enszVar.Y(cird.d, (String) ciswVar.b.orElse(null));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runActionCallbacks", 113, "NotificationsReceiver.java")).q("Unknown notification action type, not creating callback");
        } else {
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            elfl e2 = elfo.e(null);
            if (((Map) this.c.b()).containsKey(ciux.NAT_DIRECTOR)) {
                ciuu ciuuVar = (ciuu) ((Map) this.c.b()).get(ciux.NAT_DIRECTOR);
                ciuuVar.getClass();
                e2 = ciuuVar.a(this, intent, extras2, ciswVar);
            }
            elfl e3 = elfo.e(null);
            if (((Map) this.c.b()).containsKey(b2)) {
                ciuu ciuuVar2 = (ciuu) ((Map) this.c.b()).get(b2);
                ciuuVar2.getClass();
                e3 = ciuuVar2.a(this, intent, extras2, ciswVar);
            } else {
                ensz enszVar2 = (ensz) a.h();
                enszVar2.Y(cird.p, b2);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runActionCallbacks", 140, "NotificationsReceiver.java")).q("No action callback, only running on director");
            }
            elfr.l(elfo.m(e3, e2).a(new Callable() { // from class: cixo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    entd entdVar = NotificationsReceiver.a;
                    return null;
                }
            }, erpp.a), new cixp(b2), erpp.a);
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 == null || !extras3.containsKey("extra_notification_callback_type")) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runNotificationCallbacks", 170, "NotificationsReceiver.java")).q("Skipping notification callbacks, missing notificationType or callbackType");
        } else {
            String string = extras3.getString("extra_notification_callback_type", civq.NOTIFICATION_CALLBACK_UNKNOWN.name());
            civq civqVar = civq.NOTIFICATION_CALLBACK_UNKNOWN;
            try {
                civqVar = (civq) Enum.valueOf(civq.class, string);
            } catch (IllegalArgumentException unused) {
            }
            cixf cixfVar = ciswVar.a;
            if (intent.getExtras() == null) {
                new Bundle();
            }
            elfl e4 = elfo.e(null);
            elfl e5 = elfo.e(null);
            int ordinal = civqVar.ordinal();
            if (ordinal == 1) {
                if (((Map) this.d.b()).containsKey(cixfVar)) {
                    e5 = ((civr) ((Map) this.d.b()).get(cixfVar)).e(ciswVar);
                }
                civr civrVar = (civr) ((Map) this.d.b()).get(cixf.NT_DIRECTOR);
                civrVar.getClass();
                e4 = civrVar.e(ciswVar);
            } else if (ordinal == 2) {
                if (((Map) this.d.b()).containsKey(cixfVar)) {
                    e5 = ((civr) ((Map) this.d.b()).get(cixfVar)).f(ciswVar);
                }
                civr civrVar2 = (civr) ((Map) this.d.b()).get(cixf.NT_DIRECTOR);
                civrVar2.getClass();
                e4 = civrVar2.f(ciswVar);
            } else if (ordinal == 3) {
                if (((Map) this.d.b()).containsKey(cixfVar)) {
                    e5 = ((civr) ((Map) this.d.b()).get(cixfVar)).d(ciswVar);
                }
                civr civrVar3 = (civr) ((Map) this.d.b()).get(cixf.NT_DIRECTOR);
                civrVar3.getClass();
                e4 = civrVar3.d(ciswVar);
            } else if (ordinal != 4) {
                ensz enszVar3 = (ensz) a.j();
                enszVar3.Y(cird.n, cixfVar);
                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationsReceiver", "runNotificationCallbacks", 248, "NotificationsReceiver.java")).q("Unknown callback type");
            } else {
                if (((Map) this.d.b()).containsKey(cixfVar)) {
                    e5 = ((civr) ((Map) this.d.b()).get(cixfVar)).c(ciswVar);
                }
                civr civrVar4 = (civr) ((Map) this.d.b()).get(cixf.NT_DIRECTOR);
                civrVar4.getClass();
                e4 = civrVar4.c(ciswVar);
            }
            elfr.l(elfo.m(e4, e5).a(new Callable() { // from class: cixn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    entd entdVar = NotificationsReceiver.a;
                    return null;
                }
            }, erpp.a), new cixq(civqVar), erpp.a);
        }
        PendingIntent pendingIntent = (PendingIntent) extras.getParcelable("extra_pending_intent_to_run");
        if (pendingIntent == null) {
            return;
        }
        m(pendingIntent);
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.notification2o_receiver_update_message);
    }
}
