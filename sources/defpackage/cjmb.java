package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjmb extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cjmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjmb(cjmw cjmwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cjmwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjmb) c((cjmi) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjmi cjmiVar = (cjmi) this.b;
            cjmw cjmwVar = this.c;
            this.a = 1;
            if (cjmiVar.b(cjmwVar) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjmb cjmbVar = new cjmb(this.c, ffguVar);
        cjmbVar.b = obj;
        return cjmbVar;
    }
}
