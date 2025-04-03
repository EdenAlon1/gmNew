package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbui implements coxh {
    private static final entd a = entd.c("BugleSearch");
    private final ffbr b;

    public cbui(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.coxh
    public final void fE(boolean z) {
        if (!z) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cbrm.g, "IcingSyncManagerListener");
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingSyncManagerListener", "onSyncComplete", 45, "IcingSyncManagerListener.java")).q("Ignore non-full sync callback.");
        } else {
            ensz enszVar2 = (ensz) a.h();
            enszVar2.Y(cbrm.g, "IcingSyncManagerListener");
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingSyncManagerListener", "onSyncComplete", 51, "IcingSyncManagerListener.java")).q("Queues icing index rebuild work item.");
            ((cbto) this.b.b()).a();
        }
    }

    @Override // defpackage.coxh
    public final void b(boolean z) {
    }
}
