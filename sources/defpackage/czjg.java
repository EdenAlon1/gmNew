package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czjg implements View.OnClickListener {
    final /* synthetic */ ConversationMessageTransferView a;

    public czjg(ConversationMessageTransferView conversationMessageTransferView) {
        this.a = conversationMessageTransferView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        csix.l(this.a.b);
        if (!this.a.a.az()) {
            if (this.a.a.aT()) {
                ConversationMessageView conversationMessageView = (ConversationMessageView) this.a.b;
                czic czicVar = conversationMessageView.t;
                bcse bcseVar = conversationMessageView.e;
                emxf.a(!bcseVar.aC());
                uuy uuyVar = (uuy) czicVar;
                if (bcseVar.am(uuyVar.e.fe()) && uuyVar.o.c(uuyVar.e.fe())) {
                    uuyVar.bc.a(bcseVar.u()).t();
                    return;
                }
                return;
            }
            ConversationMessageView conversationMessageView2 = (ConversationMessageView) this.a.b;
            czic czicVar2 = conversationMessageView2.t;
            bcse bcseVar2 = conversationMessageView2.e;
            if (bcseVar2.al()) {
                uuy uuyVar2 = (uuy) czicVar2;
                if (uuyVar2.o.c(uuyVar2.e.fe())) {
                    uuyVar2.ay.m(bcseVar2.u());
                    return;
                }
                return;
            }
            return;
        }
        if (this.a.a.at()) {
            ConversationMessageView conversationMessageView3 = (ConversationMessageView) this.a.b;
            czic czicVar3 = conversationMessageView3.t;
            bcse bcseVar3 = conversationMessageView3.e;
            emxf.a(!bcseVar3.aC());
            uuy uuyVar3 = (uuy) czicVar3;
            if (bcseVar3.am(uuyVar3.e.fe()) && uuyVar3.o.c(uuyVar3.e.fe())) {
                uuyVar3.bc.a(bcseVar3.u()).t();
                return;
            }
            return;
        }
        ConversationMessageView conversationMessageView4 = (ConversationMessageView) this.a.b;
        bcse bcseVar4 = conversationMessageView4.e;
        if (bcseVar4 != null) {
            uuy uuyVar4 = (uuy) conversationMessageView4.t;
            if (bcseVar4.ai(uuyVar4.e.fe()) && uuyVar4.o.c(uuyVar4.e.fe())) {
                bcxq e = uuyVar4.e(bcseVar4.s());
                if (bcseVar4.aC() && bcseVar4.f() == 112 && e != null) {
                    ctwb ctwbVar = uuyVar4.r;
                    int b = e.b();
                    int b2 = ctwbVar.b();
                    if (!uuyVar4.r.p(b)) {
                        ddxs.b(uuyVar4.e.fe(), uuyVar4.r.h(b).r(), uuyVar4.r.h(b2).r(), false);
                        return;
                    }
                }
                uuyVar4.q(bcseVar4);
            }
        }
    }
}
