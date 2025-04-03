package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zyq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyo(ffgu ffguVar, zyq zyqVar) {
        super(2, ffguVar);
        this.b = zyqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zyo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zyq zyqVar = this.b;
            zyp zypVar = new zyp(zyqVar, null);
            this.a = 1;
            if (ffyk.b(zyqVar.g, zypVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zyo zyoVar = new zyo(ffguVar, this.b);
        zyoVar.c = obj;
        return zyoVar;
    }
}
