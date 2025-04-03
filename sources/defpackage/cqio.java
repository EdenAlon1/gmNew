package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqio extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqiy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqio(cqiy cqiyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqiyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqio) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cqiy cqiyVar = this.b;
        this.a = 1;
        Object c = cqiyVar.c.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqio(this.b, ffguVar);
    }
}
