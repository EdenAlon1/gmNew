package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cito extends ceuj {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler");
    public final Map b;
    private final errl c;
    private final ffbr d;
    private final cixm e;
    private final ciwb f;
    private final cius g;
    private final kno h;

    public cito(Context context, errl errlVar, ffbr ffbrVar, Map map, cixm cixmVar, ciwb ciwbVar, cius ciusVar) {
        this.h = new kno(context);
        this.c = errlVar;
        this.d = ffbrVar;
        this.b = map;
        this.e = cixmVar;
        this.f = ciwbVar;
        this.g = ciusVar;
    }

    private final void k(final cixf cixfVar, final List list) {
        if (!list.isEmpty()) {
            elfr.l(elfo.h(new erog() { // from class: citm
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    cixf cixfVar2;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        cixfVar2 = cixfVar;
                        if (!it.hasNext()) {
                            break;
                        }
                        StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
                        arrayList.add(new cisw(cixfVar2, Optional.ofNullable(statusBarNotification.getTag()), statusBarNotification.getNotification().extras, knh.b(statusBarNotification.getNotification())));
                    }
                    cito citoVar = cito.this;
                    civr civrVar = (civr) citoVar.b.get(cixf.NT_DIRECTOR);
                    civrVar.getClass();
                    elfl a2 = civrVar.a(arrayList);
                    Map map = citoVar.b;
                    elfl e = elfo.e(null);
                    if (map.containsKey(cixfVar2)) {
                        civr civrVar2 = (civr) citoVar.b.get(cixfVar2);
                        civrVar2.getClass();
                        e = civrVar2.a(arrayList);
                    }
                    return elfo.m(a2, e).a(new Callable() { // from class: citl
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, erpp.a);
                }
            }, this.c), new citn(), erpp.a);
            return;
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleNotifications");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(cird.n, cixfVar);
        enrrVar.Y(cird.d, null);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "runCancelCallbacks", 148, "CancelNotificationHandler.java")).q("No notifications given, not running cancel callbacks");
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        Long l2 = (Long) this.d.b();
        l2.getClass();
        l.d(l2.intValue());
        if (this.h.h()) {
            ciwb ciwbVar = this.f;
            if (!ciwbVar.k(ciwbVar.f())) {
                l.b(cevc.FOREGROUND_SERVICE);
                ((ceti) l).b = this.g.a();
                return l.h();
            }
        }
        l.b(cevc.WAKELOCK);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CancelNotificationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return civt.a.getParserForType();
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final String f() {
        return "shared_notification_queue_name";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, engw engwVar) {
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            civt civtVar = (civt) engwVar.get(i);
            if ((civtVar.b & 2) != 0) {
                cixf b = cixf.b(civtVar.c);
                if (b == null) {
                    b = cixf.NT_UNKNOWN;
                }
                String str = civtVar.d;
                StatusBarNotification a2 = this.e.a(b, str);
                if (cixm.g(a2)) {
                    this.e.e(a2);
                    a2.getClass();
                    k(b, Arrays.asList(a2));
                } else {
                    ensk h = a.h();
                    h.Y(ente.a, "BugleNotifications");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(cird.n, b);
                    enrrVar.Y(cird.d, str);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotification", 131, "CancelNotificationHandler.java")).q("No active notification to cancel");
                }
            } else {
                cixf b2 = cixf.b(civtVar.c);
                if (b2 == null) {
                    b2 = cixf.NT_UNKNOWN;
                }
                List c = this.e.c(b2);
                if (c.isEmpty()) {
                    ensk h2 = a.h();
                    h2.Y(ente.a, "BugleNotifications");
                    enrr enrrVar2 = (enrr) h2;
                    enrrVar2.Y(cird.n, b2);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotificationsOfType", 109, "CancelNotificationHandler.java")).q("No active status bar notification of this type exists, cancelNotificationsOfType does nothing");
                } else {
                    cixm cixmVar = this.e;
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        cixmVar.e((StatusBarNotification) it.next());
                    }
                    k(b2, c);
                    ensk h3 = a.h();
                    h3.Y(ente.a, "BugleNotifications");
                    enrr enrrVar3 = (enrr) h3;
                    enrrVar3.Y(cird.n, b2);
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/notification2o/CancelNotificationHandler", "cancelNotificationsOfType", 120, "CancelNotificationHandler.java")).q("Cancelled the active status bar notifications that match the type");
                }
            }
        }
        return elfo.e(ceyt.i());
    }
}
