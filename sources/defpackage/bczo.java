package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczo extends ffhv implements ffjm {
    final /* synthetic */ bczq a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ axcl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bczo(ffgu ffguVar, bczq bczqVar, ConversationIdType conversationIdType, axcl axclVar) {
        super(2, ffguVar);
        this.a = bczqVar;
        this.b = conversationIdType;
        this.c = axclVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bczo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw a = this.a.a(this.b, this.c);
        int i = ((enou) a).c;
        if (i != 1) {
            ((ensz) this.a.a.j()).J("Unable to increment impressions, %d matching records were found for conversationId: %s classificationType: %s", new Integer(i), this.b, this.c);
            return ffcu.a;
        }
        long k = ((brae) a.get(0)).k();
        String[] strArr = brbs.a;
        brbp brbpVar = new brbp();
        brbpVar.ap("incrementClassificationImpressions");
        brbpVar.f(new bczp(this.c, this.b));
        brbpVar.e(k + 1);
        return new Integer(brbpVar.b().e());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bczo bczoVar = new bczo(ffguVar, this.a, this.b, this.c);
        bczoVar.d = obj;
        return bczoVar;
    }
}
