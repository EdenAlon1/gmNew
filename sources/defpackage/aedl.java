package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aedl implements ellh {
    final /* synthetic */ aedh a;

    public aedl(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        czyl czylVar = (czyl) ellfVar;
        boolean b = czylVar.b();
        aedh aedhVar = this.a;
        if (b) {
            alxl alxlVar = (alxl) aedhVar.aj.b();
            engw r = engw.r(new BugleConversationId(czylVar.a()));
            czylVar.c();
            axnw.h(alxlVar.E(r, 3));
        } else {
            alxl alxlVar2 = (alxl) aedhVar.aj.b();
            engw r2 = engw.r(new BugleConversationId(czylVar.a()));
            czylVar.c();
            axnw.h(alxlVar2.F(r2, 3));
        }
        ((aehw) aedhVar.p.b()).q(((aehw) aedhVar.p.b()).G(czylVar.a().a()));
        return elli.a;
    }
}
