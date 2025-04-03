package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aecj implements ejlr<SelectedConversation, ParticipantsTable.BindData> {
    final /* synthetic */ aedh a;

    public aecj(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void c(Object obj, Object obj2) {
        SelectedConversation selectedConversation = (SelectedConversation) obj;
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
        if (bindData == null) {
            if (!((aube) this.a.bv.b()).a()) {
                csjb e = aeaa.a.e();
                e.I("HomeFragmentPeer#getBlockCallback#onSuccess: participant is null");
                e.c(selectedConversation.a);
                e.r();
                return;
            }
            ensk j = aedh.a.j();
            j.Y(ente.a, "HomeFragmentFlogger");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(csux.p, selectedConversation.a);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/home/HomeFragmentPeer$19", "onSuccess", 3905, "HomeFragmentPeer.java")).q("HomeFragmentPeer#getBlockCallback#onSuccess: participant is null");
            return;
        }
        aedh aedhVar = this.a;
        tai a = syf.a(bindData);
        taj tajVar = taj.BLOCK;
        tah syaVar = new sya(5);
        if (selectedConversation.h) {
            tajVar = taj.RBM_BLOCK;
            syaVar = new syb(4);
        }
        taa taaVar = (taa) aedhVar.J.b();
        taf k = tak.k();
        k.d(tajVar);
        syk sykVar = (syk) k;
        sykVar.e = 1;
        k.c(selectedConversation.a);
        k.b(R.id.start_chat_fab);
        sykVar.b = bindData;
        sykVar.c = syaVar;
        sykVar.a = new aean(aedhVar);
        sykVar.d = a;
        k.e();
        sykVar.f = 3;
        taaVar.d(k.f());
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        SelectedConversation selectedConversation = (SelectedConversation) obj;
        if (!((aube) this.a.bv.b()).a()) {
            csjb e = aeaa.a.e();
            e.I("Error getting local blocked users for migrating blocked");
            e.c(selectedConversation.a);
            e.r();
            return;
        }
        ensk j = aedh.a.j();
        j.Y(ente.a, "HomeFragmentFlogger");
        enrr enrrVar = (enrr) ((enrr) j).g(th);
        enrrVar.Y(csux.p, selectedConversation.a);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/home/HomeFragmentPeer$19", "onFailure", 3925, "HomeFragmentPeer.java")).q("HomeFragmentPeer#getBlockCallback#onFailure: Error getting local blocked users for migrating blocked");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
