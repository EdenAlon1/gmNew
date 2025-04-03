package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cino implements cinl {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleNotifications");
    private final Context c;
    private final ffbr d;
    private final ffbr e;
    private final kno f;
    private final emyl g;

    public cino(final Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = context;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = new kno(context);
        this.g = new emyl() { // from class: cinn
            @Override // defpackage.emyl
            public final Object get() {
                int i = cino.a;
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                rkf.f(notificationManager);
                return notificationManager;
            }
        };
    }

    private final boolean g(String str) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.g.get()).getActiveNotifications()) {
            if (TextUtils.equals(statusBarNotification.getTag(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cinl
    public final StatusBarNotification a(final String str, final int i) {
        if (str == null) {
            return null;
        }
        return (StatusBarNotification) DesugarArrays.stream(((NotificationManager) this.g.get()).getActiveNotifications()).filter(new Predicate() { // from class: cinm
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
                int i2 = cino.a;
                if (TextUtils.equals(statusBarNotification.getTag(), str)) {
                    return statusBarNotification.getId() == i;
                }
                return false;
            }
        }).findFirst().orElse(null);
    }

    @Override // defpackage.cinl
    public final void b(String str, cinj cinjVar) {
        this.f.d(str, cinjVar.G);
        if (g(str)) {
            int length = ((NotificationManager) this.g.get()).getActiveNotifications().length;
            ensz enszVar = (ensz) b.h();
            enszVar.Y(cird.d, str);
            enszVar.Y(cink.q, cinjVar);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "cancelNotification", 223, "BugleNotificationDispatcherImpl.java")).r("Canceling notification, active count: %d", length);
        }
    }

    @Override // defpackage.cinl
    public final boolean c(cink cinkVar) {
        return g(cinkVar.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    @Override // defpackage.cinl
    public final boolean d(cink cinkVar) {
        int i;
        String channelId;
        NotificationChannel notificationChannel;
        Notification b2 = cinkVar.b();
        ?? r2 = 0;
        if (b2 == null) {
            ensz enszVar = (ensz) b.h();
            enszVar.Y(cink.p, cinkVar);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 84, "BugleNotificationDispatcherImpl.java")).q("Won't notify null Android notification");
            return false;
        }
        String d = cinkVar.d();
        try {
            if (d != null) {
                this.f.g(d, cinkVar.a(), b2);
            } else {
                this.f.f(cinkVar.a(), b2);
            }
            try {
                Object obj = this.g.get();
                r2 = b2.getChannelId();
                notificationChannel = ((NotificationManager) obj).getNotificationChannel(r2);
                i = notificationChannel.getImportance();
            } catch (Exception e) {
                ((ensz) ((ensz) ((ensz) b.j()).g(e)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", '~', "BugleNotificationDispatcherImpl.java")).q("Error getting notification channel importance.");
                i = -1;
            }
            channelId = b2.getChannelId();
            ensz enszVar2 = (ensz) b.h();
            enszVar2.Y(cink.p, cinkVar);
            enszVar2.Y(cird.c, Integer.valueOf(i));
            enszVar2.Y(cird.k, channelId);
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 136, "BugleNotificationDispatcherImpl.java")).q("Notifying");
            return true;
        } catch (RuntimeException e2) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            if (stackTrace.length <= 0 || !TextUtils.equals(stackTrace[r2].getClassName(), "android.os.Parcel") || !TextUtils.equals(stackTrace[r2].getMethodName(), "readIntArray")) {
                throw e2;
            }
            ensz enszVar3 = (ensz) ((ensz) b.j()).g(e2);
            enszVar3.Y(cink.p, cinkVar);
            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "notify", 104, "BugleNotificationDispatcherImpl.java")).q("Encountered an error when notifying");
            return true;
        }
    }

    @Override // defpackage.cinl
    public final boolean e() {
        Context context = this.c;
        return ((cthp) this.e.b()).l(((ctyx) this.d.b()).q(context.getString(R.string.notifications_enabled_pref_key), context.getResources().getBoolean(R.bool.notifications_enabled_pref_default)));
    }

    @Override // defpackage.cinl
    public final void f(cink cinkVar) {
        if (c(cinkVar)) {
            d(cinkVar);
            return;
        }
        ensz enszVar = (ensz) b.h();
        enszVar.Y(cird.d, cinkVar.d());
        enszVar.Y(cink.p, cinkVar);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationDispatcherImpl", "updateIfActive", 160, "BugleNotificationDispatcherImpl.java")).q("Notifications is not active, won't update it.");
    }
}
