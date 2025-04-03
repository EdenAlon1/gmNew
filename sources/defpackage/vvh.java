package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vvh extends txv<Optional<bcse>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvh(vvn vvnVar) {
        super("Latest message");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$7", "onNewData", 2233, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Latest message");
        final vvn vvnVar = this.a;
        ((Optional) obj).ifPresent(new Consumer() { // from class: vka
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                bcse bcseVar = (bcse) obj2;
                MessageIdType u = bcseVar.u();
                final vvn vvnVar2 = vvn.this;
                if (u.equals(vvnVar2.cf)) {
                    return;
                }
                vvnVar2.cf = u;
                boolean G = vvnVar2.cx.G();
                bcqs bcqsVar = (bcqs) vvnVar2.cA.a();
                bcseVar.i();
                vvnVar2.cx.aB.j((bcqsVar.f && bcqsVar.g.a() == null) ? false : true, false);
                vvnVar2.aa();
                if (!G && bcseVar.az() && ((carb) vvnVar2.aR.b()).f(vvnVar2.M)) {
                    if (vvnVar2.cT == null) {
                        vvnVar2.aH(vvnVar2.N.Y(R.string.in_conversation_notify_new_message_text), vvnVar2.N.Y(R.string.in_conversation_notify_new_message_action), new Runnable() { // from class: vsb
                            @Override // java.lang.Runnable
                            public final void run() {
                                vvn.this.am();
                            }
                        }, true);
                    } else {
                        vvnVar2.cU++;
                        vvnVar2.n();
                    }
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
