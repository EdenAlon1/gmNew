package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acar implements cthm {
    private static final cskc a = cskc.g("Bugle", "DittoPhoneRelayNotificationSuppressor");
    private static final Duration b = Duration.ofMinutes(2);
    private static final ecda c = new ecda("DittoNotificationSessionTimer");
    private final cqoh d;
    private final ctyx e;
    private final bbgh f;
    private final ciur g;
    private final ffbr h;
    private final ffbr i;
    private boolean j = false;
    private Instant k = Instant.MIN;
    private ecri l = null;

    public acar(cqoh cqohVar, ctyx ctyxVar, bbgh bbghVar, ciur ciurVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.d = cqohVar;
        this.e = ctyxVar;
        this.f = bbghVar;
        this.g = ciurVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
    }

    private final void g(boolean z) {
        this.e.h("ditto_silenced_notifications", z);
    }

    private final synchronized void h(boolean z) {
        this.j = z;
    }

    private final synchronized boolean i() {
        if (!this.k.equals(Instant.MIN) && !this.d.f().isBefore(this.k)) {
            return Duration.between(this.k, this.d.f()).compareTo(b) <= 0;
        }
        return false;
    }

    @Override // defpackage.cthm
    public final void a() {
        h(true);
    }

    @Override // defpackage.cthm
    public final synchronized void b(boolean z) {
        String channelId;
        NotificationChannel notificationChannel;
        boolean shouldVibrate;
        Uri sound;
        AudioAttributes audioAttributes;
        boolean shouldVibrate2;
        String group;
        String id;
        csjb a2 = a.a();
        a2.I("Desktop session is");
        boolean z2 = true;
        a2.I(true != z ? "inactive" : "active");
        a2.r();
        ((bayd) this.f).b.a().v(180);
        NotificationChannel notificationChannel2 = null;
        if (z) {
            this.k = this.d.f();
            if (this.l != null) {
                ((ecrj) this.i.b()).g(c, null, null, ecrh.CANCEL);
            }
            this.l = ((ecrj) this.i.b()).e(c);
            ((bayd) this.f).b.a().y(180, ((Long) bayd.a.e()).longValue());
            return;
        }
        this.k = Instant.MIN;
        ((akzt) this.h.b()).c("Bugle.Ditto.Notification.Session.Inactive.Count");
        if (this.l != null) {
            ((ecrj) this.i.b()).g(c, null, null, ecrh.SUCCESS);
        }
        this.l = null;
        if (this.e.q("ditto_silenced_notifications", false)) {
            ((akzt) this.h.b()).c("Bugle.Notification.SuppressedByDitto.ReAlert.Count");
            ciur ciurVar = this.g;
            Stream stream = Collection.EL.stream(ciurVar.d.c(cixf.NT_INCOMING_MESSAGE));
            final ffji ffjiVar = new ffji() { // from class: ciup
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
                    statusBarNotification.getClass();
                    return Long.valueOf(statusBarNotification.getPostTime());
                }
            };
            Optional max = stream.max(Comparator.CC.comparingLong(new ToLongFunction() { // from class: ciuq
                @Override // java.util.function.ToLongFunction
                public final long applyAsLong(Object obj) {
                    return ((Number) ffji.this.invoke(obj)).longValue();
                }
            }));
            if (max.isPresent()) {
                channelId = ((StatusBarNotification) max.get()).getNotification().getChannelId();
                channelId.getClass();
                notificationChannel = ciurVar.e.getNotificationChannel(channelId);
                if (notificationChannel != null) {
                    notificationChannel2 = ciurVar.e.getNotificationChannel("messages_for_web_notification_channel");
                    if (notificationChannel2 == null) {
                        ensk g = ciur.a.g();
                        g.Y(ente.a, "BugleNotifications");
                        ((enrr) g.h("com/google/android/apps/messaging/shared/notification2o/DittoNotificationChannelManager", "getOrCreateDesktopReNotifyChannel", 76, "DittoNotificationChannelManager.kt")).q("Creating Messages for web notification channel");
                        ciwb ciwbVar = ciurVar.c;
                        group = notificationChannel.getGroup();
                        notificationChannel2 = ciwbVar.a("messages_for_web_notification_channel", "messages_for_web_notification_channel", notificationChannel, group);
                    }
                    notificationChannel2.setImportance(3);
                    shouldVibrate = notificationChannel.shouldVibrate();
                    if (shouldVibrate) {
                        shouldVibrate2 = notificationChannel2.shouldVibrate();
                        if (shouldVibrate2) {
                            notificationChannel2.enableVibration(z2);
                            sound = notificationChannel.getSound();
                            audioAttributes = notificationChannel.getAudioAttributes();
                            notificationChannel2.setSound(sound, audioAttributes);
                            ensk g2 = ciur.a.g();
                            g2.Y(ente.a, "BugleNotifications");
                            ((enrr) g2.h("com/google/android/apps/messaging/shared/notification2o/DittoNotificationChannelManager", "getOrCreateDesktopReNotifyChannel", 89, "DittoNotificationChannelManager.kt")).q("Modifying Messages for web notification channel");
                            ciurVar.c.i(notificationChannel2);
                        }
                    }
                    z2 = false;
                    notificationChannel2.enableVibration(z2);
                    sound = notificationChannel.getSound();
                    audioAttributes = notificationChannel.getAudioAttributes();
                    notificationChannel2.setSound(sound, audioAttributes);
                    ensk g22 = ciur.a.g();
                    g22.Y(ente.a, "BugleNotifications");
                    ((enrr) g22.h("com/google/android/apps/messaging/shared/notification2o/DittoNotificationChannelManager", "getOrCreateDesktopReNotifyChannel", 89, "DittoNotificationChannelManager.kt")).q("Modifying Messages for web notification channel");
                    ciurVar.c.i(notificationChannel2);
                }
                kml kmlVar = new kml(ciurVar.b, ((StatusBarNotification) max.get()).getNotification());
                if (notificationChannel2 != null) {
                    id = notificationChannel2.getId();
                    kmlVar.F = id;
                }
                Notification a3 = kmlVar.a();
                a3.flags = ((StatusBarNotification) max.get()).getNotification().flags & (-9);
                new kno(ciurVar.b).g(((StatusBarNotification) max.get()).getTag(), ((StatusBarNotification) max.get()).getId(), a3);
            }
            g(false);
        }
    }

    @Override // defpackage.cthm
    public final void c() {
        h(false);
    }

    public final synchronized boolean d() {
        return i();
    }

    final synchronized boolean e() {
        return this.j;
    }

    @Override // defpackage.cthm
    public final synchronized boolean f() {
        boolean z;
        z = e() && d();
        if (z) {
            ((akzt) this.h.b()).c("Bugle.Notification.SuppressedByDitto.Count");
            g(true);
        } else {
            g(false);
        }
        return z;
    }
}
