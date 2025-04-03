package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eati extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eatj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eati(eatj eatjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eatjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eati) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        eatj eatjVar = this.b;
        this.a = 1;
        a = eatjVar.b.a.a(exyd.COLLABORATOR_API_CALL, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eati(this.b, ffguVar);
    }
}
