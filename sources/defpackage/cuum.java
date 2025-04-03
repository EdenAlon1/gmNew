package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuum extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuun b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuum(cuun cuunVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cuunVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuum) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cuun cuunVar = this.b;
            cuul cuulVar = new cuul(this.c, null);
            this.a = 1;
            if (cuunVar.a.a(cuulVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuum(this.b, this.c, ffguVar);
    }
}
