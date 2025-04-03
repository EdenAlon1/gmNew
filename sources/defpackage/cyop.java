package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyop extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ cyoq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyop(cyoq cyoqVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = cyoqVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cyop cyopVar = new cyop(this.d, (ffgu) obj4);
        cyopVar.a = (alxj) obj;
        cyopVar.b = (cyor) obj2;
        cyopVar.c = (cyor) obj3;
        return cyopVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r4 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        if (!(this.d.d instanceof PenpalBotConversationId)) {
            return r4.b() == alxi.GROUP ? obj3 : obj2;
        }
        int i = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        return new cyor(engwVar);
    }
}
