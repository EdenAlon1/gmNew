package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aede implements ejwd<Boolean> {
    final /* synthetic */ aedh a;

    public aede(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        if (!((aube) this.a.bv.b()).a()) {
            aeaa.a.o("SyncStatusDataService failed", th);
            return;
        }
        ensk i = aedh.a.i();
        i.Y(ente.a, "HomeFragmentFlogger");
        ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$7", "onError", 1555, "HomeFragmentPeer.java")).t("SyncStatusDataService failed: %s", th.getMessage());
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = bool != null && bool.booleanValue();
        aedh aedhVar = this.a;
        aedhVar.aZ = z;
        if (((aube) aedhVar.bv.b()).a()) {
            ensk e = aedh.a.e();
            e.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer$7", "onNewData", 1541, "HomeFragmentPeer.java")).t("SyncStatus SubscriptionCallback: inFullSync: %s", bool);
        } else {
            csjb a = aeaa.a.a();
            a.I("SyncStatus SubscriptionCallback");
            a.A("inFullSync", bool);
            a.r();
        }
        aedh aedhVar2 = this.a;
        aeiw aeiwVar = aedhVar2.r;
        boolean z2 = aedhVar2.aZ;
        if (aeiwVar.a != z2) {
            aeiwVar.a = z2;
            if (z2) {
                aeiwVar.s(0);
            } else {
                aeiwVar.y(0);
            }
        }
        aedhVar2.i().N(z2);
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
