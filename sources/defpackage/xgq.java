package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgq implements xfv {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentStateJourneyMonitor");
    private final xgt b;
    private final fazb c;
    private final atcj d;

    public xgq(xgt xgtVar, fazb fazbVar, atcj atcjVar) {
        xgtVar.getClass();
        fazbVar.getClass();
        this.b = xgtVar;
        this.c = fazbVar;
        this.d = atcjVar;
    }

    @Override // defpackage.xfv
    public final void a(xhp xhpVar, int i) {
        xhpVar.getClass();
        if (this.d.a()) {
            xgt xgtVar = this.b;
            if (((xgr) xgtVar.a.remove(xhpVar.a())) != null) {
                ((xgb) this.c.b()).c(xhpVar, i);
                return;
            }
            ensk j = a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentStateJourneyMonitor", "onAddFailed", 82, "ViewModelAttachmentStateJourneyMonitor.kt")).t("ViewModelAttachmentStateJourneyMonitor skipping onAddFailed logging, no AddingState for %s", xhpVar);
        }
    }

    @Override // defpackage.xfv
    public final void b(xhi xhiVar) {
        if (this.d.a()) {
            if (this.b.a.size() > 16) {
                ensk j = a.j();
                j.Y(ente.a, "BugleComposeRow2");
                enrr enrrVar = (enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentStateJourneyMonitor", "onAddStart", 38, "ViewModelAttachmentStateJourneyMonitor.kt");
                ConcurrentHashMap concurrentHashMap = this.b.a;
                enrrVar.w("ViewModelAttachmentStateJourneyMonitorState.adding already has %d elements: %s", concurrentHashMap.size(), concurrentHashMap);
            }
            if (((xgr) this.b.a.putIfAbsent(xhiVar, xgr.a)) != null) {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleComposeRow2");
                ((enrr) j2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentStateJourneyMonitor", "onAddStart", 50, "ViewModelAttachmentStateJourneyMonitor.kt")).t("ViewModelAttachmentStateJourneyMonitor.onAddStart called multiple times for %s", xhiVar);
            }
        }
    }

    @Override // defpackage.xfv
    public final void c(xho xhoVar, int i) {
        xhoVar.getClass();
        if (this.d.a()) {
            xgt xgtVar = this.b;
            if (((xgr) xgtVar.a.remove(xhoVar.c)) != null) {
                ((xgb) this.c.b()).b(xhoVar, i);
                return;
            }
            ensk j = a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentStateJourneyMonitor", "onAddSucceeded", 63, "ViewModelAttachmentStateJourneyMonitor.kt")).t("ViewModelAttachmentStateJourneyMonitor skipping onAddSucceeded logging, no AddingState for %s", xhoVar);
        }
    }

    @Override // defpackage.xfv
    public final void d(xhp xhpVar, int i) {
        xhpVar.getClass();
        if (this.d.a()) {
            xgt xgtVar = this.b;
            xgs xgsVar = (xgs) xgtVar.b.remove(xhpVar.a());
            if (xgsVar != null) {
                xgb xgbVar = (xgb) this.c.b();
                axol.k(xgbVar.b, null, new xfz(xgbVar, xhpVar, i, xgsVar.a, null), 3);
            } else {
                ensk j = a.j();
                j.Y(ente.a, "BugleComposeRow2");
                ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentStateJourneyMonitor", "onRemoveSucceeded", 134, "ViewModelAttachmentStateJourneyMonitor.kt")).t("ViewModelAttachmentStateJourneyMonitor skipping onRemoveSucceeded logging, no RemovingState for %s", xhpVar);
            }
        }
    }

    @Override // defpackage.xfv
    public final void e(xhi xhiVar, int i) {
        if (this.d.a()) {
            if (this.b.b.size() > 16) {
                ensk j = a.j();
                j.Y(ente.a, "BugleComposeRow2");
                enrr enrrVar = (enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentStateJourneyMonitor", "onRemoveStart", 103, "ViewModelAttachmentStateJourneyMonitor.kt");
                ConcurrentHashMap concurrentHashMap = this.b.b;
                enrrVar.w("ViewModelAttachmentStateJourneyMonitorState.removing already has %d elements: %s", concurrentHashMap.size(), concurrentHashMap);
            }
            xgt xgtVar = this.b;
            if (((xgs) xgtVar.b.putIfAbsent(xhiVar, new xgs(i))) != null) {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleComposeRow2");
                ((enrr) j2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentStateJourneyMonitor", "onRemoveStart", 118, "ViewModelAttachmentStateJourneyMonitor.kt")).t("ViewModelAttachmentStateJourneyMonitor.onRemoveStart called multiple times for %s", xhiVar);
            }
        }
    }
}
