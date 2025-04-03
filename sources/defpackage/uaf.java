package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uaf extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ uag c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uaf(uag uagVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = uagVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uaf) c((bvvl) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bvvl bvvlVar = (bvvl) this.b;
            ffhd a = ekxi.a(this.c.a);
            uae uaeVar = new uae(null, bvvlVar);
            this.a = 1;
            obj = ffra.a(a, uaeVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        uaf uafVar = new uaf(this.c, ffguVar);
        uafVar.b = obj;
        return uafVar;
    }
}
