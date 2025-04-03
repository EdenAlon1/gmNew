package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrt extends ffhv implements ffjm {
    final /* synthetic */ ahrw a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahrt(ffgu ffguVar, ahrw ahrwVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = ahrwVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahrt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        ffci.b(obj);
        String[] strArr = brbs.a;
        brbp brbpVar = new brbp();
        brbpVar.ap("dismissScamClassificationInternal");
        brbpVar.d(axcl.CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM);
        brbpVar.c(axcj.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
        brbr brbrVar = new brbr();
        ConversationIdType conversationIdType = this.b;
        brbrVar.d(conversationIdType);
        brbrVar.c(axcl.CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM);
        brbpVar.af(new brbq(brbrVar));
        int e = brbpVar.b().e();
        if (e == 0) {
            z = false;
        } else {
            if (e > 1) {
                ((enrr) ahrw.a.j().h("com/google/android/apps/messaging/messageclassifications/ConversationClassificationPersisterImpl", "dismissScamClassificationInternal", 240, "ConversationClassificationPersisterImpl.kt")).B("Multiple rows updated for conversation %s with classification type %d", conversationIdType, axcl.CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM.a());
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahrt ahrtVar = new ahrt(ffguVar, this.a, this.b);
        ahrtVar.c = obj;
        return ahrtVar;
    }
}
