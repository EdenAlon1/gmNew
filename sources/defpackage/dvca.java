package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvca extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dvcb b;
    final /* synthetic */ evto c;
    final /* synthetic */ evtz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvca(dvcb dvcbVar, evto evtoVar, evtz evtzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvcbVar;
        this.c = evtoVar;
        this.d = evtzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvca) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvcb dvcbVar = this.b;
            evto evtoVar = this.c;
            evtz evtzVar = this.d;
            this.a = 1;
            if (dvcbVar.a.a(evtoVar, evtzVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvca(this.b, this.c, this.d, ffguVar);
    }
}
