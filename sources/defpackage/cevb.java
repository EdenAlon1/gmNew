package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cevb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [eyhs, java.lang.Object] */
    public static boolean a(ceve ceveVar, byte[] bArr) {
        try {
            return ceveVar.h(ceveVar.d().h(bArr));
        } catch (eygu e) {
            ensk j = cevd.a.j();
            j.Y(ente.a, "BugleWorkQueue");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkItemHandler", "preflightRaw", 2784, "WorkItemHandler.java")).B("got InvalidProtocol %s for data %d", e, bArr.length);
            return false;
        }
    }

    public static cety b() {
        return cety.l().h();
    }
}
