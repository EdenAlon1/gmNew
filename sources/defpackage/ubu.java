package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ubu extends txv<Optional<bejf>> {
    final /* synthetic */ ucd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubu(ucd ucdVar) {
        super("Conversation metadata");
        this.a = ucdVar;
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void b(Object obj) {
        uaw uawVar;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        this.a.h.S((bejf) optional.get());
        SelfIdentityId c = aqvf.c(((bejf) optional.get()).m());
        ucd ucdVar = this.a;
        ucdVar.B = bcqs.c(ucdVar.h, ucdVar.g.a);
        ucdVar.z.H();
        ucdVar.B.getClass();
        if (c != null && !c.equals(ucdVar.I.t())) {
            ucdVar.I.T(c, ucdVar.s(c));
            uaw uawVar2 = ucdVar.L;
            if (uawVar2 != null) {
                uawVar2.aj();
            }
        }
        ucj ucjVar = ucdVar.N;
        tys tysVar = ucdVar.B;
        tysVar.getClass();
        ucjVar.d = tysVar;
        ucjVar.a();
        if (ucjVar.d == null) {
            if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                ((ensz) ((ensz) ucj.a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateIsRcsConversation", 125, "DraftEditorRcsController.java")).t("DraftEditorRcsController#updateIsRcsConversation left as %s because is metadata is not loaded", Boolean.valueOf(ucjVar.f));
            }
        } else if (ucjVar.b() || ucjVar.d.A()) {
            if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                ((ensz) ((ensz) ucj.a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateIsRcsConversation", 134, "DraftEditorRcsController.java")).q("DraftEditorRcsController#updateIsRcsConversation=true because is rbm or rcs group");
            }
            ucjVar.f = true;
        } else if (ucjVar.d.z()) {
            aqgi aqgiVar = (aqgi) ucjVar.b.b();
            int q = ucjVar.c.q();
            if (((typ) ucjVar.d).k.isEmpty()) {
                ucjVar.f = aqgiVar.e(aqgiVar.b(Optional.empty(), q));
                if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                    ((ensz) ((ensz) ucj.a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateIsRcsConversation", 147, "DraftEditorRcsController.java")).F("DraftEditorRcsController#updateIsRcsConversation=%s with subId=%s (other person has no phone number?!)", ucjVar.f, q);
                }
            } else {
                ucjVar.f = aqgiVar.e(aqgiVar.c(q, ((typ) ucjVar.d).k));
                if (((Boolean) ((cfup) wfa.a.get()).e()).booleanValue()) {
                    ((ensz) ((ensz) ucj.a.h()).h("com/google/android/apps/messaging/conversation/draft/DraftEditorRcsController", "updateIsRcsConversation", 158, "DraftEditorRcsController.java")).F("DraftEditorRcsController#updateIsRcsConversation=%s with subId=%s using normal 1:1 check", ucjVar.f, q);
                }
            }
        } else {
            ucjVar.f = false;
        }
        ucdVar.x("onConversationMetadataUpdated");
        tys tysVar2 = ucdVar.B;
        tysVar2.getClass();
        if (!tysVar2.A()) {
            ucdVar.v();
        } else {
            if (tysVar2 == null || (uawVar = ucdVar.L) == null) {
                return;
            }
            uawVar.aj();
        }
    }
}
