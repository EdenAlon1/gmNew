package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoyb implements aqgd {
    final /* synthetic */ aoyd a;
    private final String b;
    private final alyd c;

    public aoyb(aoyd aoydVar, String str, alyd alydVar) {
        this.a = aoydVar;
        this.b = str;
        this.c = alydVar;
    }

    @Override // defpackage.aqgd
    public final elfl a() {
        ensk h = aoyd.a.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.q, this.a.j);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$OnDataChangedHandlerWithLogs", "onChanged", 2085, "CoreBugleMessageRepository.java")).t("firing onAllMessagesChanged, source: %s.", this.b);
        return this.c.b();
    }
}
