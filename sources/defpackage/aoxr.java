package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoxr implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ BugleConversationId b;
    final /* synthetic */ String c;

    public aoxr(String str, BugleConversationId bugleConversationId, String str2) {
        this.a = str;
        this.b = bugleConversationId;
        this.c = str2;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        ensk h = aoyd.a.h();
        h.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.q, this.b);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$1", "onSuccess", 1920, "CoreBugleMessageRepository.java")).q(this.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensk j = aoyd.a.j();
        j.Y(ente.a, "BugleMapi");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.q, this.b);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository$1", "onFailure", 1928, "CoreBugleMessageRepository.java")).q(this.c);
    }
}
