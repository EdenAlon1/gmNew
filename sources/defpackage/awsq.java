package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awsq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awss b;
    final /* synthetic */ azcr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awsq(awss awssVar, azcr azcrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awssVar;
        this.c = azcrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awsq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        this.a = 1;
        Object a = awssVar.a.a(azcrVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awsq(this.b, this.c, ffguVar);
    }
}
