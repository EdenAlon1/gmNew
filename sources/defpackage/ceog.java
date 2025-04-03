package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceog extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceoj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceog(ffgu ffguVar, ceoj ceojVar) {
        super(2, ffguVar);
        this.b = ceojVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceog) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl M = this.b.a.M();
            this.a = 1;
            obj = fgfz.c(M, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return new Integer(((csdq) obj).c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceog ceogVar = new ceog(ffguVar, this.b);
        ceogVar.c = obj;
        return ceogVar;
    }
}
