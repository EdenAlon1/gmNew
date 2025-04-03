package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azcb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azcf b;
    final /* synthetic */ String c;
    final /* synthetic */ azcg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azcb(azcf azcfVar, String str, azcg azcgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azcfVar;
        this.c = str;
        this.d = azcgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azcb) c((String) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        azcf azcfVar = this.b;
        String str = this.c;
        azcg azcgVar = this.d;
        this.a = 1;
        Object g = azcfVar.g(str, azcgVar, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azcb(this.b, this.c, this.d, ffguVar);
    }
}
