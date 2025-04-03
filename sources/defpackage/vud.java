package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vud implements ejwd<Optional<ucz>> {
    final /* synthetic */ vvn a;

    public vud(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        if (this.a.ba()) {
            return;
        }
        ensk j = vvn.a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) ((enrr) j).g(th);
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$25", "onError", 2898, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to read draft from storage.");
        this.a.S(null, new Consumer() { // from class: vub
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ComposeMessageView composeMessageView = (ComposeMessageView) obj;
                bcvr bcvrVar = (bcvr) composeMessageView.H().s().a();
                composeMessageView.H().s().b();
                bcvrVar.ak();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final Optional optional = (Optional) obj;
        this.a.S(null, new Consumer() { // from class: vuc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                vud vudVar = vud.this;
                vvn vvnVar = vudVar.a;
                ComposeMessageView composeMessageView = (ComposeMessageView) obj2;
                vvnVar.bt.b(vvnVar.cd, vvnVar.N.G());
                Optional optional2 = optional;
                if (optional2.isPresent()) {
                    ucz uczVar = (ucz) optional2.get();
                    bcvr bcvrVar = (bcvr) composeMessageView.H().s().a();
                    String b = composeMessageView.H().s().b();
                    MessageCoreData c = uczVar.c();
                    bcyk b2 = uczVar.b();
                    Context z = vudVar.a.N.z();
                    z.getClass();
                    bcvrVar.M(b, c, b2, z);
                    if (uczVar.a() != null) {
                        cxtc H = composeMessageView.H();
                        RepliedToDataAdapter a = uczVar.a();
                        a.getClass();
                        H.P(a);
                    }
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
