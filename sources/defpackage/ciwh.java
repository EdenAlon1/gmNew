package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwh implements civr {
    final /* synthetic */ cixv a;

    public ciwh(cixv cixvVar) {
        this.a = cixvVar;
    }

    @Override // defpackage.civr
    public final elfl a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ciwd ciwdVar = (ciwd) it.next();
            ensz enszVar = (ensz) ciwi.a.h();
            enszVar.Y(cird.n, ciwdVar.b());
            enszVar.Y(cird.d, (String) ciwdVar.c().orElse(null));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationCanceled", 132, "NotificationDirectorCallbacksModule.java")).q("Notification canceled");
            ((akzt) this.a.a.b()).e("Bugle.Notifications2o.Canceled.Count", ciwdVar.b().j);
        }
        return elfo.e(null);
    }

    @Override // defpackage.civr
    public final elfl b(List list) {
        if (list.isEmpty()) {
            return elfo.e(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ciwd ciwdVar = (ciwd) it.next();
            ensz enszVar = (ensz) ciwi.a.h();
            enszVar.Y(cird.n, ciwdVar.b());
            enszVar.Y(cird.d, (String) ciwdVar.c().orElse(null));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationPosted", 151, "NotificationDirectorCallbacksModule.java")).q("Notification posted");
            ((akzt) this.a.a.b()).e("Bugle.Notifications2o.Posted.Count", ciwdVar.b().j);
        }
        return elfo.e(null);
    }

    @Override // defpackage.civr
    public final elfl c(ciwd ciwdVar) {
        ensz enszVar = (ensz) ciwi.a.h();
        cisw ciswVar = (cisw) ciwdVar;
        enszVar.Y(cird.n, ciswVar.a);
        enszVar.Y(cird.d, (String) ciswVar.b.orElse(null));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationBubbleClicked", 91, "NotificationDirectorCallbacksModule.java")).q("Bubble clicked");
        ((akzt) this.a.a.b()).e("Bugle.Notifications2o.BubbleClicked.Count", ciswVar.a.j);
        return elfo.e(null);
    }

    @Override // defpackage.civr
    public final elfl d(ciwd ciwdVar) {
        ensz enszVar = (ensz) ciwi.a.h();
        cisw ciswVar = (cisw) ciwdVar;
        enszVar.Y(cird.n, ciswVar.a);
        enszVar.Y(cird.d, (String) ciswVar.b.orElse(null));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationBubbleSwiped", 105, "NotificationDirectorCallbacksModule.java")).q("Bubble swiped");
        ((akzt) this.a.a.b()).e("Bugle.Notifications2o.BubbleSwiped.Count", ciswVar.a.j);
        return elfo.e(null);
    }

    @Override // defpackage.civr
    public final elfl e(ciwd ciwdVar) {
        ensz enszVar = (ensz) ciwi.a.h();
        cisw ciswVar = (cisw) ciwdVar;
        enszVar.Y(cird.n, ciswVar.a);
        enszVar.Y(cird.d, (String) ciswVar.b.orElse(null));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationClicked", 77, "NotificationDirectorCallbacksModule.java")).q("Notification clicked");
        ((akzt) this.a.a.b()).e("Bugle.Notifications2o.Clicked.Count", ciswVar.a.j);
        return elfo.e(null);
    }

    @Override // defpackage.civr
    public final elfl f(ciwd ciwdVar) {
        ensz enszVar = (ensz) ciwi.a.h();
        cisw ciswVar = (cisw) ciwdVar;
        enszVar.Y(cird.n, ciswVar.a);
        enszVar.Y(cird.d, (String) ciswVar.b.orElse(null));
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/NotificationDirectorCallbacksModule$2", "onNotificationSwiped", 119, "NotificationDirectorCallbacksModule.java")).q("Notification swiped");
        ((akzt) this.a.a.b()).e("Bugle.Notifications2o.Swiped.Count", ciswVar.a.j);
        return elfo.e(null);
    }
}
