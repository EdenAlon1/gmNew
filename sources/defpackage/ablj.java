package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ablj extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ abll c;
    final /* synthetic */ cbmv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ablj(abll abllVar, cbmv cbmvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = abllVar;
        this.d = cbmvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ablj) c((String) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String str;
        ffhh ffhhVar = ffhh.a;
        if (this.a == 0) {
            ffci.b(obj);
            String str2 = (String) this.b;
            if (str2 == null) {
                abll abllVar = this.c;
                abllVar.f.f(null);
                abllVar.g.f(-1);
                this.c.f(ablg.c);
            } else if (ffpc.J(str2)) {
                abll abllVar2 = this.c;
                int i = engw.d;
                engw engwVar = enou.a;
                engwVar.getClass();
                abllVar2.g(str2, engwVar);
                this.c.f(ablg.b);
            } else {
                this.c.f(ablg.a);
                cbmv cbmvVar = this.d;
                abll abllVar3 = this.c;
                this.b = str2;
                this.a = 1;
                Object a = cbmvVar.a(abllVar3.b, str2, this);
                if (a == ffhhVar) {
                    return ffhhVar;
                }
                str = str2;
                obj = a;
            }
            return ffcu.a;
        }
        str = (String) this.b;
        ffci.b(obj);
        this.c.g(str, (engw) obj);
        this.c.f(ablg.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ablj abljVar = new ablj(this.c, this.d, ffguVar);
        abljVar.b = obj;
        return abljVar;
    }
}
