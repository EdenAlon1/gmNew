package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixm {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/notification2o/NotificationUtility");
    private final NotificationManager b;
    private final kno c;
    private final Context d;

    public cixm(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.b = notificationManager;
        this.c = new kno(context);
        this.d = context;
    }

    public static final boolean f(StatusBarNotification statusBarNotification) {
        Notification notification;
        return ctid.d && statusBarNotification != null && (notification = statusBarNotification.getNotification()) != null && (notification.flags & 4096) == 4096;
    }

    public static final boolean g(StatusBarNotification statusBarNotification) {
        Notification.BubbleMetadata bubbleMetadata;
        boolean isNotificationSuppressed;
        if (statusBarNotification == null) {
            return false;
        }
        if (!ctid.d) {
            return true;
        }
        Notification notification = statusBarNotification.getNotification();
        if (notification == null) {
            return false;
        }
        bubbleMetadata = notification.getBubbleMetadata();
        if (bubbleMetadata != null) {
            isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
            if (isNotificationSuppressed) {
                return false;
            }
        }
        return true;
    }

    public final StatusBarNotification a(cixf cixfVar, String str) {
        NotificationManager notificationManager = this.b;
        Optional of = Optional.of(str);
        for (StatusBarNotification statusBarNotification : Arrays.asList(notificationManager.getActiveNotifications())) {
            if (statusBarNotification.getId() == cixfVar.j && TextUtils.equals((CharSequence) of.orElse(null), statusBarNotification.getTag())) {
                return statusBarNotification;
            }
        }
        return null;
    }

    public final List b(final String str) {
        return TextUtils.isEmpty(str) ? new ArrayList() : (List) DesugarArrays.stream(this.b.getActiveNotifications()).filter(new Predicate() { // from class: cixg
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
                return TextUtils.equals(((StatusBarNotification) obj).getNotification().getGroup(), str);
            }
        }).collect(Collectors.toCollection(new cixh()));
    }

    public final List c(final cixf cixfVar) {
        return (List) DesugarArrays.stream(this.b.getActiveNotifications()).filter(new Predicate() { // from class: cixl
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
                return ((StatusBarNotification) obj).getId() == cixf.this.j;
            }
        }).collect(Collectors.toCollection(new cixh()));
    }

    public final List d(cixf cixfVar) {
        return (List) Collection.EL.stream(c(cixfVar)).filter(new cixi()).map(new Function() { // from class: cixj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((StatusBarNotification) obj).getNotification().extras;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new cixh()));
    }

    public final void e(StatusBarNotification statusBarNotification) {
        cixf b;
        StatusBarNotification statusBarNotification2;
        if (statusBarNotification == null || !g(statusBarNotification) || (b = cixf.b(statusBarNotification.getId())) == null || b == cixf.NT_UNKNOWN) {
            return;
        }
        List list = (List) Collection.EL.stream(b(statusBarNotification.getNotification().getGroup())).filter(new cixi()).collect(Collectors.toCollection(new cixh()));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                statusBarNotification2 = null;
                break;
            } else {
                statusBarNotification2 = (StatusBarNotification) it.next();
                if (knh.b(statusBarNotification2.getNotification())) {
                    break;
                }
            }
        }
        boolean anyMatch = !ctid.d ? false : Collection.EL.stream(b(statusBarNotification.getNotification().getGroup())).anyMatch(new Predicate() { // from class: cixk
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
                return cixm.f((StatusBarNotification) obj);
            }
        });
        if (statusBarNotification2 != null && list.size() == 2 && !anyMatch) {
            ensk h = a.h();
            h.Y(ente.a, "BugleNotifications");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(cird.n, b);
            enrrVar.Y(cird.d, statusBarNotification2.getTag());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 383, "NotificationUtility.java")).q("Canceling summary notification");
            this.c.d(statusBarNotification2.getTag(), statusBarNotification2.getId());
        }
        if (!ctid.d || !f(statusBarNotification)) {
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleNotifications");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(cird.n, b);
            enrrVar2.Y(cird.d, statusBarNotification.getTag());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 402, "NotificationUtility.java")).q("Canceling notification");
            this.c.d(statusBarNotification.getTag(), statusBarNotification.getId());
            return;
        }
        ensk h3 = a.h();
        h3.Y(ente.a, "BugleNotifications");
        enrr enrrVar3 = (enrr) h3;
        enrrVar3.Y(cird.n, b);
        enrrVar3.Y(cird.d, statusBarNotification.getTag());
        ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/notification2o/NotificationUtility", "cancelNotification", 395, "NotificationUtility.java")).q("Bubble showing, suppressing shade notification");
        kml kmlVar = new kml(this.d, statusBarNotification.getNotification());
        kmi a2 = knh.a(statusBarNotification.getNotification());
        if (a2 != null) {
            PendingIntent pendingIntent = a2.a;
            pendingIntent.getClass();
            IconCompat iconCompat = a2.c;
            iconCompat.getClass();
            kmh kmhVar = new kmh(pendingIntent, iconCompat);
            kmhVar.c(Alert.DURATION_SHOW_INDEFINITELY);
            kmhVar.e(true);
            kmhVar.b(a2.a());
            kmhVar.a = a2.b;
            kmlVar.M = kmhVar.a();
            int i = statusBarNotification.getNotification().flags;
            Notification a3 = kmlVar.a();
            a3.flags = i;
            new kno(this.d).g(statusBarNotification.getTag(), statusBarNotification.getId(), a3);
        }
    }
}
