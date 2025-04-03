package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ cjxq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxj(ffgu ffguVar, ConversationIdType conversationIdType, cjxq cjxqVar) {
        super(2, ffguVar);
        this.b = conversationIdType;
        this.c = cjxqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            if (this.b.b()) {
                ensk j = cjxq.a.j();
                j.Y(ente.a, "BugleProfiles");
                ((enrr) j.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefresherImpl$conversationRefresh$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 64, "ProfilesRefresherImpl.kt")).q("Conversation ID is empty, not refreshing profiles for conversation");
                return ffcu.a;
            }
            cjxq cjxqVar = this.c;
            elfl u = cjxqVar.b.u(cjxqVar.e, new BugleConversationId(this.b));
            this.a = 1;
            obj = fgfz.c(u, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        enhk enhkVar = (enhk) obj;
        ensk h = cjxq.a.h();
        h.Y(ente.a, "BugleProfiles");
        ((enrr) h.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefresherImpl$conversationRefresh$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 79, "ProfilesRefresherImpl.kt")).r("Profiles conversation refresh finished, updated %s profiles", enhkVar.size());
        bczy bczyVar = (bczy) this.c.d.b();
        enhkVar.getClass();
        ArrayList arrayList = new ArrayList(enhkVar.size());
        Iterator it = enhkVar.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getKey().toString());
        }
        bczyVar.S(new ArrayList(arrayList));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjxj cjxjVar = new cjxj(ffguVar, this.b, this.c);
        cjxjVar.d = obj;
        return cjxjVar;
    }
}
