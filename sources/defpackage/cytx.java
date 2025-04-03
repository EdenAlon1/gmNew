package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cytx extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cytz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cytx(cytz cytzVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cytzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cytx cytxVar = new cytx(this.c, (ffgu) obj3);
        cytxVar.a = (alxj) obj;
        cytxVar.b = (engw) obj2;
        return cytxVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r6 = this.a;
        Object obj2 = this.b;
        String i = r6.i();
        engw engwVar = (engw) obj2;
        cytz cytzVar = this.c;
        return new cyub(i, cytzVar.b(r6, engwVar, cytzVar.a instanceof PenpalBotConversationId), cytz.c(r6, engwVar), new cyua(((auxw) this.c.c.b()).a()));
    }
}
