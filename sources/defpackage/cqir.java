package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqir extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqiy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqir(cqiy cqiyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqiyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqir) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cqiy cqiyVar = this.b;
            this.a = 1;
            if (cqiyVar.f(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqir(this.b, ffguVar);
    }
}
