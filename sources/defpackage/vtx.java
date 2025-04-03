package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.Compose2oFragment;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtx extends txv<bctw> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtx(vvn vvnVar) {
        super("Conversation participants");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void b(Object obj) {
        eg G;
        Compose2oFragment compose2oFragment;
        bctw bctwVar = (bctw) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$21", "onNewData", 2790, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Conversation participants");
        vvn vvnVar = this.a;
        vvnVar.bs.b(vvnVar.cd, vvnVar.N.G());
        bcqs bcqsVar = (bcqs) this.a.cA.a();
        int i = 0;
        bcqsVar.f = bctwVar.e().count() > 0;
        bcqsVar.g = bctwVar;
        vvn vvnVar2 = this.a;
        if (((bcqs) vvnVar2.cA.a()).f) {
            vvnVar2.aa();
            bcqs bcqsVar2 = (bcqs) vvnVar2.cA.a();
            Context z = vvnVar2.N.z();
            z.getClass();
            vvnVar2.cB = bcqsVar2.a(z);
            if (vvnVar2.C == null && (compose2oFragment = (Compose2oFragment) vvnVar2.N.I().h("c2oFragment")) != null) {
                vvnVar2.C = compose2oFragment.H();
            }
            ParticipantsTable.BindData a = ((bcqs) vvnVar2.cA.a()).g.a();
            final int i2 = ((bcqs) vvnVar2.cA.a()).g.e;
            vjt vjtVar = vvnVar2.cC;
            boolean p = ((bcqs) vvnVar2.cA.a()).p();
            bcqs bcqsVar3 = (bcqs) vvnVar2.cA.a();
            ParticipantsTable.BindData a2 = bcqsVar3.g.a();
            int i3 = 6;
            if (!bcqsVar3.d.y() && a2 != null) {
                i3 = a2.t();
            }
            byyt byytVar = ((typ) ((bcqs) vvnVar2.cA.a()).d).a;
            List d = vvnVar2.aS.d(((bcqs) vvnVar2.cA.a()).g.f());
            ahqt ahqtVar = (ahqt) vjtVar;
            ahqtVar.v.isPresent();
            ConversationActivityUsageStatisticsState o = ahqtVar.o();
            if (o.c < 0 && !ahqtVar.n().c()) {
                o.c = i2;
                o.h = p;
                o.l = cvfc.a(i3);
                o.m = byyt.i(byytVar);
                o.k = d;
                ahqtVar.B();
            }
            vvnVar2.cC.c();
            uuy uuyVar = vvnVar2.cx;
            bctw bctwVar2 = ((bcqs) vvnVar2.cA.a()).g;
            uuyVar.C.d = true;
            upx upxVar = uuyVar.aB;
            if (upxVar != null) {
                upxVar.j(bctwVar2.a() != null, true);
            }
            uuyVar.az.setVisibility(0);
            vvnVar2.S(null, new Consumer() { // from class: vjz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    enru enruVar = vvn.a;
                    ((ComposeMessageView) obj2).H().A(i2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            vvnVar2.cJ = true;
            vvnVar2.af();
            vvnVar2.ae();
            vvnVar2.aS((bcvr) vvnVar2.cM.a());
            if (a != null && ((bcqs) vvnVar2.cA.a()).p()) {
                upq upqVar = vvnVar2.cx.aB.d;
                upqVar.F(upqVar.a, a);
                vvnVar2.aF(a);
            }
            vvnVar2.aQ();
            ArrayList f = ((bcqs) vvnVar2.cA.a()).g.f();
            int size = f.size();
            if (!((ConversationIdType) vvnVar2.J.getAndSet(vvnVar2.M)).equals(vvnVar2.M) && size != 1) {
                int size2 = f.size();
                while (true) {
                    if (i < size2) {
                        if (((ParticipantsTable.BindData) f.get(i)).Y() && (G = vvnVar2.N.G()) != null && !G.isFinishing()) {
                            vvnVar2.cn = vvnVar2.aG.h(R.string.in_conversation_blocked_contact_text);
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            vvnVar2.ad();
        }
    }
}
