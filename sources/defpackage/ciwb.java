package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwb {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager");
    public final kno b;
    public final ffbr c;
    public final ffbr d;
    private final Context e;

    public ciwb(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        this.e = context;
        this.b = new kno(context);
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    public static String h(String str, String str2) {
        return a.w(str2, str, " : ");
    }

    private final void l() {
        this.b.e(new NotificationChannelGroup(civv.DEFAULT_SETTINGS.c, civv.DEFAULT_SETTINGS.a(this.e)));
        civv civvVar = civv.CONVERSATIONS;
        this.b.e(new NotificationChannelGroup(civvVar.c, civvVar.a(this.e)));
    }

    private static boolean m(NotificationChannel notificationChannel, String str) {
        CharSequence name;
        name = notificationChannel.getName();
        return !TextUtils.equals(str, name);
    }

    public final NotificationChannel a(String str, String str2, NotificationChannel notificationChannel, String str3) {
        int importance;
        boolean shouldShowLights;
        int lightColor;
        long[] vibrationPattern;
        boolean shouldVibrate;
        boolean canShowBadge;
        Uri sound;
        boolean canBubble;
        importance = notificationChannel.getImportance();
        NotificationChannel notificationChannel2 = new NotificationChannel(str, str2, importance == -1000 ? 3 : notificationChannel.getImportance());
        shouldShowLights = notificationChannel.shouldShowLights();
        notificationChannel2.enableLights(shouldShowLights);
        lightColor = notificationChannel.getLightColor();
        notificationChannel2.setLightColor(lightColor);
        vibrationPattern = notificationChannel.getVibrationPattern();
        notificationChannel2.setVibrationPattern(vibrationPattern);
        shouldVibrate = notificationChannel.shouldVibrate();
        notificationChannel2.enableVibration(shouldVibrate);
        canShowBadge = notificationChannel.canShowBadge();
        notificationChannel2.setShowBadge(canShowBadge);
        sound = notificationChannel.getSound();
        notificationChannel2.setSound(sound, new AudioAttributes.Builder().setUsage(8).build());
        if (str3 != null) {
            notificationChannel2.setGroup(str3);
        }
        if (ctid.d) {
            canBubble = notificationChannel.canBubble();
            notificationChannel2.setAllowBubbles(canBubble);
        }
        return notificationChannel2;
    }

    public final NotificationChannel b(ConversationIdType conversationIdType) {
        return this.b.a(conversationIdType.a());
    }

    public final NotificationChannel c(String str, String str2) {
        String conversationId;
        if (this.b.a(str) == null) {
            return null;
        }
        NotificationChannel a2 = this.b.a(h(str, str2));
        if (a2 != null) {
            return a2;
        }
        NotificationChannel b = this.b.b(str, str2);
        if (b != null) {
            conversationId = b.getConversationId();
            if (!TextUtils.isEmpty(conversationId)) {
                return b;
            }
        }
        return null;
    }

    public final NotificationChannel d(Optional optional, Optional optional2) {
        NotificationChannel b;
        NotificationChannel a2;
        String group;
        String id;
        String id2;
        String id3;
        String id4;
        l();
        if (optional.isEmpty()) {
            return g();
        }
        NotificationChannel e = e((civu) optional.get());
        if (optional2.isPresent()) {
            Object obj = optional.get();
            citr citrVar = (citr) optional2.get();
            ConversationIdType d = citrVar.d();
            String j = citrVar.j();
            String i = citrVar.i();
            String str = ((cisu) obj).a;
            if (ctid.d) {
                NotificationChannel b2 = this.b.b(d.a(), j);
                if (b2 != null) {
                    id3 = b2.getId();
                    if (!id3.equals(d.a())) {
                        id4 = b2.getId();
                        j(id4);
                    }
                }
                if (c(str, j) != null) {
                    j(d.toString());
                } else {
                    NotificationChannel a3 = this.b.a(d.a());
                    if (a3 != null && (a2 = this.b.a(str)) != null) {
                        String h = h(str, j);
                        group = a2.getGroup();
                        NotificationChannel a4 = a(h, i, a3, group);
                        a4.setConversationId(str, j);
                        i(a4);
                        enru enruVar = a;
                        ensk h2 = enruVar.h();
                        h2.Y(ente.a, "BugleNotifications");
                        enrr enrrVar = (enrr) h2;
                        enrrVar.Y(cird.k, h);
                        enrrVar.Y(cird.t, j);
                        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndDeletePreRConversationChannel", 465, "NotificationChannelManager.java")).q("Migrated pre-R conversation channel to R+ channel");
                        id = a3.getId();
                        j(id);
                        ensk h3 = enruVar.h();
                        h3.Y(ente.a, "BugleNotifications");
                        enrr enrrVar2 = (enrr) h3;
                        ensn ensnVar = cird.k;
                        id2 = a3.getId();
                        enrrVar2.Y(ensnVar, id2);
                        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "migrateAndDeletePreRConversationChannel", 471, "NotificationChannelManager.java")).q("Deleted pre-R channel");
                    }
                }
                b = c(str, j);
            } else {
                b = b(d);
            }
            if (b != null) {
                return b;
            }
        }
        return e;
    }

    public final NotificationChannel e(civu civuVar) {
        String id;
        NotificationChannel a2 = this.b.a(civuVar.h());
        if (a2 != null) {
            a2.setName(civuVar.i());
            civuVar.c().isPresent();
            a2.setGroup(((civv) civuVar.c().get()).c);
            i(a2);
            return a2;
        }
        NotificationChannel notificationChannel = new NotificationChannel(civuVar.h(), civuVar.i(), 4);
        notificationChannel.setSound(civuVar.a(), new AudioAttributes.Builder().setUsage(8).build());
        civuVar.b().isPresent();
        ((Boolean) civuVar.b().get()).booleanValue();
        notificationChannel.enableLights(true);
        civuVar.f().isPresent();
        ((Boolean) civuVar.f().get()).booleanValue();
        notificationChannel.setShowBadge(true);
        civuVar.g().isPresent();
        civuVar.d().isPresent();
        ((Boolean) civuVar.d().get()).booleanValue();
        notificationChannel.enableVibration(true);
        civuVar.e().isPresent();
        ((Integer) civuVar.e().get()).intValue();
        notificationChannel.setLightColor(0);
        civuVar.c().isPresent();
        notificationChannel.setGroup(((civv) civuVar.c().get()).c);
        ensk h = a.h();
        h.Y(ente.a, "BugleNotifications");
        enrr enrrVar = (enrr) h;
        ensn ensnVar = cird.k;
        id = notificationChannel.getId();
        enrrVar.Y(ensnVar, id);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateChannelForChannelInfo", 337, "NotificationChannelManager.java")).q("Creating notification channel from channel info");
        i(notificationChannel);
        return notificationChannel;
    }

    public final NotificationChannel f() {
        Context context = this.e;
        NotificationChannel a2 = this.b.a("bugle_broadcast_receiver_channel");
        String string = context.getString(R.string.notification2o_foreground_service_channel);
        if (a2 != null && !m(a2, string)) {
            return a2;
        }
        NotificationChannel notificationChannel = new NotificationChannel("bugle_broadcast_receiver_channel", string, 2);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setShowBadge(false);
        notificationChannel.setLightColor(0);
        i(notificationChannel);
        ensk h = a.h();
        h.Y(ente.a, "BugleNotifications");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateForegroundServiceChannel", 614, "NotificationChannelManager.java")).q("Foreground service channel created");
        return notificationChannel;
    }

    public final NotificationChannel g() {
        Context context = this.e;
        NotificationChannel a2 = this.b.a("bugle_misc_channel");
        String string = context.getString(R.string.notification2o_misc_channel);
        if (a2 != null && !m(a2, string)) {
            return a2;
        }
        NotificationChannel notificationChannel = new NotificationChannel("bugle_misc_channel", string, 3);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(true);
        notificationChannel.setShowBadge(true);
        notificationChannel.setLightColor(0);
        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, new AudioAttributes.Builder().setUsage(8).build());
        i(notificationChannel);
        ensk h = a.h();
        h.Y(ente.a, "BugleNotifications");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "getOrCreateMiscellaneousChannel", 588, "NotificationChannelManager.java")).q("Miscellaneous channel created");
        return notificationChannel;
    }

    public final void i(NotificationChannel notificationChannel) {
        int importance;
        String id;
        l();
        importance = notificationChannel.getImportance();
        if (importance < 0 || importance > 5) {
            notificationChannel.setImportance(3);
        }
        try {
            this.b.d.createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleNotifications");
            enrr enrrVar = (enrr) j;
            ensn ensnVar = cird.k;
            id = notificationChannel.getId();
            enrrVar.Y(ensnVar, id);
            ((enrr) ((enrr) enrrVar.g(e)).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "commitChannel", 187, "NotificationChannelManager.java")).q("Error creating notification channel");
        }
    }

    public final void j(String str) {
        if (TextUtils.isEmpty(str)) {
            ensk j = a.j();
            j.Y(ente.a, "BugleNotifications");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 254, "NotificationChannelManager.java")).q("channel id is null/empty, ignoring request to delete null notification channel");
        } else {
            if (this.b.a(str) == null) {
                ensk h = a.h();
                h.Y(ente.a, "BugleNotifications");
                enrr enrrVar = (enrr) h;
                enrrVar.Y(cird.k, str);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 270, "NotificationChannelManager.java")).q("No notification channel to delete");
                return;
            }
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleNotifications");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(cird.k, str);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationChannelManager", "deleteChannel", 264, "NotificationChannelManager.java")).t("Deleting notification channel: %s", str);
            this.b.d.deleteNotificationChannel(str);
        }
    }

    public final boolean k(NotificationChannel notificationChannel) {
        int importance;
        importance = notificationChannel.getImportance();
        return importance == 0;
    }
}
