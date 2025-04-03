package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bdfr extends ffhv implements ffjm {
    final /* synthetic */ bdfv a;
    final /* synthetic */ ConversationIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdfr(bdfv bdfvVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bdfvVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdfr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bdfv bdfvVar = this.a;
        ffbr ffbrVar = bdfvVar.a;
        ConversationIdType conversationIdType = this.b;
        List i = bdfvVar.i(conversationIdType);
        if (byyr.d(((bczy) ffbrVar.b()).c(conversationIdType))) {
            engw<aztg> h = bdfvVar.c.h();
            h.getClass();
            ArrayList arrayList = new ArrayList();
            for (aztg aztgVar : h) {
                aztgVar.getClass();
                aoku h2 = bdfvVar.h(aztgVar);
                if (h2 != null) {
                    arrayList.add(h2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            enqv it = ((engw) i).iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (!arrayList.contains(bdfvVar.b.q((ParticipantsTable.BindData) next))) {
                    arrayList2.add(next);
                }
            }
            i = arrayList2;
        }
        return engq.a(i);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bdfr(this.a, this.b, ffguVar);
    }
}
