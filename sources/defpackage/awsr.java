package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awsr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awss b;
    final /* synthetic */ azcr c;
    final /* synthetic */ azsu d;
    final /* synthetic */ amer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awsr(awss awssVar, azcr azcrVar, azsu azsuVar, amer amerVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awssVar;
        this.c = azcrVar;
        this.d = azsuVar;
        this.e = amerVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awsr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        awss awssVar = this.b;
        azcr azcrVar = this.c;
        azsu azsuVar = this.d;
        amer amerVar = this.e;
        this.a = 1;
        Object b = awssVar.a.b(azcrVar, azsuVar, amerVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awsr(this.b, this.c, this.d, this.e, ffguVar);
    }
}
