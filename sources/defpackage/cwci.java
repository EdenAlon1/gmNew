package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwci extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwcm b;
    final /* synthetic */ List c;
    final /* synthetic */ ConversationId d;
    final /* synthetic */ ffix e;
    final /* synthetic */ cwir f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwci(ffgu ffguVar, cwcm cwcmVar, List list, cwir cwirVar, ConversationId conversationId, ffix ffixVar) {
        super(2, ffguVar);
        this.b = cwcmVar;
        this.c = list;
        this.f = cwirVar;
        this.d = conversationId;
        this.e = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwci) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cwcm cwcmVar = this.b;
            List list = this.c;
            this.a = 1;
            obj = cwcmVar.b(list, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            csjb c = cwcm.a.c();
            c.I("Add identities to Rcs group");
            c.y("newRecipientCount", this.c.size());
            c.r();
            cwir cwirVar = this.f;
            if (cwirVar.d == cwjb.e && cwirVar.e.size() < 2) {
                csjb c2 = cwcm.a.c();
                c2.I("Failed to add people to Rcs group since less than two identities are selected.");
                c2.r();
                this.b.c(null);
                return ffcu.a;
            }
            String str = this.c.size() <= 1 ? ((ChipData) this.c.get(0)).b : null;
            cwcm cwcmVar2 = this.b;
            csvw csvwVar = new csvw(new cwcj(cwcmVar2, str), new cwck(cwcmVar2, str));
            cwcm cwcmVar3 = this.b;
            ckyy ckyyVar = (ckyy) ckyz.a.createBuilder();
            String b = this.d.b();
            ckyyVar.copyOnWrite();
            ckyz ckyzVar = (ckyz) ckyyVar.instance;
            b.getClass();
            ckyzVar.c = b;
            List list2 = this.c;
            ArrayList arrayList = new ArrayList(ffdx.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(aolm.e(((ChipData) it.next()).a));
            }
            ckza ckzaVar = cwcmVar3.c;
            ckyyVar.copyOnWrite();
            ckyz ckyzVar2 = (ckyz) ckyyVar.instance;
            ckyzVar2.a();
            eydl.addAll(arrayList, ckyzVar2.d);
            ckyz ckyzVar3 = (ckyz) ckyyVar.build();
            cetp cetpVar = new cetp();
            cetpVar.a = this.d.b();
            cetpVar.e = csvwVar;
            ((cevh) ckzaVar.a.b()).g(ceyr.h("add_members_to_rcs_conversation", ckyzVar3, cetpVar.a()));
            this.b.b.j(aijc.a);
        } else {
            csjb c3 = cwcm.a.c();
            c3.I("Create new group chat since not all recipients have Rcs.");
            c3.r();
            this.e.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwci cwciVar = new cwci(ffguVar, this.b, this.c, this.f, this.d, this.e);
        cwciVar.g = obj;
        return cwciVar;
    }
}
