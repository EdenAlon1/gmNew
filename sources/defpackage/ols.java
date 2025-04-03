package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ols extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ olu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ols(olu oluVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = oluVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ols) c((ojf) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ojf ojfVar = (ojf) this.b;
            olu oluVar = this.c;
            this.a = 1;
            if (oluVar.a.c(ojfVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ols olsVar = new ols(this.c, ffguVar);
        olsVar.b = obj;
        return olsVar;
    }
}
