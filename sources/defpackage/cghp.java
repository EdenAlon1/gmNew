package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Map;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cghp extends ffhv implements ffjm {
    final /* synthetic */ cghv a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cghp(ffgu ffguVar, cghv cghvVar) {
        super(2, ffguVar);
        this.a = cghvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cghp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.c(bsdr.c.a);
        bsdmVar.z("ParentAllowlistUpdateHandler#conversationIdToParticipantsDataQuery");
        bsdmVar.r();
        bsdmVar.D(dtvz.i(ParticipantsTable.e().b(), ParticipantsTable.c.a, bsdr.c.b).g());
        String[] strArr2 = bvin.a;
        bsdmVar.G(dtvz.i(new bvik(bvin.a).b(), bvin.c.a, bsdr.c.a).g());
        enqv it = bsdmVar.b().y().iterator();
        it.getClass();
        while (it.hasNext()) {
            bscj bscjVar = (bscj) it.next();
            ConversationIdType m = bscjVar.m();
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) bscjVar.aw("participants", ParticipantsTable.BindData.class);
            if (bindData == null) {
                ensk j = cghv.a.j();
                j.Y(ente.a, "BugleWearable");
                ((enrr) j.h("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler$loadParticipantsForAllConversationsUsingConversationToParticipants$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 189, "ParentAllowlistUpdateHandler.kt")).t("There is no participant for conversation with id: %s.", m.a());
            } else {
                if (bscjVar.aw("parent_disallowed_conversations", bvht.class) != null) {
                    hashSet.add(m);
                }
                aoku q = ((aolr) this.a.c.b()).q(bindData);
                Map.EL.putIfAbsent(hashMap, m, new HashSet());
                Object obj2 = hashMap.get(m);
                obj2.getClass();
                ((HashSet) obj2).add(q);
                hashSet2.add(q);
            }
        }
        return new cghn(hashMap, hashSet, hashSet2);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cghp cghpVar = new cghp(ffguVar, this.a);
        cghpVar.b = obj;
        return cghpVar;
    }
}
