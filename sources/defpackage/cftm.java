package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cftm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cftn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cftm(cftn cftnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cftnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cftm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cftn cftnVar = this.b;
            cftl cftlVar = new cftl(null);
            this.a = 1;
            if (cftnVar.c.a(cftlVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.d.c = 1;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cftm(this.b, ffguVar);
    }
}
