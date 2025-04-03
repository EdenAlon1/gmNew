package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyq extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ yyu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyq(ffgu ffguVar, yyu yyuVar) {
        super(3, ffguVar);
        this.c = yyuVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yyq yyqVar = new yyq((ffgu) obj3, this.c);
        yyqVar.d = (ffxy) obj;
        yyqVar.b = obj2;
        return yyqVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            ffxx yytVar = ((Boolean) this.b).booleanValue() ? new yyt(this.c.d) : new ffyg(false);
            this.a = 1;
            if (ffyk.c(r4, yytVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
