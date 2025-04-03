package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqu extends ffhv implements ffjm {
    final /* synthetic */ bzqw a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzqu(ffgu ffguVar, bzqw bzqwVar) {
        super(2, ffguVar);
        this.a = bzqwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzqu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bzqw bzqwVar = this.a;
        akzw akzwVar = (akzw) bzqwVar.j.get();
        if (akzwVar != null) {
            akzwVar.c();
            ensk e = bzqw.a.e();
            e.Y(ente.a, "BugleEtouffee");
            ((enrr) bzqwVar.d((enrr) e).h("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/ConversationE2eeStatusImpl", "stopTimerIfStarted", 540, "ConversationE2eeStatusImpl.kt")).q("stopping etouffee action timer");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzqu bzquVar = new bzqu(ffguVar, this.a);
        bzquVar.b = obj;
        return bzquVar;
    }
}
