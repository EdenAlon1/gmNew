package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aecm implements ejlr<SelectedConversation, ParticipantsTable.BindData> {
    final /* synthetic */ aedh a;

    public aecm(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void c(Object obj, Object obj2) {
        SelectedConversation selectedConversation = (SelectedConversation) obj;
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj2;
        if (bindData == null) {
            if (!((aube) this.a.bv.b()).a()) {
                csjb b = aeaa.a.b();
                b.I("reportGroupCallback: Failed to find any reportable Participant for");
                b.c(selectedConversation.a);
                b.r();
                return;
            }
            ensk i = aedh.a.i();
            i.Y(ente.a, "HomeFragmentFlogger");
            enrr enrrVar = (enrr) i;
            enrrVar.Y(csux.p, selectedConversation.a);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/home/HomeFragmentPeer$20", "onSuccess", 3967, "HomeFragmentPeer.java")).q("reportGroupCallback: Failed to find any reportable Participant for");
            return;
        }
        taa taaVar = (taa) this.a.J.b();
        taf k = tak.k();
        k.d(taj.GROUP_SPAM);
        syk sykVar = (syk) k;
        sykVar.e = 1;
        k.c(selectedConversation.a);
        sykVar.b = bindData;
        sykVar.a = new Runnable() { // from class: aecl
            @Override // java.lang.Runnable
            public final void run() {
                aecm.this.a.o();
            }
        };
        sykVar.c = new sya(5);
        sykVar.d = syf.a(bindData);
        k.e();
        sykVar.f = 3;
        taaVar.d(k.f());
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        if (!((aube) this.a.bv.b()).a()) {
            aeaa.a.r("Error getting reportable participant for group conversation");
            return;
        }
        ensk j = aedh.a.j();
        j.Y(ente.a, "HomeFragmentFlogger");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$20", "onFailure", (char) 3980, "HomeFragmentPeer.java")).q("Error getting reportable participant for group conversation");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
