package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjjq b;
    final /* synthetic */ Exception c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjjp(ffgu ffguVar, cjjq cjjqVar, Exception exc) {
        super(2, ffguVar);
        this.b = cjjqVar;
        this.c = exc;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjjp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjjq cjjqVar = this.b;
        ffbz ffbzVar = cjjq.a;
        elfl b = cjjqVar.c.b(this.c);
        this.a = 1;
        Object c = fgfz.c(b, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjjp cjjpVar = new cjjp(ffguVar, this.b, this.c);
        cjjpVar.d = obj;
        return cjjpVar;
    }
}
