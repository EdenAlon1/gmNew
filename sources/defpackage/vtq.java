package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtq extends txv<Optional<Boolean>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtq(vvn vvnVar) {
        super("RCS support status");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$17", "onNewData", 2627, "ConversationFragmentPeer.java")).t("ConversationFragment: onNewData RCS supported data: %s", optional);
        optional.ifPresent(new Consumer() { // from class: vtp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                vtq vtqVar = vtq.this;
                ((bcqs) vtqVar.a.cA.a()).m = ((Boolean) obj2).booleanValue();
                vtqVar.a.ai();
                ensk e2 = vvn.a.e();
                e2.Y(ente.a, "Bugle");
                enrr enrrVar2 = (enrr) e2;
                enrrVar2.Y(csux.p, vtqVar.a.M);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$17", "onNewData", 2635, "ConversationFragmentPeer.java")).q("ConversationFragment: Updating Magic Compose visibility on RCS support status new data");
                vtqVar.a.aN();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
