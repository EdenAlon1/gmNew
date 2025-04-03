package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cksz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckta b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cksz(ckta cktaVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cktaVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cksz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cktz cktzVar = (cktz) this.b.f.b();
            ckta cktaVar = this.b;
            ConversationIdType conversationIdType = this.c;
            ecda ecdaVar = ckta.b;
            ecda ecdaVar2 = ckta.c;
            cksy cksyVar = new cksy(cktaVar, conversationIdType, null);
            this.a = 1;
            if (cktzVar.a(ecdaVar, ecdaVar2, cksyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cksz(this.b, this.c, ffguVar);
    }
}
