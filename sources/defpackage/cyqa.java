package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyqa extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ cyqd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyqa(cyqd cyqdVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = cyqdVar;
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        cyqa cyqaVar = new cyqa(this.f, (ffgu) obj6);
        cyqaVar.a = (alxj) obj;
        cyqaVar.b = (dlsr) obj2;
        cyqaVar.c = (cyqq) obj3;
        cyqaVar.d = (aqux) obj4;
        cyqaVar.e = (engw) obj5;
        return cyqaVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aqux, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cyqd cyqdVar = this.f;
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        return cyqdVar.c(r1, cyqdVar.c instanceof PenpalBotConversationId, (dlsr) obj2, (cyqq) obj3, this.d, (engw) this.e);
    }
}
