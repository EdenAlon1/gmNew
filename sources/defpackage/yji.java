package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yji extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yjn b;
    final /* synthetic */ xho c;
    final /* synthetic */ xyj d;
    final /* synthetic */ String e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yji(ffgu ffguVar, yjn yjnVar, xho xhoVar, xyj xyjVar, String str) {
        super(2, ffguVar);
        this.b = yjnVar;
        this.c = xhoVar;
        this.d = xyjVar;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yji) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        yjn yjnVar = this.b;
        xho xhoVar = this.c;
        xyj xyjVar = this.d;
        String str = this.e;
        this.a = 1;
        Object a = yjnVar.e.a(xhoVar, xyjVar, str, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yji yjiVar = new yji(ffguVar, this.b, this.c, this.d, this.e);
        yjiVar.f = obj;
        return yjiVar;
    }
}
