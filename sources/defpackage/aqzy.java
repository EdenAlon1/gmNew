package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqzy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqzz b;
    final /* synthetic */ aqux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqzy(aqzz aqzzVar, aqux aquxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqzzVar;
        this.c = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqzy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aqzz aqzzVar = this.b;
        aqux aquxVar = this.c;
        this.a = 1;
        Object b = aqzzVar.b(aquxVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqzy(this.b, this.c, ffguVar);
    }
}
