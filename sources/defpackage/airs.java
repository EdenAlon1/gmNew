package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class airs extends ffhv implements ffjm {
    final /* synthetic */ axcl a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public airs(ffgu ffguVar, axcl axclVar, ConversationIdType conversationIdType) {
        super(2, ffguVar);
        this.a = axclVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((airs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = brbs.a;
        brbp brbpVar = new brbp();
        brbpVar.ap("setDismissedInternal");
        brbpVar.f(new airt(this.a, this.b));
        brbpVar.c(axcj.CONVERSATION_CLASSIFICATION_STATE_DISMISSED);
        return new Integer(brbpVar.b().e());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        airs airsVar = new airs(ffguVar, this.a, this.b);
        airsVar.c = obj;
        return airsVar;
    }
}
