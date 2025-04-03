package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vto extends txv<Optional<ephg>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vto(vvn vvnVar) {
        super("RCS oneOnOne conditions");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        this.a.x = true;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$16", "onNewData", 2613, "ConversationFragmentPeer.java")).t("ConversationFragment: onNewData: RCS one-on-one conditions data: %s", optional);
        final vvn vvnVar = this.a;
        optional.ifPresent(new Consumer() { // from class: vtm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                vvn.this.ak((ephg) obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final vvn vvnVar2 = this.a;
        optional.ifPresent(new Consumer() { // from class: vtn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                ephg ephgVar = (ephg) obj2;
                if (ephgVar != null) {
                    vvn vvnVar3 = vvn.this;
                    vvnVar3.aF = ephgVar.i;
                    ensk e2 = vvn.a.e();
                    e2.Y(ente.a, "Bugle");
                    enrr enrrVar2 = (enrr) e2;
                    enrrVar2.Y(csux.p, vvnVar3.M);
                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer", "updateParticipantSupportCarrierVideoCall", 4592, "ConversationFragmentPeer.java")).t("ConversationFragment: Participant support carrier video call: %s", Boolean.valueOf(vvnVar3.aF));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
