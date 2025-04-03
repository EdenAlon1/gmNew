package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtt extends txv<Optional<bejf>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtt(vvn vvnVar) {
        super("Conversation metadata");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void b(Object obj) {
        final Optional optional = (Optional) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$19", "onNewData", 2689, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Conversation metadata");
        if (!optional.isPresent()) {
            vvn vvnVar = this.a;
            if (vvnVar.N.aI()) {
                vvnVar.Q();
                return;
            } else {
                vvnVar.cC.af();
                return;
            }
        }
        vvn vvnVar2 = this.a;
        vvnVar2.w = true;
        bcqs bcqsVar = (bcqs) vvnVar2.cA.a();
        bejf bejfVar = (bejf) optional.get();
        if (!bcqsVar.i.d.equals(bejfVar)) {
            bcqsVar.i.S(bejfVar);
            bcqsVar.d = bcqs.c(bcqsVar.i, bcqsVar.e);
            if (bcqsVar.p() || bcqsVar.d.A()) {
                bcqsVar.m = true;
            } else if (bcqsVar.d.z()) {
                int b = bcqsVar.b(aqvf.c(bejfVar.m()));
                aqgi aqgiVar = (aqgi) bcqsVar.b.b();
                Optional optional2 = ((typ) bcqsVar.d).k;
                if (optional2.isEmpty()) {
                    bcqsVar.m = aqgiVar.e(aqgiVar.b(Optional.empty(), b));
                } else {
                    bcqsVar.m = aqgiVar.e(aqgiVar.c(b, optional2));
                }
            } else {
                bcqsVar.m = false;
            }
            bcqsVar.n = aqvf.c(bejfVar.m());
        }
        ensk e2 = vvn.a.e();
        e2.Y(ente.a, "Bugle");
        enrr enrrVar2 = (enrr) e2;
        enrrVar2.Y(csux.p, this.a.M);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$19", "onNewData", 2697, "ConversationFragmentPeer.java")).q("ConversationFragment: Updating Magic Compose visibility on conversation metadata new data");
        this.a.aN();
        vvn vvnVar3 = this.a;
        eg G = vvnVar3.N.G();
        boolean bb = vvnVar3.bb();
        boolean z = ((bcqs) vvnVar3.cA.a()).m;
        eisx eisxVar = vvnVar3.cd;
        eisxVar.getClass();
        wgd wgdVar = vvnVar3.bs;
        wgdVar.b = true;
        wgdVar.c = Boolean.valueOf(bb);
        wgdVar.d = Boolean.valueOf(z);
        wgdVar.a(eisxVar, G);
        this.a.S(null, new Consumer() { // from class: vts
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                SelfIdentityId c = aqvf.c(((bejf) optional.get()).m());
                if (c != null) {
                    vtt vttVar = vtt.this;
                    if (!vttVar.a.cM.g() || c.equals(((bcvr) vttVar.a.cM.a()).t())) {
                        return;
                    }
                    ((bcvr) vttVar.a.cM.a()).T(c, ((bcqs) vttVar.a.cA.a()).b(c));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.a.ai();
        this.a.ak(null);
        enqu listIterator = ((enpx) this.a.aY).listIterator();
        while (listIterator.hasNext()) {
            ((tun) listIterator.next()).a((bcqs) this.a.cA.a());
        }
        if (!((bcqs) this.a.cA.a()).d.z() || ((bcqs) this.a.cA.a()).p()) {
            vvn vvnVar4 = this.a;
            vjt vjtVar = vvnVar4.cC;
            boolean z2 = ((bcqs) vvnVar4.cA.a()).m;
            boolean bk = this.a.bk();
            ahqt ahqtVar = (ahqt) vjtVar;
            ahqtVar.v.isPresent();
            vvn p = ahqtVar.p();
            ahqtVar.C(z2, bk, p != null && p.bn());
        }
        vvn vvnVar5 = this.a;
        if (((bcqs) vvnVar5.cA.a()).p() && ((typ) ((bcqs) vvnVar5.cA.a()).d).s == amny.c) {
            vvn vvnVar6 = this.a;
            if (vvnVar6.N.aI()) {
                ((ddwn) vvnVar6.aH.b()).a(R.string.email_convo_not_available_due_to_trusted_contacts, false);
                this.a.Q();
            } else {
                ((ddwn) vvnVar6.aH.b()).a(R.string.email_convo_not_available_due_to_trusted_contacts, false);
                this.a.cC.af();
            }
        }
    }
}
