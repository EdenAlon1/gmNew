package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aplm extends ffhv implements ffjm {
    final /* synthetic */ aplx a;
    final /* synthetic */ aqux b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplm(ffgu ffguVar, aplx aplxVar, aqux aquxVar) {
        super(2, ffguVar);
        this.a = aplxVar;
        this.b = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aplm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(this.a.b.b(this.b.b()));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aplm aplmVar = new aplm(ffguVar, this.a, this.b);
        aplmVar.c = obj;
        return aplmVar;
    }
}
