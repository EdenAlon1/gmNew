package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthp {
    private static final entd c = entd.c("BugleNotifications");
    public final fazb a;
    public final Context b;
    private final fazb d;
    private final fazb e;
    private final ffbr f;
    private final ffbr g;

    public cthp(Context context, fazb fazbVar, fazb fazbVar2, ffbr ffbrVar, ffbr ffbrVar2, fazb fazbVar3) {
        this.b = context;
        this.d = fazbVar;
        this.e = fazbVar2;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.a = fazbVar3;
    }

    static cthn j(String str, String str2, String str3, NotificationChannel notificationChannel) {
        int importance;
        boolean shouldShowLights;
        int lightColor;
        long[] vibrationPattern;
        boolean shouldVibrate;
        Uri sound;
        importance = notificationChannel.getImportance();
        cthn cthnVar = new cthn(str, str2, importance == -1000 ? 4 : notificationChannel.getImportance());
        shouldShowLights = notificationChannel.shouldShowLights();
        cthnVar.a(shouldShowLights);
        lightColor = notificationChannel.getLightColor();
        cthnVar.a.setLightColor(lightColor);
        vibrationPattern = notificationChannel.getVibrationPattern();
        cthnVar.a.setVibrationPattern(vibrationPattern);
        shouldVibrate = notificationChannel.shouldVibrate();
        cthnVar.b(shouldVibrate);
        sound = notificationChannel.getSound();
        cthnVar.e(sound, new AudioAttributes.Builder().setUsage(8).build());
        if (str3 != null) {
            cthnVar.c(str3);
        }
        return cthnVar;
    }

    private final NotificationChannel p(NotificationChannel notificationChannel, String str, String str2) {
        CharSequence name;
        String id;
        String id2;
        String group;
        if (notificationChannel == null) {
            return null;
        }
        name = notificationChannel.getName();
        boolean contentEquals = str.contentEquals(name);
        boolean z = !contentEquals;
        boolean z2 = false;
        if (str2 != null) {
            group = notificationChannel.getGroup();
            if (group == null) {
                z2 = true;
            }
        }
        if (contentEquals && !z2) {
            return notificationChannel;
        }
        ensk n = c.n();
        ensn ensnVar = cird.k;
        id = notificationChannel.getId();
        n.Y(ensnVar, id);
        n.Y(cird.l, Boolean.valueOf(z));
        n.Y(cird.m, Boolean.valueOf(z2));
        ((ensz) n.h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "shouldRefreshChannel", 930, "NotificationChannelUtil.java")).q("NotificationChannel should be refreshed");
        id2 = notificationChannel.getId();
        NotificationChannel notificationChannel2 = j(id2, str, str2, notificationChannel).a;
        n(notificationChannel2);
        return notificationChannel2;
    }

    private final cthn q(String str, String str2, String str3) {
        NotificationChannel f = f();
        if (f == null) {
            return null;
        }
        return j(str, str2, str3, f);
    }

    private static String r() {
        return ctho.DEFAULT_SETTINGS.e;
    }

    private final String s() {
        return this.b.getString(R.string.bugle_notification_default_incoming_message_channel_name);
    }

    private final void t(ctho cthoVar) {
        ((NotificationManager) this.a.b()).createNotificationChannelGroup(new NotificationChannelGroup(cthoVar.e, this.b.getString(cthoVar.f)));
    }

    public final NotificationChannel a() {
        NotificationChannel notificationChannel;
        String group;
        CharSequence name;
        int importance;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_connected_to_web_channel_v1");
        String string = this.b.getResources().getString(R.string.bugle_notification_ditto_channel_name);
        if (notificationChannel != null) {
            group = notificationChannel.getGroup();
            if (group != null) {
                name = notificationChannel.getName();
                if (name.toString().equals(string)) {
                    importance = notificationChannel.getImportance();
                    boolean q = ((ctyx) this.f.b()).q("ditto_persistent_notification_channel_enabled", true);
                    boolean z = importance != 0;
                    if (z == q) {
                        return notificationChannel;
                    }
                    ((ctyx) this.f.b()).h("ditto_persistent_notification_channel_enabled", z);
                    ((akzt) this.g.b()).e("Bugle.Ditto.Notification.Status", importance != 0 ? 1 : 2);
                    return notificationChannel;
                }
            }
        }
        cthn cthnVar = new cthn("bugle_connected_to_web_channel_v1", string, 2);
        cthnVar.a(false);
        cthnVar.b(false);
        cthnVar.d();
        cthnVar.c(ctho.WEB_SETTINGS.e);
        NotificationChannel notificationChannel2 = cthnVar.a;
        n(notificationChannel2);
        return notificationChannel2;
    }

    public final NotificationChannel b(boolean z, String str) {
        String s = s();
        String r = r();
        cthn cthnVar = new cthn("bugle_default_channel", s, 4);
        if (!TextUtils.isEmpty(str)) {
            cthnVar.e(Uri.parse(str), new AudioAttributes.Builder().setUsage(8).build());
        }
        cthnVar.a(true);
        cthnVar.b(z);
        if (r != null) {
            cthnVar.c(r);
        }
        NotificationChannel notificationChannel = cthnVar.a;
        n(notificationChannel);
        return notificationChannel;
    }

    public final NotificationChannel c() {
        NotificationChannel notificationChannel;
        CharSequence name;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_broadcast_receiver_channel");
        String string = this.b.getResources().getString(R.string.bugle_notification_foreground_service_channel_name);
        if (notificationChannel != null) {
            name = notificationChannel.getName();
            if (TextUtils.equals(name, string)) {
                return notificationChannel;
            }
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("bugle_broadcast_receiver_channel", string, 2);
        notificationChannel2.enableLights(false);
        notificationChannel2.enableVibration(false);
        notificationChannel2.setShowBadge(false);
        n(notificationChannel2);
        return notificationChannel2;
    }

    public final NotificationChannel d() {
        NotificationChannel notificationChannel;
        CharSequence name;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_report_issue_channel");
        String string = this.b.getResources().getString(R.string.bugle_notification_report_issue_channel_name);
        if (notificationChannel != null) {
            name = notificationChannel.getName();
            if (TextUtils.equals(name, string)) {
                return notificationChannel;
            }
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("bugle_report_issue_channel", string, 3);
        notificationChannel2.enableVibration(true);
        notificationChannel2.enableLights(false);
        notificationChannel2.setShowBadge(false);
        n(notificationChannel2);
        return notificationChannel2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        if (r0 > 2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.NotificationChannel e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cthp.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, java.lang.String, boolean):android.app.NotificationChannel");
    }

    public final NotificationChannel f() {
        NotificationChannel notificationChannel;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_default_channel");
        if (notificationChannel != null) {
            return i("bugle_default_channel", s(), r());
        }
        if (!m()) {
            return null;
        }
        boolean c2 = ((ctia) this.d.b()).c();
        Context context = this.b;
        ffbr ffbrVar = this.f;
        return b(c2, ((ctyx) ffbrVar.b()).f(context.getString(R.string.notification_sound_pref_key), null));
    }

    public final NotificationChannel g() {
        NotificationChannel notificationChannel;
        String string = this.b.getString(R.string.bugle_notification_miscellaneous_channel_name);
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_misc_channel");
        if (notificationChannel != null) {
            return p(notificationChannel, string, null);
        }
        cthn q = q("bugle_misc_channel", string, null);
        if (q == null) {
            return null;
        }
        NotificationChannel notificationChannel2 = q.a;
        n(notificationChannel2);
        return notificationChannel2;
    }

    public final NotificationChannel h() {
        NotificationChannel notificationChannel;
        String group;
        if (!ddjr.b()) {
            return null;
        }
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_reminder_channel");
        if (notificationChannel != null) {
            group = notificationChannel.getGroup();
            if (group != null) {
                return notificationChannel;
            }
        }
        String string = this.b.getResources().getString(R.string.bugle_notification_reminders_channel_name);
        if (notificationChannel != null) {
            NotificationChannel notificationChannel2 = j("bugle_reminder_channel", string, ctho.REMINDERS.e, notificationChannel).a;
            n(notificationChannel2);
            return notificationChannel2;
        }
        cthn q = q("bugle_reminder_channel", string, ctho.REMINDERS.e);
        if (q == null) {
            return null;
        }
        NotificationChannel notificationChannel3 = q.a;
        n(notificationChannel3);
        return notificationChannel3;
    }

    public final NotificationChannel i(String str, String str2, String str3) {
        NotificationChannel notificationChannel;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel(str);
        return p(notificationChannel, str2, str3);
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            ((ensz) c.o().h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "deleteNotificationChannel", 279, "NotificationChannelUtil.java")).q("Ignoring request to delete null notification channel");
        } else if (str.equals("bugle_default_channel")) {
            ((ensz) c.o().h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "deleteNotificationChannel", 283, "NotificationChannelUtil.java")).q("Ignoring request to delete default notification channel");
        } else {
            ((ensz) c.o().h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "deleteNotificationChannel", 285, "NotificationChannelUtil.java")).t("Deleting notification channel: %s", str);
            ((NotificationManager) this.a.b()).deleteNotificationChannel(str);
        }
    }

    public final boolean l(boolean z) {
        NotificationChannel notificationChannel;
        boolean areNotificationsEnabled;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel("bugle_default_channel");
        if (notificationChannel == null && !z) {
            return false;
        }
        areNotificationsEnabled = ((NotificationManager) this.a.b()).areNotificationsEnabled();
        return areNotificationsEnabled;
    }

    public final boolean m() {
        Context context = this.b;
        return ((ctyx) this.f.b()).q(context.getString(R.string.notifications_enabled_pref_key), context.getResources().getBoolean(R.bool.notifications_enabled_pref_default));
    }

    public final void n(NotificationChannel notificationChannel) {
        int importance;
        String id;
        t(ctho.CONVERSATIONS);
        t(ctho.WEB_SETTINGS);
        if (ddjr.b()) {
            t(ctho.REMINDERS);
        }
        t(ctho.DEFAULT_SETTINGS);
        importance = notificationChannel.getImportance();
        if (importance < 0 || importance > 5) {
            notificationChannel.setImportance(3);
        }
        try {
            ((NotificationManager) this.a.b()).createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            ensz enszVar = (ensz) c.j();
            ensn ensnVar = cird.k;
            id = notificationChannel.getId();
            enszVar.Y(ensnVar, id);
            ((ensz) ((ensz) enszVar.g(e)).h("com/google/android/apps/messaging/shared/util/notifications/NotificationChannelUtil", "createNotificationChannel", 170, "NotificationChannelUtil.java")).q("Error creating legacy notification channel");
        }
    }

    public final int o(String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) this.a.b()).getNotificationChannel(str);
        if (notificationChannel == null) {
            return 3;
        }
        importance = notificationChannel.getImportance();
        return importance > 0 ? 1 : 2;
    }
}
