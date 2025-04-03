package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczq implements bczm {
    public final entd a;
    private final ffhd b;

    public bczq(ffhd ffhdVar, dtuu dtuuVar) {
        ffhdVar.getClass();
        dtuuVar.getClass();
        this.b = ffhdVar;
        this.a = entd.c("BugleDataModel");
    }

    @Override // defpackage.bczm
    public final engw a(ConversationIdType conversationIdType, axcl axclVar) {
        conversationIdType.getClass();
        axclVar.getClass();
        brbn a = brbs.a();
        a.z("getConversationClassifications");
        brbr brbrVar = new brbr();
        brbrVar.d(conversationIdType);
        brbrVar.c(axclVar);
        a.k(new brbq(brbrVar));
        engw y = a.b().y();
        y.getClass();
        return y;
    }

    @Override // defpackage.bczm
    public final Object b(ConversationIdType conversationIdType, axcl axclVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.b), new bczn(null, this, conversationIdType, axclVar), ffguVar);
    }

    @Override // defpackage.bczm
    public final Object c(ConversationIdType conversationIdType, axcl axclVar, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.b), new bczo(null, this, conversationIdType, axclVar), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
