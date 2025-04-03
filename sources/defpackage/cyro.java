package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyro extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ cyrs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyro(cyrs cyrsVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = cyrsVar;
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        cyro cyroVar = new cyro(this.f, (ffgu) obj6);
        cyroVar.a = (alxj) obj;
        cyroVar.b = (alxg) obj2;
        cyroVar.c = (engw) obj3;
        cyroVar.d = (engw) obj4;
        cyroVar.e = (dlsr) obj5;
        return cyroVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [alxg, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cyrs cyrsVar = this.f;
        ?? r1 = this.a;
        ?? r2 = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        engw engwVar = (engw) obj3;
        return cyrsVar.c(r1, r2, (engw) obj2, engwVar, cyrsVar.d instanceof PenpalBotConversationId, (dlsr) this.e);
    }
}
