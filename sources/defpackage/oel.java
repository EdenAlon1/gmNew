package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oel extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ odj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oel(ffjn ffjnVar, odj odjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjnVar;
        this.d = odjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oel) c(obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            ffjn ffjnVar = this.c;
            odj odjVar = this.d;
            this.a = 1;
            if (ffjnVar.a(odjVar, obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        oel oelVar = new oel(this.c, this.d, ffguVar);
        oelVar.b = obj;
        return oelVar;
    }
}
