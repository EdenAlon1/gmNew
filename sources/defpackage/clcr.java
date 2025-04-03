package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clcr extends ffhv implements ffjm {
    final /* synthetic */ clcv a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ ckep c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clcr(clcv clcvVar, ConversationIdType conversationIdType, ckep ckepVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = clcvVar;
        this.b = conversationIdType;
        this.c = ckepVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clcr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String str = this.c.h().d;
        str.getClass();
        enru enruVar = clcv.a;
        clcv clcvVar = this.a;
        List L = ((bczy) clcvVar.p.b()).L(this.b);
        L.getClass();
        if (!L.isEmpty()) {
            enqv it = ((engw) L).iterator();
            while (it.hasNext()) {
                if (ffkj.e(str, ((ParticipantsTable.BindData) it.next()).U())) {
                    break;
                }
            }
        }
        ((akzt) clcvVar.m.b()).c("Bugle.Rcs.OnIncomingRcsMessage.SelfParticipantPresent.Counts");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clcr(this.a, this.b, this.c, ffguVar);
    }
}
