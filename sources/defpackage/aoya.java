package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoya implements alyd {
    final /* synthetic */ aoyd a;
    private final String b;
    private final alyd c;

    public aoya(aoyd aoydVar, apta aptaVar, alyd alydVar) {
        this.a = aoydVar;
        this.b = aptaVar.a;
        this.c = alydVar;
    }

    @Override // defpackage.ctbf
    public final /* bridge */ /* synthetic */ elfl a(Object obj) {
        alyc alycVar = (alyc) obj;
        ensk h = aoyd.a.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.q, this.a.j);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$MessagesChangedCallbackWithLogs", "onChange", 2060, "CoreBugleMessageRepository.java")).J("firing onChange, msg: %s %s, source: %s.", alycVar.b().a(), alycVar.a(), this.b);
        return this.c.a(alycVar);
    }

    @Override // defpackage.alyd
    public final elfl b() {
        ensk h = aoyd.a.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.q, this.a.j);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$MessagesChangedCallbackWithLogs", "onAllMessagesChanged", 2052, "CoreBugleMessageRepository.java")).t("firing onAllMessagesChanged, source: %s.", this.b);
        return this.c.b();
    }

    public aoya(aoyd aoydVar, String str, alyd alydVar) {
        this.a = aoydVar;
        this.b = str;
        this.c = alydVar;
    }
}
