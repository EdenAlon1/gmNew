package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amnk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amnr b;
    final /* synthetic */ azcr c;
    final /* synthetic */ amer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnk(amnr amnrVar, azcr azcrVar, amer amerVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amnrVar;
        this.c = azcrVar;
        this.d = amerVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amnk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amnr amnrVar = this.b;
        azcr azcrVar = this.c;
        amer amerVar = this.d;
        this.a = 1;
        Object g = amnrVar.g(azcrVar, amerVar, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amnk(this.b, this.c, this.d, ffguVar);
    }
}
