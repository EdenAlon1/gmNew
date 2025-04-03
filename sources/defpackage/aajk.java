package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajk extends ffhv implements ffjm {
    int a;
    private /* synthetic */ Object b;

    public aajk(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aajk) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.b;
            ffel ffelVar = ffel.a;
            this.a = 1;
            if (ffxyVar.fQ(ffelVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aajk aajkVar = new aajk(ffguVar);
        aajkVar.b = obj;
        return aajkVar;
    }
}
